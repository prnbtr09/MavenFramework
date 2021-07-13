import java.util.List;
import java.util.Map;

import com.jayway.jsonpath.Criteria;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.Filter;
import com.jayway.jsonpath.JsonPath;

public class Interview {
	
public static void	verifySingleDigitSum(int number) {
	int remainder=0;
	int sum=0;
	
	int finalValue=0;
	
	while(number>0){
		remainder=number%10;
		number=number/10;//999/10
	    
	    
	    
	    sum=sum+remainder;//0+9=9
	    
	    
	}
	
	finalValue=sum;
//	System.out.println(finalValue);
	if(finalValue>10) {
		verifySingleDigitSum(finalValue);
		
	}else {
		System.out.println(finalValue);
	}
	
}

	public static void main(String[] args) {
		int input=9999;
		
		
		
		
		
		verifySingleDigitSum(input);
		
		
		

		
		
		
		
		
		
		}		
	

}
