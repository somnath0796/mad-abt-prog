/**
 * 
 */
package Demo1;

/**
 * @author Somnath
 *
 */

class Runner extends Thread{
	

	public Runner() {
		super();
		this.start();
	}

	@Override
	public void run() {
		
		for(int i=0;i<10;i++){
			System.out.println("Hi Friends: "+i);
			try{
				sleep(100);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	
}
public class App {


	public static void main(String[] args) {
		Runner run = new Runner();
		

	}

}
