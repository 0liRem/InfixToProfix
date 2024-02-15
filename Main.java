//
//                      DOCUMENTACION INTERNA
//
//   Nombre del programa: POSTFIX.JAVA
//
//   Fin en Mente:
///             Programa capaz por medio del uso de stacks una calculadora con el metodo postfix, tras haber convertido de metodo infix los datos ingresados por medio de un archivo de texto
//   Programadores: Olivier Viau 23544
//                  Fabian Morales 23267
//
//   Lenguaje: Java
//
//   Recursos:
//https://keepcoding.io/blog/que-es-stack-tecnologico/

//   Historia de Modificaciones:
//
//            [000] 14/01/2024 Programa nuevo
//
//            [001] 15/02/2024 Infix to posfix

public class Main {
    public static void main(String[] args) {
        Vistas vista=new Vistas();
        vista.menu();
    }
}
