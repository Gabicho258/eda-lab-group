import java.util.*;
//method continue: Se tienen nùmeros del 0 al 22 los cuales se imprimiràn excepto los mùltiplos de 5 y los nùmeros impresos deberàn ser menores a 16
//
public class breakCont {
  public static void main(String[] args){
    int i = 0;

    while(i<=22){
      if(i==16)break;
      if((i%5)==0){
	i++;
	continue;
      }
      System.out.println(i);
      i++;
    }
  }
}

