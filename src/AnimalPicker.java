import java.util.Scanner;

public class AnimalPicker 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner scan = new Scanner(System.in);

       
        String animalCheck = "PlaceHolder";   
        while(true)
        {
            System.out.println("What animal would you like to see? Cat or Dog: ");
            animalCheck = scan.nextLine();
            if(animalCheck.equalsIgnoreCase("Dog") || animalCheck.equalsIgnoreCase("Cat"))
            {
                break;
            }
            System.out.println("Error Invalid Answer");
        }
    }
}
