package com.alive.impl;import com.alive.UserService;import com.alive.Users;import com.alive.mapper.UsersMapper;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.stereotype.Service;import org.springframework.transaction.annotation.Propagation;import org.springframework.transaction.annotation.Transactional;import tk.mybatis.mapper.entity.Example;/** * Created by mingkunyu on 2019-11-24 */@Servicepublic class UserServiceImpl implements UserService {    @Autowired    private UsersMapper usersMapper;    @Transactional(propagation = Propagation.SUPPORTS)    @Override    public boolean queryUsernameIsExist(String username) {        Example userExample = new Example(Users.class);        Example.Criteria userCriteria = userExample.createCriteria();        userCriteria.andEqualTo("username", username);        Users result = usersMapper.selectOneByExample(userExample);        return result == null ? false : true;    }    @Override    public Users queryUserForLogin(String username, String password) {        return null;    }}