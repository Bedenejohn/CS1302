package prob1;

public class GreenMartian extends Martian {
	public GreenMartian(int id){
		super(id);
	}
	public String speak(){
		String result = String.format("id=%d Grobdly Grock", getId());
		return result;
	}
	public String teleport(String dest){
		String result = String.format("id=%d teleporting to %s", getId(), dest);
		return result;
	}
}
