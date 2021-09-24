using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;

public class Player : MonoBehaviour
{

    public HealthBarController healthBar;
    public ExpBarController expBar;

    public int Health = 0;
    public int currentHealth;
    public int Exp = 0;
    public int MaxExp = 10;
    public int defence = 0;
    public int attack = 0;

    public Text attack_text;
    public Text defence_text;


    // Start is called before the first frame update
    void Start()
    {
        currentHealth = Health;
        healthBar.SetMaxHealth(Health);

        expBar.SetMaxExp(MaxExp);
    }

    // Update is called once per frame
    void Update()
    {

     /*   if(Input.GetKeyDown("space"))
          {
              currentHealth--;
              healthBar.SetHealth(currentHealth);

            Exp = Exp + 10;
            expBar.SetExp(Exp);
          }*/

        attack_text.text = "Attack: " + attack;
        defence_text.text = "Defence: " + defence;

        if (expBar.slider.value >= expBar.slider.maxValue)
        {
            expBar.level++;
            expBar.slider.value = expBar.slider.maxValue - expBar.slider.value;
            Exp = 0;
            expBar.slider.maxValue = (int)(expBar.slider.maxValue * 1.5);

            expBar.expLvl_text.text = "Level: " + this.expBar.level.ToString();

            attack = attack + 10;
            defence = defence + 10;

            Health = Health + 10;
            healthBar.SetMaxHealth(Health);
            currentHealth = Health;

        }

    }
}
