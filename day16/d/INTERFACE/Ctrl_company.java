package my.day16.d.INTERFACE;

import java.util.Scanner;

public interface Ctrl_company {
	
	// == 구직자(Company) 신규 회원가입시
	//    Company 클래스의 field 의 요구사항에 모두 맞으면
	//    CommonMember[] cmbr_arr 에 저장시켜주는 메소드 생성하기 ==
	void register(Scanner sc, CommonMember[] cmbr_arr);

	
	// == 구인회사 메뉴 == //
	void cp_menu(Scanner sc, Company_imple login_cp, CommonMember[] cmbr_arr, Recruit[] rc_arr, RecruitApply[] rcApply_arr);

	


}
