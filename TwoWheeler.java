package week1.day1;

public class TwoWheeler {

	int noOfWheels = 2 ;
	short noOfMirrors = 2;
	long chassisNumber = 123456;
	boolean isPunctured = false;
	String bikeName = "Pulsar";
	double runningKM = 40.05;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TwoWheeler pulsar = new TwoWheeler();
		System.out.println(pulsar.noOfWheels);
		System.out.println(pulsar.noOfMirrors);
		System.out.println(pulsar.chassisNumber);
		System.out.println(pulsar.isPunctured);
		System.out.println(pulsar.bikeName);
		System.out.println(pulsar.runningKM);

	}

}
