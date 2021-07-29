/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.io.File;

/**
 *
 * @author drmoales4
 */
public class Principal {
    public static void main(String[] args) {
        String ruta = "D:/MORALITOS/Desktop/Documentos Sexto Ciclo/TEORIA DE "
                + "AUTOMATAS Y COMPILADORES/2do BIMESTRE/AnalizadorLexico/src/"
                + "codigo/Lexer.flex";
        generarLexer(ruta);
    }
    public static void generarLexer(String ruta){
        File archivo = new File(ruta);
        JFlex.Main.generate(archivo);
    }
}
