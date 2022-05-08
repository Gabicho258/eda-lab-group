import java.util.*;
//method continue: Se tiene un array de nùmeros los cuales se imprimiràn excepto los mùltiplos de 5
public class breakCont {
  public static void main(String[] args){

    for(int i=0;i<=22;i++){
      if(i/5==0)continue;
      System.out.println(i);
    }
  }
}

