package vn.vtd.wls;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan({"vn.vtd.wls"})
public class DemoApplication {

	public static void main(String[] args) {
//		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
//		String rawPassword = "codejava3";
//		String encoderPassWord = encoder.encode(rawPassword);
//		System.out.println(encoderPassWord);
		
		SpringApplication.run(DemoApplication.class, args);
	}
	


}
