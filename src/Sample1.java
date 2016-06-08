import java.io.FileReader;



import java.net.URL;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.google.common.io.Resources;

public class Sample1 {

	public static void main(String[] args) {

		JSONParser js = new JSONParser();
		
		try {
			
			
			//String s = (String) ClassLoader.getSystemResources("GlobalObjects.json");
			
			URL url = Resources.getResource("GlobalObjects.json");
			System.out.println(url);
			String result = java.net.URLDecoder.decode(url.toString(), "UTF-8");
			result = result.replaceAll("file:/", "");
			System.out.println(result);

			
			
			Object obj = js
					.parse(new FileReader(result));
			
			
			JSONObject jsObj = (JSONObject) obj;
			System.out.println(jsObj.get("application name"));
			System.out.println(jsObj.get("version"));
			System.out.println(jsObj.get("type"));
		} catch (Exception e) {
			System.out.println("Fail");
		}
	}
}
