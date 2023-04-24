/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notas;

import java.text.DecimalFormat;
/**
 *
 * @author Professor
 */
public class CalcularNotas {

    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;
    private double media;
    private String status;


    //Construtor ( estudar variÃ¡veis de instancia)
    public CalcularNotas() {

        limpar();

    }

    public void limpar() {
        this.nota1 = 0;
        this.nota2 = 0;
        this.nota3 = 0;
        this.nota4 = 0;
        this.media = 0;
        this.status ="";
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }


    public double getMedia() {
        return media;
    }

    public String getStatus() {
        return status;
        
    }

    public void calcularAMedia(){
        
        this.media = (this.nota1 + this.nota2 + this.nota3 + this.nota4)/4;
    }
    
    public void classificarAMedia() {
        
        if (this.media >=6) {
            this.status = "APROVADO";
        }
        
        else {
            this.status = "REPROVADO";
        }
    }
}
