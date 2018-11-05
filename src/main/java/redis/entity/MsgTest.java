package redis.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author luotao
 * @date 2018/11/3-9:53
 */
@Entity
@Data
public class MsgTest implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;
    private String msg;
    private Integer uId;
}
