package cl.desafiolatam.apialumnos;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("cl.desafiolatam.apialumnos")
@PropertySource("classpath:database.properties")
public class AppConfig {
	
	@Autowired
	Environment ambiente;
	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dmds = new DriverManagerDataSource();
		System.out.println(ambiente.getProperty("username"));
		dmds.setDriverClassName(ambiente.getProperty("driver"));
		dmds.setUrl(ambiente.getProperty("url"));
		dmds.setUsername(ambiente.getProperty("user"));
		dmds.setPassword(ambiente.getProperty("clave"));
		return dmds;
	}
	
}