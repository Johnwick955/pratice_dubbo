package com.test.Test;

import com.test.DTO.UserDTO;
import com.test.VO.TestVO;

import java.util.List;

public interface TestUser {
    /**
     * 创建用户
     * @return 创建结果
     */
    int createUser(TestVO testVO);

    /**
     * 根据ID获取用户
     * @param id 用户ID
     * @return 用户信息
     */
    UserDTO getUserById(int id);

    /**
     * 更新用户信息
     * @return 更新结果
     */
    boolean updateUser(TestVO testVO);

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
