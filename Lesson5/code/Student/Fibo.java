import java.util.Arrays;
public class Fibo{
  public static void main(String[] args){
    int months = 12;
    int fib[] = new fib[months];
    for (int i = 0; i < months; i++){
    if (i == 0 || i == 1){
        fib[i] = i;
    }
    else
      fib[i] = fib[i-1] +  fib[i-2];
    }
    System.out.println(Arrays.toString(fib));
  }
}
