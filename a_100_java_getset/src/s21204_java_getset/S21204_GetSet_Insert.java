package s21204_java_getset;

import java.util.Scanner;

class PeoPle{
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private double avg;
	private int rank;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSum() {
		return getKor()+getEng()+getMath();
	}
	public double getAvg() {
		return (double)getSum()/3;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int ronk) {
		this.rank = ronk;
	}
	void printScore() {
		System.out.printf(" %3s %3d %3d %3d %3d %3.2f %3d \n",
		this.getName(),this.getKor(),this.getEng(),this.getMath(),this.getSum(),this.getAvg(),this.getRank());	
	}
}
public class S21204_GetSet_Insert {
	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		System.out.print("몇명?: ");
			int num = input.nextInt();	

			PeoPle stu[] = new PeoPle[num];
			
			for(int i=0; i<stu.length; i++) {
				stu[i] = new PeoPle();
			}
			for(int i=0; i<stu.length; i++) {
				System.out.print("너의 이름은?: ");
				stu[i].setName(input.next());
				System.out.print("국어 점수: ");
				stu[i].setKor(input.nextInt());
				System.out.print("영어 점수: ");
				stu[i].setEng(input.nextInt());
				System.out.print("수학 점수: ");
				stu[i].setMath(input.nextInt());
			}
			for(int i=0; i<stu.length; i++) {
				int rank=1;
				for(int j=0; j<stu.length; j++) {
					if(stu[i].getSum() < stu[j].getSum()) rank++;
				}
				stu[i].setRank(rank);
			}
			System.out.println("====================출력====================");
			System.out.printf(" %3s  %3s %2s %2s %3s %3s %4s \n", "성명","국어","영어","수학","합계","평균","석차");
			for(int i=0; i<stu.length; i++) {
				stu[i].printScore();
			}
	}
}
