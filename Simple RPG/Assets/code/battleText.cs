using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;

public class battleText : MonoBehaviour
{

    public Text output;

    public void battleOutput(string input)
    {

        if (input != null)
        {
            string currentText = output.text.ToString();
            string newText = currentText + "\n" + input;
            output.text = newText;
        }
        else
        {
            output.text = null;
        }



    }

}
