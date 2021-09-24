﻿using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.SceneManagement;

public class BckToStart : MonoBehaviour
{
    // Start is called before the first frame update
    void Start()
    {
        
    }

    // Update is called once per frame
    void Update()
    {
        if (Input.GetKey("space"))
        {
            SceneManager.LoadScene("StartMenu");
        }
        else if (Input.GetKey("escape"))
        {
            Application.Quit();
        }
    }
}
