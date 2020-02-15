import com.rhocorp.Speaker;

public class Main {

	public static void main(String[] args) {
		
	Speaker sample = new Speaker("Yamaha", "A10", "640 x 420 x 390", "Black", "Bass Reflex ", "8 Ohms", "65Hz - 20KHz", 5.4, 250, 96);
		System.out.println("Brand:\t\t\t" + sample.getBrand());
		System.out.println("Model:\t\t\t" + sample.getModel());
		System.out.println("Bass Principle:\t\t" + sample.getBass());
		System.out.println("Power Capacity:\t\t" + sample.getPower());
		System.out.println("Frequency:\t\t" + sample.getFrequency());
		System.out.println("Impedance:\t\t" + sample.getImpedance());
		System.out.println("Weight(kg):\t\t" + sample.getWeight());
		System.out.println("Sensitivity:\t\t" + sample.getSensitivity() + "dB");
		System.out.println("Dimensions(mm):\t\t" + sample.getDimensions());
		System.out.println("Color:\t\t\t" + sample.getColor());
	}
}