package ThreadDemo;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
	public static ScheduledThreadPoolExecutor exe;
	public static int counter=0;
	


	public static void main(String[] args) {
		DeviceName device1=new DeviceName("Pechka");
		DeviceName device2=new DeviceName("Hladilnik");
		DeviceName device3=new DeviceName("Peralnq");
		exe=new ScheduledThreadPoolExecutor(0);
		exe.scheduleAtFixedRate(device1, 0, 1000, TimeUnit.MILLISECONDS);
		exe.scheduleAtFixedRate(device2, 0, 5000, TimeUnit.MILLISECONDS);
		exe.scheduleAtFixedRate(device3, 0, 7500, TimeUnit.MILLISECONDS);
		exe.scheduleAtFixedRate(new StopperThread(), 0, 1000, TimeUnit.MILLISECONDS);
		
		
	}

}
