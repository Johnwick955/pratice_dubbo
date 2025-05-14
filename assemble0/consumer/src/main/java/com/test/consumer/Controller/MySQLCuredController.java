package com.test.consumer.Controller;






import com.test.DTO.UserDTO;
import com.test.Test.TestUser;
import com.test.VO.TestVO;
import com.test.consumer.req.TestReq;
import com.test.consumer.resp.TestResp;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.BeanUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/test")
public class MySQLCuredController {

    @Resource
    private TestUser testUser;


    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }


    @PostMapping("/add")
    @ResponseBody
    public int createUser(@RequestBody TestReq testReq ) {
        TestVO testVO = new TestVO();
         BeanUtils.copyProperties(testReq ,testVO);
         int a= testUser.createUser(testVO);
         return a;
    }

    @GetMapping("/detail/{id}")
    @ResponseBody
    public TestResp getUser(@PathVariable int id) {
         UserDTO userDTO = testUser.getUserById(id);
        TestResp testResp = new TestResp();
        BeanUtils.copyProperties(testResp ,userDTO);
        return testResp;
    }

    @PostMapping("/update")
    @ResponseBody
    public boolean updateUser(@RequestBody TestReq testReq) {
        TestVO testVO = new TestVO();
        BeanUtils.copyProperties(testVO ,testReq);
        return testUser.updateUser(testVO);
    }

    @PostMapping("/delete/{id}")
    @ResponseBody
    public boolean deleteUser(@PathVariable int id) {
        return testUser.deleteUser(id);
    }

//    @GetMapping
//    public List<TestResp> getAllUsers() {
//        return testUser.getAllUsers();
//    }


}
