package ThreadDemo;

public class DeviceName implements Runnable{
	private String deviceName;
	private boolean isRunning=false;
	public DeviceName(String deviceName) {
		super();
		this.deviceName = deviceName;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	@Override
	public void run() {
		if(isRunning==true){
			System.out.println(deviceName + " is running");
		}else{
			System.out.println(deviceName + " is not running");
		}
		
		isRunning=!isRunning;
		
	}

}
