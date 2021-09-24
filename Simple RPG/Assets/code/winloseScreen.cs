using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.SceneManagement;

public class winloseScreen : MonoBehaviour
{
    public Player player;

    void Update()
    {
        Scene currentScene = SceneManager.GetActiveScene();
        string sceneName = currentScene.name;

        if(sceneName == "Start")
        {
            if(Input.GetMouseButton(0))
            {
                SceneManager.LoadScene("SampleScene");
            }
        }

        if(sceneName == "SampleScene")
        {
            if(player.currentHealth <= 0 && Input.GetMouseButton(0))
            {
               SceneManager.LoadScene("Credits");
            }
        }

        if (sceneName == "Credits")
        {
            if (Input.GetMouseButton(0))
            {
                SceneManager.LoadScene("SampleScene");
            }
        }
    }
}
