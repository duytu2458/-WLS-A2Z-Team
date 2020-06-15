package vn.vtd.wls;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

//@Configuration
public class BeanConfig {

//	@Autowired
//	private Environment environment;
//
//	@Bean(name = "dataSource")
//	public DataSource getDataSource() {
//		DriverManagerDataSource dataSource = new DriverManagerDataSource();
//		dataSource.setDriverClassName(environment.getProperty("spring.datasource.driver-class-name"));
//		dataSource.setUrl(environment.getProperty("spring.datasource.url"));
//		dataSource.setUsername(environment.getProperty("spring.datasource.username"));
//		dataSource.setPassword(environment.getProperty("spring.datasource.password"));
//		return dataSource;
//	}
//
//	@Autowired
//	@Bean(name = "sessionFactory")
//	public SessionFactory getSessionFactory(DataSource dataSource) throws Exception {
//		Properties properties = new Properties();
//		properties.put("hibernate.dialect", environment.getProperty("spring.jpa.properties.hibernate.dialect"));
//		properties.put("current_session_context_class",
//				environment.getProperty("spring.jpa.properties.hibernate.current_session_context_class"));
//		LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
//		factoryBean.setPackagesToScan(new String[] { "vn.vtc.wls" });
//		factoryBean.setDataSource(dataSource);
//		factoryBean.setHibernateProperties(properties);
//		factoryBean.afterPropertiesSet();
//		SessionFactory sessionFactory = factoryBean.getObject();
//		return sessionFactory;
//	}
//
//	@Autowired
//	@Bean(name = "transactionManager")
//	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
//		HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
//		return transactionManager;
//	}
}
