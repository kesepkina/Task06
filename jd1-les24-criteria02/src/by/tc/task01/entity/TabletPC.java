package by.tc.task01.entity;

public class TabletPC extends Appliance {
	private int batteryCapacity;
	private int displayInches;
	private int memoryRom;
	private int flashMemoryCapacity;
	private String colour;

	public TabletPC(String[] params) {
		batteryCapacity = Integer.valueOf(params[2].split("=")[1]);
		displayInches = Integer.valueOf(params[3].split("=")[1]);
		memoryRom = Integer.valueOf(params[4].split("=")[1]);
		flashMemoryCapacity = Integer.valueOf(params[5].split("=")[1]);
		colour = params[6].split("=")[1];
	}

	public TabletPC(int batteryCapacity, int displayInches, int memoryRom, int flashMemoryCapacity, String colour) {
		super();
		this.batteryCapacity = batteryCapacity;
		this.displayInches = displayInches;
		this.memoryRom = memoryRom;
		this.flashMemoryCapacity = flashMemoryCapacity;
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "TabletPC [batteryCapacity=" + batteryCapacity + ", displayInches=" + displayInches + ", memoryRom="
				+ memoryRom + ", flashMemoryCapacity=" + flashMemoryCapacity + ", colour=" + colour + "]";
	}

	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public int getDisplayInches() {
		return displayInches;
	}

	public void setDisplayInches(int displayInches) {
		this.displayInches = displayInches;
	}

	public int getMemoryRom() {
		return memoryRom;
	}

	public void setMemoryRom(int memoryRom) {
		this.memoryRom = memoryRom;
	}

	public int getFlashMemoryCapacity() {
		return flashMemoryCapacity;
	}

	public void setFlashMemoryCapacity(int flashMemoryCapacity) {
		this.flashMemoryCapacity = flashMemoryCapacity;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

}
