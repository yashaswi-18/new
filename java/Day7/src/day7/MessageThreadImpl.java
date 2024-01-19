package day7;

public class MessageThreadImpl extends Thread {

	private String message;
	private int delayTime;
	public MessageThreadImpl(String message, int delayTime) {
	
		this.message = message;
		this.delayTime = delayTime;
	}
	@Override
	public void run()
	{
		for(int a=0;a<=10;a++)
		{
			System.out.println(message);
			try {
				Thread.sleep(delayTime);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}
