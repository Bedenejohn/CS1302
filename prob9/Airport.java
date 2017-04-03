package prob1;

public class Airport {
	private String city;
	private String charCode;
	private String state;
	private double cord1;
	private double cord2;
	public Airport(String charCode,double cord1,double cord2,String city,String state){
		this.city = city;
		this.charCode = charCode;
		this.state = state;
		this.cord1 = cord1;
		this.cord2 = cord2;
	}
	public Airport(String code){
		this.charCode = code;
		this.city = "";
		this.state = "";
		this.cord1 = 0;
		this.cord2 = 0;
	}
	@Override
	public boolean equals(Object o){
		if(o instanceof Airport){
			Airport a = (Airport)o;
			return charCode.equals(a.getCharCode());
		}
		return true;
	}
	public String getCity(){
		return city;
	}
	public String getCharCode(){
		return charCode;
	}
	public String getState(){
		return state;
	}
	public double getCord1(){
		return cord1;
	}
	public double getCord2(){
		return cord2;
	}
	@Override
	public String toString(){
		String str = charCode + "-" + city + ", " + state + ": " + cord1 + ", " + cord2;
		return str;
	}
	
	
}
