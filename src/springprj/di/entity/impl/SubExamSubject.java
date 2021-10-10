package springprj.di.entity.impl;

import org.springframework.beans.factory.annotation.Value;

import springprj.com.ComUtil;
import springprj.di.entity.Exam;

public class SubExamSubject implements Exam {

	@Value("50")
	public int history;
	@Value("100")
	public int japanese;
	@Value("80")
	public int music;
	@Value("20")
	public int society;
	@Value("100")
	public int science;
	
	public int total;
	
	public int getHistory() {
		return history;
	}

	public void setHistory(int history) {
		this.history = history;
	}

	public int getJapanese() {
		return japanese;
	}

	public void setJapanese(int japanese) {
		this.japanese = japanese;
	}

	public int getMusic() {
		return music;
	}

	public void setMusic(int music) {
		this.music = music;
	}

	public int getSociety() {
		return society;
	}

	public void setSociety(int society) {
		this.society = society;
	}

	public int getScience() {
		return science;
	}

	public void setScience(int science) {
		this.science = science;
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
		return "SubExamSubject [history=" + history + ", japanese=" + japanese + ", music=" + music + ", society="
				+ society + ", science=" + science + "]";
	}
	
}
