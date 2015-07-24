package sifat.com.loginregistrar;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



public class Registration extends Activity {
    Activity activity = this;
    EditText et_name, et_age, et_userName, et_password;
    Context context = this;
    UserLocalStore userLocalStore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        et_name = (EditText) findViewById(R.id.et_firstname);
        et_age = (EditText)findViewById(R.id.et_age);
        et_userName = (EditText)findViewById(R.id.et_username);
        et_password = (EditText)findViewById(R.id.et_password);
//        et_age = (EditText)findViewById(R.id.et_)
         userLocalStore = new UserLocalStore(this);
    }

    public void register(View view){
//        Toast.makeText(activity, "register() fired", Toast.LENGTH_SHORT).show();
        String name = et_name.getText().toString();
        int age = Integer.parseInt(et_age.getText().toString());
        String username = et_userName.getText().toString();
        String password = et_password.getText().toString();

        User user;
        user = new User(name,age,username,password);
        userLocalStore.storeUserData(user);
    }

}
