package sifat.com.loginregistrar;

import android.app.ProgressDialog;
import android.content.Context;

/**
 * Created by Sifat on 7/24/2015.
 */
public class ServerRequests {
    ProgressDialog progressDialog;
    public static final int CONNECTION_TIMEOUT = 1000*15;
    public static final String SERVER_ADDRESS = "127.0.0.1";

    public ServerRequests(Context context){
        progressDialog = new ProgressDialog(context);
        progressDialog.setCancelable(false);
        progressDialog.setTitle("Processing!");
        progressDialog.setMessage("Please wait...");
    }

    public void storeUserDataInBackground(){

    }

    public void fetchUserDataInBackground(){

    }

}
