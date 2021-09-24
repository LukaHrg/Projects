using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;

public class CountDownTimer : MonoBehaviour
{
    public GameObject startPos;

    public int countDownTime = 7;
    public Text countDownDisplay;

    private void Start()
    {
        StartCoroutine(CountdownStart());
    }

    IEnumerator CountdownStart()
    {
        while (countDownTime >= -1)
        {
            countDownDisplay.text = countDownTime.ToString();

            yield return new WaitForSeconds(1f);

            countDownTime--;
            if(countDownTime <= 0)
            {
                GameObject.Find("Player").GetComponent<Health>().health--;
                GameObject.Find("Player").GetComponent<Transform>().position = startPos.transform.position;
                countDownTime = 30;
            }
        }

        
    }

}
