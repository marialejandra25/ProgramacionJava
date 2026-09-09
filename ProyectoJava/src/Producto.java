/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Maria Alejandra Grandas
 */
public class Producto {
    
    //Atributos
    public int id_producto;
    public int id_categoria;
    public String nombre;
    
    //Constructor
    // 1 -> constructor - vacio 

    public Producto() {
    }
    
    // 1 -> constructor - completo
    
    public Producto(int id_producto, int id_categoria, String nombre) {
        this.id_producto =id_producto;
        this.id_categoria =id_categoria;
        this.nombre =nombre;
    }
   
    // 1-> constructor parcial
    public Producto(int id_categoria, String nombre) {
        this.id_categoria = id_categoria;
        this.nombre =nombre;
        
    }
public int getId_producto(){
        return id_producto;
}

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getNombre() {
        return nombre;
    }

//Metodos
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

//Metodo creado por mi
    public void imprimir() {
        System.out.println("El nivel de este objeto es:" + id_categoria + " -nombre:"+nombre);
    }

//Metodo principal
public static void main(String[] args) {
    //Voy a crear mi primer objeto

Producto n1 = new Producto(1, 1, "servicio");
Producto n2 = new Producto( 0,2 )"tipo");
Producto n3 = new Producto(0, 0, "nombre");



//Uso del primer metodo creado por mi
n1.imprimir();
        
    }
}

   
