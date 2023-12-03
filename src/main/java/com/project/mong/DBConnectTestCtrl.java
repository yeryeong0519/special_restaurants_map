package com.project.mong;

import com.project.mong.DAO.TestDAO;
import com.project.mong.DTO.TestDTO;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@MapperScan("com.project.mong.DAO")
@RestController
@RequestMapping("/api")
public class DBConnectTestCtrl {
    private final TestDAO testDAO;

    @Autowired
    public DBConnectTestCtrl(TestDAO testDAO) {
        this.testDAO = testDAO;
    }

    @GetMapping("/hello")
    public List<TestDTO> HelloWorld() {
        return testDAO.getTestData();
    }
}
