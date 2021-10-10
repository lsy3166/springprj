package springprj.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import springprj.config.SpringPrjApplication;

public class ComDefinition {
	//public static ApplicationContext context = new ClassPathXmlApplicationContext("/springprj/config/setting.xml");
	public static ApplicationContext context = new AnnotationConfigApplicationContext(SpringPrjApplication.class);
	
	// INLINE : iPrint, GRID : gPrint
	public static enum PRINT_BEAN_ID {
		INLINE("iPrint")
		, GRID("gPrint");
		
		private final String value;
		
		private PRINT_BEAN_ID(String value){
			this.value = value;
		}
		
		public String getValue() {
			return value;
		}
	};
	
	// mainExam, mainExam2, subExam
	public static final String EXAM_BEAN_ID = "subExam";
}
