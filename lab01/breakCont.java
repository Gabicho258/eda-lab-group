import java.util.*;
//method continue: Se tiene un array de nùmeros los cuales se imprimiràn excepto los mùltiplos de 5
public class breakCont {
  public static void main(String[] args){
    int i = 0;

    while(i<=22){
      if((i%5)==0){
	i++;
	continue;
      }
      System.out.println(i);
      i++;
    }
  }
}

