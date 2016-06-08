import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream.GetField;
import java.util.Properties;



public class sss {

	public static void main(String[] args) {
		
		
				FileInputStream inputStream = null;
				Properties prop = new Properties();
					
					try {
						inputStream = new FileInputStream("C:/My Works/JavaEclipse/AutomationTesting/src/test/resources/CAIFramework.properties");
						prop.load(inputStream);
						inputStream.close();
					} catch (Exception e) {
						System.out.println("sdfds");
						e.printStackTrace();
					}
				
				
			
		
	}
	
}
