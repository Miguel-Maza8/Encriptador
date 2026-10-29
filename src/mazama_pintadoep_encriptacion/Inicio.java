/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mazama_pintadoep_encriptacion;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Miguel Maza
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        testDesplazamiento();
        testBitChar();
        
        testBitInteger();
    }

    private static void testDesplazamiento() {
        
        System.out.println("Datos de entrada");
        
        String mensaje = "hello";
        Integer clave = 3;
        String resultado = Operaciones.encriptar(mensaje,clave,(texto, numero) ->Algoritmos.algoritmoPorDesplazamiento(texto, -numero) );
        
        System.out.println(resultado);
    }

    private static void testBitChar() {
        
        System.out.println("Datos de entrada");
        
        List<Character> mensaje = Arrays.asList('H', 'E', 'L', 'L', 'O');
        String clave = "KEY";

        List<Integer> resultado = Operaciones.encriptar( mensaje,  clave,(texto, llave) -> Algoritmos.porBit(texto, llave));
    
        System.out.println(resultado);
    }

    private static void testBitInteger() {
        System.out.println("Datos de entrada");
        
        List<Integer> mensaje = Arrays.asList(72, 69, 76, 76, 79);
        String clave = "KEY";

        List<Integer> resultado = Operaciones.encriptar( mensaje,  clave,(texto, llave) -> Algoritmos.porBit(texto, llave));
    
        System.out.println(resultado);
        
    }
    
}
