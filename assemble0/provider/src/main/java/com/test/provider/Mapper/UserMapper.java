package com.test.provider.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.test.provider.charator.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {
//    @Insert("INSERT INTO test1 (name, age) VALUES (#{name}, #{age})")
//    @Options(useGeneratedKeys = true, keyProperty = "id")
//    int insertUser(User user);
//
//    @Select("SELECT * FROM test1 WHERE id = #{id}")
//    User selectUserById(int id);
//
//    @Update("UPDATE test1 SET name = #{name}, age = #{age} WHERE id = #{id}")
//    int updateUser(User user);
//
//    @Delete("DELETE FROM test1 WHERE id = #{id}")
//    int deleteUser(int id);
//
//    @Select("SELECT * FROM test1")
//    List<User> selectAllUsers();
}