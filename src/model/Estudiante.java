/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Fernandito
 */
public class Estudiante {
    
    int Id;
    private String Nombre;
    private double Nota1;
    private double Nota2;
    private double Nota3;
    private double NotaFinal;

    public Estudiante(int Id, String Nombre, double Nota1, double Nota2, double Nota3, double NotaFinal) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Nota1 = Nota1;
        this.Nota2 = Nota2;
        this.Nota3 = Nota3;
        this.NotaFinal = NotaFinal;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getNota1() {
        return Nota1;
    }

    public void setNota1(double Nota1) {
        this.Nota1 = Nota1;
    }

    public double getNota2() {
        return Nota2;
    }

    public void setNota2(double Nota2) {
        this.Nota2 = Nota2;
    }

    public double getNota3() {
        return Nota3;
    }

    public void setNota3(double Nota3) {
        this.Nota3 = Nota3;
    }

    public double getNotaFinal() {
        return NotaFinal;
    }

    public void setNotaFinal(double NotaFinal) {
        this.NotaFinal = NotaFinal;
    }

    @Override
    public String toString() {
        return "Identificacion:"+Id
                +"\n Nombre:"+Nombre
                +"\n Nota1:"+Nota1
                +"\n Nota2:"+Nota2
                +"\n Nota3:"+Nota3
                +"\n Nota Final:"+NotaFinal;
    }
    
    
    
}
