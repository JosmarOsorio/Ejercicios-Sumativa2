// ejercicio 1 sumativa 2 .cpp : Programa que solicita un susuario y contraseña y los verifica. Por: Josmar Osorio. Para: Programación II-UBA.

import java.util.Scanner;//Importamos la libreria java.util.Scanner para poder leer datos ingresador por pantalla.
public class UsuarioyContrasena {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);//Creamos el objeto sc para leer la entrada de datos que ingrese el usuario.
        System.out.println("¡Bienvenido!, por favor ingrese los siguientes datos para acceder");
        System.out.print("Nombre de usuario: ");//Le indicamosśal usuario que ingrese el nombre de usuario.
        String usuario = sc.nextLine();

        System.out.print("Contraseña: ");//Le indicamos al usuario que ingrese la contraseña.
        String contrasena = sc.nextLine();

        if (usuario.equals("Vendedor") && contrasena.equals("1234")) {//Creamos un if para verificar si el usuario y la contraseña son correctos.
            System.out.println("¡Inicio de sesión exitoso!");//Si son corresctos se muestra un mensaje de bienvenida.
        } else {
            System.out.println("¡Nombre de usuario o contraseña incorrecta!");//Si un valor es incorrecto o ambos, se le indica al usuario.
        }

    }
}
