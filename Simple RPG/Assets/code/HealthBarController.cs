using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;

public class HealthBarController : MonoBehaviour
{

    public Slider slider;

    public Player player;

    public Text health_text;

    public void FixedUpdate()
    {
        health_text.text = "HP: " + player.currentHealth.ToString() + "/" + player.Health.ToString();
    }

    public void SetMaxHealth(int health)
    {
        slider.maxValue = health;
        slider.value = health;
    }

    public void SetHealth(int health)
    {
        slider.value = health;
    }

}
