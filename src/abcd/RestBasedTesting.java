package abcd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class RestBasedTesting {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
URL l = new URL("https://maps.googleapis.com/maps/api/geocode/json?address=TrendSet,Vijayawada");


HttpURLConnection con = (HttpURLConnection) l.openConnection();


InputStreamReader i = new InputStreamReader((InputStream) con.getContent());

BufferedReader br = new BufferedReader(i);

String x;

while((x=br.readLine())!=null) {
	
	System.out.println(x);
	
}

	}

}
