package is.ru.stringcalculator;


public class Calculator {
		
	public static int add(String text){
	
		if(text.equals("")){
			return 0;
	}
		else{
			String[] SPLITER = splitNumbers(text);
			return sum(SPLITER);
		}
	
	}

	private static int toInt(String number){
		return Integer.parseInt(number);
	}

	private static String[] splitNumbers(String numbers){
	  
	  
	 String [] SPLITER = numbers.split(",|\n");
	 return SPLITER;
  
	}
      
    private static int sum(String[] numbers){
 	    int total = 0;
        for(String number : numbers){
		    total += toInt(number);
		}
		return total;
    }
   



}