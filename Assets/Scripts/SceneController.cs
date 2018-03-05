using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class SceneController : MonoBehaviour
{

    // Use this for initialization
    void Start()
    {

    }

    // Update is called once per frame
    void Update()
    {
        AndroidJavaObject jo = new AndroidJavaObject("daybysay.com.mylog.MyLog");
        jo.Call("output", "unity test dayo");
    }
}
