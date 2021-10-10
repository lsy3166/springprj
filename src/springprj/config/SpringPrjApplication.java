package springprj.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import springprj.di.entity.Exam;
import springprj.di.entity.impl.MainExamSubject;
import springprj.di.entity.impl.SubExamSubject;

@ComponentScan({"springprj.di.ui", "springprj.di.entity"})
@Configuration
public class SpringPrjApplication {
	
	@Bean
	public Exam mainExam() {
		MainExamSubject exam = new MainExamSubject();
		exam.setMathmethics(10);
		exam.setKorean(20);
		exam.setEnglish(30);
		exam.setComputor(40);
		return exam;
	}
	
	@Bean
	public Exam mainExam2() {
		MainExamSubject exam = new MainExamSubject();
		exam.setMathmethics(50);
		exam.setKorean(60);
		exam.setEnglish(70);
		exam.setComputor(80);
		return exam;
	}
	
	@Bean
	public Exam subExam() {
		return new SubExamSubject();
	}
	
	@Bean
	public List<Exam> exams() {
		List<Exam> exams = new ArrayList<Exam>();
		exams.add(mainExam());
		exams.add(mainExam2());
		exams.add(subExam());
		return exams;
	}
}
