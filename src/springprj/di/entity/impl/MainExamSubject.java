package springprj.di.entity.impl;

import springprj.com.ComUtil;
import springprj.di.entity.Exam;

public class MainExamSubject implements Exam {

	private int mathmethics;
	private int korean;
	private int english;
	private int computor;
	
	private int total;
	
	public int getMathmethics() {
		return mathmethics;
	}

	public void setMathmethics(int mathmethics) {
		this.mathmethics = mathmethics;
	}

	public int getKorean() {
		return korean;
	}

	public void setKorean(int korean) {
		this.korean = korean;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getComputor() {
		return computor;
	}

	public void setComputor(int computor) {
		this.computor = computor;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public int total() {
		int total = ComUtil.getTotal(this.getClass());
		this.setTotal(total);
		return total;
	}

	@Override
	public float average() {
		return ComUtil.getAverage(this.getClass(), this.getTotal());
	}

	public String toString() {
		return "MainExamSubject [mathmethics=" + mathmethics + ", korean=" + korean + ", english=" + english
				+ ", computor=" + computor + "]";
	}

}
