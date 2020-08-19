package by.tc.task01.entity;

public class Oven extends Appliance {
	private int powerConsumption;
	private int weight;
	private int capacity;
	private double depth;
	private double height;
	private double width;

	public Oven(String[] params) {
		powerConsumption = Integer.valueOf(params[2].split("=")[1]);
		weight = Integer.valueOf(params[3].split("=")[1]);
		capacity = Integer.valueOf(params[4].split("=")[1]);
		depth = Double.valueOf(params[5].split("=")[1]);
		height = Double.valueOf(params[6].split("=")[1]);
		width = Double.valueOf(params[7].split("=")[1]);
	}

	public Oven(int powerConsumption, int weight, int capacity, double depth, double height, double width) {
		super();
		this.powerConsumption = powerConsumption;
		this.weight = weight;
		this.capacity = capacity;
		this.depth = depth;
		this.height = height;
		this.width = width;
	}

	@Override
	public String toString() {
		return "Oven [powerConsumption=" + powerConsumption + ", weight=" + weight + ", capacity=" + capacity
				+ ", depth=" + depth + ", height=" + height + ", width=" + width + "]";
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

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public double getDepth() {
		return depth;
	}

	public void setDepth(double depth) {
		this.depth = depth;
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
