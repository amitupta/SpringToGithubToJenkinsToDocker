package springbootWithDockerfile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"springbootController"})
public class SpringBootWithDockerfile {
	public static void main(String[] args) 
	   {
	      SpringApplication.run(SpringBootWithDockerfile.class, args);
	   }
}
