package my.day18.a.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
   실제로는 거의 안쓴다.
   == LinkedList == 
   1. 출력시 저장된 순서대로 나온다.
   2. 중복된 데이터를 저장할 수 있다.
   3. 데이터를 읽어오는 속도는 LinkedList 가 ArrayList 보다 상대적으로 느리다.
   4. 순차적으로 데이터를 추가/삭제하는 경우에는 LinkedList 가  ArrayList 보다 상대적으로 느리다.
   5. 일반적인 데이터 추가/삭제는 데이터 중간 중간마다 발생하므로 이러한 경우에는 LinkedList 가 ArrayList 보다 상대적으로 빠르다.    
   6. 결과값은 ArrayList 를 사용하든지 LinkedList 를 사용하든지 동일한 결과값을 가진다.
   7. LinkedList 보다는 ArrayList 를 사용하도록 하자. 
   
   == LinkedList (저장소) ==   
   
             유재석(자신의 메모리주소 1372)----(앞서존재하던객체의 메모리주소 1372)엄정화(자신의 메모리주소 3236)----(앞서존재하던객체의 메모리주소 3236)강호동(자신의 메모리주소 1034)----(앞서존재하던객체의 메모리주소 1034)이순신(자신의 메모리주소 2340)---(앞서존재하던객체의 메모리주소 2340)김태희(자신의 메모리주소 5236)   
   
   == 엄정화 를 삭제할 경우
   	// 엄정화(자신의 메모리주소 3236) --(앞서존재하던객체의 메모리주소 3236)강호동 에게 --(앞서존재하던객체의 메모리주소 1372)엄정화 을 전달해준다. => --(앞서존재하던객체의 메모리주소 1372)강호동
             유재석(자신의 메모리주소 1372)----(앞서존재하던객체의 메모리주소 1372)강호동(자신의 메모리주소 1034)----(앞서존재하던객체의 메모리주소 1034)이순신(자신의 메모리주소 2340)---(앞서존재하던객체의 메모리주소 2340)김태희(자신의 메모리주소 5236)
       
   == 엄정화 를 특정 위치에 추가할 경우
             엄정화(자신의 메모리주소 7876)를 유재석 다음에 추가하고자 한다.
             유재석(자신의 메모리주소 1372)----(앞서존재하던객체의 메모리주소 1372)엄정화(자신의 메모리주소 7876)----(앞서존재하던객체의 메모리주소 7876)강호동(자신의 메모리주소 1034)----(앞서존재하던객체의 메모리주소 1034)이순신(자신의 메모리주소 2340)---(앞서존재하던객체의 메모리주소 2340)김태희(자신의 메모리주소 5236)*/

public class LinkedList_main_3 extends Member{

	public static void main(String[] args) {
		
		// Member 클래스의 객체만을 저장할 수 있는 ArrayList 객체 mbrList 를 생성한다.
		
		List<Member> mbrList = new LinkedList<>();
		
		
		// Member 클래스의 객체 7개를 생성하여 mbrList 에 저장한다.
	      mbrList.add(new Member("youjs","Qwer1234$","유재석","7209101"));
	      mbrList.add(new Member("eom","Qwer1234$","엄정화","6808152"));
	      mbrList.add(new Member("kanghd","Qwer1234$","강호동","7006151"));
	      mbrList.add(new Member("leess","Qwer1234$","이순신","0010203"));
	      mbrList.add(new Member("kimth","Qwer1234$","김태희","0105064"));
	      mbrList.add(new Member("kangkc","Qwer1234$","강감찬","9812301"));
	      mbrList.add(new Member("kimss","Qwer1234$","김순신","0203203"));

	      new Member("kimss","Qwer1234$","김순신","0203203");
	      // 위의 것과 내용물이 같지만 것과 다른 것이다. new Member

	      Member mem1 = new Member("parksj","Qwer1234$","박서준","8803201");
	      Member mem2 = mem1;	// mem1 과 mem2 는 같은 주소를 사용한다.
	      mem2.setName("이현우");
	      // mem1 = ("parksj","Qwer1234$","이현우","8803203");
	      
	      mbrList.add(mem1);	// 중복된 데이터를 저장할 수 있다.
	      mbrList.add(mem2);	// 중복된 데이터를 저장할 수 있다.
	      /*
	         === 이현우님의 회원정보 === 
			1. 아이디 : parksj
			2. 비밀번호 : Qwer1234$
			3. 성명 : 이현우
			4. 주민번호 : 8803201
			5. 성별 : 남
			6. 만나이 : 35세
			
			=== 이현우님의 회원정보 === 
			1. 아이디 : parksj
			2. 비밀번호 : Qwer1234$
			3. 성명 : 이현우
			4. 주민번호 : 8803201
			5. 성별 : 남
			6. 만나이 : 35세
	       */
	      

	      // mbrList 에 저장된 회원들의 정보를 출력하도록 한다.
	      for(int i = 0; i < mbrList.size(); i++) {
	    	  System.out.println(mbrList.get(i));  
	      } // end of for-------------------------------
	      
/*
			=== 유재석님의 회원정보 === 
			1. 아이디 : youjs
			2. 비밀번호 : Qwer1234$
			3. 성명 : 유재석
			4. 주민번호 : 7209101
			5. 성별 : 남
			
			=== 엄정화님의 회원정보 === 
			1. 아이디 : eom
			2. 비밀번호 : Qwer1234$
			3. 성명 : 엄정화
			4. 주민번호 : 6808152
			5. 성별 : 여
			
			=== 강호동님의 회원정보 === 
			1. 아이디 : kanghd
			2. 비밀번호 : Qwer1234$
			3. 성명 : 강호동
			4. 주민번호 : 7006151
			5. 성별 : 남
			
			=== 이순신님의 회원정보 === 
			1. 아이디 : leess
			2. 비밀번호 : Qwer1234$
			3. 성명 : 이순신
			4. 주민번호 : 0010203
			5. 성별 : 남
			
			=== 김태희님의 회원정보 === 
			1. 아이디 : kimth
			2. 비밀번호 : Qwer1234$
			3. 성명 : 김태희
			4. 주민번호 : 0105064
			5. 성별 : 여
			
			=== 강감찬님의 회원정보 === 
			1. 아이디 : kangkc
			2. 비밀번호 : Qwer1234$
			3. 성명 : 강감찬
			4. 주민번호 : 9812301
			5. 성별 : 남
			
			=== 김순신님의 회원정보 === 
			1. 아이디 : kimss
			2. 비밀번호 : Qwer1234$
			3. 성명 : 김순신
			4. 주민번호 : 0203203
			5. 성별 : 남
*/		      
		
		
	      System.out.println("\n########################################################\n");
	      
	      for(Member mbr  : mbrList) {
	    	  System.out.println(mbr);  
	      } // end of for-------------------------------
		
	      System.out.println("\n[퀴즈1] mbrList 에 저장되어진 모든 회원들중에 여자만 정보를 출력하세요 \n"); 
	      for(Member mbr : mbrList) {
	    	  if("여".equals(mbr.gender()))
	    	  System.out.println(mbr);  
	      } // end of for-------------------------------
	
	      System.out.println("\n[퀴즈2] mbrList 에 저장되어진 모든 회원들중에 성이 김씨인 회원만 정보를 출력하세요 \n");
	     
	      boolean is_existence = false;
	      for(Member mbr : mbrList) {
	    	  if(mbr.getName().startsWith("웅"))
	    		  is_existence = true;
	    	  	  System.out.println(mbr);
	    	  	  break;
	      } // end of for-------------------------------
	      if (!is_existence) {
	    	  System.out.println("성이 웅인 회원은 없습니다.");
	      }

	      
	      System.out.println("\n[퀴즈3] mbrList 에 저장되어진 모든 회원들중에 이름이 순신인 회원만 정보를 출력하세요 \n");
	      for(Member mbr : mbrList) {
	    	  if(mbr.getName().endsWith("순신"))
	    	  System.out.println(mbr);  
	      } // end of for-------------------------------
	      if (!is_existence) {
	    	  System.out.println("이름이 순신인 회원은 없습니다.");
	      }
		
		
	        // *** ArrayList 타입인 mbrList 에 새로운 Member 객체 추가시
	        //     특정 index(위치)에 들어가도록 할 수 있다. *** 
	        
	        System.out.println("\n ~~~ mbrList 에 새로운 Member 객체 추가하기 ~~~ \n");
	        
	        mbrList.add(new Member("seolh", "Qwer1234$", "설현", "9910122"));
	        // index 값이 없으면 mbrList 의 맨 뒤에 추가된다.
	        
	        System.out.println(mbrList.get(mbrList.size()-1));
/*
    		~~~ mbrList 에 새로운 Member 객체 추가하기 ~~~ 

			=== 설현님의 회원정보 === 
			1. 아이디 : seolh
			2. 비밀번호 : Qwer1234$
			3. 성명 : 설현
			4. 주민번호 : 9910122
			5. 성별 : 여
			6. 만나이 : 24세
 */
	        
	        System.out.println("\n############################################\n");
	        
	        // 유재석(0) 엄정화(1) 강호동(2) 이순신(3) 으로 되어있었는데
	        // 유재석(0) 엄정화(1) 강호동(2) 서강준(3) 이순신(4) 로 된다.
	      
	        mbrList.add(3, new Member("seokj", "Qwer1234$", "서강준", "9901051"));
	        
	        for(Member mbr  : mbrList) {
	         	  System.out.println(mbr);  
	        } // end of for-------------------------------
/*
			 ############################################
			
			=== 유재석님의 회원정보 === 
			1. 아이디 : youjs
			2. 비밀번호 : Qwer1234$
			3. 성명 : 유재석
			4. 주민번호 : 7209101
			5. 성별 : 남
			6. 만나이 : 51세
			
			=== 엄정화님의 회원정보 === 
			1. 아이디 : eom
			2. 비밀번호 : Qwer1234$
			3. 성명 : 엄정화
			4. 주민번호 : 6808152
			5. 성별 : 여
			6. 만나이 : 55세
			
			=== 강호동님의 회원정보 === 
			1. 아이디 : kanghd
			2. 비밀번호 : Qwer1234$
			3. 성명 : 강호동
			4. 주민번호 : 7006151
			5. 성별 : 남
			6. 만나이 : 53세
			
			=== 서강준님의 회원정보 === 
			1. 아이디 : seokj
			2. 비밀번호 : Qwer1234$
			3. 성명 : 서강준
			4. 주민번호 : 9901051
			5. 성별 : 남
			6. 만나이 : 25세
			
			=== 이순신님의 회원정보 === 
			1. 아이디 : leess
			2. 비밀번호 : Qwer1234$
			3. 성명 : 이순신
			4. 주민번호 : 0010203
			5. 성별 : 남
			6. 만나이 : 23세
			
			=== 김태희님의 회원정보 === 
			1. 아이디 : kimth
			2. 비밀번호 : Qwer1234$
			3. 성명 : 김태희
			4. 주민번호 : 0105064
			5. 성별 : 여
			6. 만나이 : 22세
			
			=== 강감찬님의 회원정보 === 
			1. 아이디 : kangkc
			2. 비밀번호 : Qwer1234$
			3. 성명 : 강감찬
			4. 주민번호 : 9812301
			5. 성별 : 남
			6. 만나이 : 25세
			
			=== 김순신님의 회원정보 === 
			1. 아이디 : kimss
			2. 비밀번호 : Qwer1234$
			3. 성명 : 김순신
			4. 주민번호 : 0203203
			5. 성별 : 남
			6. 만나이 : 21세
			
			=== 이현우님의 회원정보 === 
			1. 아이디 : parksj
			2. 비밀번호 : Qwer1234$
			3. 성명 : 이현우
			4. 주민번호 : 8803201
			5. 성별 : 남
			6. 만나이 : 35세
			
			=== 이현우님의 회원정보 === 
			1. 아이디 : parksj
			2. 비밀번호 : Qwer1234$
			3. 성명 : 이현우
			4. 주민번호 : 8803201
			5. 성별 : 남
			6. 만나이 : 35세
			
			=== 설현님의 회원정보 === 
			1. 아이디 : seolh
			2. 비밀번호 : Qwer1234$
			3. 성명 : 설현
			4. 주민번호 : 9910122
			5. 성별 : 여
			6. 만나이 : 24세
 */
	        // **** ArrayList 타입인 mbrList 에 저장되어진 Member 객체 삭제하기 **** //
	        System.out.println("\n **** ArrayList 타입인 mbrList 에 저장되어진 Member 객체 삭제하기 **** \n");	  
	        
	        System.out.println(">> 삭제하기 전 mbrList.size() => " + mbrList.size());
	        // >> 삭제하기 전 mbrList.size() => 11
	        
	        Member deleted_mbr = mbrList.remove(3);	// mbrList.remove(3);(삭제할 Member 객체의 인덱스번호);
	        System.out.println(deleted_mbr);
/*
			   === 서강준님의 회원정보 === 
			1. 아이디 : seokj
			2. 비밀번호 : Qwer1234$
			3. 성명 : 서강준
			4. 주민번호 : 9901051
			5. 성별 : 남
			6. 만나이 : 25세	        
 */
	        
	        System.out.println("\n######################################\n");
	        // >> 삭제하기 후 mbrList.size() => 10
	        
	        System.out.println(">> 삭제하기 후 mbrList.size() => " + mbrList.size());
	        
	        for(Member mbr  : mbrList) {
	         	  System.out.println(mbr);  
	        } // end of for-------------------------------
		
	        
	        System.out.println("\n==============================================\n");
	        
// ==== 만약에 index 0번이 남자(남자1), index 1번이 남자(남자2), 
//	         index 2번이 여자(여자1), index 3번이 남자(남자3), 
//	         index 4번이 여자(여자2) 이라면
	        
	        boolean is_delete = mbrList.remove(mbrList.get(0));
	        System.out.println(is_delete + "\n");
	        // true
	        
	        for(Member mbr  : mbrList) {
	         	  System.out.println(mbr);  
	        } // end of for-------------------------------

	        
		      System.out.println("\n[퀴즈4] mbrList 에 저장되어진 모든 회원들중에 남자만 모두 삭제하고 정보를 출력하세요 \n");

	        
				List<Member> copy		= 	  new ArrayList<>(mbrList);
			
			// 0 1 2 3 4 5 6 7 8 9 10  		0 1 2 3 4 5 6 7 8 9 10
			
	        
	        for(Member mbr : copy) {				// mbr 은 11번 반복
	        	if (mbr.gender().equals("남"))  {	// 남자일 경우
	        		mbrList.remove(mbr);			// 원래 썼던 mbrList 의 값을 지운다.
	        	}

	        } // end of for-------------------------------

	        for(Member mbr : mbrList) {				// 남자 다 빠진 3개만 남음 
	         	  System.out.println(mbr);  		// 여자 3번 출력
	        } // end of for-------------------------------	 
	        
	        System.out.println("\n==============================================\n");
	        
/*	        
	        for(Member mbr  : mbrList) {
	        	if (mbr.gender().equals("남"))  {
	        		mbrList.remove(mbr);
	        	}	// remove 는 index 값 을 지우는 것이기 때문에 남자가 나오면 
	        		// mbr +1 값 그런데 또 남자면 다시 mbr +1 값이 나오기 때문에
	        		// 여자 다음에 남자가 있을 경우 mbr 값이 예를 들어 1이 었을 때
	        		// 1에 있던 값이 0으로 되기 때문에 값이 이상하게 나온다.

	        } // end of for-------------------------------

	        for(Member mbr  : mbrList) {
	         	  System.out.println(mbr);  
	        } // end of for-------------------------------	 
*/
	        
	        
	        
	        // == 만약에 index 0 번이 남자(남자1), index 1번이 남자(남자2), index 2번이 여자(여자1), index 3번이 남자(남자3), index 4번이 여자(여자2)
	        for(int i = mbrList.size() - 1; i >= 0; i--) {
	        	if("남".equals(mbrList.get(i).gender())) {
	        		mbrList.remove(i);
	        		// i 가 4 부터 시작해서 1씩 감소하면서 0 까지 반복한다.
	        		// 맨처음에는 index 4번인 것을 찾아서 남자인지 여자인지 검사를 한다.
	        		// 여자이므로 삭제를 안한다.
	        		
	        		// i 가 3 ==> index 3 은 남자이므로
	        		// 남자이므로 삭제를 한다.
	        		// mbrList 는
	        		// index 0 번이 남자(남자1), index 1번이 남자(남자2), index 2번이 여자(여자1), index 3번이 여자(여자2)
	        		
	        		// i 가 2 ==> index 2 은 여자이므로
	         		// 여자이므로 삭제를 안한다.	        		
	        		
	        		// i 가 1 ==> index 1 은 남자이므로
	        		// 남자이므로 삭제를 한다.
	        		// mbrList 는
	        		// index 0 번이 남자(남자1), index 1번이 여자(여자1), index 2번이 여자(여자2)
	        		
	        		// i 가 0 ==> index 0 은 남자이므로
	        		// 남자이므로 삭제를 한다.
	        		// mbrList 는
	        		// index 2번이 여자(여자1), index 3번이 여자(여자2)
	        	}
				System.out.println(mbrList.get(i));
			}

/*	        
	        
			for (int i = 0; i < mbrList.size(); i++) {
				if ("남".equals(mbrList.get(i).gender())) {
					mbrList.remove(i);

 * 					remove 를 앞에서 부터 하는 경우이다.
 *				    i 는 0 부터 시작해서 매번 1씩 증가한다.
 * 					index 0번이 남자이므로 삭제가 되어지면서 mbrList 는
 * 				    index 0번이 남자(남자1), index 1번이 여자(여자1), index 2번이 남자(남자2)
 * 
 * 
 * 				    그래서 index 0번이 남자(남자2)는 삭제되지 않고 그대로 남게 된다.
 
	        	}
	        	System.out.println(mbrList.get(i));
	        }
*/
	        for(Member mbr  : mbrList) {
	         	  System.out.println(mbr);  
	        } // end of for-------------------------------	 
	        
	        System.out.println(">> 현재 mbrList.size() => " + mbrList.size());
	        // >> 현재 mbrList.size() => 3
	        
	        System.out.println("\n === mbrList 에 저장된 모든 객체 삭제하기 == \n");
	        mbrList.clear();
	        
	        System.out.println(">> 삭제한 후 mbrList.size() => " + mbrList.size());
	        // >> 삭제한 후 mbrList.size() => 0 
	        
	} // end of main() ------------------------------------

}
