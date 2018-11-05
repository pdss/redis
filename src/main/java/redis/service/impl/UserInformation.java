package redis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import redis.repository.UserInformationRepository;
import redis.service.UserInformationService;

/**
 * @author luotao
 * @date 2018/11/5-0:10
 */
@Service
public class UserInformation implements UserInformationService {
    @Autowired
    private UserInformationRepository repository;
    @Override
    @Cacheable(cacheNames = {"UserInformation"})
    public redis.entity.UserInformation findOne(Integer id) {
        return repository.findById(id).get();
    }
}
