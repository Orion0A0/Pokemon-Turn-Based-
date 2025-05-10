                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            import java.util.ArrayList;
/**
 * Stores all of the play belongings here, such as their pokemon and pokeballs
 *
 * @Orion0A0
 * @2/21/2025
 */

public class Player
{
   private Pokemon[] battleSlot;
   private ArrayList<Pokemon> storage;
   public Player ()
   {
       battleSlot = new Pokemon[4];
       storage = new ArrayList<Pokemon>();
   }
   public void addPokemon(Pokemon pika)
   {
       storage.add(pika);
   }
   public void changeSlot(int position, Pokemon change)
   {
       storage.add(battleSlot[position]);
       battleSlot[position] = change;
   }
   public void displayStorage()
   {
       for(int i = 0; i < storage.size(); i++)
       {
           Pokemon hold = storage.get(i);
           System.out.println(hold.getName() + " HP " + hold.getHp() + " Atk " + hold.getAtk() + " Def " + hold.getDef() + " \n");
           System.out.println("Moves: " + hold.getMoves(0).getName() + ", " + hold.getMoves(1).getName() + ", " + hold.getMoves(2).getName() + ", " + hold.getMoves(3).getName());
       }
   }
}