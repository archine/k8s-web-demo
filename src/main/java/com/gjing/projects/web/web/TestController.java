package com.gjing.projects.web.web;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Gjing
 **/
@RestController
public class TestController {
    @PostMapping("/test1")
    @ApiOperation("测试1")
    public ResponseEntity<String> test1() {
        return ResponseEntity.ok("web-demo test1 is ok");
    }

    @GetMapping("/test2")
    @ApiOperation("测试2")
    @ApiImplicitParam(name = "user", value = "用户名", dataType = "String", paramType = "query", required = true)
    public ResponseEntity<String> test2(String user) {
        return ResponseEntity.ok("web-demo test2 is ok: " + user);
    }
}
