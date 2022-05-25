package io.automatiko.examples.model;

import io.quarkus.funqy.Funq;

public class UserFunction {

	@Funq
	public User process(User user) {
		user.setUsername(user.getFirstName()+ "-" + user.getLastName());
		return user;
	}
}
