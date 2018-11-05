package redis.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import redis.entity.MsgTest;
import redis.service.MsgTestService;

import java.io.Serializable;

import static org.junit.Assert.*;

/**
 * @author luotao
 * @date 2018/11/3-10:01
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class MsgTestServiceImplTest {
    @Autowired
    private MsgTestService msgTestService;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private RedisTemplate<Object,MsgTest> msgRedisTemplate;

    @Test
    public void findOne() {
        System.out.println(msgTestService.findOne(27));
    }
    @Test
    //保存数据
    public void redisTest(){

       // stringRedisTemplate.opsForValue().append("msg","hello");
        //System.out.println(stringRedisTemplate.opsForValue().get("msg"));
        stringRedisTemplate.opsForList().leftPush("mylist","1");
        stringRedisTemplate.opsForList().leftPush("mylist","2");
        stringRedisTemplate.opsForList().leftPush("mylist","3");
    }
    @Test
    //保存对象
    public void redisTest1(){
        ///MsgTest msgTest = msgTestService.findOne(27);
        //System.out.println(msgTest);
        //msgRedisTemplate.opsForValue().set("msg-02",msgTest);
        //System.out.println(redisTemplate.opsForValue().get("msgtest"));
        System.out.println(msgRedisTemplate.opsForValue().get("msg-02"));

    }
}