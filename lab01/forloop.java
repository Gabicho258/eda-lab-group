import java.util.*;

//Se quiere tener una lista enumerada de un conjunto de personas(listas separadas segùn el sexo).

public class forloop {
  public static void main(String[] args){
    String nameH[] = {"Brandon","Carlos","Daymar","Emanuel","Flavio","Josue","Daniel","Ismael"}; 
    String nameM[] = {"Ana","Barbie","Carmen","Ema","Nadia","Maria","Isabella"}; 

    //for loop utilizado
    for(int i=0;i<nameH.length;i++){
      System.out.println((i+1)+"."+nameH[i]);
    }

    //for each utilizado
    int ind=1;
    for(String i:nameM){
      System.out.println((ind)+"."+i);
      ind++;
    }
  }
}

