package springprj.di.ui.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import springprj.com.ComDefinition;
import springprj.di.entity.Exam;
import springprj.di.ui.Print;

@Component("gPrint")
public class GridPrint implements Print {
	
	@Autowired
	@Qualifier(ComDefinition.EXAM_BEAN_ID)
	private Exam exam;
	
	@Override
	public void print() {
		System.out.printf("[Grid Print] %s\n", exam.toString());
		System.out.println("！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！");
		System.out.println("Β       TOTAL                         |                AVERAGE                |");
		System.out.println("！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！");
		System.out.printf("Β       %d                           |                %f              |\n", exam.total(), exam.average());
		System.out.println("！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！");
	}

}
