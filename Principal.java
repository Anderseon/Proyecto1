import java.util.Scanner;
public class Principal {
    public static void main (String [] args){
        mostrarMenu();
    }
    public static void mostrarMenu(){
        Scanner scanner = new Scanner(System.in);
        int seleccion;
        while(true){
            System.out.println("-----------------------------------");
            System.out.println("--0. si desea cerrar el programa --");
            System.out.println("--  1. para crear un vehiculo    --");
            System.out.println("-- 2. mostrar vehiculos creados  --");
            System.out.println("--3.cantidad de vehiculos creados--");
            System.out.println("--4. mostrar todos los vehiculos --");
            System.out.println("--          color verde          --");
            System.out.println("--   5. Mostrar vehiculos con    --");
            System.out.println("--    modelos entre 2000-2021    --");
            System.out.println("--   6. para crear un sensor     --");
            System.out.println("--  7. mostrar sensores creados  --");
            System.out.println("--8. cantidad de sensores creados--");
            System.out.println("--   9. mostrar sensores tipo    --");
            System.out.println("--            temperatura        --");
            System.out.println("-- 666. Mostrar sensores tipo    --");
            System.out.println("--     temperatura ordenados     --");
            System.out.println("-----------------------------------");
            System.out.println("Seleccione: ");
            seleccion = scanner.nextInt(); 
            if (seleccion==0){
                break;
            }   
            if (seleccion==1){
                if(Vehiculo.getPosAnadir() == Vehiculo.tamano){
                    System.out.println("Error base de datos llena");
                }else{
                    System.out.println("Ingrese un modelo: ");
                    int temporal1 = scanner.nextInt();
                    System.out.println("Ingrese una marca: ");
                    String temporal2 =scanner.next();
                    System.out.println("Ingrese un valor: ");
                    double temporal3 = scanner.nextDouble();
                    System.out.println("Ingrese un color: ");
                    String temporal4 = scanner.next();

                    Vehiculo.meterObjeto(temporal1, temporal2, temporal3, temporal4); 
                }
            }  
            if (seleccion==2){
                System.out.println(Vehiculo.toStringVehiculos());
            }     
            if (seleccion==3){
                System.out.println(Vehiculo.posAnadir+"/"+Vehiculo.tamano);
            }  
            if (seleccion==4){
                System.out.println(Vehiculo.buscarVerde());
            }  
            if (seleccion==5){
                System.out.println(Vehiculo.buscarModelo());
            }  
            if (seleccion==6){
                if(Sensor.getPosAnadir() == Sensor.tamano){
                    System.out.println("Error base de datos llena");
                }else{
                
                    System.out.println("Ingrese un tipo: ");
                    String temporal1 =scanner.next();
                    System.out.println("Ingrese un valor: ");
                    double temporal2 = scanner.nextDouble();
                    

                    Sensor.meterObjeto(temporal1, temporal2); 
                }
            }  
            if (seleccion==7){
                System.out.println(Sensor.toStringSensores());
            }  
            if (seleccion==8){
                System.out.println(Sensor.posAnadir+"/"+Sensor.tamano);
            }  
            if (seleccion==9){
                System.out.println(Sensor.buscarTemperatura());
            }  
            if (seleccion==666){
                System.out.println(Sensor.ordernarTemperatura());
            }  

        }
    }
}