package clases.semana.pkg2;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

public class ClasesSemana2 {

    static Scanner lea = new Scanner(System.in);

    public static void main(String[] args) {

        boolean coso1 = true;
        Object coso = coso1;

        ArrayList lista = new ArrayList();//Lista no tipada
        ArrayList<Integer> lista2 = new ArrayList();//Lista tipada

        //CRUD
        //-create
        //add
        lista.add(5);
        lista.add("hola");
        lista.add(Color.RED);
        lista.add(new Date());
        lista.add(1, 500L);
        lista.addAll(lista2);
        
        if (!lista.contains(5)) {
            lista.add(10);
        }

        //-reade
        System.out.println("Impresion Basica");
        System.out.println(lista);
        System.out.println("");

        System.out.println("Impresion Controlada");

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.indexOf(lista.get(i)) + "[" + lista.get(i) + "]");
        }
        System.out.println("");
        System.out.println("DATES");
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) instanceof Date) {
                System.out.println(lista.indexOf(lista.get(i)) + "[" + lista.get(i) + "]");
            }
        }

        System.out.println("");
        System.out.println("FOR ESPECIAL");

        for (Object object : lista) {
            System.out.println(lista.indexOf(object) + "[" + object + "]");
        }
        System.out.println("");

        Iterator i = lista.iterator();
        while (i.hasNext()) {
            Object next = i.next();
            System.out.println(next);
        }
        //-update 
        //total

        lista.set(2, 10F);

        //Parcial
        ((Date) lista.get(4)).setHours(15);

        i = lista.iterator();
        System.out.println("");
        System.out.println("Lista modificada");
        while (i.hasNext()) {
            Object next = i.next();
            System.out.println(next);
        }

        //-delete.
        lista.remove(2);
        System.out.println("");
        System.out.println("Lista con indice 2 eliminado");
        for (int j = 0; j < lista.size(); j++) {
            System.out.println(lista.get(j));
        }
        
        //METODOS DE ADMINISTRACION
        
            Collections.max(lista2);
            Collections.min(lista2);
            Collections.sort(lista2);
            Collections.reverse(lista2);
            Collections.shuffle(lista2);
    }
}
