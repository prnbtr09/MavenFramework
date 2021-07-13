import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.jayway.jsonpath.Criteria;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.Filter;
import com.jayway.jsonpath.JsonPath;

public class practice {
	
	public static void findKeyIneachSegment(int sub[]) {
		
		for(int i=0;i<sub.length;i++) {
			System.out.println(sub[i]);			
		}

		
	}

	public static void main(String[] args) {
		
		String jsonString="{\r\n" + 
				"    \"book\": \r\n" + 
				"    [\r\n" + 
				"        {\r\n" + 
				"            \"title\": \"Beginning JSON\",\r\n" + 
				"            \"author\": \"Ben Smith\",\r\n" + 
				"            \"price\": 49.99\r\n" + 
				"        },\r\n" + 
				"\r\n" + 
				"        {\r\n" + 
				"            \"title\": \"JSON at Work\",\r\n" + 
				"            \"author\": \"Tom Marrs\",\r\n" + 
				"            \"price\": 29.99\r\n" + 
				"        },\r\n" + 
				"\r\n" + 
				"        {\r\n" + 
				"            \"title\": \"Learn JSON in a DAY\",\r\n" + 
				"            \"author\": \"Acodemy\",\r\n" + 
				"            \"price\": 8.99\r\n" + 
				"        },\r\n" + 
				"\r\n" + 
				"        {\r\n" + 
				"            \"title\": \"JSON: Questions and Answers\",\r\n" + 
				"            \"author\": \"George Duckett\",\r\n" + 
				"            \"price\": 6.00\r\n" + 
				"        }\r\n" + 
				"    ],\r\n" + 
				"\r\n" + 
				"    \"price range\": \r\n" + 
				"    {\r\n" + 
				"        \"cheap\": 10.00,\r\n" + 
				"        \"medium\": 20.00\r\n" + 
				"    }\r\n" + 
				"}";
		
		
//JsonObject object=JsonPath.from(jsonString).get("$.tool.jsonpath.creator.location[2]");		
//
//System.out.println(object);
		
		
		String path="$['tool']['jsonpath']['creator']['name']";
		String jsonpathCreatorLocationPath = "$['tool']['jsonpath']['creator']['location'][*]";

DocumentContext js=JsonPath.parse(jsonString);
//System.out.println(js.read(jsonpathCreatorLocationPath));

Filter expensiveFilter = Filter.filter(Criteria.where("price").gt(20.00));
List<Map<String, Object>> expensive = JsonPath.parse(jsonString)
  .read("$['book'][?]", expensiveFilter);

System.out.println(expensive);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		int arr[] = { 3, 5, 2, 4, 9, 3, 1, 7, 3, 11, 12, 3};
		
		int segmentSize=3;
		int key=3;
		int temp=0;
		
		int semgments=arr.length/segmentSize;//4
		for(int j=0;j<semgments;j++) {
		for(int i=0;i<segmentSize;i++) {
			int sub[]=Arrays.copyOfRange(arr, i, segmentSize);
			findKeyIneachSegment(sub);
			
			if(i==(segmentSize-1)) {
				i=segmentSize;
				segmentSize=segmentSize+segmentSize;	
			}
		}
		}
		
		
		
		
		
		
		
		
		
		/* Largest and smallest element
		 * Integer arr[] = {10, 15, 5, 7, 4, 20}; int length=arr.length;
		 * 
		 * int kthLargest=3; int kthSmallest=3;
		 * 
		 * //smallest
		 * 
		 * Arrays.sort(arr);
		 * 
		 * 
		 * 
		 * for(int i=0;i<length;i++) { if(i==(kthSmallest-1)) {
		 * System.out.println(kthSmallest+" smallest Integer is "+arr[i]); } }
		 * 
		 * 
		 * Arrays.sort(arr, Collections.reverseOrder());
		 * 
		 * for(int i=0;i<arr.length;i++) { if(i==(kthLargest-1)) {
		 * System.out.println(kthLargest+" Largest integer is "+arr[i]); } }
		 */		
		
		
		
		
		
	
		
		
		
		
		
/**		//Array reverse
		int arr[] = {1, 2, 3, 4, 5, 6};
		int length=arr.length;
		
		
		int tempArr[]=new int[length];
		int counter=0;
		
		for(int i=arr.length-1;i>=0;i--) {
			tempArr[counter]=arr[i];
			counter++;
			
		}
		
		for(int i=0;i<tempArr.length;i++) {
			System.out.print(tempArr[i]+" ");
		}
**/


	}

}
