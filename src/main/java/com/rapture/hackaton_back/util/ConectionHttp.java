package com.rapture.hackaton_back.util;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class ConectionHttp {
	
	public static void uploadVideo(String token) throws IOException {
		URL url = new URL("https://api.symbl.ai/v1/process/audio");
		HttpURLConnection urlConection = (HttpURLConnection) url.openConnection();
		urlConection.setRequestMethod("POST");
		urlConection.setRequestProperty("x-api-key", token);
	}
}
