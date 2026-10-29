package mazama_pintadoep_encriptacion;

import java.util.function.BiFunction;

public class Operaciones {


    public static <T,U,R> R encriptar (T mensaje, U clave , BiFunction<T,U,R> operacion){
         
       return operacion.apply(mensaje, clave);
    }


}