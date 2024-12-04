public abstract class Negocios {
    
    /* CLASE ABASTRACTA
    * Seria negocio por ejemplo. Ya que vamos a crear varios negocios que nos dan una rentabilidad
    * pero no sabemos cuantos negocios o que van a hacer asique creamos una clase abstracta que indique
    * variables comunes como que queremos una rentabilidad positiva
    * Además, todos nuestros negocios estarán en España
    */

    Protected double rentabilidad;
    Protected double pais;

    /* METODO ABSTRACTO
     * Queremos que los negocios nos generen rentabilidad, pero cada tipo lo hace de una manera distinta
     * por eso, creamos un metodo abstracto para decirle lo que tiene que hacer, sin decirle como.
     * 
     * Puede ser usado por las clases hijas
     * no por la clase abstracta ya que no puede generar objetos
     */


     public abstract generarRentabilidad ();

    
}
