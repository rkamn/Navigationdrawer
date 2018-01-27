package com.example.rakesh.navigationdrawer;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle mtoggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawerLayout=(DrawerLayout)findViewById(R.id.drawer);
        mtoggle=new ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(mtoggle);
        mtoggle.syncState();
        getSupportActionBar().getDisplayOptions();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.drawermenu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==(R.id.search)){
            Toast.makeText(this,"you have clicked for Search",Toast.LENGTH_SHORT).show();
        }else if (item.getItemId()==(R.id.admin)) {
            Toast.makeText(this, "You are on Admin page", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, Admin.class);
            startActivity(intent);
        }else if (item.getItemId()==(R.id.db)) {
            Toast.makeText(this, "You have clicked on Dashboard", Toast.LENGTH_SHORT).show();
        }else if (item.getItemId()==(R.id.setting)) {
            Toast.makeText(this, "You are on Setting", Toast.LENGTH_SHORT).show();
        }else if (item.getItemId()==(R.id.event)) {
            Toast.makeText(this, "You have clicked for Event", Toast.LENGTH_SHORT).show();
        }else if (item.getItemId()==(R.id.logout)) {
            Toast.makeText(this, "Sucessfully logout", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this,"page is under maintanance",Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
