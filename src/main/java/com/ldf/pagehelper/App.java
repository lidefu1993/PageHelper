package com.ldf.pagehelper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * @author ldf
 * @date 2018/12/9 12:06
 **/
@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Bean
    public DataSource myDataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//        dataSource.setUrl("jdbc:mysql://172.16.36.159:3306/jzc_data_test");
//        dataSource.setUsername( "bonc" );
//        dataSource.setPassword( "Bonc%123456" );
        //三峡
//        dataSource.setDriverClassName("com.bonc.xcloud.jdbc.XCloudDriver");
//        dataSource.setUrl("jdbc:xcloud:@172.16.3.46:1803/bonc_sxxny_ly?connectRetry=3&socketTimeOut=60000000&connectDirect=false");
//        dataSource.setUsername("sxxny");
//        dataSource.setPassword("sxxny1q2w3e");
        //天柱山
        dataSource.setDriverClassName("com.bonc.xcloud.jdbc.XCloudDriver");
        dataSource.setUrl("jdbc:xcloud:@172.16.3.46:1803/bonc_tzs_ly?connectRetry=3&socketTimeOut=60000000&connectDirect=false");
        dataSource.setUsername("tzs");
        dataSource.setPassword("tzs1q2w3e");
        return dataSource;
    }

}
