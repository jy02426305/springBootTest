package cn.cyx.springboot.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api("swagger练习控制器")
public class HelloController {

    @ApiOperation("swagger练习服务接口")
    @ApiImplicitParam(name="userName",value = "姓名",required = false,type = "String")
    @GetMapping("/hello")
    public String hello(String userName){
        return "你好："+userName;
    }
}
