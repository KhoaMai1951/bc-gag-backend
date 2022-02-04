package com.techgeeknext.service;

import java.util.ArrayList;

import org.apache.tomcat.websocket.WsFrameClient;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class JwtUserDetailsService implements UserDetailsService {

	private RestTemplate restTemplate;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		final String uri = "https://graph.facebook.com/debug_token?access_token=EAALszACouZAoBAIeMPQyWjJpGGzykBWBiT6PpcLZBrILhBk5ZAxcXbmiH41hHH6APiJZCOaJPcMo6InHONRQJXsTc9xy0xRy4fPeMbkGf452KakOs4PuYyIqMIjXx3c7CxPqpXie2Pm3sJ4mabKmJp2k5uER55320nxpZCsJBARYJubmmQmUzg1o5VaFPKoyEsig47j7mja874cobZA36naVev5u18b7cZD&input_token=EAALszACouZAoBAIeMPQyWjJpGGzykBWBiT6PpcLZBrILhBk5ZAxcXbmiH41hHH6APiJZCOaJPcMo6InHONRQJXsTc9xy0xRy4fPeMbkGf452KakOs4PuYyIqMIjXx3c7CxPqpXie2Pm3sJ4mabKmJp2k5uER55320nxpZCsJBARYJubmmQmUzg1o5VaFPKoyEsig47j7mja874cobZA36naVev5u18b7cZD";
//
//		restTemplate = new RestTemplate();
//
//	    System.out.println(restTemplate.getForObject(uri,
//	            String.class));
//	    =================================================================
//		if ("techgeeknext".equals(username)) {
//			return new User("techgeeknext", 
//					"$2a$10$ixlPY3AAd4ty1l6E2IsQ9OFZi2ba9ZQE0bP7RFcGIWNhyFrrT3YUi",
//					new ArrayList<>());
//		} else {
//			throw new UsernameNotFoundException("User not found with username: " + username);
//		}
		
		return new User(username, 
				"$2a$10$ixlPY3AAd4ty1l6E2IsQ9OFZi2ba9ZQE0bP7RFcGIWNhyFrrT3YUi",
				new ArrayList<>());
	}

}