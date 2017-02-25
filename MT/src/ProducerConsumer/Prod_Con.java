package ProducerConsumer;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Prod_Con {
	
	private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);
	private static volatile boolean running = true;
	
	public static void producer() throws InterruptedException{
		Random rand = new Random();
		
		while(running){
			queue.put(rand.nextInt(100));
			
		}
	}
	
	public static void consumer() throws InterruptedException{
		Random rand = new Random();
		
		while(running){
			long start = System.currentTimeMillis();
			Thread.sleep(100);
			
			if(rand.nextInt(10)==0){
				Integer value = queue.take();
				long end = System.currentTimeMillis();
				System.out.println("Taken: "+value+" ; Queue size: "+queue.size()+"; Time taken: "+(end-start));
			}
		}
	}
	
	
	public void shutdown(Thread t1, Thread t2) throws InterruptedException{
		running =  false;
		t1.wait();
		t2.wait();
	}
	

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Press return to stop...");
		Thread.sleep(2000);
		System.out.println("Starting System....");
		Thread t1 = new Thread(new Runnable(){
			
			public void run() {
				try {
					producer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});
		
		Thread t2 = new Thread(new Runnable(){
			
			public void run() {
				try {
					consumer();
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
			
		});
		
		t1.start();
		t2.start();
		
		new Scanner(System.in).nextLine();
		
		Prod_Con p = new Prod_Con();
		p.shutdown(t1,t2);
		
		t1.join();
		t2.join();
		
		
		
		
	}

}
