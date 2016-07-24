
public class Class3 {
	
	public static void main(String[] args) {
		int age=17;
		if(age<16){
			System.out.println("You can't drive");
		}
		else if(age>=16 && age<18){
			System.out.println("You can't vote");
		}
		else if(age>=18 && age<25){
			System.out.println("You can't rent a car");
		}
		else{
			System.out.println("You can do anyting that is legal.");
		}
	}

}
