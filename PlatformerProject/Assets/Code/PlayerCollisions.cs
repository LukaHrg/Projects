using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class PlayerCollisions : MonoBehaviour
{
    public Animation Bounce;
    public GameObject startPos;
    // Start is called before the first frame update
    void Start()
    {
        Bounce.GetComponent<Animation>();
    }

    // Update is called once per frame
    void Update()
    {
        
    }
    public void OnCollisionEnter2D(Collision2D col)
    {
        if(col.gameObject.CompareTag ("Boundary"))
        {
            GameObject.Find("Player").GetComponent<Health>().health--;
            gameObject.transform.position = startPos.transform.position;
            GameObject.Find("EventSystem").GetComponent<CountDownTimer>().countDownTime = 30;
        }
        if (col.gameObject.CompareTag("BouncyObjects"))
        {
            Bounce.Play();
        }
    }
}
