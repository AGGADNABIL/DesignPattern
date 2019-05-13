package com.proxy;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProxyInternet implements InternetProxyServer {
	
	private List<String> deniedSites =Stream.of("facebook","youtube","twitter").collect(Collectors.toList());

	@Override
	public String serverSite(String url) {
		if (deniedSites.contains(url)) {
			return url+" ce site n'est pas autorisé";
		}
		
		return new Tissalate().serverSite(url);
	}

}
