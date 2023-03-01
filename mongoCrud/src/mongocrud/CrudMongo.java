/*
Luis Angel Estrada Armenta
Programa para hacer conexion con mongo java
fecha: 27/02/2023
grupo: DSM502
 */
package mongocrud;

/**
 *
 * @author Luis Angel
 */
public class CrudMongo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Connection conexion = new Connection();

        conexion.Mostrar();
        //   conexion.insertar("nadar");
        System.out.println("Otro");
        //  conexion.Mostrar();
        System.out.println("otro mas");
        //  conexion.Actualizar("nadar","brincar");
        conexion.Eliminar("brincar");
        conexion.Mostrar();
    }

}
