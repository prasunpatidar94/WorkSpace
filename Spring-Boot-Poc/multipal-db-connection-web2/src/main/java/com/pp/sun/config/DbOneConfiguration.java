package com.pp.sun.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Properties;

@Configuration
public class DbOneConfiguration {

    //    DataSource
    @Bean
    @ConfigurationProperties(prefix = "db1.datasource")
    public DataSource db1DataSource() {
        return DataSourceBuilder.create().build();
    }

    //    EntityManagerFectory
    @Bean
    public LocalContainerEntityManagerFactoryBean db1EntityManagerFactoryBean() {

      LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();

        em.setDataSource(db1DataSource());
        em.setPackagesToScan("com.pp.sun.entity");
        em.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        Properties properties = new Properties();
        properties.put("hibernate.hbm2ddl.auto","update");
        properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
        em.setJpaProperties(properties);

        return em;
    }

    //    TransactionalManager
    @Bean
    public PlatformTransactionManager db1platformTransactionManager(JpaTransactionManager jpaTransactionManager) {

        jpaTransactionManager.setEntityManagerFactory(db1EntityManagerFactoryBean().getObject());

        return null;
    }

}
