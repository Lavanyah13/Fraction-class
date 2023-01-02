public class Fraction {
  private int numerator;
  private int denominator;
  
  public Fraction(int numerator,int denominator){
    this.numerator=numerator;
    this.denominator=denominator;
    simplify();
  }
  
  public void simplify(){
    
    int gcd=1;
    int smaller = Math.min(numerator,denominator);
    for (int i=2; i<= smaller; i++) {
      if (numerator%2==0 && denominator%2==0)
      gcd=i;
    }
    numerator= numerator/gcd;
    denomiator=denominator/gcd;
  }
  
  public void increment{
    numerator=numerator+denominator;
    simplify();
  }
  
  public void print()
  {
    System.out.print(numerator + "/" + denominator);
  }
}

  
    public class FractionUse {
      public static void main (String [] args){
        
      Fraction f1= new Fraqction (4,6);
        f1.print();
        f1.increment();
        f1.print();
      }
    }
      
      
