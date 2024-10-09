import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BuscarPelicula peli = new BuscarPelicula();
        System.out.println("Ingrese el numero de la pelicula");

        try{
            var numeroPelicula = sc.nextLine();
            Pelicula pelicula = peli.busquedaPelicula(Integer.parseInt(numeroPelicula));
            Escritura archivo = new Escritura();
            archivo.archivosdepelicula(pelicula);

        }catch (NumberFormatException e){
            System.out.println("Numero no encontrado"+e.getMessage());
        }
        catch (RuntimeException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando la aplicacion");
        }
        sc.close();


    }
}
