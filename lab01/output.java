import java.util.*;
//Se da una lista de nombres y se pide imprimirlas con saltos de lìnea
//y tambièn seguida de guiones
public class output {
  public static void main(String[] args){
    String nombres[] = {"Yerick","Manuel","Renzo","Joseph"};
    for(int i=0;i<nombres.length;i++){
      System.out.println(nombres[i]);
    }

    for(int i=0;i<nombres.length;i++){
      System.out.print(nombres[i]+"-");
    }
  }
}

