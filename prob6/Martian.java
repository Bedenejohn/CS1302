package prob1;

public abstract class Martian {
	private int id;
	private int volume;
	public Martian(int id){
		this.id = id;
	}
	public boolean equals(Object o){
		if(o instanceof Martian){
			Martian p = (Martian) o;
			return p.id == this.id;
		}
		return false;
	}
	public int compareTo(Martian m){
		return id.compareTo(m.getId());
	}
	public Martian clone(){
		Martian result = this.clone();
		return result;
	}
	public int getId(){
		return id;
	}
	public int getVolume(){
		return volume;
	}
	public void setVolume(int level){
		this.volume = level;
	}
	public abstract String speak();

	public String toString(){
		String result = String.format("id=%d volume=%d",id,volume);
		return result;
	}
}
