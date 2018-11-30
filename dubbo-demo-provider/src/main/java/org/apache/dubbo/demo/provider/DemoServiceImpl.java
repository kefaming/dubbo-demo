package org.apache.dubbo.demo.provider;
import org.apache.dubbo.demo.DemoService;

import com.alibaba.dubbo.config.annotation.Service;

@Service
public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        return "Hello " + name;
    }
}