package com.wangmike.ureport;

import com.wangmike.ureport.bean.User;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * <pre>
 *    @author  : wangchun
 *    @time    : 2020/6/28 9:05
 *    @desc    : 输入描述
 *    @version : v1.0
 * </pre>
 */

/**
 * 范德萨发生的
 */
@Component
public class UserBean {

    public List<User> loadData(String dsName, String datasetName, Map<String,Object> parameters) throws InterruptedException {
//        TimeUnit.SECONDS.sleep(5);顶顶顶说的是大撒大撒
        List<User>userList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            User user = new User();
            user.setId(new Random().nextInt(100000));
            user.setName(UUID.randomUUID().toString().substring(0,12));
            user.setAddress(UUID.randomUUID().toString().substring(0,12));
            userList.add(user);
        }
        return userList;
    }

}
