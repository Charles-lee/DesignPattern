package org.kosta;

public class ChocolateTopping extends Topping{

	public ChocolateTopping(Cookie cookie) {
		super(cookie);
	}

	@Override
	public String getName() {
		return "���ݸ��� " + cookie.getName();
	}
}
