package com.ricky.codelab.dubbo.api;

import com.ricky.codelab.dubbo.api.model.User;

public interface DemoService {
 
	public String sayHello(String name);
 
    public User findUserById(long id);
}