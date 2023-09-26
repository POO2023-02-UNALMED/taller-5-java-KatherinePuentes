package zooAnimales;

import java.util.ArrayList;

public class Mamifero extends Animal{
    private static ArrayList<Mamifero> listado = new Arraylist<>();
    public static int caballos;
    public static int leones;
    private boolean pelaje;
    private int patas;

    public Mamifero(){
        listado.add(this);
    }

    public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int ṕatas){
        super(nombre, edad, habitat, genero);
        this.pelaje= pelaje;
        this.patas= patas;
        listado.add(this);
    }

    public static int cantidadMamiferos(){
        return listado.size();
    }

    public static Mamifero crearCaballo(String nombre, int edad, String genero){
        Mamifero Caballo = new MAmifero(nombre, edad, "pradera", genero, true, 4);
        leones++;
        return Leon;
    }

    public boolean isPelaje(){
        return this.pelaje;
    }

    public int getPatas(){
        return this.patas;
    }
}