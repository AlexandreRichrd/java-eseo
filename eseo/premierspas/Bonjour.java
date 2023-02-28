package eseo.premierspas;

public class Bonjour {


    public static void main (String[] args ){
        System.out.println("Bonjour cher utilisateur " );
        if(args.length > 1){
            System.out.println("Voici les arguments passes " + " en ligne de commande : " );
            
            for (int i =0; i < args.length ; i ++){
                System.out.println("Argument Numero " + ( i +1) + " : " + args [ i ]);
            }
        }else if(args.length == 1){
            System.out.println("Voici le seul argument passé");
            System.out.println("Argument : " + args[0]);
        }else {
            System.out.println("Aucun argument passe!");
        }
    }
}