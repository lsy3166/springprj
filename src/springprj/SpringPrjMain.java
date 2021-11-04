package springprj;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import springprj.com.ComDefinition;
import springprj.com.ComUtil;
import springprj.di.entity.Exam;
import springprj.di.ui.Print;

public class SpringPrjMain {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		List<Exam> exams = (List<Exam>)ComDefinition.context.getBean("exams");
		AtomicInteger index = new AtomicInteger(1);
		exams.stream().forEach(exam -> {
			System.out.println("리스트 대상 ["+ index.getAndAdd(1) + "] : " +  exam);
		});
		System.out.println("---------------------------------------------------------------------------------------------");
		Print console = (Print)ComDefinition.context
				.getBean(ComDefinition.PRINT_BEAN_ID.GRID.getValue());
		console.print();
		
		ComUtil.paintInvertedTriangle();
	}

}
