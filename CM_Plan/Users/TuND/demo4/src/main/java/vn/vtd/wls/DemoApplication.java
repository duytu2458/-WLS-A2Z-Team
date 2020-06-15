package vn.vtd.wls;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan({ "vn.vtd.wls.admin.controller", "vn.vtd.wls.admin.service", "vn.vtd.wls.demo", "vn.vtd.wls.model",
//		"vn.vtd.wls.admin.repositories" })

//@ComponentScans(value = { @ComponentScan("vn.vtd.wls.admin.controller"),
//        @ComponentScan("vn.vtd.wls.admin.service"),
//        @ComponentScan("vn.vtd.wls.admin.repositories"),
//        @ComponentScan("vn.vtd.wls.model"),
//        @ComponentScan("vn.vtd.wls.demo")
//})
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}

}
