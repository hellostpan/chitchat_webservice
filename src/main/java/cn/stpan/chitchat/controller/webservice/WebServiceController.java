package cn.stpan.chitchat.controller.webservice;

import cn.stpan.chitchat.entites.TUserEntity;
import cn.stpan.chitchat.service.UserService;
import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2016/1/14.
 */
@RestController
@RequestMapping("rest/user")
public class WebServiceController {
    private UserService userService;
    private Logger log = Logger.getLogger(WebServiceController.class);

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/list")
    public List<HashMap<String, Object>> getUserList() {
        List<HashMap<String, Object>> list = userService.getUserList();
        log.info(list);
        return list;
    }

    @RequestMapping("/userInfo/{userId}")
    public TUserEntity getUserByUserId(@PathVariable(value = "userId") String userId) {
        TUserEntity user = userService.getUserByUserId(userId);
        ObjectMapper mapper = new ObjectMapper();
        log.info(JSON.toJSON(user));
        return user;
    }

}
