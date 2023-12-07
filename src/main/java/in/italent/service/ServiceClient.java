package in.italent.service;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import in.italent.binding.response;

@Service
public class ServiceClient {


		public void invokeUrl() {
		//	String endpoint="https://techzone-dev2.cisco.com/restapi/vc/messages/id/25423/moderation/status";
			String endpoint="https://techzone-dev2.cisco.com/restapi/vc/messages/id/25423/moderation/status";
			response block = WebClient.create().get()
			         .uri(endpoint)
			         .accept(MediaType.APPLICATION_JSON)
			         .retrieve()
			         .bodyToMono(response.class)
			         .block();
			System.out.println(block);
		}
	}


