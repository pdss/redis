package redis.service;

import redis.entity.MsgTest;

/**
 * @author luotao
 * @date 2018/11/3-9:58
 */

public interface MsgTestService {
    MsgTest findOne(Integer id);
}
