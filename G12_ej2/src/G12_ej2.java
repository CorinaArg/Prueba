
import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author CDRCONS02
 */
public class G12_ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Lavadora lava = new Lavadora();
        lava = lava.crearLavadora();
        lava.precioFinal();
        lava.mostrarLavadora();
        /*System.out.println(lava.toString());*/

        System.out.println(" ");
        
        Televisor tele = new Televisor();
        tele = tele.crearTelevisor();
        tele.precioFinal();
       tele.mostrarTele();
        System.out.println(" ");
        
          
       ArrayList<Electrodomestico> lista = new ArrayList();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int opcion;
        double pTotal = 0d;
        double pTotalT = 0d;
        double pTotalL = 0d;

        do
        {
            System.out.println("Que electrodomestico desea ingresar a la lista?");
            System.out.println("1. Lavadora");
            System.out.println("2. Televisor");
            System.out.println("3. Salir");
            opcion = leer.nextInt();

            switch (opcion)
            {
                case 1:

                    lista.add(lava.crearLavadora());
                    System.out.println(" ");

                    break;

                case 2:

                    lista.add(tele.crearTelevisor());
                    System.out.println(" ");
                    break;

            }

        } while (opcion != 3);

        for (Electrodomestico elec : lista)
        {
            if (elec instanceof Televisor)
            {
                tele.precioFinal();
                System.out.println(" ");
               tele.mostrarTele();
                System.out.println(" ");
                pTotalT += elec.getPrecio();
                pTotal += elec.getPrecio();

            }
            if (elec instanceof Lavadora)
            {

                lava.precioFinal();
                System.out.println(" ");
                lava.mostrarLavadora();
                System.out.println(" ");
                pTotalL += elec.getPrecio();
                pTotal += elec.getPrecio();

            }

        }
        
        System.out.println("Precio Total:" + pTotal);
        System.out.println("Precio Total:" + pTotalL);
        System.out.println("Precio Total:" + pTotalT);

    }

               
       
        
        

    }


