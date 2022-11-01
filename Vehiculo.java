import java.util.Arrays;

public class Vehiculo {

    //atributos
    public static Vehiculo[] vehiculos = new Vehiculo[10];
    public static int tamano= 10;
    public static int posAnadir = 0;
    private int modelo;
    private String marca;
    private double valorComercial;
    private String color;
    
    //métodos
    @Override
    public String toString(){
            return modelo+", "+marca+", "+valorComercial+", "+color;
    }
    public static String toStringVehiculos(){
       
        return Arrays.toString(vehiculos);
    }
    public  int cantidadVehiculos(){
            return Vehiculo.posAnadir;
    }
    public static void  meterObjeto(int model, String marca1, double valor, String color1){
        vehiculos[Vehiculo.posAnadir] = new Vehiculo(model, marca1, valor, color1);
        Vehiculo.setPosAnadir((Vehiculo.posAnadir+1));
    }
    public static String buscarVerde(){
        String concatena = "";
        for(int i=0; i<Vehiculo.posAnadir;i++){
            if((vehiculos[i].getColor()).equals("verde")){
                concatena = concatena.concat(vehiculos[i]+" ; ");
            }
        }
        return concatena;
    } 
    public static String buscarModelo(){
        String concatena = "";
        for(int i=0; i<Vehiculo.posAnadir;i++){
            if(vehiculos[i].getModelo()>=2000 && vehiculos[i].getModelo()<=2021){
                concatena = concatena.concat(vehiculos[i]+" ; ");
            }
        }
        return concatena;
    } 


    //constructores
    public Vehiculo() {
    }
    public Vehiculo(int modelo, String marca, double valorComercial) {
        this.modelo = modelo;
        this.marca = marca;
        this.valorComercial = valorComercial;
        this.color = "verde";
    }
    public Vehiculo(int modelo, String marca, double valorComercial, String color) {
        this.modelo = modelo;
        this.marca = marca;
        this.valorComercial = valorComercial;
        this.color = color;
    }
    //getters-setters
    public static Vehiculo[] getVehiculos() {
        return vehiculos;
    }
    public static int getTamano() {
        return tamano;
    }
    public static  int getPosAnadir() {
        return Vehiculo.posAnadir;
    }
    public int getModelo() {
        return modelo;
    }
    public String getMarca() {
        return marca;
    }
    public double getValorComercial() {
        return valorComercial;
    }
    public String getColor() {
        return color;
    }
    public static void setVehiculos(Vehiculo[] vehiculos) {
        Vehiculo.vehiculos = vehiculos;
    }
    public static void setTamano(int tamano) {
        Vehiculo.tamano = tamano;
    }
    public static void setPosAnadir(int posAnadir) {
        Vehiculo.posAnadir = posAnadir;
    }
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setValorComercial(double valorComercial) {
        this.valorComercial = valorComercial;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
