package networkprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class ReadURL {
	public static void main(String[] args) {
		try {
			URL url = new URL("http://google.com");
			InputStream iStream = url.openStream();
			InputStreamReader iStreamReader = new InputStreamReader(iStream);
			BufferedReader bReader = new BufferedReader(iStreamReader);
			String dataString = bReader.readLine();
			while(dataString != null) {
				System.out.println(dataString);
				dataString = bReader.readLine();
			}
			bReader.close();
			iStreamReader.close();
			iStream.close();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
