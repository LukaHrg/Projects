﻿using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.SceneManagement;

public class Restart : MonoBehaviour
{
    
  public void restart()
    {
        SceneManager.LoadScene("StartMenu");
    }

    public void restartC()
    {
        SceneManager.LoadScene("Credits");
    }
    // Start is called before the first frame update
    void Start()
    {
        
    }

    // Update is called once per frame
    void Update()
    {
       
    }
}