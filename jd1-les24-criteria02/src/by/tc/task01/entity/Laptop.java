package by.tc.task01.entity;

public class Laptop extends Appliance {

	private double batteryCapacity;
	private String os;
	private int memoryRom;
	private int systemMemory;
	private double cpu;
	private double displayInchs;

	public Laptop(String[] params) {
		batteryCapacity = Double.valueOf(params[2].split("=")[1]);
		os = params[3].split("=")[1];
		memoryRom = Integer.valueOf(params[4].split("=")[1]);
		systemMemory = Integer.valueOf(params[5].split("=")[1]);
		cpu = Double.valueOf(params[6].split("=")[1]);
		displayInchs = Double.valueOf(params[7].split("=")[1]);
	}

	public Laptop(double batteryCapacity, String os, int memoryRom, int systemMemory, double cpu, double displayInchs) {
		super();
		this.batteryCapacity = batteryCapacity;
		this.os = os;
		this.memoryRom = memoryRom;
		this.systemMemory = systemMemory;
		this.cpu = cpu;
		this.displayInchs = displayInchs;
	}

	@Override
	public String toString() {
		return "Laptop [batteryCapacity=" + batteryCapacity + ", os=" + os + ", memoryRom=" + memoryRom
				+ ", systemMemory=" + systemMemory + ", cpu=" + cpu + ", displayInchs=" + displayInchs + "]";
	}

	public double getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(double batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public int getMemoryRom() {
		return memoryRom;
	}

	public void setMemoryRom(int memoryRom) {
		this.memoryRom = memoryRom;
	}

	public int getSystemMemory() {
		return systemMemory;
	}

	public void setSystemMemory(int systemMemory) {
		this.systemMemory = systemMemory;
	}

	public double getCpu() {
		return cpu;
	}

	public void setCpu(double cpu) {
		this.cpu = cpu;
	}

	public double getDisplayInchs() {
		return displayInchs;
	}

	public void setDisplayInchs(double displayInchs) {
		this.displayInchs = displayInchs;
	}

}
