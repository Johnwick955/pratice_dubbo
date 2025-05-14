package com.test.provider.remoteImpl;

import com.test.DTO.UserDTO;
import com.test.Test.TestUser;
import com.test.VO.TestVO;
import com.test.provider.Service.ProviderUserService;
import com.test.provider.charator.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.List;

public class testRomoteImpl implements TestUser {

    @Resource
    private ProviderUserService providerUserService;

    @Override
    public int createUser(TestVO testVO){
        User user  = new User();
        BeanUtils.copyProperties(testVO ,user);
        return providerUserService.createUser(user);
    }

    @Override
    public UserDTO getUserById(int id){
        UserDTO userDTO = new UserDTO();
        User user = providerUserService.getUserById(id);
        BeanUtils.copyProperties(user ,userDTO);
        return userDTO;
    }

    @Override
    public boolean updateUser(TestVO testVO){
        User user  = new User();
        BeanUtils.copyProperties(user ,testVO);
        return  providerUserService.updateUser(user);
    }

    @Override
    public boolean deleteUser(int id){
        return providerUserService.deleteUser(id);
    }

    @Override
    public List<UserDTO> getAllUsers(){
        return providerUserService.getAllUsers();
    }
}
