package com.test.provider.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.test.DTO.UserDTO;
import com.test.Test.TestUser;
import com.test.VO.TestVO;
import com.test.provider.Mapper.UserMapper;
import com.test.provider.Service.ProviderUserService;
import com.test.provider.charator.User;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//@DubboService(interfaceClass = TestUser.class, version = "0.0.1-SNAPSHOT",interfaceName = "com.test.Test.TestUser")
@DubboService(version = "0.0.1-SNAPSHOT")
public class ProviderUserServiceImpl extends ServiceImpl<UserMapper,User> implements ProviderUserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public int createUser(User user) {
        user.setName(user.getName());
        user.setAge(user.getAge());
        return userMapper.insert(user);

    }

    @Override
    public User getUserById(int id) {
        User user = new User();
        user = userMapper.selectById(id);
        user.setName(user.getName());
        return user;

    }

    @Override
    public boolean updateUser(User user) {
        user.setName(user.getName());
        user.setAge(user.getAge());
        int result = userMapper.updateById(user);
        return result > 0;
    }

    @Override
    public boolean deleteUser(int id) {
        int result = userMapper.deleteById(id);
        return result > 0;
    }

    @Override
    public List<UserDTO> getAllUsers() {

        List<User> userList = userMapper.selectList(null);
        List<UserDTO> userDTOList = new ArrayList<UserDTO>();
        for (User user : userList) {
            UserDTO userDTO = new UserDTO();
            userDTO.setId(user.getId());
            userDTO.setName(user.getName());
            userDTO.setAge(user.getAge());
            userDTOList.add(userDTO);
    }
        return userDTOList;
}

}
