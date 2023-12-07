package in.italent.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.italent.service.ServiceClient;

@RestController
public class ClientController {

	@Autowired
	private ServiceClient serviceClient;
	@Autowired
	private TokenGenerationClass tokenclass;
	
	@GetMapping("/modern")
	public String invokeRest() {
		serviceClient.invokeUrl();
		return "success";
	}
		
		@GetMapping("/token")
		public String token() {
			tokenclass.invokeToken();
			return "token generated";
		}
		
	
}
