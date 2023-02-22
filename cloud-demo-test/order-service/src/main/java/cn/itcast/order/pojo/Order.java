package cn.itcast.order.pojo;

import cn.itcast.feign.pojo.User;
import lombok.Data;
import org.springframework.stereotype.Repository;

@Repository
@Data
public class Order {
    private Long id;
    private Long price;
    private String name;
    private Integer num;
    private Long userId;
    private User user;
}