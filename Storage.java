import java.util.ArrayList;

public class Storage implements IStorage{
	
	private ArrayList<Attendee> list = new ArrayList<>();
	
	public void add(Attendee s){
		list.add(s);
	}
	public void delete(int i){
		list.remove(i);
	}
	public int size(){
		return list.size();
	}
	public Attendee retreive(int i){
		return list.get(i);
	}
	
}
