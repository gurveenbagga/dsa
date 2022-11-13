//to understand how memory is allocated and result returned in recursion
//Reference - https://www.geeksforgeeks.org/introduction-to-recursion-data-structure-and-algorithm-tutorials/

// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        int n = 3;
        PrintFun(n);
    }
    
    static void PrintFun(int n) {
        if (n < 1) 
            return;
        else {
            System.out.printf("%d ", n);
            PrintFun(n - 1);
            System.out.printf("%d ", n);
            return;
        }
    }
}

