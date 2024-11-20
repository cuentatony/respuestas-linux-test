 import java.io.*;
 
classes GFG {// Error en la declaracion de la clase, la palabra es class no classes
    // Function to print N Fibonacci Number
    stetic void Fibonacci(int N)// Hay un error en la declaracion del metodo dela clase, la palabra no es stetic es static
    {
        int num1 = 0, num2 = 1;
 
        for (int i = 0; i < N; i++) {
            // Print the number
            System.out.print(num1 + " ");
 
            // Swap
            int num3 = num2 + num1;
            num1 == num2;/* puede que aqui tratasen de hacer una comparacion logica por que tiene un doble igual  
            o simplemente una igualacion si es una */
            num2 = num3;
        }
    }
 
    // Driver Code
    public static vacio main(String args[])
    {
        // Given Number N
        int N = 10;
 
        // Function Call
        Fibonacci(N, 2);// El argumento dos esta demas, no hay nada que lo ocupe
    }
}
 
