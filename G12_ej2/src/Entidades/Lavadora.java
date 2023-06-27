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
public class Lavadora extends Electrodomestico {

    protected Integer carga;

    public Lavadora() {
    }

    public Lavadora(Integer carga) {
        this.carga = carga;
    }

    public Lavadora(Integer carga, Integer precio, String color, char consumoenerg, Integer peso) {
        super(precio, color, consumoenerg, peso);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    public Lavadora crearLavadora() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Electrodomestico e = super.crearElectrodomestico();
        System.out.println(" Ingrese los kilos de carga ");
        int carga1 = leer.nextInt();
        return new Lavadora(carga1, e.precio, e.color, e.consumoenerg, e.peso);
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (this.carga > 30) {
            this.precio += 500;
        }
    }
    
    public void mostrarLavadora(){
        System.out.println("---------------------------------");
        System.out.println("Caracteristicas de su Lavadora: ");
        System.out.println("precio: "+this.precio);
        System.out.println("color: "+ this.color);
        System.out.println("consumo energetico tipo: " + this.consumoenerg);
        System.out.println("Peso: " + this.peso + " Kilos netos");
        System.out.println("Carga de lavado: " + this.carga + " kilos");
    }

    @Override
    public String toString() {
        
        return super.toString()+ "carga" + carga;

    }

}
