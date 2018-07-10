package techgroup.com.slaeyplay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText userName;
    EditText passWord;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userName = (EditText)findViewById(R.id.userName);
        passWord = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.logIn);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checklogin();

            }
        });

    }
   /* // so we've created a method here called login checker to see if the password
    and username and passwords that we inputed are similar to the hardcorded value that weve inputed
     which are user and pass
    */
    public void checklogin(){
       if (userName.getText().toString().equals("user")&& passWord.getText().toString().equals("pass")){
           Intent intent = new Intent(LoginActivity.this,MainActivity.class);
            startActivity(intent);
            /*with a single if statement we are able to collect input from the user
            and then see if it matches the value of what we are looking for
            * */
       }else{
           Toast.makeText(LoginActivity.this,"invalid account",Toast.LENGTH_LONG).show();
       }
    }
}
