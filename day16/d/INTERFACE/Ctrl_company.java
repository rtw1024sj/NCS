package my.day16.d.INTERFACE;

import java.util.Scanner;

public class Ctrl_company extends Ctrl_common{

	
	// == 구직자(Company) 신규 회원가입시
	//    Company 클래스의 field 의 요구사항에 모두 맞으면
	//    CommonMember[] cmbr_arr 에 저장시켜주는 메소드 생성하기 ==
	public void register(Scanner sc, CommonMember[] cmbr_arr) {
		if(CommonMember.count < cmbr_arr.length) { // 지금까지 생성된 구인회사 회원수가 cmbr_arr.length(==>정원) 보다 적을 경우에만 신규회원을 받아들인다.
			
			String id;        
			String passwd;       
			String name;        		
			String business_number;		// 사업자등록번호 
			
			Company_imple cp = new Company_imple();

			// id
			outer:
			do {
				System.out.print("1.아이디 : ");
				id = sc.nextLine();
				
				// == 가입된 회원들에 대해 중복아이디 검사하기 시작 == //
				for(int i = 0; i < CommonMember.count; i++) {
					
					if ( cmbr_arr[i].getType() == 2 && id.equals(cmbr_arr[i].getId()) ) {
						System.out.println(">> 이미 사용중인 아이디 이므로 다른 아이디값을 입력하세요!!\n");
						continue outer;
					}
				} // end of for-----------------------------------------
				// == 가입된 회원들에 대해 중복아이디 검사하기 끝 == //
				
				cp.setId(id);
				// setId 여기서 확인하고 문제가 있으면 id == null 값이기 때문에
				
			} while (!(cp.getId() != null)); // end of do~while ----------------------------------------
			// gu.getId() 의 값이 null 일 경우 다시 do 로 올라가 반복
			// end id
			
			// passwd
			do {
				System.out.print("2.비밀번호 : ");
				passwd = sc.nextLine();
				
				cp.setPasswd(passwd);
				
			} while (!(cp.getPasswd() != null));
			// end passwd

			// name
			do {
				System.out.print("3.성명 : ");
				name = sc.nextLine();
				
				cp.setName(name);
				
			} while (!(cp.getName() != null));
			// end name
			
			// business_number
			do {
				System.out.print("4.사업자등록번호 : ");
				business_number = sc.nextLine();
				
				cp.setBusiness_number(business_number);
				
			} while (!(cp.getBusiness_number() != null));
			// end business_number
			
			
			///////////////////////////////////////////////

			cmbr_arr[CommonMember.count++] = cp;
			System.out.println(">> 구인회사 회원가입 성공 !! <<\n");
			
		}
		else { // 지금까지 생성된 구직인회사 회원수가 cmbr_arr.length(==>정원) 와 같거나 큰 경우에만 신규회원을 받아들이면 안된다.
			System.out.println(">> 정원 "+ cmbr_arr.length + "개가 꽉차서 구인회사 회원가입이 불가합니다.!! <<\n");
		}
		
	}// end of void register(Scanner sc, CommonMember[] cmbr_arr)------------
	
	
	
	


	
	
	// == 구인회사 메뉴 == //
	public void cp_menu(Scanner sc, Company_imple login_cp, CommonMember[] cmbr_arr, Recruit[] rc_arr, RecruitApply[] rcApply_arr) {
		
		String str_menuno;
		do {
			System.out.println("\n >> 구인회사 전용메뉴("+ login_cp.getName() +" 기업 로그인 성공) <<\n"
			                 + "1.회사정보 보기   2.회사정보 수정   3.모든구직자 조회    4.구직자성별검색		5.구직자연령대검색\n"
			                 + "6.구직자 연령대 및 성별검색	  7.채용공고입력하기		8.우리회사 채용공고 조회 	9.우리회사 채용공고 지원자 조회\n"
			                 + "10.로그아웃\n");  
			System.out.print("▷ 메뉴번호 선택 : ");
			str_menuno = sc.nextLine();
			
			switch (str_menuno) {
				case "1": // 회사정보 보기 
					view_companyInfo(login_cp);
					break;
					
				case "2": // 회사정보 수정
					update_companyInfo(sc, login_cp);
					break;	
					
				case "3": // 모든구직자 조회
					view_all_gujikja_info(cmbr_arr);
					break;	
					
				case "4": // 구직자 성별검색
					view_all_gujikja_gender(sc, cmbr_arr);
					break;
					
				case "5": // 구직자 연령대검색
					view_all_gujikja_age(sc ,cmbr_arr);

					break;					
					
				case "6": // 구직자 연령대 및 성별검색
					view_all_gujikja_gender_age(sc ,cmbr_arr);
					break;					
					
					
				case "7": // 채용공고입력하기
					register_recruit(sc, login_cp, rc_arr);

					break;					
	
					
				case "8": // 우리회사 채용공고 조회
					view_recruit_mycompany(login_cp, rc_arr);
					break;					
					
					
				case "9": // 우리회사 채용공고 지원자 조회
					view_gujikja_recruitApply(login_cp, rcApply_arr);
					break;					
					
					
				case "10": // 로그아웃
					login_cp = null;
					break;					
					
				default:
					System.out.println(">> [경고] 선택하신 번호는 메뉴에 없습니다. <<\n");
					break;
			}// end of switch (str_menuno)-----------------------
			
		} while(!"10".equals(str_menuno));
		// end of do~while-----------------------------
		
		System.out.println(">> 로그아웃 되었습니다. <<\n");
		
	}// end of public void cp_menu(Scanner sc, Company login_cp, Company[] cp_arr) ------------------
	// == 구인회사 메뉴 끝 == //
	
	
	// == 회사정보 보기 == //
	private void view_companyInfo(Company_imple login_cp) {
		System.out.println(">>> "+ login_cp.getName() +"님의 정보 <<<");
		System.out.println("-".repeat(85));
		System.out.println("   아이디 	비밀번호 		회사명	     가입일자		사업자등록번호	직종");
		System.out.println("-".repeat(85));
		System.out.println( "   " + login_cp.getId()+"\t\t"+
							login_cp.getPasswd()+"\t"+
							login_cp.getName()+"\t"+
							login_cp.getRegister_day()+"\t"+
							login_cp.getBusiness_number()+"\t"+
							login_cp.getJob_type() +"\n");		
	} // end of private void view_companyInfo(Company login_cp) --------------------
	// == 회사정보 보기 끝 == //
// =======================================================================================	//
	
	// == 회사정보 수정 == //
	private void update_companyInfo(Scanner sc, Company_imple login_cp) {
		
		view_companyInfo(login_cp);
		
		System.out.println("\n>> [주의사항] 변경하지 않고 예전의 데이터값을 그대로 사용하시려면 그냥 엔터하세요!!\n");
		
		boolean exit_ok = false;
		do {
			//////////////////////////////////////////////////////////////
			System.out.print("1.비밀번호 : ");
			String new_passwd = sc.nextLine();  // 기존비밀번호인 qWer1234$ 을 qWer0070$ 으로 변경하려고 한다.
			                                    // 기존비밀번호인 qWer1234$ 을 qWer1234$ 으로 변경하려고 하려면 기존암호와 동일하므로 변경이 불가합니다. 
			                                    // 기존비밀번호인 qWer1234$ 을 변경하기 싫다. 
			                                    // 기존비밀번호인 qWer1234$ 을 abcd 로 변경하고자 할때는 비밀정책에 맞지 않으므로 안된다.!! 
			
			if(!new_passwd.equals("")) { // 입력한 비밀번호가 엔터가 아닐 경우 
				
				if(login_cp.getPasswd().equals(new_passwd) ) { // 입력한 비밀번호가 기존 비밀번호와 같을 경우 
					System.out.println(">> 기존암호와 동일하므로 변경이 불가합니다.!!");
				}
				else {
					login_cp.setPasswd(new_passwd);
					
					if(login_cp.getPasswd().equals(new_passwd)) {
						exit_ok = true;
					}
				}
				
			}
			
			else { // 입력한 비밀번호가 엔터일 경우
				exit_ok = true;
			}
		  //////////////////////////////////////////////////////////////
		} while(!exit_ok);
		// end of do~while-------------------------------------------
		
		
		// == 기업명 == //
		exit_ok = false;
		do {
			////////////////////////////////////////////////////////////////////
			System.out.print("2.기업명 : ");
			String new_name = sc.nextLine(); // 기존성명인 엄정화 를 엄화정 으로 변경하려고 한다.
	                                         // 기존성명인 엄정화 를 엄정화로 변경하려고 하려면 기존성명과 동일하므로 변경이 불가합니다. 
	                                         // 기존성명인 엄정화 을 변경하기 싫다. 
	                                         // 기존성명인 엄정화를 엄JungHwa 로 변경하고자 할때는 성명정책에 맞지 않으므로 안된다.!!
			
			if(!new_name.equals("")) { // 입력한 성명이 엔터가 아닐 경우 
				
				if(login_cp.getName().equals(new_name) ) { // 입력한 성명이 기존 성명과 같을 경우 
					System.out.println(">> 기존기업명과 동일하므로 변경이 불가합니다.!!");
				}
				else {
					login_cp.setName(new_name);
					
					if(login_cp.getName().equals(new_name)) {
						exit_ok = true;
					}
				}
				
			}
			
			else { // 입력한 기업명 엔터일 경우
				exit_ok = true;
			}
          ////////////////////////////////////////////////////////////////////
		} while(!exit_ok);
		// == 기업명 끝 == //        
		
		// == 사업자등록번호 == //
		exit_ok = false;
		do {
			////////////////////////////////////////////////////////////////////
			System.out.print("3.사업자등록번호 : ");
			
			String new_usinessNumber = sc.nextLine(); 
	
			if(!new_usinessNumber.equals("")) {  
	
				if(login_cp.getBusiness_number().equals(new_usinessNumber) ) {  
					System.out.println(">> 기존사업자등록번호와 동일하므로 변경이 불가합니다.!!");
				}
				else {
					login_cp.setBusiness_number(new_usinessNumber);
					
					if(login_cp.getBusiness_number().equals(new_usinessNumber)) {
						exit_ok = true;
					}
				}
	
			}
			
			else { // 입력한 사업자등록번호 엔터일 경우
				exit_ok = true;
			}
			/////////////////////////////////////////////////////////////////	
		} while(!exit_ok);
		// == 사업자등록번호 끝 == //

		// == 직종 == //
		exit_ok = false;
		do {
			////////////////////////////////////////////////////////////////////
			System.out.print("4.직종 : ");
			
			String new_jobType = sc.nextLine(); 
	
			if(!new_jobType.equals("")) {  
	
				if(login_cp.getJob_type().equals(new_jobType) ) {  
					System.out.println(">> 기존직종과 동일하므로 변경이 불가합니다.!!");
				}
				else {
					login_cp.setJob_type(new_jobType);
					
					if(login_cp.getJob_type().equals(new_jobType)) {
						exit_ok = true;
					}
				}
	
			}
			
			else { // 입력한 직종 엔터일 경우
				exit_ok = true;
			}
			/////////////////////////////////////////////////////////////////	
		} while(!exit_ok);
		// == 직종 끝 == //
		
		// == 자본금 == //
		exit_ok = false;
		do {
			////////////////////////////////////////////////////////////////////
			System.out.print("5.자본금 : ");

			String new_seedMoney = sc.nextLine();
			try {
				long new_seed_money = Long.parseLong(new_seedMoney);

				if (!new_seedMoney.equals("")) {

					if (login_cp.getSeed_money() == new_seed_money) {
						System.out.println(">> 기존자본금과 동일하므로 변경이 불가합니다.!!");
					} else {
						login_cp.setSeed_money(new_seed_money);

						if (login_cp.getSeed_money() == new_seed_money) {
							exit_ok = true;
						}
					}

				}

				else { // 입력한 자본금 엔터일 경우
					exit_ok = true;
				}
				/////////////////////////////////////////////////////////////////
			} catch (NumberFormatException e) {
				exit_ok = true;
			}
		} while (!exit_ok);
		// == 자본금 끝 == //
		
	} // end of private void update_companyInfo(Scanner sc, Company login_cp) ----------------
	// == 회사정보 수정 끝 == //	
// =======================================================================================	//	

	private void view_all_gujikja_info(CommonMember[] cmbr_arr) {

		int cnt = 0;
		for(int i = 0; i < CommonMember.count; i++) {
			if( cmbr_arr[i] instanceof Gujikja_imple) {
				cnt++;
			}
		}
		
		if(cnt == 0) {
			System.out.println(">> 구인회사로 등록된 구직자가 한명도 없습니다. << \n");
		}
		
		else {
			
			title_gujikja();
			
			StringBuilder sb = new StringBuilder();
			
			for (int i = 0; i < CommonMember.count; i++) {
				if (cmbr_arr[i] instanceof Gujikja_imple) {
					sb.append(cmbr_arr[i].getName() +"\t"
						+ ((Gujikja_imple)cmbr_arr[i]).getGender() +"\t"
						+ ((Gujikja_imple)cmbr_arr[i]).getAge() +"\n");
				}
			}// end of for--------------
			
			System.out.println(sb.toString());
		}
		
	}// end of private void view_all_gujikja_info(CommonMember[] cmbr_arr) -----------------

	
	private void title_gujikja() {
		System.out.println("=".repeat(70));
		System.out.println(" 이름 	성별    연령대");
		System.out.println("=".repeat(70));		
	}// end of private void title_gujikja()----------------------------
	
	
	private void view_all_gujikja_gender(Scanner sc, CommonMember[] cmbr_arr) {
		
		int cnt = 0;
		for (int i = 0; i < CommonMember.count; i++) {

			if (cmbr_arr[i].getType() == 1) {
				cnt++;
			}

		} // end of for--------------------------

		if (cnt == 0) { // 구직자가 없는 경우
			System.out.println(">> 구직자로 가입된 회원이 아무도 없습니다. <<\n");
		}

		else { // 구직자가 존재하는 경우
			
			String input_gender = "";
			boolean isUse_input_gender = false;			
			do {
				System.out.print("▷ 검색하고자 하는 성별[남/여] => ");
				input_gender = sc.nextLine();  // "남" "여" "   남" "여   " "    남   " "    여   " --> 정상
			                                   // ""  "      " "강아지" --> 비정상
				
				System.out.println("=".repeat(50));
				System.out.println(" 이름 	성별");
				System.out.println("=".repeat(50));
				
				switch (input_gender.trim()) {
					case "남": 
					case "여": 
						isUse_input_gender = true;
						input_gender = input_gender.trim();
						break;
		
					default:
						System.out.println("[경고] \"남\" 또는 \"여\" 만 입력하세요!!\n");
						break;
				}// end of switch (str_ageLine)-----------------------
				
			} while(!isUse_input_gender);
			// end of do~while------------------------
			
			
			// == 입력받은 성별에 해당하는 구직자 찾기 == //
			StringBuilder sb = new StringBuilder();
			boolean isSearch = false;
			
			for (int i = 0; i < CommonMember.count; i++) {
				
				 if( cmbr_arr[i] instanceof Gujikja_imple && input_gender.equals(((Gujikja_imple)cmbr_arr[i]).getGender() )) {
					 isSearch = true;
					 sb.append( cmbr_arr[i].getName() + "\t"
					 		  + ((Gujikja_imple)cmbr_arr[i]).getGender() + "\n");
				 }
				
			}// end of for--------------------------
			
			if(isSearch) {
				System.out.println(sb.toString());
			}
			else {
				System.out.println("[검색결과 성별 "+ input_gender +"자 구직자는 없습니다]\n");
			}
			
		}// end of if~else----------------------------------

	}// end of private void view_all_gujikja_gender(Gujikja[] gu_arr) -----------------------------
	
	
	// == 구직자 연령대검색 == //
	private void view_all_gujikja_age(Scanner sc, CommonMember[] cmbr_arr) {
		
		int cnt = 0;
		for (int i = 0; i < CommonMember.count; i++) {
			if (cmbr_arr[i].getType() == 1) {
				cnt++;
			}
		}
		
		if(cnt == 0) { // 구직자가 없는 경우
			System.out.println(">> 구직자로 가입된 회원이 아무도 없습니다. <<\n");
			return; // 해당 메소드(지금은 search_ageLine_gender())를 종료하는 것이다.
		}
		
		else { // 구직자가 존재하는 경우
			
			String str_ageLine = "";
			boolean isUse_ageLine = false;
			
			do {
				System.out.print("▷ 검색하고자 하는 연령대[예: 20] => ");
				str_ageLine = sc.nextLine();  // "0" "10" "20" "30" "40" "50" "60" "70" "80" --> 정상
			                                  // "25" "강아지" "-20" --> 비정상
				
				System.out.println("=".repeat(50));
				System.out.println(" 이름 	연령대");
				System.out.println("=".repeat(50));
				
				switch (str_ageLine) {
					case "0": 
					case "10": 
					case "20": 
					case "30": 
					case "40": 
					case "50": 
					case "60":
					case "70":
					case "80":
						isUse_ageLine = true;
						break;
		
					default:
						System.out.println("[경고] 올바른 연령대를 입력하세요!!\n");
						break;
				}// end of switch (str_ageLine)-----------------------
				
			} while(!isUse_ageLine);
			// end of do~while------------------------
			
			
			// == 입력받은 연령대에 해당하는 구직자 찾기 == //
			boolean is_ageline_search = false;
			
			for (int i = 0; i < CommonMember.count; i++) {
				if(cmbr_arr[i] instanceof Gujikja_imple ) {
				int ageLine = ((Gujikja_imple)cmbr_arr[i]).getAge()/10*10;
				//                 					 나이/10*10
				//                 					 26/10*10 ==> 20
                //                 					 23/10*10 ==> 20
				
				if (Integer.parseInt(str_ageLine) == ageLine) {
					is_ageline_search = true;
					break;
				}
			}
		} // end of for--------------------------
			
			if(!is_ageline_search) { // 검색하고자 하는 연령대에 해당하는 구직자가 존재하지 않는 경우 
				System.out.println("[검색결과 연령대가 "+str_ageLine+"인 구직자는 없습니다]\n");
				return; // 해당 메소드(지금은 search_ageLine_gender())를 종료하는 것이다.
			}

			else { // 검색하고자 하는 연령대에 해당하는 구직자가 존재하는 경우
				
				// == 입력받은 연령대 및 성별에 해당하는 구직자 찾기 == //
				StringBuilder sb = new StringBuilder();
				boolean is_ageline_Search = false;
				
				for(int i=0; i<CommonMember.count; i++) {
					
					 if( cmbr_arr[i] instanceof Gujikja_imple && Integer.parseInt(str_ageLine) == ((Gujikja_imple)cmbr_arr[i]).getAge()/10*10) {
						 
						 is_ageline_Search = true;
						 sb.append( cmbr_arr[i].getName() + "\t"
								  + ((Gujikja_imple)cmbr_arr[i]).getAge() + "\n");
					 }
					
				}// end of for--------------------------
				
				if(is_ageline_Search) {
					System.out.println(sb.toString());
				}
				else {
					System.out.println("[검색결과 연령대가 "+ str_ageLine + "인 구직자는 없습니다]\n"); 
				}
				// === !! 성별 검색 끝 !! === //
			}
			
		}// end of if~else----------------------------------
		
		
	}// end of private void view_all_gujikja_age(Scanner sc, CommonMember[] cmbr_arr) ---------
	// == 구직자 연령대검색 끝 == //
	
	
	
	// == 구직자 연령대 및 성별 검색 == //
	private void view_all_gujikja_gender_age(Scanner sc, CommonMember[] cmbr_arr) {
		
		int cnt = 0;
		for( int i = 0; i < CommonMember.count; i++) {
			if ( cmbr_arr[i] instanceof Gujikja_imple ) {
				cnt++;
			}
		}
		
		if(cnt == 0) { // 구직자가 없는 경우
			System.out.println(">> 구직자로 가입된 회원이 아무도 없습니다. <<\n");
			return; // 해당 메소드(지금은 search_ageLine_gender())를 종료하는 것이다.
		}
		
		else { // 구직자가 존재하는 경우
			
			String str_ageLine = "";
			boolean isUse_ageLine = false;
			
			do {
				System.out.print("▷ 검색하고자 하는 연령대[예: 20] => ");
				str_ageLine = sc.nextLine();  // "0" "10" "20" "30" "40" "50" "60" "70" "80" --> 정상
			                                  // "25" "강아지" "-20" --> 비정상
				
				
				
				switch (str_ageLine) {
					case "0": 
					case "10": 
					case "20": 
					case "30": 
					case "40": 
					case "50": 
					case "60":
					case "70":
					case "80":
						isUse_ageLine = true;
						break;
		
					default:
						System.out.println("[경고] 올바른 연령대를 입력하세요!!\n");
						break;
				}// end of switch (str_ageLine)-----------------------
				
			} while(!isUse_ageLine);
			// end of do~while------------------------
			
			
			// == 입력받은 연령대에 해당하는 구직자 찾기 == //
			boolean is_ageline_search = false;
			
			for (int i = 0; i < CommonMember.count; i++) {
				if (cmbr_arr[i] instanceof Gujikja_imple) {
					int ageLine = ((Gujikja_imple)cmbr_arr[i]).getAge() / 10 * 10;
					// 나이/10*10
					// 26/10*10 ==> 20
					// 23/10*10 ==> 20

					if (Integer.parseInt(str_ageLine) == ageLine) {
						is_ageline_search = true;
						break;
					}
				}
			} // end of for--------------------------
			
			if(!is_ageline_search) { // 검색하고자 하는 연령대에 해당하는 구직자가 존재하지 않는 경우 
				System.out.println("[검색결과 연령대 "+str_ageLine+"대인 구직자는 없습니다]\n");
				return; // 해당 메소드(지금은 search_ageLine_gender())를 종료하는 것이다.
			}

			else { // 검색하고자 하는 연령대에 해당하는 구직자가 존재하는 경우
				
				// === !! 성별 검색 시작 !! === //
				String input_gender = "";
				boolean isUse_input_gender = false;			
				do {
					System.out.print("▷ 검색하고자 하는 성별[남/여] => ");
					input_gender = sc.nextLine();  // "남" "여" "   남" "여   " "    남   " "    여   " --> 정상
				                                   // ""  "      " "강아지" --> 비정상
					
					switch (input_gender.trim()) {
						case "남": 
						case "여": 
							isUse_input_gender = true;
							input_gender = input_gender.trim();
							break;
			
						default:
							System.out.println("[경고] \"남\" 또는 \"여\" 만 입력하세요!!\n");
							break;
					}// end of switch (str_ageLine)-----------------------
					
				} while(!isUse_input_gender);
				// end of do~while------------------------
				
				
				// == 입력받은 연령대 및 성별에 해당하는 구직자 찾기 == //
				StringBuilder sb = new StringBuilder();
				boolean is_ageline_gender_Search = false;
				
				for (int i = 0; i < CommonMember.count; i++) {
					if (cmbr_arr[i] instanceof Gujikja_imple) {

						if (Integer.parseInt(str_ageLine) == ((Gujikja_imple) cmbr_arr[i]).getAge() / 10 * 10
								&& input_gender.equals(((Gujikja_imple) cmbr_arr[i]).getGender())) {

							is_ageline_gender_Search = true;
							sb.append(cmbr_arr[i]).getInfo() + "\n");
						}
					}

				} // end of for--------------------------

				if(is_ageline_gender_Search) {
					System.out.println("-".repeat(80)+"\n"
					         + " 아이디     비밀번호          성명    생년월일  성별    현재만나이      가입일자 \n"
					         + "-".repeat(80));
					
					System.out.println(sb.toString());
				}
				else {
					System.out.println("[검색결과 연령대가 "+ str_ageLine + "대인 "+ input_gender +"자 구직자는 없습니다]\n"); 
				}
				// === !! 성별 검색 끝 !! === //
			}
			
		}// end of if~else----------------------------------
	}// end of private void view_all_gujikja_age(Gujikja[] gu_arr)-----------------------------
	// == 구직자 연령대 및 성별 검색 == //
	
	
	// == 채용공고 입력하기 == //
	private void register_recruit(Scanner sc, Company_imple login_cp, Recruit[] rc_arr) {
		
		System.out.println("======= " + login_cp.getName() + " 채용공고 등록 =======");
		
		Recruit rc = new Recruit();
		
		
		do {
			System.out.print("1.채용제목 : ");
			String subject = sc.nextLine();
			rc.setSubject(subject);
			
		} while (! (rc.getSubject() != null) );
		// == 채용제목 == //
	
		
		do {
			System.out.print("2.채용분야[예) 사무직] : ");
			String work_type = sc.nextLine();
			rc.setWork_type(work_type);
			
		} while (! (rc.getWork_type() != null) );
		// == 채용분야 == //
		
		
		do {
			System.out.print("3.채용인원 : ");
			String str_cnt = sc.nextLine();

			try {
				int cnt = Integer.parseInt(str_cnt);	//숫자가 입력되고 (만약 숫자가 아니면 NumberFormatException) 로 catch
				if (cnt <= 0) {	// 입력된 수가 0 미만이면
					System.out.println("[경고] 1 이상 입력하세요!!]");
				} else {	// 입력된 수가 1 이상이면
					rc.setCnt(cnt);
				}
			} catch (NumberFormatException e) {	// 숫자가 아닐경우
				System.out.println("[경고] 1 이상 입력하세요!!]");
			}
		} while (!(rc.getCnt() > 0));	// 모집인원이 1명 이상이어야 빠져나간다.
		// == 채용인원 == //

		
		do {
			System.out.print("4.연봉 : ");
			String str_yearpay = sc.nextLine();
			
			try {
				int yearpay = Integer.parseInt(str_yearpay);	//숫자가 입력되고 (만약 숫자가 아니면 NumberFormatException) 로 catch
				if (yearpay <= 0) {	// 입력된 수가 0 미만이면
					System.out.println("[경고] 1 이상 입력하세요!!]");
				} else {	// 입력된 수가 1 이상이면
					rc.setYearpay(yearpay);
				}
			} catch (NumberFormatException e) {	// 숫자가 아닐경우
				System.out.println("[경고] 1 이상 입력하세요!!]");
			}
			
		} while (!(rc.getYearpay() > 0));	// 모집인원이 1명 이상이어야 빠져나간다.
		// == 연봉 == //

		
		do {
			System.out.print("5.채용마감일자[예) 20240208] : ");
			String finish_day = sc.nextLine();
			rc.setFinish_day(finish_day);
			
		} while (! (rc.getFinish_day() != null) );
		// == 채용마감일자 == //
		
		System.out.println();
		
		rc.setCp(login_cp);
		rc_arr[Recruit.count++] = rc;
		
	} // end of private void register_recruit(Scanner sc, Company login_cp) ---------------------
	// == 채용공고 입력하기 끝 == //
	

	
	// == 우리회사 채용공고 조회 == //
	private void view_recruit_mycompany(Company_imple login_cp, Recruit[] rc_arr) {
		
		boolean is_existence = false;
		
		do {

			for (int i = 0; i < Recruit.count; i++) {

				if (login_cp.getId().equals(rc_arr[i].getCp().getId())) { // 로그인되어진 id 와 Recruit[i] 번째와 같다면
					is_existence = true;

					System.out.println(rc_arr[i].recruit_info());
				}

			} // end of for-----------------------------------------

			if (!is_existence) {
				System.out.println(">> 채용공고를 낸 것이 없습니다. <<\n");
			}

		} while (!is_existence);
		
	} // end of private void view_recruit_mycompany(Company login_cp, Recruit[] rc_arr) -----------
	// == 우리회사 채용공고 조회 끝 == //

	
	// == 우리회사 채용공고 지원자 조회 == //
	private void view_gujikja_recruitApply(Company_imple login_cp, RecruitApply[] rcApply_arr) {
		
		boolean is_existence = false;
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < RecruitApply.count; i++) {
			
			if ( login_cp.getId().equals(rcApply_arr[i].getRc().getCp().getId()) ) {
				is_existence = true;
				sb.append(rcApply_arr[i].getRc().getRecruit_no() + "\t"
						+ rcApply_arr[i].getRc().getSubject() + "\t\t"
						+ rcApply_arr[i].getGu().getName() + "\t"
						+ rcApply_arr[i].getGu().getGender() + "\t"
						+ rcApply_arr[i].getGu().getAge() + "\t"
						+ rcApply_arr[i].getApply_motive() + "\n");
			}
		} // end of for---------------------------------
		
		if (is_existence) {
			System.out.println("=".repeat(100));
			System.out.println("채용공고	채용제목				지원자명	성별	나이	지원동기");
			System.out.println("=".repeat(100));
			System.out.println(sb.toString());
		}
		else {
			System.out.println(">> 채용공고에 지원자가 없습니다. <<\n");
		}
		
	} // end of private void view_gujikja_recruitApply(Company login_cp, RecruitApply[] rcApply_arr) -------
	// == 우리회사 채용공고 지원자 조회 끝 == //

	
}// end of public class Ctrl_company extends Ctrl_common --------------------------------------
