package redis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import redis.entity.MsgTest;
import redis.entity.UserInformation;
import redis.service.MsgTestService;
import redis.service.UserInformationService;

/**
 * @author luotao
 * @date 2018/11/3-10:19
 */
@RestController
public class MainController {
    @Autowired
    private MsgTestService msgTestService;
    @Autowired
    private UserInformationService service;
    @GetMapping("/{id}")
    public MsgTest getMsg(@PathVariable Integer id){
        return msgTestService.findOne(id);
    }
    @GetMapping("/user/{id}")
    public UserInformation getUser(@PathVariable Integer id){
        return service.findOne(id);
    }
}
