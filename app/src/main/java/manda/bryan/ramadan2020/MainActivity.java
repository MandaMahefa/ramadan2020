package manda.bryan.ramadan2020;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.View;

import androidx.core.view.GravityCompat;
import androidx.appcompat.app.ActionBarDrawerToggle;

import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.List;
import manda.bryan.ramadan2020.Entity.Article;
import manda.bryan.ramadan2020.Fixture.Fixture;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    public boolean detail1 = false;
    public boolean detail2= false;
    public int default_value;

    TextView titre_book, description_book, titre_book_second, designation_second, description_detail1,description_detail2;

    Button btn_detail1, btn_detail2;
    ScrollView srScrollView;
    Article article;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fixture fixture = new Fixture();
        if (getIntent().getStringExtra("value_id")!=null){
            default_value = Integer.parseInt(getIntent().getStringExtra("value_id"));
        }else{
            default_value = 24;
        }
        article = fixture.getOneArticle(default_value);
        titre_book = findViewById(R.id.titre_book);
        description_book = findViewById(R.id.description_book);
        titre_book_second = findViewById(R.id.titre_book_second);
        designation_second = findViewById(R.id.designation_second);
        description_detail1 = findViewById(R.id.description_detail);
        srScrollView  = findViewById(R.id.scroll_id);
        description_detail2 = findViewById(R.id.designation_second_detail);
        btn_detail1 = findViewById(R.id.detail1);
        btn_detail2 = findViewById(R.id.detail2);
        if (default_value == 19){
            srScrollView.setBackgroundColor(getResources().getColor(R.color.colorScroll));
        }else{
            srScrollView.setBackgroundColor(getResources().getColor(R.color.colorScrollWhite));
        }
        btn_detail1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                detail1 = !detail1;
                if (detail1){
                    description_detail1.setVisibility(View.VISIBLE);
                    description_detail1.setText(article.getDetail_book());
                }else {
                    description_detail1.setVisibility(View.GONE);
                }
            }
        });

        btn_detail2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                detail2 = !detail2;
                if (detail2){
                    description_detail2.setText(article.getDetail_second());
                    description_detail2.setVisibility(View.VISIBLE);
                }else {
                    description_detail2.setVisibility(View.GONE);
                }
            }
        });



        setTitle(article.getDate_book());
        titre_book.setText(article.getTitre_book());
        description_book.setText(article.getDescription_book());
        titre_book_second.setText(article.getTitre_book_second());
        designation_second.setText(article.getDesignation_second());

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab_prev = findViewById(R.id.fab_prev);
        fab_prev.setImageResource(R.drawable.ic_skip_previous_whhite_24dp);

        fab_prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent not = new Intent(MainActivity.this,MainActivity.class);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                if (default_value < 0) default_value = 30;
                default_value--;
                not.putExtra("value_id", String.valueOf(default_value));
                startActivity(not);
            }
        });

        final FloatingActionButton fab_next = findViewById(R.id.fab_next);
        fab_next.setImageResource(R.drawable.ic_skip_next_white_24dp);
        fab_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent not = new Intent(MainActivity.this,MainActivity.class);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                default_value++;
                if (default_value > 30) default_value = 1;
                not.putExtra("value_id", String.valueOf(default_value));
                startActivity(not);
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_fandraisana) {
            Intent i = new Intent(this,SommaireActivity.class);
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            this.startActivity(i);
        } else if (id == R.id.nav_pays) {
            Intent i = new Intent(this,PaysActivity.class);
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            this.startActivity(i);
        } else if (id == R.id.nav_about) {
            Intent i = new Intent(this,AboutActivity.class);
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            this.startActivity(i);
        }
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
