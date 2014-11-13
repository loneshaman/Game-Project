/**
 * Created by loneshaman on 11/11/2014.
 */

import java.util.Random;
public abstract class Actor {
    public String getName() {
        return name;
    }

    protected String name; //name of the actor class

    protected int value; //value of the class. used for combat and movement

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String player_name) {
        this.playerName = player_name;
    }

    protected String playerName; //name of the player controlling actor

    public abstract void move(int x, int y); //movement depends on the actor type

    public abstract void ability(); //ability dependent on actor type

    public void roll(){
        Random dice = new Random(77);
        value = dice.nextInt(6)+1;
        switch (value)
        {
            case 1:
                name = "Berserker"; //slow but ridiculously strong attacker
                break;
            case 2:
                name = "Knight"; //can carry other units as it moves
                break;
            case 3:
                name = "Mage"; //can teleport and switch places with others on the field
                break;
            case 4:
                name = "Bard"; //versatile class that can transform into a Mage or a Thief
                break;
            case 5:
                name = "Thief"; //fast class that can move diagonally
                break;
            case 6:
                name = "Acrobat"; //super agile but weak class; can transform into a random class
        }
    }

    public Actor(String playa)
    {
        roll();
        playerName = playa;
    }
}
