
package Entities;

public class InstruccionEntity {

    
    private String Instruccion, Definicion;
    
    public String getInstruccion() {
        return Instruccion;
    }

    
    public String getDefinicion() {
        return Definicion;
    }
    
    public InstruccionEntity(String Instruccion, String Definicion){
        this.Definicion = Definicion;
        this.Instruccion = Instruccion;
    }
    
    
    
}
