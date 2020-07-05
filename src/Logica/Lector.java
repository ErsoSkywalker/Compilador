
package Logica;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Lector {
    
    ArrayList<String> Instrucciones = new ArrayList<>();
    ArrayList<String> InstruccionesPorCompilar = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    String ArchivoALeer = "";
    public Lector() throws IOException{
        LectorArchivoInstrucciones("C:\\Users\\conti\\Desktop\\Important Things\\Asesorias\\Compilador\\Codigos\\DefinicionLenguaje.txt");
        System.out.println("Dame el archivo a compilar prro uwu");
        ArchivoALeer = sc.nextLine();
        LectorArchivoACompilar(ArchivoALeer);
        CompilarCodigo comp = new CompilarCodigo(InstruccionesPorCompilar, new PrepararObjetos(Instrucciones));
    }
    
    void LectorArchivoInstrucciones(String archivo) throws FileNotFoundException, IOException {
        String cadena;
        FileReader file = new FileReader(archivo);
        BufferedReader b = new BufferedReader(file);
        while ((cadena = b.readLine()) != null) {
            Instrucciones.add(cadena);
        }
        b.close();
    }
    
    void LectorArchivoACompilar(String archivo) throws FileNotFoundException, IOException {
        String cadena;
        FileReader file = new FileReader(archivo);
        BufferedReader b = new BufferedReader(file);
        while ((cadena = b.readLine()) != null) {
            InstruccionesPorCompilar.add(cadena);
        }
        b.close();
    }
    
    
}
