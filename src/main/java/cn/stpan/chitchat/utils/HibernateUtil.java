package cn.stpan.chitchat.utils;

import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2016/1/19.
 */
public class HibernateUtil {
    private static SessionFactory sessionFactory;
    static{
        try {
            ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
            sessionFactory = context.getBean("localSessionFactoryBean", SessionFactory.class);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}
