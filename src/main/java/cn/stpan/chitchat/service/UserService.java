package cn.stpan.chitchat.service;

import cn.stpan.chitchat.entites.TUserEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2016/1/15.
 */
@Service
public interface UserService {
    TUserEntity getUserByUserId(String id);
    List<HashMap<String,Object>> getUserList();
}
