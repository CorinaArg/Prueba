/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author CDRCONS02
 */
public class Televisor extends Electrodomestico {

    protected Integer pulgadas;
    protected boolean TDT;

    public Televisor() {
    }

    public Televisor(Integer pulgadas, boolean TDT) {
        this.pulgadas = pulgadas;
        this.TDT = false;
    }

    public Televisor(Integer pulgadas, boolean TDT, Integer precio, String color, char consumoenerg, Integer peso) {
        super(precio, color, consumoenerg, peso);
        this.pulgadas = pulgadas;
        this.TDT = TDT;
    }

    public Integer getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(Integer pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }

    public Televisor crearTelevisor() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Electrodomestico e = super.crearElectrodomestico();
        System.out.println(" Ingrese las pulgadas o resolucion ");
        int resolucion = leer.nextInt();
        System.out.println(" Ingrese si tiene TDT incorporado s/n");
        String op;

        do {
            System.out.println("Tiene sintonizador TDT S/N: ");
            op = leer.next().toUpperCase().substring(0, 1);
        } while (!(op.equals("S") || op.equals("N")));

        if (op.equals("S")) {
            TDT = true;
        }
        return new Televisor(resolucion, TDT, e.precio, e.color, e.consumoenerg, e.peso);

    }

    @Override
    public void precioFinal() {
        super.precioFinal(); 
        if (pulgadas>40){
          this.precio += (this.precio*30/100);
        }
         if (TDT= true){
              this.precio += 500;
        }
    }

    @Override
    public String toString() {
     
        return super.toString()+ " pulgadas " + this.pulgadas + "TDT" + this.TDT; 
    }

     public void mostrarTele(){
        System.out.println("---------------------------------");
        System.out.println("Caracteristicas de su tele: ");
        System.out.println("precio: "+this.precio);
        System.out.println("color: "+ this.color);
        System.out.println("consumo energetico tipo: " + this.consumoenerg);
        System.out.println("Peso: " + this.peso + " Kilos netos");
        System.out.println("Resolucion: " + this.pulgadas + "tdt" + this.precio);
    }
    
}
