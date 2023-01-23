public class Main {
    public static void main(String[] args) {

        int numeroIf=-3;
        int numeroWhile=0;
        var estacion="oso";

        System.out.println("----------------------------------------------");
        System.out.println("1. compare si la variable numeroIf es positivo, negativo, o 0.");
        if(numeroIf>0){
            System.out.println(numeroIf+" es un numero positivo");
        }else if(numeroIf<0){
            System.out.println(numeroIf+" es un numero negativo");
        }else{
            System.out.println("El número es 0");
        }

        System.out.println("----------------------------------------------");
        System.out.println("2. bucle While");
        while(numeroWhile<3){
            System.out.println("numeroWhile = "+numeroWhile);
            numeroWhile++;
        }

        System.out.println("----------------------------------------------");
        System.out.println("3. bucle Do While");
        numeroWhile=2;
        do{
            System.out.println("Numero incrementado: "+numeroWhile);
            numeroWhile++;
        }while(numeroWhile<3);
        System.out.println("----------------------------------------------");
        System.out.println("4. bucle For");
        for(int numeroFor=0;numeroFor<=3;numeroFor++){
            System.out.println("numeroFor: "+numeroFor);
        }
        System.out.println("----------------------------------------------");
        System.out.println("5. Switch");
        switch (estacion){
            case "verano":
                System.out.println("es verano");
                break;
            case "privamera":
                System.out.println("es primavera");
                break;
            case "otoño":
                System.out.println("es otoño");
                break;
            case "invierno":
                System.out.println("es invierno");
                break;
            default:
                System.out.println("no es una estacion del año");
        }
    }
}