package cn.stpan.chitchat.controller.webservice;

import cn.stpan.chitchat.entites.TUserEntity;
import cn.stpan.chitchat.service.UserService;
import cn.stpan.chitchat.utils.CodeConstant;
import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.org.apache.xml.internal.serializer.ToUnknownStream;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

/**
 * Created by stpan on 2016/4/27 21:00.
 */
@RestController
@RequestMapping("rest/user")
public class UserServiceController {
    private Logger log = Logger.getLogger(WebServiceController.class);
    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public String login(@RequestBody HashMap<String,String> hashMap){
        HashMap<String,Object> map = new HashMap<String, Object>();
        if (hashMap!=null){
            String password = hashMap.get("password");
            String account = hashMap.get("account");
            map.put("code", CodeConstant.SUCCESS);
            map.put("result",userService.login(account,password));
        }else {
            map.put("code",CodeConstant.EMPTY);
        }
        log.info(JSON.toJSONString(map));
        return JSON.toJSONString(map);
    }

    @RequestMapping("/userInfo/{userId}")
    public String getUserByUserId(@PathVariable(value = "userId") String userId) {
        TUserEntity user = userService.getUserByUserId(userId);
        log.info(JSON.toJSONString(user));
        return JSON.toJSONString(user);
    }
}
