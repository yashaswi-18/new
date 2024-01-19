package day7;

public class MessageThreadImplMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new MessageThreadImpl("Yashaswi" , 1000);
		Thread t2 = new MessageThreadImpl("Patil" , 500);

		t1.start();
		t2.start();
       //t1.run();
      //  t2.run();
	}

}
