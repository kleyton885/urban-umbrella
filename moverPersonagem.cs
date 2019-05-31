using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class moverPersonagem : MonoBehaviour
{
	CharacterController objetoCharControler;
	float giro = 300.0f;
	Vector3 vetorDirecao = new Vector3(0,0,0);
	float velocidade = 5.0f;
	private float pulo = 5.0f;
	
	public GameObject jogador;
	public Animation animacao;
	
    void Start()
    {
        objetoCharControler = GetComponent<CharacterController>();
		animacao = jogador.GetComponent<Animation>();
    }

    // Update is called once per frame
    void Update()
    {
        Vector3 forward = Input.GetAxis("Vertical") * transform.TransformDirection(Vector3.forward) * velocidade;
		transform.Rotate(new Vector3(0,Input.GetAxis("Horizontal") * giro *Time.deltaTime,0));
		
		objetoCharControler.Move(forward * Time.deltaTime);
		objetoCharControler.SimpleMove(Physics.gravity);
		
		if (Input.GetButton("Jump")){
			if (objetoCharControler.isGrounded == true){
				vetorDirecao.y = pulo;
				jogador.GetComponent<Animation>().Play("pulando");
			}
		}else{
			if (Input.GetButton("Horizontal") || Input.GetButton("Vertical") ){
				if (!animacao.IsPlaying("pulando")){
					jogador.GetComponent<Animation>().Play("andando");
				}
			}else{
				if (objetoCharControler.isGrounded == true){
					jogador.GetComponent<Animation>().Play("parado");
				}
			}
		}
		
		
		
		vetorDirecao.y -= 3.0f * Time.deltaTime;
		objetoCharControler.Move(vetorDirecao * Time.deltaTime);
    }
}
