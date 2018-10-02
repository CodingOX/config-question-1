package club.hicode.configquestion1.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * XXXX
 *
 * @author LiuChunfu
 * @date 2018/10/2
 */
@ConfigurationProperties(prefix = "mic.user")
public class User {

    private String name;

    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
