package cn.stpan.chitchat.service.impl;

import cn.stpan.chitchat.entites.TUserEntity;
import cn.stpan.chitchat.service.UserService;
import cn.stpan.chitchat.utils.HibernateUtil;
import org.hibernate.Session;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2016/1/15.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    public TUserEntity getUserByUserId(String id) {
        TUserEntity user = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            /*String sql = "SELECT id,account,gender FROM t_user WHERE id = '"+id+"'";
            Object[] objects = (Object[]) session.createSQLQuery(sql).uniqueResult();
            if (objects!=null){
                user.setId(objects[0].toString());
                user.setAccount(objects[0].toString());
                user.setGender(objects[0].toString());
            }*/
            user = session.get(TUserEntity.class,id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return user;
    }

    public List<HashMap<String, Object>> getUserList() {
        List<HashMap<String,Object>> hashMapList = new ArrayList<HashMap<String, Object>>();
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            String sql = "SELECT id,account,gender FROM t_user";
            List<Object[]> list = (List<Object[]>) session.createSQLQuery(sql).list();
            HashMap<String, Object> hashMap;
            for (Object[] objects:list){
                hashMap = new HashMap<String, Object>();
                hashMap.put("id", objects[0]);
                hashMap.put("name", objects[1]);
                hashMap.put("gender", objects[2]);
                hashMapList.add(hashMap);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return hashMapList;
    }
}
