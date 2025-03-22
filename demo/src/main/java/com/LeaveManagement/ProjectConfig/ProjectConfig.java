package com.LeaveManagement.ProjectConfig;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.LeaveManagement.Controller"
        ,"com.LeaveManagement.Service"
        ,"com.LeaveManagement.Aspects"})
@EnableAspectJAutoProxy(exposeProxy = true)
public class ProjectConfig {


}
