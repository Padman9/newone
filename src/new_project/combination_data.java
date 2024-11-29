package new_project;

public class combination_data 
{
  public static void main(String[] args) {
  
	  String[][] testData = {
	            {"validusername", "validpassword"},
	            {"validusername", "wrongpassword"},
	            {"wrongusername", "validpassword"},
	            {"onlyletters", "validpassword"},
	            {"letters123", "validpassword"},
	            {"letters123!@", "validpassword"},
	            {"123456", "validpassword"},
	            {"123456!@", "validpassword"},
	            {"", "validpassword"},
	            {"CaseSensitive", "validpassword"},
	        };
	       
	        // Loop through each combination and test the login process
	        for (String[] data : testData) {
	            String username = data[0];
	            String password = data[1];

	            System.out.println(data);
	        }
}
}
