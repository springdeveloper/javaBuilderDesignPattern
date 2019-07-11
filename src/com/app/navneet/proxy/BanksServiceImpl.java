package com.app.navneet.proxy;

public class BanksServiceImpl implements BankService{


	@Override
	public String sendMessgae(String message) {
         System.out.println("Send Transaction Message   "+message);		
         
         return "Hi";
	}


}
