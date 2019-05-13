package com.proxy;

public class Tissalate implements InternetProxyServer{

	@Override
	public String serverSite(String url)  {
		return String.format("https://%s.com", url);
	}

	
}
