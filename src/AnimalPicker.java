import java.util.Scanner;

import javax.xml.catalog.Catalog;

public class AnimalPicker 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner scan = new Scanner(System.in);

       
        // String animalCheck = "PlaceHolder";   
        // while(true)
        // {
        //     System.out.println("What animal would you like to see? Cat, Dog, or Fish: ");
        //     animalCheck = scan.nextLine();
        //     if(animalCheck.equalsIgnoreCase("Dog") || animalCheck.equalsIgnoreCase("Cat") || animalCheck.equalsIgnoreCase("fish"))
        //     {
        //         break;
        //     }
        //     System.out.println("Error Invalid Answer");
        // }
        // if(animalCheck.equalsIgnoreCase("Dog"))
        // {
        //     System.out.println("Dog ASCII here: ");
        //     System.out.println("  __      _\no\'\')}____//\n `_/      )\n (_(_/-(_/");
        // }
        // else if(animalCheck.equalsIgnoreCase("Cat"))
        // {
        //     System.out.println("Cat ASCII here: ");
        //     System.out.println("      |\\      _,,,---,,_\nZZZzz /,`.-\'`\'    -.  ;-;;,_\n     |,4-  ) )-,_. ,\\ (  `\'-\'\n    \'---\'\'(_/--\'  `-\'\\_)");
        // }
        // else if(animalCheck.equalsIgnoreCase("fish"))
        // {
        //     System.out.println("Fish ASCII here: ");
        //     System.out.println("  _\n><_>");
        // }
        // scan.close();
        //For the screenshot I forgot earlier
        System.out.println("What animal would you like: Cat, or Dog?");
        String animalCheck = scan.nextLine();
        if (animalCheck.equalsIgnoreCase("cat")) 
        {
            System.out.println("Cat ASCII here: ");
            System.out.println("      |\\      _,,,---,,_\nZZZzz /,`.-\'`\'    -.  ;-;;,_\n     |,4-  ) )-,_. ,\\ (  `\'-\'\n    \'---\'\'(_/--\'  `-\'\\_)");
        }
        else if(animalCheck.equalsIgnoreCase("dog"))
        {
            System.out.println("Dog ASCII here: ");
            System.out.println("  __      _\no\'\')}____//\n `_/      )\n (_(_/-(_/");
        }
    }
}
