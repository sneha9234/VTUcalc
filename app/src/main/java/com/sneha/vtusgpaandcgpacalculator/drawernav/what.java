package com.sneha.vtusgpaandcgpacalculator.drawernav;

import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.DividerItemDecoration;

import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.navigation.NavigationView;
import com.sneha.vtusgpaandcgpacalculator.R;
import com.sneha.vtusgpaandcgpacalculator.drawernav.bottom_navi.savedFragment;
import com.sneha.vtusgpaandcgpacalculator.notif;


public class what extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;

    public FragmentTransaction fragmentTransaction;
    NavigationView navigationView;

    public Fragment fragment = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_what);


        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.open, R.string.close);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();

        fragmentTransaction = getSupportFragmentManager().beginTransaction();


        fragmentTransaction.add(R.id.main_content, new mainfrag());

        fragmentTransaction.commit();

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        navigationView = (NavigationView) findViewById(R.id.nav_view);
        NavigationMenuView navMenuView = (NavigationMenuView) navigationView.getChildAt(0);
        navMenuView.addItemDecoration(new DividerItemDecoration(what.this, DividerItemDecoration.VERTICAL));

        navigationView.getMenu().getItem(0).setChecked(true);
        navigationView.getMenu().getItem(1).setChecked(false);
        navigationView.getMenu().getItem(2).setChecked(false);
        navigationView.getMenu().getItem(3).setChecked(false);
        navigationView.getMenu().getItem(4).setChecked(false);
        navigationView.setItemIconTintList(null);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {


            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.nav_main:
                        fragment = new mainfrag();
                        navigationView.getMenu().getItem(1).setChecked(false);
                        navigationView.getMenu().getItem(2).setChecked(false);
                        navigationView.getMenu().getItem(3).setChecked(false);
                        navigationView.getMenu().getItem(4).setChecked(false);
                        navigationView.setCheckedItem(R.id.nav_main);
                        mDrawerLayout.closeDrawers();
                        fragmentTransaction = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.main_content, new mainfrag());
                        fragmentTransaction.commit();
                        getSupportActionBar().setTitle(("SGPA and CGPA Calculator"));
                        item.setChecked(true);
                        break;
                    case R.id.nav_savedcal:
                        fragment = new savedFragment();
                        navigationView.getMenu().getItem(0).setChecked(false);
                        navigationView.getMenu().getItem(2).setChecked(false);
                        navigationView.getMenu().getItem(3).setChecked(false);
                        navigationView.getMenu().getItem(4).setChecked(false);
                        navigationView.setCheckedItem(R.id.nav_savedcal);
                        mDrawerLayout.closeDrawers();
                        fragmentTransaction = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.main_content, new savedFragment());
                        fragmentTransaction.commit();
                        getSupportActionBar().setTitle(("Saved Calculations"));
                        item.setChecked(true);
                        break;
                    case R.id.nav_upldoc:
                        fragment = new uploadedfragment();
                        navigationView.getMenu().getItem(0).setChecked(false);
                        navigationView.getMenu().getItem(1).setChecked(false);
                        navigationView.getMenu().getItem(3).setChecked(false);
                        navigationView.getMenu().getItem(4).setChecked(false);
                        navigationView.setCheckedItem(R.id.nav_upldoc);
                        mDrawerLayout.closeDrawers();
                        fragmentTransaction = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.main_content, new uploadedfragment());
                        fragmentTransaction.commit();
                        getSupportActionBar().setTitle(("Uploaded documents"));
                        item.setChecked(true);
                        break;
                    case R.id.nav_notif:
                        fragment = new notif();
                        navigationView.getMenu().getItem(0).setChecked(false);
                        navigationView.getMenu().getItem(1).setChecked(false);
                        navigationView.getMenu().getItem(2).setChecked(false);
                        navigationView.getMenu().getItem(4).setChecked(false);
                        navigationView.setCheckedItem(R.id.nav_notif);
                        mDrawerLayout.closeDrawers();
                        fragmentTransaction = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.main_content, new notif());
                        fragmentTransaction.commit();
                        getSupportActionBar().setTitle(("Notifications"));
                        item.setChecked(true);
                        break;
                    case R.id.nav_site:
                        fragment = new resultsite();
                        navigationView.getMenu().getItem(0).setChecked(false);
                        navigationView.getMenu().getItem(1).setChecked(false);
                        navigationView.getMenu().getItem(2).setChecked(false);
                        navigationView.getMenu().getItem(3).setChecked(false);
                        navigationView.setCheckedItem(R.id.nav_site);
                        mDrawerLayout.closeDrawers();
                        fragmentTransaction = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.main_content, new resultsite());
                        fragmentTransaction.commit();
                        getSupportActionBar().setTitle(("VTU Results"));
                        item.setChecked(true);
                        break;
                }
                if (fragment != null) {
                    FragmentManager manager = getSupportFragmentManager();
                    manager.beginTransaction().replace(R.id.main_content, fragment, fragment.getTag()).commit();
                }
                return false;
            }
        });
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (mToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void showmain() {
        fragment = new mainfrag();
        if (fragment != null) {
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.main_content, fragment, fragment.getTag()).commit();
            navigationView.getMenu().getItem(0).setChecked(true);
            navigationView.getMenu().getItem(1).setChecked(false);
            navigationView.getMenu().getItem(2).setChecked(false);
            navigationView.getMenu().getItem(3).setChecked(false);
            navigationView.getMenu().getItem(4).setChecked(false);
            getSupportActionBar().setTitle("SGPA and CGPA Calculator");
        }
    }

    boolean doubleBackToExitPressedOnce = false;

    @Override
    public void onBackPressed() {
        if (this.mDrawerLayout.isDrawerOpen(GravityCompat.START)) {
            this.mDrawerLayout.closeDrawer(GravityCompat.START);
        } else if (fragment instanceof mainfrag) {
            mDrawerLayout.closeDrawers();
            if (doubleBackToExitPressedOnce) {
                super.onBackPressed();
                return;
            }

            this.doubleBackToExitPressedOnce = true;
            Toast.makeText(this, "Press BACK again to exit", Toast.LENGTH_SHORT).show();

            new Handler().postDelayed(new Runnable() {

                @Override
                public void run() {
                    doubleBackToExitPressedOnce = false;
                }
            }, 2000);
        } else {
            showmain();

        }
    }

}


