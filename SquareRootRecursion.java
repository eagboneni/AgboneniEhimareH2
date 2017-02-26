public class SquareRootRecursion{
  
  public static double babylSqrt(double sqrt, double x){ 
    if((sqrt*sqrt)> x-0.1 &&(sqrt*sqrt) < x +0.1){
    return sqrt;
    }
    else
      return babylSqrt(sqrt - 0.1, x);
  }
  public static double getSqrt(double x){
    return babylSqrt(x,x);
  }
public static void main(String[]args){
   
        System.out.println(getSqrt(36));


}

}