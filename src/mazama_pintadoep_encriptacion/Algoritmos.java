package mazama_pintadoep_encriptacion;

import java.util.ArrayList;
import java.util.List;

/**
 * Algoritmos
 */
public class Algoritmos {

    
    public static String algoritmoPorDesplazamiento (String mensaje , int numero){

         char[] letras = mensaje.toCharArray();
        

         for( int i=0;  i<letras.length ;i++){
             
            int posicion = letras[i] - 'a';
            posicion = (posicion +numero) % 26;
            letras[i] = (char) (posicion +'a');
             

            
         }
              return new String(letras);
    }

    public static <T> List<Integer> porBit(List<T> mensaje , String clave){
      
           
            if (clave == null ||clave.isEmpty() ){
                throw new IllegalArgumentException("Error clave nula o vacia");
            }
            if( mensaje == null){
                     throw new IllegalArgumentException("Error el mensaje no puede ser nulo");
                }
            char[] claves = clave.toCharArray();
            List<Integer> listaN = new ArrayList<>();

            for( int i = 0; i < mensaje.size();i++){
                
                T elemento = mensaje.get(i);
                
                int claveActual = claves[i % claves.length];
                
                int resultado; 
                
                if(elemento instanceof Character){
                   
                    resultado = (int) (Character) elemento ^ claveActual;
                }
                else if(elemento instanceof Integer){
                     resultado = (Integer) elemento ^ claveActual;
                }else{
                   throw new IllegalArgumentException("Error dato no permitido ");

                }
                
                listaN.add(resultado);
            }
         
            return listaN;

        
    }
}