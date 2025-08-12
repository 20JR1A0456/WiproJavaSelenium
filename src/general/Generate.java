package general;

public class Generate {

	
		
		    public static void main(String[] args) {
		        String input = "a2b3c4";
		        String result = "";

		        for (int i = 0; i < input.length(); i += 2) {
		            char letter = input.charAt(i); 
		            int count = input.charAt(i + 1) - '0'; 

		            for (int j = 0; j < count; j++) {
		                result += letter; 
		            }
		        }

		        System.out.println(result);
		    }
		}

	

	


