/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero_automatico;
import java.util.*;
/**
 *
 * @author Felipe
 */
public class Cajero_automatico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero,numero2,numero3,comprobante,operacion=0,monto,decision,montoCuentaCorriente,montoCuentaRut,montoDepositarCuentaCorriente,montoDepositarCuentaRut;
        int ap;
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenido al cajero automatico");
        System.out.println();
        
        
        int vector[]= new int [1];
        int vector1[]= new int [1];
        
        for(ap=0;ap<1;ap++){
            do{
            System.out.println("Ingrese contraseña");
            vector[ap]=leer.nextInt();
            
            System.out.println("ingrese nuevaente su contranseña");
            vector1[ap]=leer.nextInt();
            if(vector[ap] == vector1[ap]){
                System.out.println("contraseña correcta");
            }
            if(vector[ap] != vector1[ap]){
                System.out.println("contraseña incorrecta");
            }
            }while(vector[ap] != vector1[ap]);
        }
        System.out.println();
        
        
         
         
        int saldoFinalCuentaCorriente=200000;
        int saldoFinalCuentaRut=120000;
        
        System.out.println("(recuerde que su saldo actual de su cuenta corriente es de $200000 mil pesos");
        System.out.println("y su saldo actual de su cuenta rut es de $120000 mil pesos)");
        System.out.println();
        do{
            int saldo=0;
            
             
            System.out.println("Por favor seleccione el producto con que desea operar");
            System.out.println();
            System.out.println("1: Cuenta Corriente  2: Cuenta Rut , presione numero");
            System.out.println();
            
            
            numero= leer.nextInt();
            System.out.println();
        
            do{
                if(numero>2 || numero<1){
                System.out.println("Porfavor ingrese numero 1 o numero 2");  
                numero= leer.nextInt();
                }
            }while(numero>2 || numero <1);
        
       
            if(numero==1){
                
                
                System.out.println("Cuenta corriente, por favor seleccione la operacion que desea realizar");
                System.out.println();
                System.out.println("1.-Giro rapido por $7.000");
                System.out.println("2.-Giro rapido por $17.000");
                System.out.println("3.-Giro rapido por $37.000");
                System.out.println("4.-Giro por otro monto");
                System.out.println("5.-Consulta de saldo");
                System.out.println("6.-Transferencia de dinero de una cuenta a otra");
                System.out.println("7.-Depositar dinero a esta cuenta");
                System.out.println();
                System.out.println("Por favor presione numero");
                numero2= leer.nextInt();
                do{
                    if(numero2 >7 || numero2 <1){
                    System.out.println("Porfavor ingrese alguno de los numeros indicados");  
                    numero2= leer.nextInt();
                    }
                }while(numero2>7 || numero2 <1);
            
                if (numero2==1){
                    System.out.println("Usted a hecho un giro de $7.000, espere un momento mientras sale su dinero");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("¿Desea imprimir su comprobante? 1=si , 2=no");
                    comprobante=leer.nextInt();
                    if(comprobante==1){
                        System.out.println("Por favor retire su comprobante");
                        System.out.println("");
                        System.out.println("¿Desea realizar otra operacion? 1=si , 2=no");
                        operacion=leer.nextInt();
                        if(operacion==1){
                            System.out.println("");
                        }
                        if(operacion==2){
                            System.out.println("Gracias, vuelva pronto");
                        }
                    }
                    if(comprobante==2){
                        System.out.println("");
                        System.out.println("¿Desea realizar otra operacion? 1=si , 2=no");
                        operacion=leer.nextInt();
                        if(operacion==1){
                            System.out.println("");
                        }
                        if(operacion==2){
                            System.out.println("Gracias, vuelva pronto");
                        }
                    }
                    saldo=saldo+7000;
                    saldoFinalCuentaCorriente=saldoFinalCuentaCorriente-saldo;
                }
                if (numero2==2){
                    System.out.println("Usted a hecho un giro de $17.000, espere un momento mientras sale su dinero");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("¿Desea imprimir su comprobante? 1=si , 2=no");
                    comprobante=leer.nextInt();
                    if(comprobante==1){
                        System.out.println("Por favor retire su comprobante");
                        System.out.println("");
                        System.out.println("¿Desea realizar otra operacion? 1=si , 2=no");
                        operacion=leer.nextInt();
                        if(operacion==1){
                            System.out.println("");
                        }
                        if(operacion==2){
                            System.out.println("Gracias, vuelva pronto");
                        }
                    }
                    if(comprobante==2){
                        System.out.println("");
                        System.out.println("");
                        System.out.println("¿Desea realizar otra operacion? 1=si , 2=no");
                        operacion=leer.nextInt();
                        if(operacion==1){
                            System.out.println("");
                        }
                        if(operacion==2){
                            System.out.println("Gracias, vuelva pronto");
                        }
                    }
                    saldo=saldo+17000;
                    saldoFinalCuentaCorriente=saldoFinalCuentaCorriente-saldo;
                }
                if(numero2==3){
                    System.out.println("Usted a hecho un giro de $37.000, espere un momento mientras sale su dinero");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("¿Desea imprimir su comprobante? 1=si , 2=no");
                    comprobante=leer.nextInt();
                    if(comprobante==1){
                        System.out.println("Por favor retire su comprobante");
                        System.out.println("");
                        System.out.println("¿Desea realizar otra operacion? 1=si , 2=no");
                        operacion=leer.nextInt();
                        if(operacion==1){
                            System.out.println("");
                        }
                        if(operacion==2){
                            System.out.println("Gracias, vuelva pronto");
                        }
                    }
                    if(comprobante==2){
                        System.out.println("");
                        System.out.println("");
                        System.out.println("¿Desea realizar otra operacion? 1=si , 2=no");
                        operacion=leer.nextInt();
                        if(operacion==1){
                            System.out.println("");
                        }
                        if(operacion==2){
                            System.out.println("Gracias, vuelva pronto");
                        }
                    }
                    
                    saldo=saldo+37000;
                    saldoFinalCuentaCorriente=saldoFinalCuentaCorriente-saldo;
                }
                if(numero2==4){
                    System.out.println("Ingrese monto");
                    monto=leer.nextInt();
                    System.out.println("Espere un momento");
                    System.out.println("");
                    System.out.println("Usted a hecho un giro de: "+"$"+monto+" espere un momento mientras sale su dinero");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("¿Desea imprimir su comprobante? 1=si , 2=no");
                    comprobante=leer.nextInt();
                    if(comprobante==1){
                        System.out.println("Por favor retire su comprobante");
                        System.out.println("");
                        System.out.println("¿Desea realizar otra operacion? 1=si , 2=no");
                        operacion=leer.nextInt();
                        if(operacion==1){
                            System.out.println("");
                        }
                        if(operacion==2){
                            System.out.println("Gracias, vuelva pronto");
                        }
                    }
                    if(comprobante==2){
                        System.out.println("");
                        System.out.println("");
                        System.out.println("¿Desea realizar otra operacion? 1=si , 2=no");
                        operacion=leer.nextInt();
                        if(operacion==1){
                            System.out.println("");
                        }
                        if(operacion==2){
                            System.out.println("Gracias, vuelva pronto");
                        }
                    }
                    saldo=saldo+monto;
                    saldoFinalCuentaCorriente=saldoFinalCuentaCorriente-saldo;
                }
                if(numero2==5){
                    System.out.println("Su saldo es de: "+"$"+saldoFinalCuentaCorriente);
                    if(saldoFinalCuentaCorriente<0){
                        System.out.println("Usted en este momento debe dinero a su cuenta corriente, un monto total de: "+(saldoFinalCuentaCorriente*-1));
                    }
                    System.out.println("¿Desea realizar otra operacion? 1=si , 2=no");
                    operacion=leer.nextInt();
                    if(operacion==1){
                        System.out.println("");
                    }
                    if(operacion==2){
                        System.out.println("Gracias, vuelva pronto");
                    }
                }
                if(numero2==6){
                    System.out.println("Transferir dinero a:  1.-Cuenta rut");
                    decision=leer.nextInt();
                    
                    if(decision==1){
                        
                        System.out.println("Ingrese monto a depositar");
                        montoCuentaRut=leer.nextInt();
                        System.out.println("Espere un momento");
                        System.out.println("");
                        System.out.println("Usted a hecho un deposito de: "+"$"+montoCuentaRut);
                        
                        saldoFinalCuentaRut=saldoFinalCuentaRut+montoCuentaRut;
                        saldoFinalCuentaCorriente=saldoFinalCuentaCorriente-montoCuentaRut;
                        
                        System.out.println("¿Desea realizar otra operacion? 1=si , 2=no");
                        operacion=leer.nextInt();
                        if(operacion==1){
                            System.out.println("");
                        }
                        if(operacion==2){
                            System.out.println("Gracias, vuelva pronto");
                        }
                        
                        
                    }
                }
                if(numero2==7){
                    System.out.println("Ingrese monto a depositar");
                    montoDepositarCuentaCorriente=leer.nextInt();
                    System.out.println("Espere un momento");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("Usted a hecho un deposito de: "+"$"+montoDepositarCuentaCorriente);
                    
                    saldoFinalCuentaCorriente=saldoFinalCuentaCorriente+montoDepositarCuentaCorriente;
                    
                    System.out.println("¿Desea realizar otra operacion? 1=si , 2=no");
                    operacion=leer.nextInt();
                    if(operacion==1){
                        System.out.println("");
                    }
                    if(operacion==2){
                        System.out.println("Gracias, vuelva pronto");
                    }
                }
            
            
            }
            
            
            
            
            
            
         
            int saldo2=0;
        
            if(numero==2){
                
                System.out.println("Cuenta rut, por favor seleccione la operacion que desea realizar"); 
                System.out.println();
                System.out.println("1.-Giro rapido por $10.000");
                System.out.println("2.-Giro rapido por $20.000");
                System.out.println("3.-Giro rapido por $50.000");
                System.out.println("4.-Giro por otro monto");
                System.out.println("5.-Consulta de saldo");
                System.out.println("6.-Transferencia de dinero de una cuenta a otra");
                System.out.println("7.-Depositar dinero a esta cuenta");
                System.out.println();
                System.out.println("Por favor presione numero");
                numero3= leer.nextInt();
                do{
                    if(numero3 >7 || numero3 <1){
                    System.out.println("Porfavor ingrese alguno de los numeros indicados");  
                    numero3= leer.nextInt();
                    }
                }while(numero3>7 || numero3 <1);
            
                if (numero3==1){
                    System.out.println("Usted a hecho un giro de $10.000, espere un momento mientras sale su dinero");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("¿Desea imprimir su comprobante? 1=si , 2=no");
                    comprobante=leer.nextInt();
                    if(comprobante==1){
                        System.out.println("Por favor retire su comprobante");
                        System.out.println("");
                        System.out.println("¿Desea realizar otra operacion? 1=si , 2=no");
                        operacion=leer.nextInt();
                        if(operacion==1){
                            System.out.println("");
                        }
                        if(operacion==2){
                            System.out.println("Gracias, vuelva pronto");
                        }
                    }
                    if(comprobante==2){
                        System.out.println("");
                        System.out.println("¿Desea realizar otra operacion? 1=si , 2=no");
                        operacion=leer.nextInt();
                        if(operacion==1){
                            System.out.println("");
                        }
                        if(operacion==2){
                            System.out.println("Gracias, vuelva pronto");
                        }
                    }
                    saldo2=saldo2+10000;
                    saldoFinalCuentaRut=saldoFinalCuentaRut-saldo2;
                }
                if (numero3==2){
                    System.out.println("Usted a hecho un giro de $20.000, espere un momento mientras sale su dinero");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("¿Desea imprimir su comprobante? 1=si , 2=no");
                    comprobante=leer.nextInt();
                    if(comprobante==1){
                        System.out.println("Por favor retire su comprobante");
                        System.out.println("");
                        System.out.println("¿Desea realizar otra operacion? 1=si , 2=no");
                        operacion=leer.nextInt();
                        if(operacion==1){
                            System.out.println("");
                        }
                        if(operacion==2){
                            System.out.println("Gracias, vuelva pronto");
                        }
                    }
                    if(comprobante==2){
                        System.out.println("");
                        System.out.println("¿Desea realizar otra operacion? 1=si , 2=no");
                        operacion=leer.nextInt();
                        if(operacion==1){
                            System.out.println("");
                        }
                        if(operacion==2){
                            System.out.println("Gracias, vuelva pronto");
                        }
                    }
                    saldo2=saldo2+20000;
                    saldoFinalCuentaRut=saldoFinalCuentaRut-saldo2;
                }
                if (numero3==3){
                    System.out.println("Usted a hecho un giro de $50.000, espere un momento mientras sale su dinero");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("¿Desea imprimir su comprobante? 1=si , 2=no");
                    comprobante=leer.nextInt();
                    if(comprobante==1){
                        System.out.println("Por favor retire su comprobante");
                        System.out.println("");
                        System.out.println("¿Desea realizar otra operacion? 1=si , 2=no");
                        operacion=leer.nextInt();
                        if(operacion==1){
                            System.out.println("");
                        }
                        if(operacion==2){
                            System.out.println("Gracias, vuelva pronto");
                        }
                    }
                    if(comprobante==2){
                        System.out.println("");
                        System.out.println("¿Desea realizar otra operacion? 1=si , 2=no");
                        operacion=leer.nextInt();
                        if(operacion==1){
                            System.out.println("");
                        }
                        if(operacion==2){
                            System.out.println("Gracias, vuelva pronto");
                        }
                    }
                    saldo2=saldo2+50000;
                    saldoFinalCuentaRut=saldoFinalCuentaRut-saldo2;
                }
                if(numero3==4){
                    System.out.println("Ingrese monto");
                    monto=leer.nextInt();
                    System.out.println("Espere un momento");
                    System.out.println("");
                    System.out.println("Usted a hecho un giro de: "+"$"+monto+" espere un momento mientras sale su dinero");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("¿Desea imprimir su comprobante? 1=si , 2=no");
                    comprobante=leer.nextInt();
                    if(comprobante==1){
                        System.out.println("Por favor retire su comprobante");
                        System.out.println("");
                        System.out.println("¿Desea realizar otra operacion? 1=si , 2=no");
                        operacion=leer.nextInt();
                        if(operacion==1){
                            System.out.println("");
                        }
                        if(operacion==2){
                            System.out.println("Gracias, vuelva pronto");
                        }
                    }
                    if(comprobante==2){
                        System.out.println("");
                        System.out.println("");
                        System.out.println("¿Desea realizar otra operacion? 1=si , 2=no");
                        operacion=leer.nextInt();
                        if(operacion==1){
                            System.out.println("");
                        }
                        if(operacion==2){
                            System.out.println("Gracias, vuelva pronto");
                        }
                    }
                    saldo2=saldo2+monto;
                    saldoFinalCuentaRut=saldoFinalCuentaRut-saldo2;
                }
                if(numero3==5){
                    System.out.println("Su saldo es de: "+"$"+saldoFinalCuentaRut);
                    if(saldoFinalCuentaRut<0){
                        System.out.println("Usted en este momento debe dinero a su cuenta rut, un monto total de: "+(saldoFinalCuentaRut*-1));
                    }
                    System.out.println("¿Desea realizar otra operacion? 1=si , 2=no");
                    operacion=leer.nextInt();
                    if(operacion==1){
                        System.out.println("");
                    }
                    if(operacion==2){
                        System.out.println("Gracias por preferir este cajero, vuelva pronto");
                    }
                }
                if(numero3==6){
                    
                    System.out.println("Transferir dinero a:  1.-Cuenta corriente");
                    decision=leer.nextInt();
                    if(decision==1){
                        System.out.println("Ingrese monto a depositar");
                        montoCuentaCorriente=leer.nextInt();
                        System.out.println("Espere un momento");
                        System.out.println("");
                        System.out.println("Usted a hecho un deposito de: "+"$"+montoCuentaCorriente);
                        
                        saldoFinalCuentaRut=saldoFinalCuentaRut-montoCuentaCorriente;
                        saldoFinalCuentaCorriente=saldoFinalCuentaCorriente+montoCuentaCorriente;
                        
                        System.out.println("¿Desea realizar otra operacion? 1=si , 2=no");
                        operacion=leer.nextInt();
                        if(operacion==1){
                            System.out.println("");
                        }
                        if(operacion==2){
                            System.out.println("Gracias, vuelva pronto");
                        }
                        
                    }
                    
                    
                }
                if(numero3==7){
                    System.out.println("Ingrese monto a depositar");
                    montoDepositarCuentaRut=leer.nextInt();
                    System.out.println("Espere un momento");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("Usted a hecho un deposito de: "+"$"+montoDepositarCuentaRut);
                    
                    saldoFinalCuentaRut=saldoFinalCuentaRut+montoDepositarCuentaRut;
                    
                    System.out.println("¿Desea realizar otra operacion? 1=si , 2=no");
                    operacion=leer.nextInt();
                    if(operacion==1){
                        System.out.println("");
                    }
                    if(operacion==2){
                        System.out.println("Gracias, vuelva pronto");
                    }
                    
                }
            
            
            }
            
        }while(operacion==1);
        
        //hola mundo
        //hola  
           
    }
    
}


