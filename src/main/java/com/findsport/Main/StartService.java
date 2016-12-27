package com.findsport.Main;

import com.findsport.DataBaseConnections.CreateDBConnection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by Arjun on 12/27/2016.
 */
public class StartService {
    public static void main(String[] args){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("Springbean.xml");
        CreateDBConnection connection = (CreateDBConnection) context.getBean("createDBConnection");
        JdbcTemplate template = connection.getConnection();


    }
}
