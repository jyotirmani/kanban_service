package com.kanban;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/user")
public class UserResource {
	
	@GetMapping
	public List<User> getUsers() {
		
		return Arrays.asList(
				new User("Sam", "CDT"),
				new User("Kam", "PDT"),
				new User("Jam", "AWT")
				);
	}
	
	@GetMapping("/{userName}")
	public User getUser(@PathVariable("userName") final String userName) {
		
		return new User("userName", "AWST");
	}
	
	public class User {
		private String userName;
		
		private String team;
		
		public User(String userName, String salary) {
			this.userName = userName;
			this.team = team;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getTeam() {
			return team;
		}

		public void setTeam(String team) {
			this.team = team;
		}
	}

}
