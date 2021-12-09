
	public interface CarAssignment{
		void body();
		void engine();
		void tires();
		void ac();
	public static void main(String[] args) {
			CarAssignment vg = new Polo();
			vg.tires();
			vg.body();
			vg.engine();
			vg.ac();
		}
	}
	
	abstract class Voltswagon implements CarAssignment{
		public void body() {
			System.out.println("Repesents the body of the car");
		}
		public void ac() {
			System.out.println("Represents the car having air conditioning");
		}
		void noac() {
			System.out.println("Represents the car not having air conditioning");
		}
		
   }
	
	 class Polo extends Voltswagon {

		@Override
		public void engine() {
			// TODO Auto-generated method stub
			System.out.println("Main portion");
		}

		@Override
		public void tires() {
			// TODO Auto-generated method stub
			System.out.println("Wheeles go round and round");
		}
		
	}
	
	 class Wabc extends Voltswagon{

		@Override
		public void engine() {
			// TODO Auto-generated method stub
			System.out.println("Another main portion");
		}

		@Override
		public void tires() {
			// TODO Auto-generated method stub
			System.out.println("These wheeles are made to race");
		}
	}


	

