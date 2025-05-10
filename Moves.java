
/**
 * A class that creates objects to store values of different moves
 * 
 * Return Type: Moves array
 * 
 * @Orion0A0
 * @02/15/2025
 */
public class Moves
{
   private int base_atk;
   private double chance;
   private String debuffType;
   private String element;
   private String name;
   private boolean healing;
   
   public Moves (int base_atk, double chance, String debuffType, String element, String name, boolean healing)
   {
       this.base_atk = base_atk;
       this.chance = chance;
       this.debuffType = debuffType;
       this.element = element;
       this.name = name;
       this.healing = healing;
   }
   public Moves()
   {
       grassInitialize();
       waterInitialize();
       fireInitialize();
   }
   //creates value for each different moves
   public static Moves[] fireInitialize ()
   {
       //fire type
       Moves ember = new Moves(5, 0.2, "burning", "fire", "Ember", false);
       Moves overheat = new Moves(7, 0.15, "burning", "fire", "Overheat", false);
       Moves firePunch = new Moves(4, 0.1, "burning", "fire", "Fire Punch", false);
       Moves inferno = new Moves(10, 0.15, "burning", "fire", "Inferno", false);
      
       Moves[] list = {ember, overheat, firePunch, inferno};
       
       return list;
       
   }
   public static Moves[] grassInitialize ()
   {
       //grass type
       Moves absorb = new Moves(3, 0, null, "grass", "Absorb", true);
       Moves razorLeaf = new Moves(5, 0, null, "grass", "Razor Leaf", false);
       Moves energyBall = new Moves(4, 0, null, "grass", "Energy Ball", true);
       Moves solarBeam = new Moves(9, 0, null, "grass", "Solar Beam", false);
       
       Moves[] list = {absorb, razorLeaf, energyBall, solarBeam};
       
       return list;
       
   }
   public static Moves[] waterInitialize ()
   {
       //water type
       Moves waterGun = new Moves(4, 0, null, "water", "waterGun", false);
       Moves bubble = new Moves(3, 0.3, "weak", "water", "Bubble", false);
       Moves aqueJet = new Moves(6, 0, null, "water", "AqueJet", false);
       Moves hydroPump = new Moves(9, 0, null, "water", "Hydro Pump", false);
      
       Moves[] list = {waterGun, bubble, aqueJet, hydroPump};
       
       return list;
       
   }
   public static Moves[] normalInitialize ()
   {
       //normal type, sleep heals to full Hp, restore heals 25%
       Moves tackle = new Moves(3, 0, null, "normal", "Tackle", false);
       Moves sleep = new Moves(0, 1, "sleep", "normal", "Sleep", true);
       Moves restore = new Moves(0, 0, null, "normal", "Tackle", true);
       
       Moves[] list = {tackle, sleep, restore};
       
       return list;
       
   }
   //assign random skills to different types of pokemon
   public static Moves[] randomSkills(String type) 
   {
       //array that holds temp array from method
       Moves[] elementList;
       Moves[] commonList = Moves.normalInitialize();
       //array that stores pokemon's skill
       Moves[] pokemonSkills = new Moves[4];
       //random elements in this method
       int random = (int)(Math.random() * 4);
       if (type.equals("grass"))
       {
           elementList = Moves.grassInitialize();
       }else if (type.equals("water"))
       {
           elementList = Moves.waterInitialize();
       }else
       {
           elementList = Moves.fireInitialize();
       }
       //assigns "random" number of element skills for that pokemon
       for(int i = 0; i <= random; i++)
       {
           pokemonSkills[i] = elementList[(int)(Math.random() * elementList.length)];
       }
       //the common type skill with fill the number of skills up to 4
       for(int j = random + 1; j <= 3; j++)
       {
           pokemonSkills[j] = commonList[(int)(Math.random() * commonList.length)];
       }
       return pokemonSkills;
   }
   public int getBase_atk()
   {
       return base_atk;
   }
   public double getChance()
   {
       return chance;
   }
   public String getDebuffType()
   {
       return debuffType;
   }
   public String getElement()
   {
       return element;
   }
   public String getName()
   {
       return name;
   }
   public boolean getHealing()
   {
       return healing;
   }
}

