package by.tc.task01.entity;

public class Refrigerator extends Appliance {
	private int powerConsumption;
	private int weight;
	private double freezerCapacity;
	private double overallCapacity;
	private double height;
	private double width;

	public Refrigerator(String[] params) {
		powerConsumption = Integer.valueOf(params[2].split("=")[1]);
		weight = Integer.valueOf(params[3].split("=")[1]);
		freezerCapacity = Double.valueOf(params[4].split("=")[1]);
		overallCapacity = Double.valueOf(params[5].split("=")[1]);
		height = Double.valueOf(params[6].split("=")[1]);
		width = Double.valueOf(params[7].split("=")[1]);
	}

	public Refrigerator(int powerConsumption, int weight, double freezerCapacity, double overallCapacity, double height,
			double width) {
		super();
		this.powerConsumption = powerConsumption;
		this.weight = weight;
		this.freezerCapacity = freezerCapacity;
		this.overallCapacity = overallCapacity;
		this.height = height;
		this.width = width;
	}

	@Override
	public String toString() {
		return "Refrigerator [powerConsumption=" + powerConsumption + ", weight=" + weight + ", freezerCapacity="
				+ freezerCapacity + ", overallCapacity=" + overallCapacity + ", height=" + height + ", width=" + width
				+ "]";
	}

	public int getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public double getFreezerCapacity() {
		return freezerCapacity;
	}

	public void setFreezerCapacity(double freezerCapacity) {
		this.freezerCapacity = freezerCapacity;
	}

	public double getOverallCapacity() {
		return overallCapacity;
	}

	public void setOverallCapacity(double overallCapacity) {
		this.overallCapacity = overallCapacity;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

}
