package StudentDemo;
import java.util.Scanner;
public class SMS2{
	private int rollno;
	String name;
	static String School_name;
	String address;
	String course;
	
	static {
		School_name = "COLECTOR SCHOOL";
	}
	SMS2() {
		
	}
	SMS2 Add(int l) {
		SMS2 o = new SMS2();
		if(l>1000) {
			System.out.println("over flow");
		}else {
			try
			{   System.out.println("..................................................................................................................................");
				System.out.println("###STUDENT MANGEMENT SYSTEM###");
				System.out.println("..................................................................................................................................");
				Scanner s = new Scanner(System.in);
				System.out.println("Enter name:");
				o.name=s.next();
				System.out.println("Enter Address:");
				o.address=s.next();
				System.out.println("Enter Course:");
				o.course=s.next();
				System.out.println("Enter rollno:");
				o.rollno=s.nextInt();
				
			}
				catch(Exception e) {
					System.out.println(e);
					e.getMessage();
			}
		}
		return(o);
	}
	void search(int rollno,int l,SMS2 s[]) {
		for(int i=0;i<l;i++){
		
			if(s[i].rollno==rollno){
			
				  s[i].display(s[i]);
				
			}
		}
	}
		boolean delete(int rollno,SMS2 o[], int l) {
			boolean t=false;
			for(int i=0;i<l;i++) {
				if(rollno==o[i].rollno) {
					for(int j=i;j< l - 1;j++) {
						o[j]=o[ j+1];
					}
					t=true;
					return(t);
				}
			}
				return(t);
			}
		
boolean update(int rollno,SMS2 obj[],int l) {
	boolean t = false;
	for(int i=0;i<l;i++) {
		if(rollno==obj[i].rollno) {
			try{System.out.println("........................................");
			
			Scanner s= new Scanner(System.in);
			System.out.println("Enter name :");
			obj[i].name=s.next();
			System.out.println("Enter address :");
			obj[i].address=s.next();
			System.out.println("Enter course :");
			obj[i].course=s.next();
			
			
			t=true;
			return(t);
			
			}catch(Exception e) {
				System.out.println(e);
				e.getMessage();
			}
		}
			}
				return(t);
}
void display(SMS2 s) {
	System.out.println("........................#######################..........................");
	System.out.println(" name :" + s.name);
	System.out.println(" Address:" + s.address);
	System.out.println(" course :" + s.course);
	System.out.println(" rollno :" + s.rollno);
	System.out.println("...............########################.................");
}


void show(int l,SMS2 s[]) {
	for(int i=0;i<l;i++) {
		System.out.println(".....................................................");
		System.out.println(" Name       :" + s[i ].name);
		System.out.println(" Address       :" + s[i ].address);
		System.out.println(" course       :" + s[i ].course);
		System.out.println(" rollno.       :" + s[i ].rollno);
		System.out.println(".....................................................");
	}
		
}

public static void main(String args[]) {
	SMS2 obj[]=new SMS2[1000];
	Scanner s = new Scanner(System.in);
	boolean f = true;
	int choice;
	int l = 0;
	int r;
	SMS2 o=new SMS2();
	
	do {
		try {System.out.println("### WELCOME ###");
		       System.out.println("Enter your choice");
		       System.out.println("#############################################");
		       System.out.println("1)..........................Add");
		       System.out.println("2)..........................Delete");
		       System.out.println("3)..........................Search");
		       System.out.println("4)..........................Update");
		       System.out.println("5)..........................Display");
		       System.out.println("##############################################");
		       choice =s.nextInt();
		       
		       
		       try {
		    	   switch(choice) {
		    	   case 1:
		    		   
		    		   obj[l]=o.Add(l);
		    		   l++;
		    		   break;
		    	   case 2:
		    		   
		    		   System.out.println("Enter rollno.for deletion");
		    		   r=s.nextInt();
		    		   boolean b=o.delete(r, obj, l);
		    		   if(b=true) {l--;
		    		   System.out.println(".........###################...................");
		    		      System.out.println("Successfully deleted");
		    		   }else {
		    			   System.out.println("rollno.not found");
		    		   }
		    		   break;
		    	   case 3:System.out.println("Enter rollno.to search student");
	    		   r=s.nextInt();
	    		  o.search(r, l, obj);
	    		  break;
	    		  
		    	   case 4:
		    		   System.out.println("Enter rollno.for update");
		    		   r=s.nextInt();
		    		   boolean c=o.update(r, obj, l);
		    		   if(c=true) {
		    			   System.out.println("Successfully updated");
		    		   }else {
		    				   System.out.println("rollno.not found");
		    				   
		    			   }
		    		   break;
		    	   case 5:
		    		   o.show(l, obj);
		    		   default:
		    			   System.out.println("Enter right choice");
		    	   }
		    	   
		       }catch(Exception m) {
		    	   System.out.println(m);
		       }
		}catch(Exception e) {
		
		System.out.println(e);
		}
	System.out.println("Want to do more....true/false");
	f = s.nextBoolean();
	}while(f);

}
		       
	}


		    		   
		    		   		
					
	
	


