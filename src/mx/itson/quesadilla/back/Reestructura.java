package mx.itson.quesadilla.back;

public class Reestructura {
    /*
    El metodo limpiar realiza un replace de los multiples caracteres extra que
    pueda contener la cadena de numeros telefonicos, guardando esta cadena nueva 
    en la variable reemplazarCaracteres, despues se crea un arreglo por el cual
    al haber dejado unicamente el caracter , podemos separar cada numero con un 
    split y este se guarda con el nombre de resultado.
    */
    public String[] limpiar(String numerosTelefonicos){
        String reemplazarCaracteres = numerosTelefonicos.replace(" ","").replace("(", "").replace(")", "").replace("-", "");
        String[] resultado = reemplazarCaracteres.split(",");
        return resultado;
    }
        
        
}
