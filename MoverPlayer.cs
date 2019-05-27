using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class MoverPlayer : MonoBehaviour
{
    private float velocidade = 1.0f;
    private float pulo = 1.0f;
    private float gravidade = 3.5f;
    private float giro = 180.0f;
    private CharacterController objetoCharControler;
    public GameObject jogador;

    void Start()
    {
        objetoCharControler = GetComponent<CharacterController>();
    }

    void Update()
    {
        Vector3 foward = Input.GetAxis("Vertical") * transform.TransformDirection(Vector3.forward);
        transform.Rotate(new Vector3(0, Input.GetAxis("Horizontal") * giro * Time.deltaTime, 0));

        if (Input.GetButton("Jump"))
        {
            jogador.GetComponent<Animation>().Play("Pulando");
        }
    }
}
