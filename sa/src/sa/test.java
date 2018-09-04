package sa;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.ResourceBundle;
public class test {
	public static void main(String args[]) 
	{
		 YearMonth ym = YearMonth.now();  
		    String s = ym.format(DateTimeFormatter.ofPattern("MM yyyy"));  
		    System.out.println(s);  
		    //updated the code on 11:43
	}

}
