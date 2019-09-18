package com.example.billy;
import java.lang.Math;//DOES MATH

//Dachi == shorthand for Tomodachi
//Tomodachi == Friend

public class Dachi {

    public int Happiness;
    public int Fullness;
    public int Energy;
    public int Meals;
    public boolean isEndGame;

    public Dachi()
    {
        Happiness = 20;
        Fullness = 20;
        Energy = 20;
        Meals = 3;
        isEndGame = false;
    }
    //CONSTRUCTORS
    //CONSTRUCTORS
    //METHODS FOR DACHI
    //METHODS FOR DACHI

    public String endGame()
    {
        if(Happiness == 0)
        {
            isEndGame = true;
            return "Wow you really were a bad friend, Billy died of Unhappiness \n \n \n";
        }
        if(Fullness == 0)
        {
            isEndGame = true;
            return "Wow you really were a bad friend, Billy died of STARVATION!!! \n THE WORST FRIEND EVER YOU ARE!!! \n \n \n";
        }
        if(Fullness == 100 && Happiness== 100 )
        {
            isEndGame = true;
            return "Cool, Billy is thrilled with you, you win \n YOU ARE SUCH A GREAT FRIEND!! \n \n \n";
        }
        else
        {
            return null;
        }
    }

    public  static int randomInt(int low, int high)
    {
        int result = (int)(Math.random()
                * (high-low-1)) + low;
        return result;
    }

    public String Feed()
    {
        if(Meals > 0)
        {
            int successChance = randomInt(1,5);
            if(successChance == 1)
            {
                return "Billy did not like that, guess it sucks to suck," + Meals + "meals left";
            }
            else
            {
                Meals -= 1;
                int full = randomInt(5,11);
                Fullness += full;
                String lost = endGame();
                return lost + "Billy gained" + full + "Fullness, " + Meals + "meals left";
            }
        }
        else
        {
            Fullness -= 5;
            Happiness -= 5;
            String lost = endGame();
            return lost + "No Meals Left";
        }

    }

    public String Play()
    {
        if(Energy > 0)
        {
            int successChance = randomInt(1,5);
            if(successChance == 1)
            {
                return "Billy did not like that, guess it sucks to suck," + Energy + "energy left";
            }
            else
            {
                Energy -= 5;
                int happy = randomInt(5,11);
                Happiness += happy;
                String lost = endGame();
                return lost + "Played with Billy," + Energy + "energy left, " + happy + " happiness gained" ;
            }
        }
        else
        {
            Fullness -= 5;
            Happiness -= 5;
            String lost = endGame();
            return lost + "Not enough energy" ;
        }
    }

    public String Work()
    {
        int earned = randomInt(1,4);
        Energy -= 5;
        Meals += earned;
        return "Earned" + earned + "meals";
    }

    public String Sleep()
    {
        Energy += 15;
        Fullness -= 5;
        Happiness -= 5;
        endGame();
        return "Slept to gain 15 energy, unfortunately this act of greed has resulted in Billy being less full and happy.... way to go....";
    }
    //METHODS FOR DACHI
    //METHODS FOR DACHI
}
