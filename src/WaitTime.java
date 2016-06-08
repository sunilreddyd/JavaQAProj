
public enum WaitTime {
	
	//x ((double)getVal());
	TOO_HIGH (20), 	HIGH (15), 	MEDIUM(10), LOW(5), TOO_LOW(1);
	
	private final double waitTime;
	
	WaitTime(double waitTime){
		this.waitTime = waitTime;
	}
	
	
	
	public void setHighTimeValue(){
		//TOO_HIGH (30);
		
	}
	
	
	public static double getVal(){
		return 5;
	}
}
