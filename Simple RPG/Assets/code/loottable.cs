using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;

public class loottable : MonoBehaviour
{

    public Player player;
    public int statUp;
    public Text gearOutput;

    public int randomNumber;
    public int randomNumber2;

    public void stats()
    {
        randomNumber = Random.Range(0, 100);
        randomNumber2 = Random.Range(0, 100);

        //                                         ARMOUR

        if ((randomNumber > 0 && randomNumber <= 30) && (randomNumber2 > 0 && randomNumber2 <= 30))
        {
            //            common                                         armour
            statUp = Random.Range(0, 5);
            player.Health = statUp + player.Health;
            gearOutput.text = "";
            gearOutput.text = "You got a common armour piece \n Hp + " + statUp;
        }
       if ((randomNumber > 30 && randomNumber <= 55) && (randomNumber2 > 0 && randomNumber2 <= 30))
        {
            //           uncommon                                         armour
            statUp = Random.Range(2, 10);
            player.Health = statUp + player.Health;
            gearOutput.text = "";
            gearOutput.text = "You got an uncommon armour piece \n Hp + " + statUp;
        }
        if ((randomNumber > 55 && randomNumber <= 74) && (randomNumber2 > 0 && randomNumber2 <= 30))
        {
            //               rare                                         armour
            statUp = Random.Range(5, 20);
            player.Health = statUp + player.Health;
            gearOutput.text = "";
            gearOutput.text = "You got a rare armour piece \n Hp + " + statUp;
        }
        if ((randomNumber > 74 && randomNumber <= 89) && (randomNumber2 > 0 && randomNumber2 <= 30))
        {
            //              veryrare                                      armour
            statUp = Random.Range(10, 50);
            player.Health = statUp + player.Health;
            gearOutput.text = "";
            gearOutput.text = "You got a very rare armour piece \n Hp + " + statUp;
        }
        if ((randomNumber > 89 && randomNumber <= 99) && (randomNumber2 > 0 && randomNumber2 <= 30))
        {
            //                epic                                        armour
            statUp = Random.Range(20, 75);
            player.Health = statUp + player.Health;
            gearOutput.text = "";
            gearOutput.text = "You got an epic armour piece \n Hp + " + statUp;
        }
        if ((randomNumber > 99 && randomNumber <= 100) && (randomNumber2 > 0 && randomNumber2 <= 30))
        {
            //             legendary                                      armour
            statUp = Random.Range(90, 100);
            player.Health = statUp + player.Health;
            gearOutput.text = "";
            gearOutput.text = "You got a legendary armour piece \n Hp + " + statUp;
        }

        //                                          SHIELD                         

        if ((randomNumber > 0 && randomNumber <= 30) && (randomNumber2 > 30 && randomNumber2 <= 60))
        {
            //            common                                         shield
            statUp = Random.Range(0, 5);
            player.defence = statUp + player.defence;
            gearOutput.text = "";
            gearOutput.text = "You got a common shield \n Defence + " + statUp;
        }
        if ((randomNumber > 30 && randomNumber <= 55) && (randomNumber2 > 30 && randomNumber2 <= 60))
        {
            //           uncommon                                         shield
            statUp = Random.Range(2, 10);
            player.defence = statUp + player.defence;
            gearOutput.text = "";
            gearOutput.text = "You got an uncommon shield \n Defence + " + statUp;
        }
        if ((randomNumber > 55 && randomNumber <= 74) && (randomNumber2 > 30 && randomNumber2 <= 60))
        {
            //               rare                                         shield
            statUp = Random.Range(5, 20);
            player.defence = statUp + player.defence;
            gearOutput.text = "";
            gearOutput.text = "You got a rare shield \n Defence + " + statUp;
        }
        if ((randomNumber > 74 && randomNumber <= 89) && (randomNumber2 > 30 && randomNumber2 <= 60))
        {
            //              veryrare                                      shield
            statUp = Random.Range(10, 50);
            player.defence = statUp + player.defence;
            gearOutput.text = "";
            gearOutput.text = "You got a veryrare shield \n Defence + " + statUp;
        }
        if ((randomNumber > 89 && randomNumber <= 99) && (randomNumber2 > 30 && randomNumber2 <= 60))
        {
            //                epic                                        shield
            statUp = Random.Range(20, 75);
            player.defence = statUp + player.defence;
            gearOutput.text = "";
            gearOutput.text = "You got an epic shield \n Defence + " + statUp;
        }
        if ((randomNumber > 99 && randomNumber <= 100) && (randomNumber2 > 30 && randomNumber2 <= 60))
        {
            //             legendary                                      shield
            statUp = Random.Range(90, 100);
            player.defence = statUp + player.defence;
            gearOutput.text = "";
            gearOutput.text = "You got a legendary shield \n Defence + " + statUp;
        }

        //                                     SWORD

        if ((randomNumber > 0 && randomNumber <= 30) && (randomNumber2 > 60 && randomNumber2 <= 90))
        {
            //            common                                         sword
            statUp = Random.Range(0, 5);
            player.attack = statUp + player.attack;
            gearOutput.text = "";
            gearOutput.text = "You got a common sword \n Attack + " + statUp;
        }
        if ((randomNumber > 30 && randomNumber <= 55) && (randomNumber2 > 60 && randomNumber2 <= 90))
        {
            //           uncommon                                         sword
            statUp = Random.Range(2, 10);
            player.attack = statUp + player.attack;
            gearOutput.text = "";
            gearOutput.text = "You got an uncommon sword \n Attack + " + statUp;
        }
        if ((randomNumber > 55 && randomNumber <= 74) && (randomNumber2 > 60 && randomNumber2 <= 90))
        {
            //               rare                                         sword
            statUp = Random.Range(5, 20);
            player.attack = statUp + player.attack;
            gearOutput.text = "";
            gearOutput.text = "You got a rare sword \n Attack + " + statUp;
        }
        if ((randomNumber > 74 && randomNumber <= 89) && (randomNumber2 > 60 && randomNumber2 <= 90))
        {
            //              veryrare                                      sword
            statUp = Random.Range(10, 50);
            player.attack = statUp + player.attack;
            gearOutput.text = "";
            gearOutput.text = "You got a very rare sword \n Attack + " + statUp;
        }
        if ((randomNumber > 89 && randomNumber <= 99) && (randomNumber2 > 60 && randomNumber2 <= 90))
        {
            //                epic                                        sword
            statUp = Random.Range(20, 75);
            player.attack = statUp + player.attack;
            gearOutput.text = "";
            gearOutput.text = "You got an epic sword \n Attack + " + statUp;
        }
        if ((randomNumber > 99 && randomNumber <= 100) && (randomNumber2 > 60 && randomNumber2 <= 90))
        {
            //             legendary                                      sword
            statUp = Random.Range(90, 100);
            player.attack = statUp + player.attack;
            gearOutput.text = "";
            gearOutput.text = "You got a legenr sword \n Attack + " + statUp;
        }

        //                                 SET

        if ((randomNumber > 0 && randomNumber <= 30) && (randomNumber2 > 90 && randomNumber2 <= 100))
        {
            //            common                                             set
            statUp = Random.Range(0, 5);
            player.defence = statUp + player.defence;
            player.attack = statUp + player.attack;
            player.Health = statUp + player.Health;
            gearOutput.text = "";
            gearOutput.text = "You got a common armour set \n All stats + " + statUp;
        }
        if ((randomNumber > 30 && randomNumber <= 55) && (randomNumber2 > 90 && randomNumber2 <= 100))
        {
            //           uncommon                                             set
            statUp = Random.Range(2, 10);
            player.defence = statUp + player.defence;
            player.attack = statUp + player.attack;
            player.Health = statUp + player.Health;
            gearOutput.text = "";
            gearOutput.text = "You got an uncommon armour set \n All stats + " + statUp;
        }
        if ((randomNumber > 55 && randomNumber <= 74) && (randomNumber2 > 90 && randomNumber2 <= 100))
        {
            //               rare                                             set
            statUp = Random.Range(5, 20);
            player.defence = statUp + player.defence;
            player.attack = statUp + player.attack;
            player.Health = statUp + player.Health;
            gearOutput.text = "";
            gearOutput.text = "You got a rare armour set \n All stats + " + statUp;
        }
        if ((randomNumber > 74 && randomNumber <= 89) && (randomNumber2 > 90 && randomNumber2 <= 100))
        {
            //              veryrare                                          set
            statUp = Random.Range(10, 50);
            player.defence = statUp + player.defence;
            player.attack = statUp + player.attack;
            player.Health = statUp + player.Health;
            gearOutput.text = "";
            gearOutput.text = "You got a very rare armour set \n All stats + " + statUp;
        }
        if ((randomNumber > 89 && randomNumber <= 99) && (randomNumber2 > 90 && randomNumber2 <= 100))
        {
            //                epic                                            set
            statUp= Random.Range(20, 75);
            player.defence = statUp + player.defence;
            player.attack = statUp + player.attack;
            player.Health = statUp + player.Health;
            gearOutput.text = "";
            gearOutput.text = "You got an epic armour set \n All stats + " + statUp;
        }
        if ((randomNumber > 99 && randomNumber <= 100) && (randomNumber2 > 90 && randomNumber2 <= 100))
        {
            //             legendary                                          set
            statUp += Random.Range(90, 100);
            player.defence = statUp + player.defence;
            player.attack = statUp + player.attack;
            player.Health = statUp + player.Health;
            gearOutput.text = "";
            gearOutput.text = "You got a legendary armour set \n All stats + " + statUp;
        }
    }
}
