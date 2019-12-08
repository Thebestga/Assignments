package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    EditText user_name;
    EditText email_address;
    EditText pass;
    EditText phone_number;
    CheckBox check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        user_name = findViewById(R.id.editText);
        pass = findViewById(R.id.editText2);
        email_address = findViewById(R.id.editText3);
        phone_number = findViewById(R.id.editText4);
        check = findViewById(R.id.checkBox);
        check.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(check.isChecked())
                    check.setTextColor(Color.BLACK);

            }
        });
    }


    public void onClickSubmitButton(View v){
//
        String name = user_name.getText().toString();
        String pass1 = pass.getText(). toString();
        String email = email_address.getText(). toString();
        String phone = phone_number.getText(). toString();
        boolean error = false;
        if(name != null && name.equalsIgnoreCase(""))
        {
            user_name.setError("Please Enter Valid Name");
            error =true;
        }
        if(pass1 != null && pass1.equalsIgnoreCase(""))
        {
            pass.setError("Enter Valid Pssword");
            error =true;
        }
        if(email != null && email.equalsIgnoreCase(""))
        {
            email_address.setError("Enter Valid Email Address");
            error =true;
        }
       // if (email !=("@") && email !=(".com"))
        //{
          //  emailaddress.setError("Enter @ and .com");
           // error = true;
        //}
        if(phone != null && phone.equalsIgnoreCase(""))
        {
            phone_number.setError("Enter Valid Phone Number");
            error =true;
        }
        if(!check.isChecked()){
            check.setTextColor(Color.RED);
            error = true;
        }

        if(!error){
            Intent intend = new Intent(this, Main3Activity.class);
            startActivity(intend);
        }



    }

}
