package springbootController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker")
public class DockerController {

	@GetMapping
	public String hello() {

		return "Now docker images created and Docker working properly";

	}
}
