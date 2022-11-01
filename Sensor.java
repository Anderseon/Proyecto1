import java.util.Arrays;

public class Sensor {
    
    //atributos
    public static Sensor[] sensores = new Sensor[8];
    public static int tamano = 8;
    public static int posAnadir = 0;
    private String tipo;
    private double valor;
    
  
   //metodos
   @Override
    public  String toString(){
        return tipo+", "+valor;
    }
    public static String toStringSensores(){
        return Arrays.toString(sensores);
    }
    public  int cantidadSensores(){
        return Sensor.posAnadir;
    }
    public static void meterObjeto(String tipe, double valor1){
        sensores[Sensor.posAnadir] = new Sensor(tipe,valor1);
        Sensor.setPosAnadir((Sensor.posAnadir+1));
    }
    public static String buscarTemperatura(){
        String concatena = "";
        for(int i=0; i<Sensor.posAnadir;i++){
            if(sensores[i].getTipo().equals("temperatura")){
                concatena = concatena.concat(sensores[i]+" ; ");
            }
        }
        return concatena;
    } 
    public static String ordernarTemperatura(){
        int contador = 0;
        for(int z = 0; z<Sensor.posAnadir;z++){
            if(sensores[z].getTipo().equals("temperatura")){
                contador = contador+1;
            }
        }
        Sensor[] sensoresTemporales = new Sensor[contador];
        int guardar = 0;
        for(int i = 0; i<Sensor.posAnadir;i++){
            if(sensores[i].getTipo().equals("temperatura")){
                sensoresTemporales[guardar] = sensores[i]; 
                guardar = guardar+1;
            }
        }
        for (int x = 0; x < sensoresTemporales.length; x++) {
            for (int i = 0; i < sensoresTemporales.length-x-1; i++) {
                if(sensoresTemporales[i].getValor() > sensoresTemporales[i+1].getValor()){
                    Sensor tmp = sensoresTemporales[i+1];
                    sensoresTemporales[i+1] = sensoresTemporales[i];
                    sensoresTemporales[i] = tmp;
                }
            }
        }
        return Arrays.toString(sensoresTemporales);
    }

    //constructores

    public  Sensor(){

    }

    public Sensor(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }
    
    //getters-setters
    public static int getTamano() {
        return tamano;
    }
    public static int getPosAnadir() {
        return Sensor.posAnadir;
    }
    public String getTipo() {
        return tipo;
    }
    public double getValor() {
        return valor;
    }
    public static void setTamano(int tamano) {
        Sensor.tamano = tamano;
    }
    public static void setPosAnadir(int posAnadir) {
        Sensor.posAnadir = posAnadir;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
}