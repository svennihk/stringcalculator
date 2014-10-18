package is.ru.stringcalculator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {
	//private static String[] negativeThrow = ("Negatives not allowed:");
		
	public static int add(String text){
	
		if(text.equals("")){
			return 0;
		}
		else
		{
			String[] SPLITER = splitNumbers(text);
			return sum(SPLITER);
		}
	
	}

	private static int toInt(String number){
		return Integer.parseInt(number);
	}

	private static String[] splitNumbers(String numbers){
	  
	  if(numbers.startsWith("//")){
	  	Matcher tekk = Pattern.compile("//(.)\n(.*)").matcher(numbers);
	  	tekk.matches();
	  	String geymir = tekk.group(1);
	  	String nr = tekk.group(2);
	  	return nr.split(geymir); 
		}
	  else{
	 	String [] SPLITER = numbers.split(",|\n");
	 	return SPLITER;
	 }
  
	}
      
    private static int sum(String[] numbers){
 	    int total = 0;
 	    int no = 0;
        for(String number : numbers){
        	if(toInt(number) > 1000){
        		
        	}
        	else{
        		total += toInt(number);
			}
		}
		return total;
    }
}