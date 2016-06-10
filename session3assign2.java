package acadgild.assignments;

public class session3assign2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To find if the given num is Prime.
		
		int num=97,i;
		int modulus=0;
	
		for(i=2;i<num;i++){
			
			modulus=num%i;
			if(modulus==0){
				System.out.println("The given number "+num+" is not a Prime number!");
				break;
			}
			
			
		}
		if(modulus!=0){
		System.out.println("The given number "+num+" is a Prime number!");
			
			
		}
		
	}

	}


