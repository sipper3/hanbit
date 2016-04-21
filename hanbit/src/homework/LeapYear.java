package homework;

public class LeapYear {
	public String getEndOfMonth(int year,int month){
		String day="";
		
		// 코딩하여 완성하시오
		switch (month) {
		case 1:
			day = "31";
			break;
		case 2:
			if(year%4 == 0) day = "29";
			else day = "28";	
			break;
		case 3:
			day = "31";
			break;
		case 4:
			day = "30";
			break;
		case 5:
			day = "31";
			break;
		case 6:
			day = "30";
			break;
		case 7:
			day = "31";
			break;
		case 8:
			day = "31";
			break;
		case 9:
			day = "30";
			break;
		case 10:
			day = "31";
			break;
		case 11:
			day = "30";
			break;
		case 12:
			day = "31";
			break;

		default:
			day = "> 날짜형식에 맞게 입력해주세요.";
			break;
		}
		
		return year+"-"+month+"-"+day;
	}
	
}
