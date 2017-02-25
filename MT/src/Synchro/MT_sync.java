package Synchro;

import java.util.Scanner;

class Processor extends Thread{
	private volatile boolean running = true;

	public Processor(String name) {
		super(name);
	}
	
	public void run(){
		while(running){
			System.out.println(getName());
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void shutdown(){
		running = false;
	}
	
	
}
public class MT_sync {
	public static void main(String args[]){
		Processor proc = new Processor("Hello");
		proc.start();
		extracted().nextLine();
		
		proc.shutdown();
		
		
		
	}

	private static Scanner extracted() {
		return new Scanner(System.in);
	}
}
