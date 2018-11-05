package redis.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import redis.repository.UserInformationRepository;
import redis.service.UserInformationService;

import static org.junit.Assert.*;

/**
 * @author luotao
 * @date 2018/11/5-0:12
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserInformationTest {
    @Autowired
    private UserInformationService service;
    @Test
    public void findOne() {
        System.out.println(service.findOne(1));
    }
}