package com.app.navneet.proxy;

public class BankServiceProxy extends BanksServiceImpl {

	@Override
	public String sendMessgae(String message) {

		System.out.println("Send Transaction Message Proxy   " + message);
		return super.sendMessgae(message);

	}
}
