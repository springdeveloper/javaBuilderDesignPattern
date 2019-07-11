package com.app.navneet.proxy;

public class AppRun {

	public static void main(String[] args) {

		BankService service=new BankServiceProxy();
		service.sendMessgae("Hello");
	}

}
