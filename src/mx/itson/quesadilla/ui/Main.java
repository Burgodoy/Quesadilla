package mx.itson.quesadilla.ui;
import java.util.Scanner;
import mx.itson.quesadilla.back.Reestructura;

public class Main {
    
    public static void main(String[] args){
        
        System.out.println("Ingrese la cadena de numeros telefonicos");
        //metodo scanner para ingreso de datos
        Scanner scanner = new Scanner(System.in);
        String cadena = scanner.nextLine();
        
        String[] cadenaResuelta = new Reestructura().limpiar(cadena);
        /*cadenaResuelta hace una instancia de la clase reestructura y utiliza 
        el metodo limpiar(utilizando nuestra variable cadena), el cual utiliza un 
        replace de caracteres e inmediatamente un split para separar cada elemento 
        y dejarlo en un espacio del arreglo.
        */
        int guaymas = 0;
        int tijuana = 0;
        int hermosillo = 0;
        int otro = 0;
        /*
        Declaramos las variables donde guardaremos el registro de numeros
        */
        
        for (String s : cadenaResuelta) {
            /*
            En este ciclo pasamos cada elemento del arreglo en donde al utilizar
            el metodo startsWith podemos separar los numeros dependiendo si se
            cumple su condicional inicial y asi ir sumando cada elemento hasta 
            terminar el arreglo.
            */
            if (s.startsWith("664")) {
                tijuana++;
            }else if(s.startsWith("622")){
                guaymas++;
            }else if (s.startsWith("662")) {
                hermosillo++;
            }else{
                otro++;
            }
            /*
            Mandamos a imprimir los resultados obtenidos.
            */
        }
        System.out.println("Hay " + tijuana + " numeros de Tijuana");
        System.out.println("Hay " + guaymas + " numeros de Guaymas");
        System.out.println("Hay " + hermosillo + " numeros de Hermosillo");
        System.out.println("Hay " + otro + " numeros de otra localizacion");

    }
}