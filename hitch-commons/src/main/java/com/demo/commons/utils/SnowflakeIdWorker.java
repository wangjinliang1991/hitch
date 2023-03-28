package com.demo.commons.utils;

public class SnowflakeIdWorker {

    // start time: 2023-01-01
    private final long twepoch = 1672502400L;

    // machine id bits
    private final long workerIdBits = 5L;

    // data center id bits
    private final long datacenterIdBits = 5L;

    // max machine workers  algo: calc max decimal num of several binary nums
    private final long maxWorkerId = -1L ^ (-1L << workerIdBits);

    // max data center ids
    private final long maxDatacenterId = -1L ^ (-1L << datacenterIdBits);

    // sequence bits
    private final long sequenceBits = 12L;

    // machine id left 12 bit
    private final long workerIdShift = sequenceBits;

    // datacenter id left 17 bit
    private final long datacenterIdShift = sequenceBits + workerIdBits;

    // timestamp left 22 bits
    private final long timestampLeftShift = sequenceBits + workerIdBits + datacenterIdBits;

    // mask to create sequence 4095 (0b111111111111=0xfff=4095)
    private final long sequenceMask = -1L ^ (-1L << sequenceBits);

    // machine id (0-31)
    private long workerId;

    // data center id
    private long datacenterId;

    // sequence(0-4095) unit: millisecond
    private long sequence = 0L;

    private long lastTimestamp = -1L;

    // ======== constructor ======
    public SnowflakeIdWorker(long workerId, long datacenterId) {
        // check
        if (workerId > maxWorkerId || workerId < 0) {
            throw new IllegalArgumentException(String.format("worker Id can't be greater than %d or less than 0", workerId));
        }
        if (datacenterId > maxDatacenterId || datacenterId < 0) {
            throw new IllegalArgumentException(String.format("datacenter Id can't be greater than %d or less than 0", maxDatacenterId));
        }
        this.workerId = workerId;
        this.datacenterId = datacenterId;
    }

    /**
     * get next id
     * @return SnowflakeId
     */
    public synchronized long nextId() {
        long timestamp = timeGen();

        // if current time < last timestamp, clock moved backwards
        if (timestamp < lastTimestamp) {
            throw new RuntimeException(
                    String.format("Clock moved backwards. Refusing to generate id for %d milliseconds",lastTimestamp - timestamp)
            );
        }

        // if created during same time, sequence within milliSeconds
        if (lastTimestamp == timestamp) {
            sequence = (sequence + 1) & sequenceMask;
            // sequence overflow
            if (sequence == 0) {
                // block till next millisecond
                timestamp = tilNextMillis(lastTimestamp);
            }
        } else {
            // timstamp changed, sequence reset
            sequence = 0L;
        }

        // last timestamp when creating id
        lastTimestamp = timestamp;

        // create id
        return ((timestamp - twepoch) << timestampLeftShift)
                | (datacenterId << datacenterIdShift)
                | (workerId << workerIdShift)
                | sequence;
    }

    private long tilNextMillis(long lastTimestamp) {
        long timestamp = timeGen();
        while (timestamp <= lastTimestamp) {
            timestamp = timeGen();
        }
        return timestamp;
    }

    private long timeGen() {
        return System.currentTimeMillis();
    }

    public static void main(String[] args) {
        // test
        SnowflakeIdWorker idWorker = new SnowflakeIdWorker(0, 0);
        for (int i = 0; i < 100; i++) {
            long id = idWorker.nextId();
            System.out.println(Long.toBinaryString(id));
            System.out.println(id);
        }
    }
}
