package project0906;
class Car{
	String color;
	int speed;
	
	Car(){
		System.out.println("Car생성자");//생성자
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	void upSpeed(int value) {
		speed=speed+value;
	}
	
	void downSpeed(int value) {
		speed=speed-value;
	}
	
}

class Sedan extends Car{
	int seatnum;
	
	Sedan (){
		System.out.println("Sedan생성자");}

	public int getSeatnum() {
		return seatnum;
	}

	public void setSeatnum(int seatnum) {
		this.seatnum = seatnum;
	}
}

class Truck extends Car{
	 int Capacity;
}
public class Exam01 {

	public static void main(String[] args) {
	
		Sedan s1=new Sedan();
		s1.setColor("빨강");
		s1.setSpeed(100);

	}

}
