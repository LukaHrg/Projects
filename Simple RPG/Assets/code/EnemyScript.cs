using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.SceneManagement;
using UnityEngine.UI;

public class EnemyScript : MonoBehaviour
{
    public Player player;
    public HealthBarController health;
    public ExpBarController exp;
    public loottable loot;
    public battleText output;

    public Text lose;

    private int hp;
    private int attack;
    private int defence;
    private int killexp;

    public Button boar;
    public Button wolf;
    public Button lion;
    public Button giantscorpion;
    public Button goblinwarrior;
    public Button vampire;
    public Button demon;
    public Button vampirelord;
    public Button deathbringer;
    public Button hellhound;
    public Button valkyrie;

    // Start is called before the first frame update
    void Start()
    {
        boar.onClick.AddListener(combatboar);
        wolf.onClick.AddListener(combatwolf);
        lion.onClick.AddListener(combatlion);
        giantscorpion.onClick.AddListener(combatgiantscorpion);
        goblinwarrior.onClick.AddListener(combatgoblinwarrior);
        vampire.onClick.AddListener(combatvampire);
        demon.onClick.AddListener(combatdemon);
        vampirelord.onClick.AddListener(combatvampirelord);
        deathbringer.onClick.AddListener(combatdeathbringer);
        hellhound.onClick.AddListener(combathellhound);
        valkyrie.onClick.AddListener(combatvalkyrie);
    }

    // Update is called once per frame
    void Update()
    {

    }

    public void combatboar()
    {
        hp = 10;
        attack = 10;
        defence = 10;
        killexp = 2;
        output.battleOutput(null);

        if (((player.defence >= attack) && (player.attack <= defence)))
        {
            output.battleOutput("The batte was tied");
        }
        else
        {
            while (player.currentHealth > 0 && hp > 0)
            {
                if (defence < player.attack)
                {
                    hp = hp - (Mathf.Abs(defence - player.attack));
                    print(hp + " enemy hp");
                    output.battleOutput("enemy has " + hp + " Hp left");
                }
                else
                {
                    output.battleOutput("enemy has " + hp + " Hp left");
                }

                if (player.defence < attack)
                {
                    player.currentHealth = player.currentHealth - (Mathf.Abs(player.defence - attack));
                    health.SetHealth(player.currentHealth);
                    print(player.currentHealth + " player hp");
                    output.battleOutput("you have " + player.currentHealth + " Hp left");
                }
                else
                {
                    output.battleOutput("you have " + player.currentHealth + " Hp left");
                }

            }
        }

        if (hp <= 0)
        {
            player.Exp = player.Exp + killexp;
            exp.SetExp(player.Exp);
            loot.stats();
            player.currentHealth = player.Health;
            health.SetHealth(player.currentHealth);
            output.battleOutput("You Win");
        }
        else if (player.currentHealth <= 0)
        {
            output.battleOutput("You Died!");
            lose.text = "You Lose! \n\n Press anyhwere to continue.";
        }
    }

    public void combatwolf()
    {
        hp = 35;
        attack = 35;
        defence = 35;
        killexp = 5;
        output.battleOutput(null);

        if (((player.defence >= attack) && (player.attack <= defence)))
        {
            output.battleOutput("The batte was tied");
        }
        else
        {
            while (player.currentHealth > 0 && hp > 0)
            {
                if (defence < player.attack)
                {
                    hp = hp - (Mathf.Abs(defence - player.attack));
                    print(hp + " enemy hp");
                    output.battleOutput("enemy has " + hp + " Hp left");
                }
                else
                {
                    output.battleOutput("enemy has " + hp + " Hp left");
                }

                if (player.defence < attack)
                {
                    player.currentHealth = player.currentHealth - (Mathf.Abs(player.defence - attack));
                    health.SetHealth(player.currentHealth);
                    print(player.currentHealth + " player hp");
                    output.battleOutput("you have " + player.currentHealth + " Hp left");
                }
                else
                {
                    output.battleOutput("you have " + player.currentHealth + " Hp left");
                }

            }
        }

        if (hp <= 0)
        {
            player.Exp = player.Exp + killexp;
            exp.SetExp(player.Exp);
            loot.stats();
            player.currentHealth = player.Health;
            health.SetHealth(player.currentHealth);
            output.battleOutput("You Win");
        }
        else if (player.currentHealth <= 0)
        {
            output.battleOutput("You Died!");
            lose.text = "You Lose! \n\n Press anyhwere to continue.";
        }
    }

    public void combatlion()
    {
        hp = 80;
        attack = 80;
        defence = 80;
        killexp = 10;
        output.battleOutput(null);

        if (((player.defence >= attack) && (player.attack <= defence)))
        {
            output.battleOutput("The batte was tied");
        }
        else
        {
            while (player.currentHealth > 0 && hp > 0)
            {
                if (defence < player.attack)
                {
                    hp = hp - (Mathf.Abs(defence - player.attack));
                    print(hp + " enemy hp");
                    output.battleOutput("enemy has " + hp + " Hp left");
                }
                else
                {
                    output.battleOutput("enemy has " + hp + " Hp left");
                }

                if (player.defence < attack)
                {
                    player.currentHealth = player.currentHealth - (Mathf.Abs(player.defence - attack));
                    health.SetHealth(player.currentHealth);
                    print(player.currentHealth + " player hp");
                    output.battleOutput("you have " + player.currentHealth + " Hp left");
                }
                else
                {
                    output.battleOutput("you have " + player.currentHealth + " Hp left");
                }

            }
        }

        if (hp <= 0)
        {
            player.Exp = player.Exp + killexp;
            exp.SetExp(player.Exp);
            loot.stats();
            player.currentHealth = player.Health;
            health.SetHealth(player.currentHealth);
            output.battleOutput("You Win");
        }
        else if (player.currentHealth <= 0)
        {
            output.battleOutput("You Died!");
            lose.text = "You Lose! \n\n Press anyhwere to continue.";
        }
    }

    public void combatgiantscorpion()
    {
        hp = 120;
        attack = 120;
        defence = 120;
        killexp = 20;
        output.battleOutput(null);

        if (((player.defence >= attack) && (player.attack <= defence)))
        {
            output.battleOutput("The batte was tied");
        }
        else
        {
            while (player.currentHealth > 0 && hp > 0)
            {
                if (defence < player.attack)
                {
                    hp = hp - (Mathf.Abs(defence - player.attack));
                    print(hp + " enemy hp");
                    output.battleOutput("enemy has " + hp + " Hp left");
                }
                else
                {
                    output.battleOutput("enemy has " + hp + " Hp left");
                }

                if (player.defence < attack)
                {
                    player.currentHealth = player.currentHealth - (Mathf.Abs(player.defence - attack));
                    health.SetHealth(player.currentHealth);
                    print(player.currentHealth + " player hp");
                    output.battleOutput("you have " + player.currentHealth + " Hp left");
                }
                else
                {
                    output.battleOutput("you have " + player.currentHealth + " Hp left");
                }

            }
        }

        if (hp <= 0)
        {
            player.Exp = player.Exp + killexp;
            exp.SetExp(player.Exp);
            loot.stats();
            player.currentHealth = player.Health;
            health.SetHealth(player.currentHealth);
            output.battleOutput("You Win");
        }
        else if (player.currentHealth <= 0)
        {
            output.battleOutput("You Died!");
            lose.text = "You Lose! \n\n Press anyhwere to continue.";
        }
    }

    public void combatgoblinwarrior()
    {
        hp = 250;
        attack = 250;
        defence = 250;
        killexp = 30;
        output.battleOutput(null);

        if (((player.defence >= attack) && (player.attack <= defence)))
        {
            output.battleOutput("The batte was tied");
        }
        else
        {
            while (player.currentHealth > 0 && hp > 0)
            {
                if (defence < player.attack)
                {
                    hp = hp - (Mathf.Abs(defence - player.attack));
                    print(hp + " enemy hp");
                    output.battleOutput("enemy has " + hp + " Hp left");
                }
                else
                {
                    output.battleOutput("enemy has " + hp + " Hp left");
                }

                if (player.defence < attack)
                {
                    player.currentHealth = player.currentHealth - (Mathf.Abs(player.defence - attack));
                    health.SetHealth(player.currentHealth);
                    print(player.currentHealth + " player hp");
                    output.battleOutput("you have " + player.currentHealth + " Hp left");
                }
                else
                {
                    output.battleOutput("you have " + player.currentHealth + " Hp left");
                }

            }
        }

        if (hp <= 0)
        {
            player.Exp = player.Exp + killexp;
            exp.SetExp(player.Exp);
            loot.stats();
            player.currentHealth = player.Health;
            health.SetHealth(player.currentHealth);
            output.battleOutput("You Win");
        }
        else if (player.currentHealth <= 0)
        {
            output.battleOutput("You Died!");
            lose.text = "You Lose! \n\n Press anyhwere to continue.";
        }
    }

    public void combatvampire()
    {
        hp = 400;
        attack = 400;
        defence = 400;
        killexp = 40;
        output.battleOutput(null);

        if (((player.defence >= attack) && (player.attack <= defence)))
        {
            output.battleOutput("The batte was tied");
        }
        else
        {
            while (player.currentHealth > 0 && hp > 0)
            {
                if (defence < player.attack)
                {
                    hp = hp - (Mathf.Abs(defence - player.attack));
                    print(hp + " enemy hp");
                    output.battleOutput("enemy has " + hp + " Hp left");
                }
                else
                {
                    output.battleOutput("enemy has " + hp + " Hp left");
                }

                if (player.defence < attack)
                {
                    player.currentHealth = player.currentHealth - (Mathf.Abs(player.defence - attack));
                    health.SetHealth(player.currentHealth);
                    print(player.currentHealth + " player hp");
                    output.battleOutput("you have " + player.currentHealth + " Hp left");
                }
                else
                {
                    output.battleOutput("you have " + player.currentHealth + " Hp left");
                }

            }
        }

        if (hp <= 0)
        {
            player.Exp = player.Exp + killexp;
            exp.SetExp(player.Exp);
            loot.stats();
            player.currentHealth = player.Health;
            health.SetHealth(player.currentHealth);
            output.battleOutput("You Win");
        }
        else if (player.currentHealth <= 0)
        {
            output.battleOutput("You Died!");
            lose.text = "You Lose! \n\n Press anyhwere to continue.";
        }
    }

    public void combatdemon()
    {
        hp = 600;
        attack = 600;
        defence = 600;
        killexp = 50;
        output.battleOutput(null);

        if (((player.defence >= attack) && (player.attack <= defence)))
        {
            output.battleOutput("The batte was tied");
        }
        else
        {
            while (player.currentHealth > 0 && hp > 0)
            {
                if (defence < player.attack)
                {
                    hp = hp - (Mathf.Abs(defence - player.attack));
                    print(hp + " enemy hp");
                    output.battleOutput("enemy has " + hp + " Hp left");
                }
                else
                {
                    output.battleOutput("enemy has " + hp + " Hp left");
                }

                if (player.defence < attack)
                {
                    player.currentHealth = player.currentHealth - (Mathf.Abs(player.defence - attack));
                    health.SetHealth(player.currentHealth);
                    print(player.currentHealth + " player hp");
                    output.battleOutput("you have " + player.currentHealth + " Hp left");
                }
                else
                {
                    output.battleOutput("you have " + player.currentHealth + " Hp left");
                }

            }
        }

        if (hp <= 0 && player.currentHealth <= 0)
        {
            print("TIED!!");
        }
        else if (hp <= 0)
        {
            player.Exp = player.Exp + killexp;
            exp.SetExp(player.Exp);
            loot.stats();
            player.currentHealth = player.Health;
            health.SetHealth(player.currentHealth);
            output.battleOutput("You Win");
        }
        else if (player.currentHealth <= 0)
        {
            output.battleOutput("You Died!");
            lose.text = "You Lose! \n\n Press anyhwere to continue.";
        }
    }
    public void combatvampirelord()
    {
        hp = 800;
        attack = 800;
        defence = 800;
        killexp = 75;
        output.battleOutput(null);

        if (((player.defence >= attack) && (player.attack <= defence)))
        {
            output.battleOutput("The batte was tied");
        }
        else
        {
            while (player.currentHealth > 0 && hp > 0)
            {
                if (defence < player.attack)
                {
                    hp = hp - (Mathf.Abs(defence - player.attack));
                    print(hp + " enemy hp");
                    output.battleOutput("enemy has " + hp + " Hp left");
                }
                else
                {
                    output.battleOutput("enemy has " + hp + " Hp left");
                }

                if (player.defence < attack)
                {
                    player.currentHealth = player.currentHealth - (Mathf.Abs(player.defence - attack));
                    health.SetHealth(player.currentHealth);
                    print(player.currentHealth + " player hp");
                    output.battleOutput("you have " + player.currentHealth + " Hp left");
                }
                else
                {
                    output.battleOutput("you have " + player.currentHealth + " Hp left");
                }

            }
        }

        if (hp <= 0 && player.currentHealth <= 0)
        {
            print("TIED!!");
        }
        else if (hp <= 0)
        {
            player.Exp = player.Exp + killexp;
            exp.SetExp(player.Exp);
            loot.stats();
            player.currentHealth = player.Health;
            health.SetHealth(player.currentHealth);
            output.battleOutput("You Win");
        }
        else if (player.currentHealth <= 0)
        {
            output.battleOutput("You Died!");
            lose.text = "You Lose! \n\n Press anyhwere to continue.";
        }
    }
    public void combatdeathbringer()
    {
        hp = 1000;
        attack = 1000;
        defence = 1000;
        killexp = 100;
        output.battleOutput(null);

        if (((player.defence >= attack) && (player.attack <= defence)))
        {
            output.battleOutput("The batte was tied");
        }
        else
        {
            while (player.currentHealth > 0 && hp > 0)
            {
                if (defence < player.attack)
                {
                    hp = hp - (Mathf.Abs(defence - player.attack));
                    print(hp + " enemy hp");
                    output.battleOutput("enemy has " + hp + " Hp left");
                }
                else
                {
                    output.battleOutput("enemy has " + hp + " Hp left");
                }

                if (player.defence < attack)
                {
                    player.currentHealth = player.currentHealth - (Mathf.Abs(player.defence - attack));
                    health.SetHealth(player.currentHealth);
                    print(player.currentHealth + " player hp");
                    output.battleOutput("you have " + player.currentHealth + " Hp left");
                }
                else
                {
                    output.battleOutput("you have " + player.currentHealth + " Hp left");
                }

            }
        }

        if (hp <= 0)
        {
            player.Exp = player.Exp + killexp;
            exp.SetExp(player.Exp);
            loot.stats();
            player.currentHealth = player.Health;
            health.SetHealth(player.currentHealth);
            output.battleOutput("You Win");
        }
        else if (player.currentHealth <= 0)
        {
            output.battleOutput("You Died!");
            lose.text = "You Lose! \n\n Press anyhwere to continue.";
        }
    }
    public void combathellhound()
    {
        hp = 1200;
        attack = 1200;
        defence = 1200;
        killexp = 120;
        output.battleOutput(null);

        if (((player.defence >= attack) && (player.attack <= defence)))
        {
            output.battleOutput("The batte was tied");
        }
        else
        {
            while (player.currentHealth > 0 && hp > 0)
            {
                if (defence < player.attack)
                {
                    hp = hp - (Mathf.Abs(defence - player.attack));
                    print(hp + " enemy hp");
                    output.battleOutput("enemy has " + hp + " Hp left");
                }
                else
                {
                    output.battleOutput("enemy has " + hp + " Hp left");
                }

                if (player.defence < attack)
                {
                    player.currentHealth = player.currentHealth - (Mathf.Abs(player.defence - attack));
                    health.SetHealth(player.currentHealth);
                    print(player.currentHealth + " player hp");
                    output.battleOutput("you have " + player.currentHealth + " Hp left");
                }
                else
                {
                    output.battleOutput("you have " + player.currentHealth + " Hp left");
                }

            }
        }

        if (hp <= 0)
        {
            player.Exp = player.Exp + killexp;
            exp.SetExp(player.Exp);
            loot.stats();
            player.currentHealth = player.Health;
            health.SetHealth(player.currentHealth);
            output.battleOutput("You Win");
        }
        else if (player.currentHealth <= 0)
        {
            output.battleOutput("You Died!");
            lose.text = "You Lose! \n\n Press anyhwere to continue.";
        }
    }
    public void combatvalkyrie()
    {
        hp = 1400;
        attack = 1400;
        defence = 1400;
        killexp = 150;
        output.battleOutput(null);

        if (((player.defence >= attack) && (player.attack <= defence)))
        {
            output.battleOutput("The batte was tied");
        }
        else
        {
            while (player.currentHealth > 0 && hp > 0)
            {
                if (defence < player.attack)
                {
                    hp = hp - (Mathf.Abs(defence - player.attack));
                    print(hp + " enemy hp");
                    output.battleOutput("enemy has " + hp + " Hp left");
                }
                else
                {
                    output.battleOutput("enemy has " + hp + " Hp left");
                }

                if (player.defence < attack)
                {
                    player.currentHealth = player.currentHealth - (Mathf.Abs(player.defence - attack));
                    health.SetHealth(player.currentHealth);
                    print(player.currentHealth + " player hp");
                    output.battleOutput("you have " + player.currentHealth + " Hp left");
                }
                else
                {
                    output.battleOutput("you have " + player.currentHealth + " Hp left");
                }

            }
        }

        if (hp <= 0)
        {
            player.Exp = player.Exp + killexp;
            exp.SetExp(player.Exp);
            loot.stats();
            player.currentHealth = player.Health;
            health.SetHealth(player.currentHealth);
            output.battleOutput("You Win! \n\n Press anyhwere to continue.");
            if (Input.GetMouseButton(0))
            {
                SceneManager.LoadScene("Credits");
            }
        }
        else if (player.currentHealth <= 0)
        {
            output.battleOutput("You Died!");
            lose.text = "You Lose! \n\n Press anyhwere to continue.";
        }
    }
}

