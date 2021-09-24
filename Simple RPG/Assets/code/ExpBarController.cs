using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;
public class ExpBarController : MonoBehaviour
{

    public Slider slider;
   public int level = 1;

    public Player player;
    public HealthBarController health;

    public Text expLvl_text;

    private void Update()
    {
        
    }

    public void SetMaxExp(int Maxexp)
    {
        slider.maxValue = Maxexp;
    }

    public void SetExp(int exp)
    {
        slider.value = exp;
    }
}

