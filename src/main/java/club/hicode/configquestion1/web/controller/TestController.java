package club.hicode.configquestion1.web.controller;

import club.hicode.configquestion1.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * XXXX
 *
 * @author LiuChunfu
 * @date 2018/10/2
 */
@RestController
public class TestController {


    @Autowired
    private User user;

    @Value("${mic.user.name}")
    public String name;

    @GetMapping("/all")
    public Object[] all() {
        Object[] result = new Object[2];
        result[0] = user;
        result[1] = name;
        return result;
    }
}
