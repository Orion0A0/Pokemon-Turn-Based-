
/**
 * Recieves user inputs.
 *
 * @Orion0A0
 * @02/15/2025
 */
public class Main
{
    public static void main(String[] args)
    {
    Pokemon[] arr = Pokemon.initialize();
    Player orion = new Player();
    orion.addPokemon(arr[1]);
    orion.displayStorage();
    
    //System.out.println(arr[1].getName() + " " + arr[1].getMoves(1).getName());
    
    }
    
    
}
