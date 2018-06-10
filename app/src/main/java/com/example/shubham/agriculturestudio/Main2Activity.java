

package com.example.shubham.agriculturestudio;
import com.hypertrack.lib.HyperTrack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        HyperTrack.initialize(this, "pk_4873640763c47c15660a3c66ab78fce71ab2400a ");

    }
}
