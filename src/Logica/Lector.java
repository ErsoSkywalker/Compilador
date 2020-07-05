package Logica;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Lector {

    ArrayList<String> Instrucciones = new ArrayList<>();
    ArrayList<String> InstruccionesPorCompilar = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    javax.swing.JTextArea OutPutText;

    public Lector(String Archivo, javax.swing.JTextArea TextAreaOmg) throws IOException {

        this.OutPutText = TextAreaOmg;
        LectorArchivoInstrucciones("C:\\Users\\conti\\Desktop\\Important Things\\Asesorias\\Compilador\\Codigos\\DefinicionLenguaje.txt");
        System.out.println("Dame el archivo a compilar prro uwu");
        LectorArchivoACompilar(Archivo);
        CompilarCodigo comp = new CompilarCodigo(InstruccionesPorCompilar, new PrepararObjetos(Instrucciones), OutPutText);
    }

    void LectorArchivoInstrucciones(String archivo) throws IOException {
        String cadena;
        try {
            FileReader file = new FileReader(archivo);
            BufferedReader b = new BufferedReader(file);
            while ((cadena = b.readLine()) != null) {
                Instrucciones.add(cadena);
            }
            b.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "¡Este archivo no se encuentra!", "Aviso", JOptionPane.ERROR_MESSAGE);
        }

    }

    void LectorArchivoACompilar(String archivo) throws IOException {
        String cadena;
        try {
            FileReader file = new FileReader(archivo);
            BufferedReader b = new BufferedReader(file);
            while ((cadena = b.readLine()) != null) {
                InstruccionesPorCompilar.add(cadena);
            }
            b.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "¡Debes insertar un archivo a compilar :D!", "Aviso", JOptionPane.ERROR_MESSAGE);
        }

    }

}
