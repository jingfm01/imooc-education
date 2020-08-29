package com.jj.system.service;

import com.jj.system.domain.Test;
import com.jj.system.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestService {

    @Resource
    private TestMapper testMapper;

    public List<Test> list(){

        return testMapper.list();
    }

}
