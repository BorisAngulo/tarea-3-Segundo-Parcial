import javax.swing.JOptionPane;
import java.util.Scanner;

public class Recorridos{
    public static void Caracol(int tamaño){
        int[][] caracol;
        caracol = new int[tamaño][tamaño];
        int a = 0;//variable que nos ayudara
        int b = tamaño - 1; //variable que nos ayudara
        int conteo = 1;//llenaran la matriz
        
        //codigo para el recorrido
            for(int j = 0; j < tamaño;j++){
            for(int i = a; i <= b; i++){
                caracol[a][i] = conteo++;
            }
            
            for(int i = a + 1; i <= b; i++){
                caracol[i][b] = conteo++;
            }
            
            for(int i = b - 1; i >= a; i--){
                caracol[b][i] = conteo++;
            }

            for(int i = b - 1; i >= a + 1; i--){
                caracol[i][a] = conteo++;
            }
            a++;
            b--;
        }
        
        //codigo para impresion
        for(int i = 0; i < tamaño; i++){
            for(int j = 0; j < tamaño; j++){
                System.out.print(caracol[i][j] + "\t");
            }
            System.out.println(caracol[i]);
        }
    }
    
    public static void DiagonalPrinciparYSecundaria(int tamaño){
        int[][] recorrido;
        recorrido = new int [tamaño][tamaño];
        int tache = 0; //variable para ayudar
        
        //codigo para el recorrido
        for(int i = 0; i < tamaño; i++){
            recorrido[i][i] = 1;
        }
        for(int i = tamaño -1; i >= 0; i--){
            recorrido[tache][i] = 1;
            tache++;
        }
        
        //codigo para la impresion
        for(int i = 0; i < tamaño; i++){
            for(int j = 0; j < tamaño; j++){
                System.out.print(recorrido[i][j] + "\t");
            }
            System.out.println(recorrido[i]);
        }
    }
    
    public static void CreaTuMatriz(){
        Scanner entrada = new Scanner(System.in);
        int[][] matriz;
        int tamaño;
        tamaño = Integer.parseInt(JOptionPane.showInputDialog("Digita el tamaño que quieres para tu matriz nxn"));
        matriz = new int[tamaño][tamaño];
        
        System.out.println("Llena la matriz: ");
        for(int i = 0; i < tamaño; i++){
            System.out.println("Llena la fila: " + i);
            for(int j = 0; j < tamaño; j++){
                int llenado = entrada.nextInt();
                matriz[i][j] = llenado;
            }
        }
        
        System.out.println("\n Imprimiendo Matriz......");
        for(int i = 0; i < tamaño; i++){
            for(int j = 0; j < tamaño; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println(matriz[i]);
        }
    }
}
