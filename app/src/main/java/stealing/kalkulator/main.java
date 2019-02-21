package stealing.kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;


public class main extends AppCompatActivity {
    Button plus,minus,divider,multiplication,cancel,result,zero,one,two,three,four,five,six,seven,eight,nine;
    EditText editor;
    float Valueone,Valuetwo;
    boolean div,multi,add,subb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        plus = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.minus);
        result = (Button) findViewById(R.id.result);
        divider = (Button) findViewById(R.id.divider);
        multiplication = (Button) findViewById(R.id.multiplication);
        cancel = (Button) findViewById(R.id.cancel);
        zero = (Button) findViewById(R.id.zero);
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        editor = (EditText) findViewById(R.id.editor);

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.setText(editor.getText()+"0");
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.setText(editor.getText()+"1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.setText(editor.getText()+"2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.setText(editor.getText()+"3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.setText(editor.getText()+"4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.setText(editor.getText()+"5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.setText(editor.getText()+"6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.setText(editor.getText()+"7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.setText(editor.getText()+"8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.setText(editor.getText()+"9");
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.setText(null);
            }
        });



        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editor == null) editor.setText("");
                else {
                    Valueone = Float.parseFloat(editor.getText() + "");
                    add = true;
                    editor.setText(null);

                }
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Valueone = Float.parseFloat(editor.getText() + "");
                    subb = true;
                    editor.setText(null);


            }
        });


        divider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                    Valueone = Float.parseFloat(editor.getText() + "");
                    div = true;
                    editor.setText(null);


            }
        });
        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    multi = true;
                    Valueone = Float.parseFloat(editor.getText() + "");
                    editor.setText(null);


            }
        });


        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Valuetwo = Float.parseFloat(editor.getText() + "");
                    if(add == true) {

                        editor.setText(Valueone + Valuetwo + "");
                        add=false;
                    }
                     if(subb == true)
                    {

                        editor.setText(Valueone - Valuetwo + "");
                        subb=false;
                    }
                     if(div == true)
                    {

                        editor.setText(Valueone / Valuetwo + "");
                        div=false;
                    }
                     if(multi == true)
                    {

                        editor.setText(Valueone * Valuetwo + "");
                        multi=false;
                    }


            }
        });
    }
}
