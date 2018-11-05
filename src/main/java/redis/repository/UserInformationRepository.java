package redis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import redis.entity.UserInformation;

/**
 * @author luotao
 * @date 2018/11/5-0:06
 */
public interface UserInformationRepository extends JpaRepository<UserInformation,Integer> {
}
