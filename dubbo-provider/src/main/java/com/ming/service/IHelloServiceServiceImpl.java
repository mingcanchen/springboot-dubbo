package com.ming.service;

import com.ming.api.IHelloService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author wolter
 */
@Service(version = "${demo.service.version}")
public class IHelloServiceServiceImpl implements IHelloService {

    @Value("${dubbo.application.name}")
    private String serviceName;

    @Override
    public String sayHello(String name) {
        return String.format("[%s]: Hello, %s", serviceName, name);
    }
}
