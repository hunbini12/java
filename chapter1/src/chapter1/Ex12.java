package chapter1;

public class Ex12 {

	public static void main(String[] args) {
		char grade = 'F';
		int score = 74;
		
		if( score >= 90) {
			grade = 'A';
		} else if(score >= 80) {
			grade = 'B';
		} else if(score >= 70) {
			grade = 'C';
		} else if(score >= 60) {
			grade = 'D';
		} else if(score >= 50) {
			grade = 'E';
		} else grade = 'F';
		
		
		if(grade == 'A') {
			System.out.println("참 잘했어요");
		} else if(grade == 'B') {
			System.out.println("잘했어요");
		} else if(grade == 'C') {
			System.out.println("노력 하세요");
		} else if(grade == 'D') {
			System.out.println("좀 더 노력하세요");
		} else if(grade == 'F') {
			System.out.println("다음 학기");
		} else {
			System.out.println("잘못된 학점입니다.");
		}
		
		
		switch(grade) {
		case 'A': {
			System.out.println("참 잘했어요");
		}
		case 'B': {
			System.out.println("잘했어요");
		}
		case 'C': {
			System.out.println("노력");
		}
		case 'D': {
			System.out.println("좀더노력");
		}
		case 'F': {
			System.out.println("다음학기");
			break;
		}
		default : {
			System.out.println("잘못된");
		}
	}
}
}
