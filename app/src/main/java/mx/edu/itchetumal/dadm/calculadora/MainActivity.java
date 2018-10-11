package mx.edu.itchetumal.dadm.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.app.Activity;

public class MainActivity extends AppCompatActivity {


    Button btn1,btnBorrar,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnSuma,btnIgual,btnResta;
    EditText edtResul;
    String aux,aux3;
    String operador, reserva;
    String mostrar="";
    int resultado,aux2;
    boolean bandera = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //programa resta
        btnResta= findViewById(R.id.btnResta);
        btnResta.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                reserva = edtResul.getText().toString();
                operador = "-";
                edtResul.setText("");
                bandera=true;
            }
        });

        //programa suma
        btnSuma= findViewById(R.id.btnSumar);
        btnSuma.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           reserva = edtResul.getText().toString();
                                           operador = "+";
                                           edtResul.setText("");
                                           bandera=true;
                                       }
                                   }

        );
        //Programar el Click para el boton de borrar
        btnBorrar = findViewById(R.id.btnBorrar);
        btnBorrar.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             mostrar = "";
                                             edtResul.setText(mostrar);
                                             reserva = "";
                                             operador = "";
                                             bandera=true;
                                         }
                                     }

        );
        //Programa para la igual
        btnIgual= findViewById(R.id.btnIgual);
        btnIgual.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            mostrar = edtResul.getText().toString();
                                            mostrar = mostrar + "1";

                                            if(operador.equals("+")){
                                                resultado = Integer.parseInt(reserva) + Integer.parseInt (edtResul.getText().toString());
                                                edtResul.setText(String.valueOf(resultado));
                                                bandera=false;
                                            }   if(operador.equals("-")){
                                                resultado = Integer.parseInt(reserva) - Integer.parseInt(edtResul.getText().toString());
                                                edtResul.setText(String.valueOf(resultado));
                                                bandera=false;
                                            }
                                        }
                                    }


        );
        //Programa para insertar "1" a la pantalla de resultado
        edtResul =(EditText) findViewById(R.id.edtResultado);
        btn1= findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtResul.getText().toString().compareTo("0")==0 ){
                    edtResul.setText("1");
                }else if (bandera==true) {
                    mostrar = edtResul.getText().toString();
                    mostrar = mostrar + "1";
                    edtResul.setText(mostrar);
                }

            }
        });
        //Programa para insertar "2" a la pantalla de resultado
        btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        if(edtResul.getText().toString().compareTo("0")==0){
                                            edtResul.setText("2");
                                        }else if (bandera==true) {
                                            mostrar = edtResul.getText().toString();
                                            mostrar = mostrar + "2";
                                            edtResul.setText(mostrar);
                                        }

                                    }
                                }

        );
        //Programa para insertar "3" a la pantalla de resultado
        btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        if(edtResul.getText().toString().compareTo("0")==0){
                                            edtResul.setText("3");
                                        }else if (bandera==true) {
                                            mostrar = edtResul.getText().toString();
                                            mostrar = mostrar + "3";
                                            edtResul.setText(mostrar);
                                        }
                                    }
                                }

        );
        //Programa para insertar "4" a la pantalla de resultado
        btn4 = findViewById(R.id.btn4);
        btn4.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        if(edtResul.getText().toString().compareTo("0")==0){
                                            edtResul.setText("4");
                                        }else if (bandera==true) {
                                            mostrar = edtResul.getText().toString();
                                            mostrar = mostrar + "4";
                                            edtResul.setText(mostrar);
                                        }
                                    }
                                }

        );
        //Programa para insertar "5" a la pantalla de resultado
        btn5 = findViewById(R.id.btn5);
        btn5.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        if(edtResul.getText().toString().compareTo("0")==0){
                                            edtResul.setText("5");
                                        }else if (bandera==true) {
                                            mostrar = edtResul.getText().toString();
                                            mostrar = mostrar + "5";
                                            edtResul.setText(mostrar);
                                        }
                                    }
                                }

        );
        //Programa para insertar "6" a la pantalla de resultado
        btn6 = findViewById(R.id.btn6);
        btn6.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        if(edtResul.getText().toString().compareTo("0")==0){
                                            edtResul.setText("6");
                                        }else if (bandera==true) {
                                            mostrar = edtResul.getText().toString();
                                            mostrar = mostrar + "6";
                                            edtResul.setText(mostrar);
                                        }
                                    }
                                }

        );
        //Programa para insertar "7" a la pantalla de resultado
        btn7 = findViewById(R.id.btn7);
        btn7.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        if(edtResul.getText().toString().compareTo("0")==0){
                                            edtResul.setText("7");
                                        }else if (bandera==true) {
                                            mostrar = edtResul.getText().toString();
                                            mostrar = mostrar + "7";
                                            edtResul.setText(mostrar);
                                        }
                                    }
                                }

        );
        //Programa para insertar "8" a la pantalla de resultado
        btn8 = findViewById(R.id.btn8);
        btn8.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        if(edtResul.getText().toString().compareTo("0")==0){
                                            edtResul.setText("8");
                                        }else if (bandera==true) {
                                            mostrar = edtResul.getText().toString();
                                            mostrar = mostrar + "8";
                                            edtResul.setText(mostrar);
                                        }
                                    }
                                }

        );
        //Programa para insertar "9" a la pantalla de resultado
        btn9 = findViewById(R.id.btn9);
        btn9.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        if(edtResul.getText().toString().compareTo("0")==0){
                                            edtResul.setText("9");
                                        }else if (bandera==true) {
                                            mostrar = edtResul.getText().toString();
                                            mostrar = mostrar + "9";
                                            edtResul.setText(mostrar);
                                        }
                                    }
                                }

        );
        //Programa para insertar "0" a la pantalla de resultado
        btn0 = findViewById(R.id.btn0);
        OyenteClick objDetectaClic = new OyenteClick();
        btn0.setOnClickListener(objDetectaClic);
        //btn0.setOnClickListener(objDetectaClic);





    }
    //Declaración de la clase oyente
    class OyenteClick implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            if( ((Button) v) ==btn1){


            }
            if(edtResul.getText().toString().compareTo("0")==0){
                edtResul.setText("0");
            }else if (bandera==true) {
                mostrar = edtResul.getText().toString();
                mostrar = mostrar + ((Button) v);
                edtResul.setText(mostrar);
            }
        }
    }

}//main activity