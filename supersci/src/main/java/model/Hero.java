package model;
/**
 * Holds the information for the Hero
 * @author Amaya Shabazz
 */
import java.util.ArrayList;
import java.util.Iterator;

public class Hero {
    private String name;
    private String subject;
    private int strength;
    private String story;
    public ArrayList<Weapon> weapons;
    public ArrayList<Weapon> collectedWeapons;
    

    public Hero(String name, int strength, String subject, String story, ArrayList<Weapon> weapons) 
    {
        this.setName(name);
        this.setStrength(strength);
        this.setSubject(subject);
        this.setStory(story);
        this.setWeapons(weapons);
        collectedWeapons = new ArrayList<Weapon>();
    }

    private void setStory(String story)
    {
        this.story = story;
    }
    public String getStory()
    {
        return this.story;
    }
    private void setName(String name)
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }

    public String getSubject() 
    {
        return subject;
    }

    private void setSubject(String subject)
    {
        this.subject = subject;
    }

    public int getStrength() 
    {
        return strength;
    }

    public void setStrength(int strength) 
    {
        this.strength = strength;
    }

    public ArrayList<Weapon> getCollectedWeapons()
    {
        return this.collectedWeapons;
    }


    public ArrayList<Weapon> getWeapons() 
    {
       return weapons;
    }
    
    //one list of weapons & one list of collected weapons
    public void setWeapons(ArrayList<Weapon> weapons) 
    {
        this.weapons = weapons;
    }

    /**
     * Adds a weapon to the list of collected weapons
     * @param weapon Holds the weapon name and its effect
     */
    public void addWeapon(Weapon weapon) 
    {
        collectedWeapons.add(weapon);
        if (weapon.getEffect().equals("strength"))
            strength+= 2;
    }

    /**
     * Gives the description of the hero
     * @return Will return information about the current hero
     */
    public String getDescription() 
    {
        return name+": \nStrength: "+strength+"\nSubject: "+subject
        +"\nAll Weapons: "+weapons+"\nCollected Weapons: "+collectedWeapons+"\nStory: "+story;
    }

    public boolean hasMove() 
    {
        boolean check = false;
        Iterator<Weapon> iterator = weapons.iterator();
        int index = 0;
        while (iterator.hasNext())
        {
            if(collectedWeapons.get(index).getEffect().equalsIgnoreCase("move"))
                check = true;
            ++index;
        }
        return check;
    }

    public boolean hasIntel() 
    {
        boolean check = false;
        Iterator<Weapon> iterator = weapons.iterator();
        int index = 0;
        while (iterator.hasNext())
        {
            if(collectedWeapons.get(index).getEffect().equalsIgnoreCase("intel"))
                check = true;
            ++index;
        }
        return check;
    }
    
    public boolean hasStrength()
    {
        boolean check = false;
        Iterator<Weapon> iterator = weapons.iterator();
        int index = 0;
        while (iterator.hasNext())
        {
            if(collectedWeapons.get(index).getEffect().equalsIgnoreCase("strength"))
                check = true;
            ++index;
        }
        return check;
    }
}
