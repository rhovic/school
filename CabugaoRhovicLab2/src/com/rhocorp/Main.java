package com.rhocorp;

public class Main {

	public static void main(String[] args) {
		Speaker s1 = new Speaker("Yamaha", "A10", "640 x 420 x 390", "Black", "Bass Reflex", "8 Ohms", "65Hz - 20KHz", 5.4, 250, 96);
		GamingSpeaker s2 = new GamingSpeaker("Logitech", "Z625", "282 x 303 x 264", "Black", "Subwoofer", "N/A", "N/A", 6.5, 400, 96);
		BluetoothSpeaker s3 = new BluetoothSpeaker("Marshall", "Stockwell II", "178 x 152 x 71", "Black", "N/A", "N/A", "N/A", 1.38, 100, 80);
			
		//override
		s3.setBrand("Bose");
		s3.setModel("Soundlink Mini II");
		s3.setDimensions("208 x 189 x 102");
		s3.setColor("Black");
		s3.setBass("N/A");
		s3.setFrequency("N/A");
		s3.setImpedance("N/A");
		s3.setWeight(0.68);
		s3.setSensitivity(80);
		s3.setPower(110);
		
		s2.setBrand("Haisen");
		s2.setModel("MK2");
		s2.setDimensions("305 x 150 x 305");
		s2.setColor("Gray");
		s2.setBass("Subwoofer");
		s2.setFrequency("N/A");
		s2.setImpedance("N/A");
		s2.setWeight(3.5);
		s2.setSensitivity(78);
		s2.setPower(20);
		
		s1.setBrand("Samsung");
		s1.setModel("Sound Bar Magic");
		s1.setDimensions("700 x 105 x 105");
		s1.setColor("Black");
		s1.setBass("Subwoofer");
		s1.setFrequency("65Hz - 20KHz");
		s1.setImpedance("10 Ohms");
		s1.setWeight(5.78);
		s1.setSensitivity(98);
		s1.setPower(450);
		
		//Speaker 2
				System.out.println("\n\nBrand:\t\t\t" + s1.getBrand());
				System.out.println("Model:\t\t\t" + s1.getModel());
				System.out.println("Bass Principle:\t\t" + s1.getBass());
				System.out.println("Power Capacity:\t\t" + s1.getPower());
				System.out.println("Frequency:\t\t" + s1.getFrequency());
				System.out.println("Impedance:\t\t" + s1.getImpedance());
				System.out.println("Weight(kg):\t\t" + s1.getWeight());
				System.out.println("Sensitivity:\t\t" + s1.getSensitivity() + "dB");
				System.out.println("Dimensions(mm):\t\t" + s1.getDimensions());
				System.out.println("Color:\t\t\t" + s1.getColor());
				
				//GamingSpeaker 2
				System.out.println("\n\n");
				s2.print();
				System.out.println("Brand:\t\t\t" + s2.getBrand());
				System.out.println("Model:\t\t\t" + s2.getModel());
				System.out.println("Bass Principle:\t\t" + s2.getBass());
				System.out.println("Power Capacity:\t\t" + s2.getPower());
				System.out.print("Frequency:\t\t" + s2.getFrequency());
				s2.noDetails();
				System.out.print("\nImpedance:\t\t" + s2.getImpedance());
				s2.noDetails();
				System.out.println("\nWeight(kg):\t\t" + s2.getWeight());
				System.out.println("Sensitivity:\t\t" + s2.getSensitivity() + "dB");
				System.out.println("Dimensions(mm):\t\t" + s2.getDimensions());
				System.out.println("Color:\t\t\t" + s2.getColor());
				
				//BluetoothSpeaker 2
				System.out.println("\n\n");
				s3.print(0);
				System.out.println("Brand:\t\t\t" + s3.getBrand());
				System.out.println("Model:\t\t\t" + s3.getModel());
				System.out.print("Bass Principle:\t\t" + s3.getBass());
				s3.noDetails();
				System.out.println("\nPower Capacity:\t\t" + s3.getPower());
				System.out.print("Frequency:\t\t" + s3.getFrequency());
				s3.noDetails();
				System.out.print("\nImpedance:\t\t" + s3.getImpedance());
				s3.noDetails();
				System.out.println("\nWeight(kg):\t\t" + s3.getWeight());
				System.out.println("Sensitivity:\t\t" + s3.getSensitivity() + "dB");
				System.out.println("Dimensions(mm):\t\t" + s3.getDimensions());
				System.out.println("Color:\t\t\t" + s3.getColor());
		
				Speaker bose = new BluetoothSpeaker("Bose", "Soundlink Mini II", "208 x 189 x 102", "Black", "N/A", "N/A", "N/A", 0.68, 110, 80);
				
				System.out.println("\t\n\t Brands");
				bose.listAllBrand(s1.getBrand(), s2.getBrand(), s3.getBrand());
				
	}

}
