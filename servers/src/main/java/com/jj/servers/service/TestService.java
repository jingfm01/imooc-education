package com.jj.servers.service;

import com.jj.servers.domain.Test;
import com.jj.servers.mapper.TestMapper;
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
