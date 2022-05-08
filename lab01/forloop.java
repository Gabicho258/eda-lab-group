import java.util.*;

//Se quiere tener una lista enumerada de un conjunto de personas.

public class forloop {
  public static void main(String[] args){
    String names[] = {"Ana","Brandon","Carlos","Daymar","Emanuel","Fabiola","Josue","Daniel","Ismael"}; 

    //for loop utilizado
    for(int i=0;i<names.length;i++){
      System.out.println((i+1)+"."+names[i]);
    }

  }
}

