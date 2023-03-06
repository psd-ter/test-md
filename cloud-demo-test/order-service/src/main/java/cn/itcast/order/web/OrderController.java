package cn.itcast.order.web;

import cn.itcast.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class OrderController {

//   @Autowired
//   private OrderService orderService;
//    @Autowired
//    private RestTemplate restTemplate;
//    @Autowired
//    private UserClient userClient;
//    @GetMapping("{orderId}")
//    public Order queryOrderByUserId(@PathVariable("orderId") Long orderId) {
//
//        // 根据id查询订单并返回
//        Order order = orderService.queryOrderById(orderId);
//        Long userId = order.getUserId();
//        User user = userClient.queryById(order.getUserId());
//        order.setUser(user);
//        return order;
//    }
//    @GetMapping("{orderId}")
//    public Order queryOrderByUserId(@PathVariable("orderId") Long orderId) {
//
//        // 根据id查询订单并返回
//        Order order = orderService.queryOrderById(orderId);
//        String url = "http://userService/user/"+order.getUserId();
//        User forObject = restTemplate.getForObject(url, User.class);
//        order.setUser(forObject);
//        return order;
//    }
}
