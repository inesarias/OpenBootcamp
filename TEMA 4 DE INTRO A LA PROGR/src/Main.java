public class Main {
    public static void main(String[] args) {
        int numeroIf = 0;
        if (numeroIf < 0) {
            System.out.println("La variable numeroIf" + numeroIf + "es negativo");

        } else if (numeroIf > 0) {
            System.out.println("la variable numeroIf" + numeroIf + "es positivo");

        } else {
            System.out.println("La variable numeroIf es 0");
        }

        int numeroWhile = 1;
        // WHILE
        
        while(numeroWhile<3); {
            numeroWhile++;
            System.out.println("La variable numeroWhile ahora vale: " + numeroWhile);
        }

        int numeroDoWhile = 3;
        
        //DO
        
        do {
            numeroDoWhile++;
            System.out.println("La variable numeroDoWhile ahora vale:  + numeroDoWhile");
        } while (numeroDoWhile < 3);

        //FOR 
        
        for (int numeroFor =0;numeroFor <= 3; numeroFor++){
            System.out.println("La variable numeroFor ahora vale:" + numeroFor);
        } 
        //SWITCH
        var estacion= "VERANO";
        switch (estacion) {
            case "VERANO":
                System.out.println("Es Verano");
                break;
            case "INVIERNO":
                System.out.println("Es Invierno");
                break;
            case "PRIMAVERA":
                System.out.println("Es Primavera");
                break;
            case "OTOÑO":
                System.out.println("Es Otoño");
            default:
                System.out.println("No es una estación");
        }
    }
}
