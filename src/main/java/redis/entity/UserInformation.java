package redis.entity;

import com.sun.javafx.geom.PickRay;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author luotao
 * @date 2018/11/5-0:04
 */
@Data
@Entity
public class UserInformation {
    @Id
    private Integer id;
    private String username;
    private String password;
}
