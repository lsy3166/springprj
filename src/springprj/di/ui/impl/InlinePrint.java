package springprj.di.ui.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import springprj.com.ComDefinition;
import springprj.di.entity.Exam;
import springprj.di.ui.Print;

@Component("iPrint")
public class InlinePrint implements Print {
	
	@Autowired
	@Qualifier(ComDefinition.EXAM_BEAN_ID)
	private Exam exam;

	@Override
	public void print() {
		System.out.printf("[Inline Print] %s\n", exam.toString());
		System.out.printf("- Total : %d, Average : %f\n\n", exam.total(), exam.average());
	}

}
