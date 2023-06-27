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
public class Electrodomestico {

    protected Integer precio;
    protected String color;
    protected char consumoenerg;
    protected Integer peso;

    public Electrodomestico() {
    }

    public Electrodomestico(Integer precio, String color, char consumoenerg, Integer peso) {
        this.precio = precio;
        this.color = color;
        this.consumoenerg = consumoenerg;
        this.peso = peso;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getcolor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoenerg() {
        return consumoenerg;
    }

    public void setConsumoenerg(char consumoenerg) {
        this.consumoenerg = consumoenerg;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public void comprobarConsumoEnergetico(char letra) {

        switch (letra) {
            case 'A':

            case 'B':

            case 'C':

            case 'D':

            case 'E':

            case 'F':
                setConsumoenerg(letra);
                break;

            default:
                setConsumoenerg('F');
        }

    }

    public void comprobarColor(String color) {
        if (color.equalsIgnoreCase("BLANCO") || color.equalsIgnoreCase("NEGRO")
                || color.equalsIgnoreCase("AZUL") || color.equalsIgnoreCase("GRIS") || color.equalsIgnoreCase("ROJO")) {
            setColor(color);

        } else {
            setColor("BLANCO");
        }
    }

    public Electrodomestico crearElectrodomestico() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println(" Ingrese color ");
        String color1 = leer.next();

        System.out.println(" Ingrese consumo ");
        char consumo = leer.next().toUpperCase().charAt(0);//*charAt toma el primer caracter del String y lo pasa a char en la posiion que se indique*/
        System.out.println(" Ingrese peso ");
        Integer peso1 = leer.nextInt();
        setPrecio(1000);

        Electrodomestico e = new Electrodomestico(precio, color1, consumo, peso1);
        
        e.comprobarColor(color1);
        e.comprobarConsumoEnergetico(consumo);
        

        return e;

    }

    public void precioFinal() {

        switch (getConsumoenerg()) {
            case 'A':
                this.precio += 1000;
                break;
            case 'B':
                this.precio += 800;
                break;
            case 'C':
                this.precio += 600;
                break;
            case 'D':
                this.precio += 500;
                break;
            case 'E':
                this.precio += 300;
                break;
            case 'F':
                this.precio += 100;
                break;
        }

        if (this.peso < 20) {
            this.precio += 100;
        } else if (this.peso < 50) {
            this.precio += 500;
        } else if (this.peso < 80) {
            this.precio += 800;
        } else {
            this.precio += 1000;

        }
    }

    @Override
    public String toString() {
        return "Electrodomestico" + "precio=" + precio + ", color=" + color + ", consumoenerg=" + consumoenerg + ", peso=" + peso + '}';
    }

}
