package com.tchoko.springboot.bookstore.domain.security;

import org.springframework.security.core.GrantedAuthority;

public class Authority implements GrantedAuthority {
	private static final long serialVersionUID = 1L;
	private final String autority;

	public Authority(String autority) {
		super();
		this.autority = autority;
	}

	@Override
	public String getAuthority() {
		return autority;
	}

}
