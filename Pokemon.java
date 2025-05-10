
/**
 * Stores basic stats of Pokemon, such as MP, HP, and basic ATK
 *
 * @Orion0A0
 * @02/15/2025
 */
public class Pokemon extends Moves
{
    private int atk;
    private int hp;
    private int def;
    private String type;
    private String name;
    private String[][] available_pokemon;
    private Moves[] skills;
    
    /** 
         give pokemon random stats and its type
         * HP range from 50~100
         * atk range from 1 ~ 10
         * def range from 0 ~ 5
    */
    public Pokemon(String name, String type)
    {
        this.name = name;
        this.type = type;
        hp = (int)(Math.random() * 51) + 50;
        atk = (int)(Math.random() * 10) + 1;
        def = (int)(Math.random() * 6);
        skills = Moves.randomSkills(type);
    }
    //creates a list of Available Pokemon supported by this game
    public static Pokemon[] initialize()
    {
        Pokemon charmander = new Pokemon("Charmander", "fire");
        Pokemon bulbasaur = new Pokemon("Bulbasaur", "grass");
        Pokemon squirtle = new Pokemon("Squirtle", "water");
        
        Pokemon[] list = {charmander, bulbasaur, squirtle};
        return list;
    }
    public int getDef()
    {
        return def;
    }
    public int getAtk()
    {
        return atk;
    }
    public int getHp()
    {
        return hp;
    }
    public String getType()
    {
        return type;
    }
    public String getName()
    {
        return name;
    }
    public Moves getMoves(int position)
    {
        return skills[position];
    }
}
