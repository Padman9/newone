package new_project;



public class ReverseNumberSum {
    public static void main(String[] args) {
        int start = 1;
        int end = 9;
        
        // Reverse the numbers
        for (int i = end; i >= start; i--)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        
        // Calculate the sum of every three numbers
        int sum = 0;
        int count = 0;
        for (int i = end; i >= start; i--) 
        {
            sum += i;
            count++;
            if (count % 3 == 0)
            {
                System.out.println("Sum of three numbers: " + sum);
                sum = 0;
            }
        }
    }
}

 