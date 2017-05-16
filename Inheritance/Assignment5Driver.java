public class Assignment5Driver{
	public static void main(String[] args){
		Vehicle v = new Vehicle();
		v.name();
		v.start();
		v.door();
		Vehicle.engine();
		System.out.println("");

		v = new Car();
		v.name();
		v.start();
		v.door();
		Car.engine();
		System.out.println("");

		v = new Coupe();
		v.name();
		v.start();
		v.door();
		Coupe.engine();
		System.out.println("");

		v = new Truck();
		v.name();
		v.start();
		v.door();
		Truck.engine();
		System.out.println("");

		Thr t = new Thr();
		t.start();

		Thre th = new Thre();
		th.start();


	}

}