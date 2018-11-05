package redis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import redis.entity.MsgTest;
import redis.repository.MsgTestRespository;
import redis.service.MsgTestService;

/**
 * @author luotao
 * @date 2018/11/3-9:59
 */
@Service
public class MsgTestServiceImpl implements MsgTestService {
    @Autowired
    MsgTestRespository msgTestRespository;
    @Override
    @Cacheable(cacheNames = {"MsgTest"})
    public MsgTest findOne(Integer id) {
        return msgTestRespository.findById(id).get();
    }
}
