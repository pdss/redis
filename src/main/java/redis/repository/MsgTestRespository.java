package redis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import redis.entity.MsgTest;

/**
 * @author luotao
 * @date 2018/11/3-9:55
 */
public interface MsgTestRespository extends JpaRepository<MsgTest,Integer> {
}
