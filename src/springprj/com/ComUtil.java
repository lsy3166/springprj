package springprj.com;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ComUtil {
	
	public static int getTotal(Class<?> cls) {
		int total = 0;
		try {
			Object object = ComDefinition.context.getBean(ComDefinition.EXAM_BEAN_ID);
			Method[] methods = cls.getDeclaredMethods();
			
			for (Method method: methods) {
				if (method.getName().startsWith("get")) {
					total += (int)method.invoke(object);
				}
			}
		} catch (IllegalAccessException | IllegalArgumentException
				| InvocationTargetException | SecurityException e) {
			e.printStackTrace();
		}
		return total;
	}
	
	public static float getAverage(Class<?> cls, int total) {
		return total / (cls.getDeclaredFields().length - 1);
	}
	
	public static void paintInvertedTriangle() {
		StringBuilder sb = new StringBuilder();
		String star = "¡å";
		String space = " ";
		int colLen = 21;
		int rowLen = colLen/2+1;
		for (int row = 0 ; row < rowLen ; row++) {
			String strRow = "";
			for (int col = 0 ; col < colLen ; col++) {
				if (col - row >= 0) {
					if (col >= (colLen - row)) strRow += space;
					else strRow += star;
				}
				else strRow += space;
			}
			strRow += "\n";
			sb.append(strRow);
		}
		
		System.out.println(sb.toString());
	}
}
