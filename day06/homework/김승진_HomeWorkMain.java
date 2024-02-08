package my.day06.homework;

public class 김승진_HomeWorkMain {

	public static void main(String[] args) {

		System.out.println("\n== 숙제 1 ==\n");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
		
		/*
		 
		   for (i = 0) 일 때 {
		   for (j = 0; j < 0; false) {
		   }
		   sysout "*" "\n"
		   }
		   결과 : 
		   *
		   
		   for (i = 1) 일 때 {
		   for (j = 0; 0 < 1; true) {
		   sysout "*"
		   for (j = 1; 1 < 1; false)
		   }
		   sysout "*" "\n"
		   }
		   결과 : 
		   *
		   **
		   
		   
		   for (i = 2) 일 때 {
		   for (j = 0; 0 < 2; true) {
   		   sysout "*"
		   for (j = 1; 1 < 2; true)
		   sysout "*"		   
		   for (j = 2; 2 < 2; flase)
		   }
		   sysout "*" "\n"
		   }
		   결과 : 
		   *
		   **
		   ***
		   		   
		   for (i = 3) 일 때 {
		   for (j = 0; 0 < 3; true) {
   		   sysout "*"
		   for (j = 1; 1 < 3; true)
		   sysout "*"		   
		   for (j = 2; 2 < 3; true)
		   sysout "*"		   
		   for (j = 3; 3 < 2; flase) 
		   }
		   sysout "*" "\n"
		   }
   		   결과 : 
		   *
		   **
		   ***
		   ****
		   
		   for (i = 4) 일 때 {
		   for (j = 0; 0 < 4; true) {
   		   sysout "*"
		   for (j = 1; 1 < 4; true)
		   sysout "*"		   
		   for (j = 2; 2 < 4; true)
		   sysout "*"		   
		   for (j = 3; 3 < 4; true)
		   sysout "*"		   
		   for (j = 4; 4 < 4; flase)
		   }
		   sysout "*" "\n"
		   } 
  		   결과 : 
		   *
		   **
		   ***
		   ****
		   *****
		   
		   for (i = 5; 5 < 5; flase)
		    
		    
		 */
		
		  /*
	       == 숙제 1 == 
	      *
	      **
	      ***
	      ****
	      *****
	      */       
		
		
		System.out.println("\n== 숙제 2 ==\n");
		for (int i = 0; i < 5; i++) {
			System.out.println();
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
			System.out.print("*");
			}
		}
		
		/*
		   
		   for (i = 0;) 일 때 {
		   sysout "\n"
		   for (j = 5; 5 > 0; true) {
		   sysout " "
		   for (j = 4; 4 > 0; true) 
		   sysout " "
		   for (j = 3; 3 > 0; true) 
		   sysout " "
		   for (j = 2; 2 > 0; true) 
		   sysout " "
		   for (j = 1; 1 > 0; true) 
		   sysout " "
   		   for (j = 0; 0 > 0; false) 
		   }
		   for(k = 0; 0 <= 0; true) {
		   sysout "*"
		   for(k = 1; 1 <= 0; false)
		   	}
		   }
		   
		   for (i = 1;) 일 때 {
   		   sysout "\n"
		   for (j = 5; 5 > 1; true) {
		   sysout " "
		   for (j = 4; 4 > 1; true) 
		   sysout " "
		   for (j = 3; 3 > 1; true) 
		   sysout " "
		   for (j = 2; 2 > 1; true) 
		   sysout " "
		   for (j = 1; 1 > 1; false) 
		   }
		   for(k = 0; 0 <= 1; true) {
		   sysout "*"
		   for(k = 1; 1 <= 1; true)
   		   sysout "*"
   		   for(k = 2; 2 <= 1; false)
		   	}
		   }
		   
		   for (i = 2;) 일 때 {
   		   sysout "\n"
		   for (j = 5; 5 > 2; true) {
		   sysout " "
		   for (j = 4; 4 > 2; true) 
		   sysout " "
		   for (j = 3; 3 > 2; true) 
		   sysout " "
		   for (j = 2; 2 > 2; false) 
		   sysout " "
		   for (j = 1; 1 > 1; false) 
		   }
		   for(k = 0; 0 <= 2; true) {
		   sysout "*"
		   for(k = 1; 1 <= 2; true)
   		   sysout "*"
   		   for(k = 2; 2 <= 2; true)
   		   sysout "*"
   		   for(k = 3; 2 <= 3; false)
		   	}
		   }
		   
		   for (i = 3;) 일 때 {
   		   sysout "\n"
		   for (j = 5; 5 > 3; true) {
		   sysout " "
		   for (j = 4; 4 > 3; true) 
		   sysout " "
		   for (j = 3; 3 > 3; false) 
		   }
		   for(k = 0; 0 <= 3; true) {
		   sysout "*"
		   for(k = 1; 1 <= 3; true)
   		   sysout "*"
   		   for(k = 2; 2 <= 3; true)
   		   sysout "*"
   		   for(k = 3; 3 <= 3; true)
   		   sysout "*"
   		   for(k = 4; 4 <= 3; false)
		   	}
		   }
		   
		   for (i = 4;) 일 때 {
   		   sysout "\n"
		   for (j = 5; 5 > 4; true) {
		   sysout " "
		   for (j = 4; 4 > 4; false) 
		   }
		   for(k = 0; 0 <= 3; true) {
		   sysout "*"
		   for(k = 1; 1 <= 4; true)
   		   sysout "*"
   		   for(k = 2; 2 <= 4; true)
   		   sysout "*"
   		   for(k = 3; 3 <= 4; true)
   		   sysout "*"
   		   for(k = 4; 4 <= 4; true)
   		   sysout "*"
   		   for(k = 5; 5 <= 4; false)
		   	}
		   }
		   
   		   for (i = 5; 5 < 5; false)

		   
		   
		 */
		
		/*
	      == 숙제 2 == 
	              *
	             **
	            ***
	           ****
	          ***** 
		*/
		
	        System.out.println();
	        
			System.out.println("\n== 3번 반대방향 ==\n");
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < i; j++) {
					System.out.print(" ");
				}
				for (int k = 5; k > i; k--) {
					System.out.print("*");
				}
				System.out.println();
			}
			
	      /*       
	      == 3번 반대방향 == 
			*****
			 ****
			  ***
			   **
			    *
		 */

			
		System.out.println("\n== 숙제 3 ==\n");
		
		for (int i = 1; i <= 5; i++) {
			
			for (int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println("*");

		}
		
		
		/*
	      == 숙제 3 == 
	      *****   
	      ****    
	      ***    
	      **     
	      *  
	     */
	      
		
		
		System.out.println("\n== 숙제 4 ==\n");
		for (int i = 1; i < 6; i+=2) {
			for (int j = 5; j > i; j-=2) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		  int i = 1; 1 < 6; true {
		  
		  for int j = 5 ; 5 > 1; true {
		  " "
		  for int j = 3; 3 > 1; true
		  " "
		  for int j = 1; 1 > 1 flase
		  j end }
		  vv
		  
		  k = 0; 0 < 1 true {
		  "*"
		  k = 1; 1<1< false
		  k end }
		  vv*
		  
		  for (i) end 
		  } // end of for(i)-------
		  vv*\n
		  
		  
		  int i = 3; 3 < 6 true {
		  
		  for int j = 5; 5 > 3; true {
		  " "
		  for int j = 3; 3 > 3; flase
		  j end }
		  vv*\n
		  v
		  
		  k = 0; 0 < 3; true {
		  "*"
		  k = 1; 1 < 3; true
		  "*"
		  k = 2; 2 < 3; true
		  "*"
		  k = 3; 3 < 3; false
		  k end }
		  vv*\n
		  v***
		  
		  for (i) end 
		  } // end of for(i)-------
		  vv*\n
		  v***\n
		  
		  int i = 5; 5 < 6; true {
		  
  		  for int j = 5; 5 > 5; flase {
		  j end }
		  vv*\n
		  v***\n
		  
		  for int k = 0; 0 < 5; true {
		  "*"
		  for int k = 1; 1 < 5; true
		  "*"
		  for int k = 2; 2 < 5; true
		  "*"
		  for int k = 3; 3 < 5; true
		  "*"
		  for int k = 4; 4 < 5; true
		  "*"
		  for int k = 5; 5 < 5; flase
		  k end }
  		  vv*\n
		  v***\n
		  *****
		  
  		  for (i) end 
  		  } // end of for(i)-------
  		  vv*\n
		  v***\n
		  *****\n
		  
		 */
		
	     /*        
	     == 숙제 4 ==
	    
	         *
	        ***
	       ***** 
	      
	      */
		
		System.out.println("\n== 숙제 5 ==\n");
		for (int i = 0; i < 5; i+=2) {
			for (int j = 5	; j > i; j-=1) {
				System.out.print("*");
			}
			System.out.println();
			for (int k = 0; k < i; k+=2) {
				System.out.print(" ");
			}
			System.out.print(" ");

		}
		
		/*
	     == 숙제 5 ==
	             
	       *****
	        ***
	         *
	      */
		
		System.out.println("\n== 숙제 6 ==\n");

		for (int i = 1; i < 6; i+=2) {
			for (int j = 5	; j > i; j-=2) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < 5; i += 2) {
			System.out.print(" ");
			for (int j = 3; j > i; j -= 1) {
				System.out.print("*");
			}
			System.out.println();
			for (int k = 0; k < i; k += 2) {
				System.out.print(" ");
			}
			System.out.print(" ");

		}
		
		/*
	     == 숙제 6 ==
	          
	         *
	        ***
	       *****
	        ***   
	         *      

	*/
		
		
		System.out.println("\n== 입사문제 ==\n");
		
		for (int i = 1; i <= 9; i++) {
			
			for (int j = 9; j > i; j--) {
				System.out.print("*");
			}
			System.out.println("*" + i);

		}
		
		/*
	   == 입사문제 == 
	           
	   *********1
	   ********2
	   *******3
	   ******4
	   *****5
	   ****6
	   ***7
	   **8
	   *9

	   */   
		
	}

}
