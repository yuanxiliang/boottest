package com.bootdo.testDemo;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONArray;
import com.bootdo.system.dao.DeptDao;
import com.bootdo.system.domain.DeptDO;

@RestController()
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestDemo {

    @Autowired
    DeptDao deptDao;

    @Test
    public void testName() throws Exception {
        List<DeptDO> list = deptDao.list(null);
        System.out.println(JSONArray.toJSONString(list));
    }
}
