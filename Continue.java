/**
 *
 * @author Javier Arturo
 */
public class Continue {
   
    public static void main(String[] args) {
        
        for (int cuenta = 1; cuenta <= 10; cuenta++) {
            
            if(cuenta == 5) { //Si cuenta es cinco
                continue;  //omite el resto del código en el ciclo
            }
            
            if(cuenta == 6){
                continue;
            }
            
            
        }
        
        System.out.println("Se uso continue para omitir imprimir el 5");
    }
    
}
