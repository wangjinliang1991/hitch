package com.demo.modules.vo;

import com.demo.commons.domain.vo.VO;

public class AccountVO implements VO {


    private String id;

    @Override
    public Class getPO() {
        return AccountVO.class;
    }
}
