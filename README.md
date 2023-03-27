# hitch
taxi hitch demo 

## Technology selection
### backend
spring cloud + nacos + gateway + feign

### frontend
nginx + h5 + jquery mobile

### storage
basic info save into mysql, real time position save into mongodb

### cache
redis
### file save
fastdfs

### message
rabbitmq + kafka + websocket
### document
swagger2

## micro service design
### module division
service registry: nacos
gateway         : gateway
stroke          : stroke
order           : order
user module     : account
payment         : payment
storage         : storage
IM              : notice

add common(for utils) and module(model)

