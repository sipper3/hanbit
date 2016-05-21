package member;

import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		//MemberUI ui = new MemberUI();
		Scanner s = new Scanner(System.in);
		MemberService service = new MemberServiceImpl();
		
		
		while (true) {
			System.out.println("[메뉴]1.회원가입, 2.로그인, 3.마이페이지, 4.수정, 5.탈퇴, 6.조회(ID), 7.조회(성별), 8.조회(이름), 0.로그아웃");
			switch (s.next()) {
			case "1":
				System.out.println("아이디, 비번, 이름, 성별");
				MemberBean m = new MemberBean(s.next(), s.next(), s.next(), s.next());
				System.out.println(service.join(m));
				break;
			case "2":
				System.out.println("아이디, 비번");
				System.out.println(service.login(s.next(), s.next()));
				break;
			case "3":
				System.out.println(service.detail().toString());
				break;
			case "4":
				System.out.println("비번");
				MemberBean m2 = new MemberBean();
				m2.setPwd(s.next());
				service.update(m2);
				break;
			case "5":
				System.out.println("탈퇴");
				service.delete();
				break;
			case "6":
				System.out.println("조회 ID");
				System.out.println(service.findByID(s.next()).toString());
				break;
			case "7":
				System.out.println("조회 성별(남:M, 여:W)");
				System.out.println(service.countByGen(s.next())+"명");
				break;
			case "8":
				System.out.println("조회 이름");
				System.out.println(service.findByName(s.next()));
				break;
			case "0":
				System.out.println("로그아웃..");
				return;
			default:
				System.out.println("0 ~ 6번만 선택이 가능합니다");
				break;
			}
		}

	}

}
