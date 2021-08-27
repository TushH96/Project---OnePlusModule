package examples;

public class A {

	public static void main(String[] args) {
		
		
/*		// Anonymous inner class
		myinterface my = new myinterface() {
			
			@Override
			public void show() {
				// TODO Auto-generated method stub
				System.out.println("hello");
			}
		};
		
		my.show();
	}*/
	
	/*	//Lambda Expression
		myinterface lambda = () ->{System.out.println("Tushar");};
		lambda.show();
	}*/
		
	/*	//Lambda Expression
		myinterface lambda = (int s) ->{System.out.println("Value is = "+s);};
		lambda.show(20);*/
		
		
		/*//Lambda Expression
				myinterface lambda = s ->System.out.println("Value is = "+s);
				lambda.show(20);*/
				
	/*	//Lambda Expression
		myinterface lambda = (ss,tt) ->System.out.println("Value is = "+ss +" , "+ tt);
		lambda.show(20,40);*/
		
		//Lambda Expression
		myinterface lambda = (ss,tt) ->{ return(ss+tt);};
		System.out.println(lambda.show(20,40));
		
		
	/*	//Lambda Expression
		myinterface lambda = (ss,tt) ->(ss+tt);
		System.out.println("Addition is : "+lambda.show(20,40));*/
		
		
	}
}


