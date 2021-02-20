package com.wuguangyao.business.service.impl;

import com.wuguangyao.core.service.IDemoService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class DemoService implements IDemoService {
    @Override
    public String hello() {
        return "DemoService";
    }
}
