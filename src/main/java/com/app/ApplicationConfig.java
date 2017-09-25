package com.app;

import com.app.catalog.CatalogGeneration;
import com.app.service.ApnaService;
import com.app.service.ApnaServiceImpl;
import com.app.service.HumaraServiceImpl;
import org.postgresql.ds.PGPoolingDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class ApplicationConfig {

    @Value("${database-server}")
    private String serverName;
    @Value("${database-name}")
    private String databaseName;
    @Value("${user-name}")
    private String userName;
    @Value("${password}")
    private String password;


    @Bean(name = "apna")
    public ApnaService getApnaService(){
        return new ApnaServiceImpl();
    }

    @Bean(name = "humara")
    public ApnaService getHuamaraService (){
        return new HumaraServiceImpl();
    }

    @Bean
    public JdbcTemplate getTemplate(DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }

    @Bean
    public DataSource getDatasource(){
        PGPoolingDataSource source = new PGPoolingDataSource();
        source.setServerName(serverName);
        source.setDatabaseName(databaseName);
        //source.setCurrentSchema("testSchema");
        source.setUser(userName);
        source.setPassword(password);
        source.setMaxConnections(10);
        return source;
    }



    @Bean
    public CatalogGeneration getCatalogGeneration(){
        return new CatalogGeneration();
    }

}
