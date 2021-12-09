import java.util.Scanner;

class Assignment8 {
	double billpayer;
	void Bill(double units) {
		if(units < 100)
			billpayer = units*1.40;
		else if(units <= 300)
			billpayer = 100 * 1.50 + (units - 100);
		else if(units > 300)
			billpayer = 100 * 1.50 + 150 * 2 * (units-200) * 2;
	}
	
static class PowerBill extends Assignment8{
	public static void main(String[] args) {
		double units;
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the number of watts");
		units = sc1.nextLong();
		PowerBill pb = new PowerBill();
		pb.Bill(units);
		System.out.println("Power Bill to pay: " + pb.billpayer);
	} 
	
static class WaterBill extends Assignment8{
	public static void main (String[] args) {
		double units;
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter the number of gallons");
		units = sc2.nextLong();
		WaterBill wb = new WaterBill();
		wb.Bill(units);
		System.out.println("Water Bill to pay: " + wb.billpayer);
		
}
	
	
}
}
}
