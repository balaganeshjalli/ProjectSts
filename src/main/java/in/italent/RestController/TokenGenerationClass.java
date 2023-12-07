package in.italent.RestController;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class TokenGenerationClass {

	@GetMapping
	public void invokeToken() {
		String endpoint="https://techzone-dev2.cisco.com/restapi/vc/authentication/sessions/login/?user.login=balaganesh&user.password=balaganesh@123&restapi.response_format=json";
		String block = WebClient.create().get()
		         .uri(endpoint)
		         .accept(MediaType.APPLICATION_JSON)
		         .retrieve()
		         .bodyToMono(String.class)
		         .block();
		System.out.println(block);
	}
}
