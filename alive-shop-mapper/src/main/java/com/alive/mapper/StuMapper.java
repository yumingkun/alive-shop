package com.alive.mapper;

import com.alive.Stu;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;


public interface StuMapper extends Mapper<Stu>, MySqlMapper<Stu> {
}