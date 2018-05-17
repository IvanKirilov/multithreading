package ThreadDemo;

public class StopperThread implements Runnable{

	@Override
	public void run() {
		Main.counter++;
		if(Main.counter>23){
			Main.exe.shutdown();
		}
		
	}

}
