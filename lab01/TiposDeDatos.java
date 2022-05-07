/*Se nesecita mostrar un mensaje que contenga tu nombre ,inicial, edad  y la media geometrica
 de(3,4,5) asegurese de usar datos primitivos y no primitivos
 NOTA: utilice Math.pow(niNumero,1/n) para la media geometrica*/
public class TiposDeDatos {
    public static void main(String[] args) {
        char inicial = 'F';
        int producto = 3 * 4 * 5, edad = 22;
        String nombre = "Franco";
        double media = Math.pow(producto, 1 / 3);
        System.out.println(
                "Nombre:" + nombre + "; Inicial" + inicial + "; Edad:" + edad + "\nMedia Geometrica:" + media);

    }
}
