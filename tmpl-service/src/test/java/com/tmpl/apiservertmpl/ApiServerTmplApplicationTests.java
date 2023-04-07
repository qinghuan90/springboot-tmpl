package test.java.com.tmpl.apiservertmpl;

import org.junit.jupiter.api.Test;
import org.redisson.api.RList;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;

@SpringBootTest
class ApiServerTmplApplicationTests {

    @Autowired
    RedissonClient client;

    @Resource
    @Qualifier("redisTemplate")
    RedisTemplate redisCache;

    @Test
    void contextLoads() {
        RList<String> ss = client.getList("xx");
        ss.add("aa");
    }

    @Test
    void testRedis() {

        redisCache.opsForValue().set("aa","vv");
    }

}
