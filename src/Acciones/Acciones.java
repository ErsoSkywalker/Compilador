
package Acciones;

import Entities.InstruccionEntity;
import java.util.ArrayList;

public class Acciones {
    
    javax.swing.JTextArea TextAreaOmg;
    
    public Acciones(ArrayList<InstruccionEntity> InstruccionesBase, ArrayList<InstruccionEntity> InstruccionesACompilar, javax.swing.JTextArea TextAreaOmg){
        this.TextAreaOmg = TextAreaOmg;
        for(int i = 0; i < InstruccionesACompilar.size(); i++){
            switch(InstruccionesACompilar.get(i).getInstruccion()){
                case "%PRINT":{
                    AccionPrint(InstruccionesACompilar.get(i).getDefinicion());
                    break;
                }
                case "%SUMA":{
                    AnalisisNumerico(InstruccionesACompilar.get(i).getDefinicion(), 1);
                    break;
                }
                case "%RESTA":{
                    AnalisisNumerico(InstruccionesACompilar.get(i).getDefinicion(), 2);
                    break;
                }
                case "%MULTI":{
                    AnalisisNumerico(InstruccionesACompilar.get(i).getDefinicion(), 3);
                    break;
                }
                case "%DIV":{
                    AnalisisNumerico(InstruccionesACompilar.get(i).getDefinicion(), 4);
                    break;
                }
                case "%EXPO":{
                    AnalisisNumerico(InstruccionesACompilar.get(i).getDefinicion(), 5);
                    break;
                }
                case "%HELP":{
                    AccionHelp(InstruccionesACompilar.get(i).getDefinicion(), InstruccionesBase);
                    break;
                }
            }
        }
        
    }
    
    public void AccionPrint(String PorImprimir){
         TextAreaOmg.setText(TextAreaOmg.getText() + "\n" + PorImprimir);
    }
    
    public void AnalisisNumerico(String PorAnalizar, int Accion){
        int ConteoEspacios = 0, BanderaI = 0;
        double Resultado = 0;
        String NumeroUnoSinTratar = "", NumeroDosSinTratar = "";
        for(int i = 0; i < PorAnalizar.length(); i++ )
                ConteoEspacios += (PorAnalizar.charAt(i) == ' ')? 1 : 0;
        
        if(ConteoEspacios != 1){
            System.out.println("Oye Bro, La cantidad de parametros no es correcta para esta funcion >:c Recuerda, solo puedes usar dos datos uwu");
        }else{
            for(int i = 0; i < PorAnalizar.length(); i++ ){
                if(PorAnalizar.charAt(i) != ' '){
                    NumeroUnoSinTratar+= PorAnalizar.charAt(i);
                }else{
                    BanderaI = i;
                    break;
                }
            }
            
            for(int i = BanderaI+1; i < PorAnalizar.length(); i++){
                NumeroDosSinTratar+= PorAnalizar.charAt(i);
            }
            
            if(NumeroUnoSinTratar.matches("[0-9]+") && NumeroDosSinTratar.matches("[0-9]+")){
                
                switch(Accion){
                    case 1:{
                        Resultado = Integer.parseInt(NumeroUnoSinTratar) + Integer.parseInt(NumeroDosSinTratar);
                        break;
                    }
                    case 2:{
                        Resultado = Integer.parseInt(NumeroUnoSinTratar) - Integer.parseInt(NumeroDosSinTratar);
                        break;
                    }
                    case 3:{
                        Resultado = Integer.parseInt(NumeroUnoSinTratar) * Integer.parseInt(NumeroDosSinTratar);
                        break;
                    }
                    case 4:{
                        Resultado = Integer.parseInt(NumeroUnoSinTratar) / Integer.parseInt(NumeroDosSinTratar);
                        break;
                    }
                    case 5:{
                        Resultado = Math.pow(Integer.parseInt(NumeroUnoSinTratar), Integer.parseInt(NumeroDosSinTratar));
                        break;
                    }
                }
                
                TextAreaOmg.setText(TextAreaOmg.getText() + "\n" + Resultado);
            }else{
                TextAreaOmg.setText(TextAreaOmg.getText() + "\nSolo se pueden recibir numeros en los parametros :D");
            }
            
        }
    }

    public void AccionHelp(String Texto, ArrayList<InstruccionEntity> InstruccionesBase){
        int Validacion = 0;
        for(int i = 0; i < InstruccionesBase.size(); i++){
            if(Texto.equalsIgnoreCase(InstruccionesBase.get(i).getInstruccion())){
                 TextAreaOmg.setText(TextAreaOmg.getText() + "\nBienvenido al Modulo de ayuda, la instrucción que buscas es la siguiente");
                 TextAreaOmg.setText(TextAreaOmg.getText() + "\n"+Texto + ": " + InstruccionesBase.get(i).getDefinicion());
                 
                System.out.println(Texto + ": " + InstruccionesBase.get(i).getDefinicion());
                Validacion++;
                break;
            }
        }
        if(Validacion == 0){
            TextAreaOmg.setText(TextAreaOmg.getText() + "\nNo hemos encontrado tu instrucción en la lista de instrucciones uwu");
        }
        
    }
    
    
}
