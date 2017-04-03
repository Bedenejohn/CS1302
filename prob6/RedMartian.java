package prob1;

public class RedMartian extends Martian {
	public RedMartian(int id){
		super(id);
	}
	public String speak(){
		String result = String.format("id=%d Rubldy Rock", getId());
		return result;
	}
	public String toString(){
		String result = String.format("id=%d volume=%d",getId(), getVolume());
		return result;
	}
	
}
