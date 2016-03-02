
public class Contact {
	
	private ISend serviceType = null;
	
	public Contact(ISend serviceType){
		this.serviceType=serviceType;
	}
	public void sendMessage(String msg_from, String msg_to, String message){
		serviceType.sendMessage(msg_from, msg_to, message);
	}
}
