/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2algoritmodeordenamiento;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
import model.Estudiante;

/**
 *
 * @author Fernandito
 */
public class Ejercicio2AlgoritmoDeOrdenamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        ArrayList<Estudiante> lista=new ArrayList<>();
        int opcion=0;
        
        
                    
        int identificacion=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa la identificacion"));
        String nombre=JOptionPane.showInputDialog(null,"Ingresa el nombre");
        double nota1=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresa la Primera nota"));
        double nota2=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresa la Segunda nota"));
        double nota3=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresa la Tercera nota"));
        double notafinal= ((0.3)*(nota1+nota2))+((0.4)*(nota3));
                  
        Estudiante estudiante=new Estudiante(identificacion,nombre,nota1,nota2,nota3,notafinal); //creo un objeto y agrego los parametros
        lista.add(estudiante); //agrego el objeto estudiante a la lista
        
        imprimirLista(lista);
        
        
    }
    private static String imprimirLista(ArrayList<Estudiante> lista){
        
        String result="";
        
        for (int i = 0; i < lista.size(); i++) {
            
            result += lista.get(i).toString();
        }
        
        return result;
        
    }

    
   
    }
    

