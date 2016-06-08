import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class Sample {

	public static void main(String[] args) {
		JSONParser js = new JSONParser();
		try {
			
			Object obj = js.parse(new FileReader("resources/GlobalObjects.json"));
			JSONObject jsObj = (JSONObject) obj;
			System.out.println(jsObj.get("application name"));
			System.out.println(jsObj.get("version"));
			System.out.println(jsObj.get("type"));
			//System.out.println(jsObj.get("MemberInfoPage"));
			
			JSONObject jsObj1 = (JSONObject) jsObj.get("MemberInfo-Page");
			JSONObject jsObj2 = (JSONObject) jsObj1.get("MemberID2");
			
			System.out.println(jsObj2.get("description"));

			
			
			/*
			JSONArray jsArr = (JSONArray) jsObj.get("MemberInfo-Page");
			System.out.println(jsArr.size());
			JSONObject jsObj1 = (JSONObject) jsArr.get(1);
			
			
			System.out.println(jsObj1.get("name"));
			System.out.println(jsObj.get("application name"));
			System.out.println(jsObj.get("version"));
			System.out.println(jsObj.get("type"));
			System.out.println(jsObj.get("MemberInfoPage"));
			
			*/
			
			
			
		} catch (ParseException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
