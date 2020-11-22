package com.jzweb.springboot.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ryan
 * @version 1.0
 * @date 11/22/2020
 */
@Api()
@RestController
@RequestMapping("/api/login")
public class LoginController
{
    @ApiOperation(value = "登录",notes = "接口登录",produces = "application/json")
    @ApiImplicitParams({@ApiImplicitParam(name = "uname",value = "user name",required = true,dataType = "String"),
            @ApiImplicitParam(name = "pwd",value = "password",required = true,dataType = "String")})
    @RequestMapping(value = "/in", method = RequestMethod.POST)
    public Map<String, String> login(String uname,String pwd)
    {
        return new HashMap<>();
    }

    @RequestMapping(value = "/menu", method = RequestMethod.GET)
    public Map<String, String> menu(){
        return new HashMap<>();
    }
}
