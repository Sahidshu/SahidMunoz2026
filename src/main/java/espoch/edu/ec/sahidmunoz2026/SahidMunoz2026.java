
package espoch.edu.ec.sahidmunoz2026;

import java.util.Scanner;


public class SahidMunoz2026 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in) ;
        float precios[] = new float [5];
        float mayor;
        float menor;
        float suma=0;
        int contador=0;
       
       
        for (int i = 0; i<5; i++){
            System.out.println("Ingrese el precio de los productos: ");
            precios[i]=sc.nextFloat(); 
            suma=suma + precios[i];
        }
        
        System.out.println("Seleccione la operacion a realizar");
        System.out.println("1. Calcular el precio promedio de los productos");
        System.out.println("2. Hayar el precio mas alto y el precio mas bajo de los productos");
        System.out.println("3. Contar productos por encima del promedio: ");
        System.out.println("4. Salir");
        
        int opcion=0;
        opcion=sc.nextInt();
        switch (opcion){
            case 1:
                float promedio=suma/5;
                System.out.println("El promedio de los productos es: "+promedio);
                break;
            case 2:
                mayor=precios[0];
                menor=precios[0];
                for (int i=1; i<5; i++){
                    if (precios[i]>mayor){
                        mayor=precios[i];
                        
                    }if (precios[i]<menor){
                        menor=precios[i];
                    }
                }
                System.out.println("El precio mas alto es: "+mayor);
                System.out.println("El precio mas bajo es: "+menor);
                break;
            case 3:
                float promedioContador=suma/5;
                for (int i=0; i<5; i++){
                    if (precios[i]>promedioContador){
                        contador++;
                    }    
                }
                System.out.println("Productos que exceden el precio promedio: "+contador);
                break;
            case 4:
                System.out.println("Saliendo");
                break;
            default:
                System.out.println("Opcion invalida");
                
        }
        
        sc.close();
        
        
    }
}
