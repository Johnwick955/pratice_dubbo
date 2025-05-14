package com.test.provider.Service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.test.DTO.UserDTO;
import com.test.Test.TestUser;
import com.test.VO.TestVO;
import com.test.provider.charator.User;

import java.util.List;

public interface ProviderUserService extends IService<User> {
    /**
     * 创建用户
     * @return 创建结果
     */
    int createUser(User user);

    /**
     * 根据ID获取用户
     * @param id 用户ID
     * @return 用户信息
     */
    User getUserById(int id);

    /**
     * 更新用户信息
     * @return 更新结果
     */
    boolean updateUser(User user);

    /**
     * 根据ID删除用户
     * @param id 用户ID
     * @return 删除结果
     */
    boolean deleteUser(int id);

    /**
     * 获取所有用户
     * @return 用户列表
     */
    List<UserDTO> getAllUsers();
}