import java.util.Scanner;
public class TicTacToe {
  public static Object tps[];
  public static void method1(Object a[], int b) {
    tps=new Object[b];
    tps=a.clone();
    method2(tps);
  }
  public static boolean method2(Object arr[]) {
     System.out.printf(" %s | %s | %s %n-----------%n %s | %s | %s %n-----------%n %s | %s | %s %n",arr[0],arr[1],arr[2],arr[3],arr[4],arr[5],arr[6],arr[7],arr[8]);
      boolean x=method5(arr);
      return x;
  }
  public static boolean method3(int a) {
    a--;
    tps[a]="O";
    boolean x=method2(tps);
    return x;
  }
  public static boolean method4(int b) {
    b--;
    tps[b]="X";
    boolean x=method2(tps);
  return x;
}
  public static boolean method5(Object a[]) {
    boolean bol=false;
    if((a[0].equals(a[1]))&&(a[1].equals(a[2]))) {
      bol=true;
    }
    else if((a[6].equals(a[7]))&&(a[7].equals(a[8]))) {
              bol=true;
    }
    else if((a[0].equals(a[3]))&&(a[3].equals(a[6]))) {
       bol=true;
    }
    else if((a[2].equals(a[5]))&&(a[5].equals(a[8]))) {
      bol=true;
    }
    else if((a[2].equals(a[4]))&&(a[4].equals(a[6]))) {
      bol=true;
    }
    else if((a[0].equals(a[4]))&&(a[4].equals(a[8]))) {
      bol=true;
    }
    else if((a[1].equals(a[4]))&&(a[4].equals(a[7]))) {
        bol=true;
    }
    else if((a[3].equals(a[4]))&&(a[4].equals(a[5]))) {
        bol=true;
    }

    else {
      bol=false;
    }
    return bol;
  }
  
    
  public static void main(String [] args) {
    Scanner sc=new Scanner(System.in);
    TicTacToe obj=new TicTacToe();
    Object cs[]=new Object[9];
    int v=1;
    for(int i=0; i<cs.length; i++) {
      cs[i]=v;
      v++;
    }
    obj.method1(cs, cs.length);
    for(int i=0; i<cs.length; i++) {
      if(i%2==0) {
        System.out.print("1st person! pick a number: ");
        int a=sc.nextInt();
        if(a<1||a>9) {
          System.out.println("Wrnog");
  
        }
        boolean t=obj.method3(a);
        if(t) {
          System.out.println("Congrates you won 1st");
          break;
        }
       
      }
      if(i%2==1) {
        System.out.print("2nd person! pick a number: ");
        int b=sc.nextInt();
        if(b<1||b>9) {
          System.out.println("Wrnog");
        }
               boolean q=obj.method4(b);
                 if(q) {
          System.out.println("Congrates you won 2nd person");
          break;
        }
      }
    }
  }
}