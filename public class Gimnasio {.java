public class Gimnasio {
    
 /* CLASE
    * Nuestra Clase es un Gimnasio
    */ 

    /* ATRIBUTOS
     * Nos indican las caracteristicas que va a tener cada uno de los elementos que creamos con 
     * esta clase. En este caso, Los atributos nos indicaran las caracteristicas de cada
     * gimnasio que crearemos.
     */

     int numAulas;
     String nombre;


     /* CONSTRUCTOR
      * Me va a permitir crear un gimnasio concreto. Por ejemplo "Gimansio Merche"
      * this.numAula me permite darle el mismo nombre a las variables ya que nunca se pueden repetir
      * pero como estan dentro del metodo, con this.variable podemos hacer la escepcion
      */

      public Gimnasio (int numAulas, String nombre) {
        this.numAulas = numAulas;
        this.nombre = nombre;
      }


     /* METODOS
      * Nos indican las cosas que pueden hacer los elementos que creamos.
      * en este caso, vamos a decir que hay 3 niveles de clases y en funcion de un examen fisico
      * te asignan un nivel u otro
      */

      public void saberClase (double nivel) {
        if (nivel>=5) {
            System.out.println("Perteneces a las clases de nivel avanzado")
        }
        else (nivel<5) {
            System.out.println("Perteneces a las clases de iniciacion")
        }
      }

      //Tenemos todas las variables bien recogiditas en el metodo, por lo que no estorban en el main

    
}

