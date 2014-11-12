/**
 * Created by loneshaman on 11/11/2014.
 */

import java.util.Random;
public abstract class Actor {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
                name = "";
                break;
            case 5:
                name = "Assassin"; //
        }
    }

    public Actor()
    {
        roll();

    }
}
