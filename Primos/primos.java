package Primos;
import javax.swing.JOptionPane;
import java.io.PrintWriter;
import java.io.FileWriter;

public class primos {

    public static void main (String []args ){
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el rango final de hasta donde quiere que se impriman los numeros primos: "));

        String primos = calcularPrimos(num);
                String nombreArchivo = "primos.txt";
                
        
        guardarNotasEnArchivo(nombreArchivo,primos);

        JOptionPane.showMessageDialog(null,"Los datos se guardaron correctamente en : "+nombreArchivo);
        }           
                
        private static String calcularPrimos(int num) {
            StringBuilder primos = new StringBuilder();
            for (int i=2; i<num; i++){
                boolean esprimo = true;
                for (int j=2; j<i; j++){
                    if(i%j==0){
                        esprimo =false; 
                        break;                       
       }   
  }
            if(esprimo){
                primos.append(i +" ");
                }
            }return primos.toString();
        }
                     
        private static void guardarNotasEnArchivo(String nombreArchivo, String primos) {
            try(PrintWriter write = new PrintWriter(new FileWriter(nombreArchivo))) {
                write.println(primos);
                System.out.println(" ");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Error al guardar los datos.");
                e.printStackTrace();
            }
    }
        
        



            


    
}
