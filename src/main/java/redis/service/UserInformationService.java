package redis.service;

import redis.entity.UserInformation;

/**
 * @author luotao
 * @date 2018/11/5-0:10
 */
public interface UserInformationService {
    UserInformation findOne(Integer id);
}
