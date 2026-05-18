import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
       
       int opcion = 0;
       
       while(opcion != 11)
       {
            System.out.println("\nQue quieres utilizar?");
            System.out.println("1) Calculadora");
            System.out.println("2) Numeros Par o Impar");
            System.out.println("3) Tabla de multiplicacion");
            System.out.println("4) Contador de Vocales");
            System.out.println("5) Promedio de notas");
            System.out.println("6) Registro de estudiante");
            System.out.println("7) Cuenta de Banco");
            System.out.println("8) Vehiculos");
            System.out.println("9) Matrix 3x3");
            System.out.println("10) Inventario");
            System.out.println("11) Salir");
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch(opcion)
            {
                case 1:

                    calculadora();
                    break;

                case 2:

                    parImpar();
                    break;
                
                case 3:

                    tablaMultiplicar();
                    break;

                case 4:

                    contadorVocales();
                    break;

                case 5:

                    promedioNotas();
                    break;

                case 6:

                    System.out.println("Escribe tu nombre:");
                    String nombre1 = teclado.nextLine();

                    System.out.println("Escribe tu matricula:");
                    int matricula = teclado.nextInt();
                    teclado.nextLine();

                    System.out.println("Cual es tu carrera?");
                    String carrera = teclado.nextLine();

                    Estudiante e1 = new Estudiante(nombre1, matricula,carrera);

                    System.out.println("Nombre:" + e1.getNombre());
                    System.out.println("Matricula:" + e1.getMatricula());
                    System.out.println("Carrera:" + e1.getCarrera());

                    break;

                case 7:
                  
                  System.out.println("Nombre:");
                    String nombre2 = teclado.nextLine();

                    System.out.println("Numero de cuenta:");
                    int cuenta = teclado.nextInt();
                    teclado.nextLine();

                    System.out.println("Tipo de cuenta");
                    String tipocuenta = teclado.nextLine();
                      
                    Cuentabancaria c2 = new Cuentabancaria(nombre2,cuenta,tipocuenta);
                    
                    System.out.println("Datos del cliente:");
                    System.out.println("Nombre:" + c2.getNombre());
                    System.out.println("Numero de cuenta:" + c2.getCuenta());
                    System.out.println("Tipo de cuenta:" + c2.getTipocuenta());

                    break;

                case 8:

                    System.out.println("Marca:");
                    String marca = teclado.nextLine();

                    System.out.println("Velocidad Maxima:");
                    int velocidad = teclado.nextInt();
                    teclado.nextLine();

                    System.out.println("Modelo");
                    String modelo = teclado.nextLine();
                     
                    Vehiculo v1 = new Vehiculo(marca,modelo,velocidad);

                    System.out.println("Datos del Vehiculos:");
                    System.out.println("Marca:" + v1.getMarca());
                    System.out.println("Velocidad:" + v1.getVelocidad());
                    System.out.println("Modelo:" + v1.getModelo());

                    System.out.println("Combustible:");
                    String combustible = teclado.nextLine();

                    System.out.println("Puertas:");
                    int puertas = teclado.nextInt();
                    teclado.nextLine();
                    
                    Carro r1 = new Carro(puertas,combustible,marca,modelo,velocidad);
                    
                    System.out.println("Puertas:" + r1.getPuertas());
                    System.out.println("Combustible:" + r1.getCombustible());

                    System.out.println("casco:");
                    boolean casco = teclado.nextBoolean();

                    System.out.println("Cilindrada:");
                    int cilindrada = teclado.nextInt();
                    teclado.nextLine();

                    Motor m1 = new Motor( casco,cilindrada,marca, modelo,velocidad);
                    
                     System.out.println("Casco:" + m1.getCasco());
                     System.out.println("Cilindrada:" + m1.getCilindrada());

                    
                    break;

                case 9:

                    matriz();

                    break;

                case 10:

                    System.out.println("Nombre:");
                    String nombre = teclado.nextLine();

                    System.out.println("Cantidad:");
                    int cantidad = teclado.nextInt();

                    System.out.println("Precio");
                    double precio = teclado.nextDouble();
                    teclado.nextLine();

                    Producto p1 = new Producto(nombre,precio,cantidad);
                    
                    System.out.println("Nombre:" + p1.getNombre());
                    System.out.println("Precio:" + p1.getPrecio());
                    System.out.println("Cantidad:" + p1.getCantidad());

                    break;
                
                case 11:

                    System.out.println("Gracias por usar el programa...");

                    break;

                default:

                    System.out.println("Opcion no valida.");
                    break;
            }

       }

    }

    // Esto me sirve para que todos los metodos lo puedan usar.
       static Scanner teclado = new Scanner(System.in); 
 
        public static void calculadora() {

            System.out.println("Digita el primer numero:");
            double num1 = teclado.nextDouble();
            
            System.out.println("Digita el segundo numero:");
            double num2 = teclado.nextDouble();

            System.out.println("\nQue operacion quieres?");
            System.out.println("1) suma (+)");
            System.out.println("2) Resta (-)");
            System.out.println("3) divicion (/)");
            System.out.println("4) Multiplicacion (x)");
            System.out.println("Solo existen estas 4 operaciones");
            int opcion = teclado.nextInt();

            double resultado = 0;

            switch (opcion){
                case 1:

                resultado = num1 + num2;
                System.out.println("Resultado:" + resultado);
                break;

                case 2:

                resultado = num1 - num2;
                System.out.println("Resultado:" + resultado);
                break;

                case 3:

                if (num2 != 0)
                {
                    resultado = num1 / num2;
                    System.out.println("Resultado:" + resultado);
                } else {
                    System.out.println("No se puede dividir (0)");
                }
                break; 

                case 4:

                resultado = num1 * num2;
                System.out.println("Resultado:" + resultado);
                break;   

               default:
                System.out.println("No existe esa opcion");
                break;  
            }
           
        }

        public static void parImpar() {
         
          System.out.println("Digita un numero:");
            int num = teclado.nextInt();
            
            if (num % 2 == 0 )
            {
                System.out.println(num + "\nEs un numero par.");
            } else {
                System.out.println(num + "\nEs un numero impar.");
            }
            
        }

        public static void tablaMultiplicar() {

              System.out.println("Digita un numero:");
              double num = teclado.nextDouble();

              for (int i = 0; i <= 12; i++)
              {
                double resultado = num * i;
                System.out.println(num + " x " + i + " = " + resultado);
              }
            
        }

        public static void contadorVocales() {
           System.out.println("Escribe alguna frase o texto:");

            String texto = teclado.nextLine();
             texto = texto.toLowerCase();

            int vocales = 0;

             for(int i = 0; i < texto.length(); i++)
              {
             if (texto.charAt(i) == 'a' ||
              texto.charAt(i) == 'e' ||
              texto.charAt(i) == 'i' ||
               texto.charAt(i) == 'o' ||
                texto.charAt(i) == 'u')
             {
            vocales++;
            }
          }

            System.out.println("La cantidad de vocales es: " + vocales);
            
        }

        public static void promedioNotas()
        {
            System.out.println("Cuantas materias tienes?:");
            int cantidad = teclado.nextInt();

           System.out.println("Digita tus Notas:");
           double[] notas = new double[cantidad];
           double suma = 0;

           for (int i = 0; i < notas.length; i++)
           {
              notas[i] = teclado.nextDouble();            
              suma += notas[i];
           }
            double promedio = suma / cantidad;
            System.out.println("Tu promedio es:" + promedio);

            
        }

        public static void matriz()
        {
            System.out.println("Vamos a llenar una matriz 3x3:");

            System.out.println("Digita los numeros de la matriz:");
            double[][] matriz = new double[3][3];

            for(int i = 0; i < matriz.length; i++)
            {
                for (int j = 0; j < matriz[i].length; j++)
                {
                  matriz[i][j] = teclado.nextDouble();
                  
                }
            }

             System.out.println("\nLa matriz es:");

            for(int i = 0; i < matriz.length; i++)
            {
                for (int j = 0; j < matriz[i].length; j++)
                {
                  System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }
        }
}