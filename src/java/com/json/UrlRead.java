package com.json;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;

public class UrlRead {
    public static void main(String[] args) {
        try {
			URL url = new URL("https://ghibliapi.herokuapp.com/films");
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			String str = "";
                        try (FileWriter file = new FileWriter("A:/Instaspaces/Ram/web.html")) {
			while (null != (str = br.readLine())) {
                            file.append(str);
				System.out.println(str);
			}
                        }
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		   
	}
}

   