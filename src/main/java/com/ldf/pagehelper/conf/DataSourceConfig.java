//package com.ldf.pagehelper.conf;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.context.annotation.PropertySource;
//
//import javax.sql.DataSource;
//
///**
// * Created by ldf on 2018/7/2.
// */
//@Configuration
//@PropertySource(value = "classpath:application-jdbc.properties")
//public class DataSourceConfig {
//
//    @Value("${druid.type}")
//    private Class<? extends DataSource> dataSourceType;
//
//    @Primary
//    @Bean("jzcDataSource")
//    @ConfigurationProperties(prefix = "druid.datasources.tour.master")
//    public DataSource jzcDataSource() {
//        return DataSourceBuilder.create().type(dataSourceType).build();
//    }
//
//
//
//}
