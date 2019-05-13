package com.proxy;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DriverProxy {
	public static void main(String[] args) {
		List<String> sites =Stream.of("facebook","youtube","twitter",
									  "avajava" ,"abroun" ,"aliExpress")
								  .collect(Collectors.toList());
		InternetProxyServer ips = new ProxyInternet();
		sites.forEach(url-> System.out.println(ips.serverSite(url)));	
	}
}

