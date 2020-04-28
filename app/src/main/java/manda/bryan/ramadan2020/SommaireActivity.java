package manda.bryan.ramadan2020;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;

public class SommaireActivity extends AppCompatActivity {

    TextView textView02, textView03, textView04, textView05, textView06, textView07, textView08, textView09, textView10, textView11 ;
    TextView textView12, textView13, textView14, textView15, textView16, textView17, textView18, textView19, textView20, textView21 ;
    TextView textView22, textView23, textView24, textView25, textView26, textView27, textView28, textView29, textView30;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sommaire);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setBackgroundColor(Color.parseColor("#3b5998"));
        fab.setImageResource(R.drawable.ic_share_black_24dp);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/onjambavaka"));
                startActivity(intent);
            }
        });

        textView02 = findViewById(R.id.numero02);
        textView03 = findViewById(R.id.numero03);
        textView04 = findViewById(R.id.numero04);
        textView05 = findViewById(R.id.numero05);
        textView06 = findViewById(R.id.numero06);
        textView07 = findViewById(R.id.numero07);
        textView08 = findViewById(R.id.numero08);
        textView09 = findViewById(R.id.numero09);
        textView10 = findViewById(R.id.numero10);

        textView11 = findViewById(R.id.numero11);
        textView12 = findViewById(R.id.numero12);
        textView13 = findViewById(R.id.numero13);
        textView14 = findViewById(R.id.numero14);
        textView15 = findViewById(R.id.numero15);
        textView16 = findViewById(R.id.numero16);
        textView17 = findViewById(R.id.numero17);
        textView18 = findViewById(R.id.numero18);
        textView19 = findViewById(R.id.numero19);
        textView20 = findViewById(R.id.numero20);

        textView21 = findViewById(R.id.numero21);
        textView22 = findViewById(R.id.numero22);
        textView23 = findViewById(R.id.numero23);
        textView24 = findViewById(R.id.numero24);
        textView25 = findViewById(R.id.numero25);

        textView27 = findViewById(R.id.numero27);
        textView28 = findViewById(R.id.numero28);
        textView29 = findViewById(R.id.numero29);
        textView30 = findViewById(R.id.numero30);

        textView02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent not = new Intent(SommaireActivity.this,MainActivity.class);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                not.putExtra("value_id", String.valueOf(25));
                startActivity(not);
            }
        });

        textView03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent not = new Intent(SommaireActivity.this,MainActivity.class);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                not.putExtra("value_id", String.valueOf(26));
                startActivity(not);
            }
        });

        textView04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent not = new Intent(SommaireActivity.this,MainActivity.class);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                not.putExtra("value_id", String.valueOf(27));
                startActivity(not);
            }
        });

        textView05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent not = new Intent(SommaireActivity.this,MainActivity.class);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                not.putExtra("value_id", String.valueOf(28));
                startActivity(not);
            }
        });

        textView06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent not = new Intent(SommaireActivity.this,MainActivity.class);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                not.putExtra("value_id", String.valueOf(29));
                startActivity(not);
            }
        });
        textView07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent not = new Intent(SommaireActivity.this,MainActivity.class);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                not.putExtra("value_id", String.valueOf(30));
                startActivity(not);
            }
        });
        textView08.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent not = new Intent(SommaireActivity.this,MainActivity.class);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                not.putExtra("value_id", String.valueOf(1));
                startActivity(not);
            }
        });

        textView09.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent not = new Intent(SommaireActivity.this,MainActivity.class);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                not.putExtra("value_id", String.valueOf(2));
                startActivity(not);
            }
        });

        textView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent not = new Intent(SommaireActivity.this,MainActivity.class);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                not.putExtra("value_id", String.valueOf(3));
                startActivity(not);
            }
        });

        textView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent not = new Intent(SommaireActivity.this,MainActivity.class);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                not.putExtra("value_id", String.valueOf(4));
                startActivity(not);
            }
        });

        textView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent not = new Intent(SommaireActivity.this,MainActivity.class);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                not.putExtra("value_id", String.valueOf(5));
                startActivity(not);
            }
        });

        textView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent not = new Intent(SommaireActivity.this,MainActivity.class);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                not.putExtra("value_id", String.valueOf(6));
                startActivity(not);
            }
        });

        textView14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent not = new Intent(SommaireActivity.this,MainActivity.class);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                not.putExtra("value_id", String.valueOf(7));
                startActivity(not);
            }
        });

        textView15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent not = new Intent(SommaireActivity.this,MainActivity.class);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                not.putExtra("value_id", String.valueOf(8));
                startActivity(not);
            }
        });

        textView16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent not = new Intent(SommaireActivity.this,MainActivity.class);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                not.putExtra("value_id", String.valueOf(9));
                startActivity(not);
            }
        });

        textView17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent not = new Intent(SommaireActivity.this,MainActivity.class);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                not.putExtra("value_id", String.valueOf(10));
                startActivity(not);
            }
        });

        textView18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent not = new Intent(SommaireActivity.this,MainActivity.class);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                not.putExtra("value_id", String.valueOf(11));
                startActivity(not);
            }
        });

        textView19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent not = new Intent(SommaireActivity.this,MainActivity.class);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                not.putExtra("value_id", String.valueOf(12));
                startActivity(not);
            }
        });

        textView20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent not = new Intent(SommaireActivity.this,MainActivity.class);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                not.putExtra("value_id", String.valueOf(13));
                startActivity(not);
            }
        });

        textView21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent not = new Intent(SommaireActivity.this,MainActivity.class);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                not.putExtra("value_id", String.valueOf(14));
                startActivity(not);
            }
        });
        textView22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent not = new Intent(SommaireActivity.this,MainActivity.class);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                not.putExtra("value_id", String.valueOf(15));
                startActivity(not);
            }
        });
        textView23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent not = new Intent(SommaireActivity.this,MainActivity.class);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                not.putExtra("value_id", String.valueOf(16));
                startActivity(not);
            }
        });

        textView24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent not = new Intent(SommaireActivity.this,MainActivity.class);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                not.putExtra("value_id", String.valueOf(17));
                startActivity(not);
            }
        });

        textView25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent not = new Intent(SommaireActivity.this,MainActivity.class);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                not.putExtra("value_id", String.valueOf(18));
                startActivity(not);
            }
        });

        textView27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent not = new Intent(SommaireActivity.this,MainActivity.class);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                not.putExtra("value_id", String.valueOf(20));
                startActivity(not);
            }
        });

        textView28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent not = new Intent(SommaireActivity.this,MainActivity.class);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                not.putExtra("value_id", String.valueOf(21));
                startActivity(not);
            }
        });

        textView28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent not = new Intent(SommaireActivity.this,MainActivity.class);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                not.putExtra("value_id", String.valueOf(22));
                startActivity(not);
            }
        });

        textView29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent not = new Intent(SommaireActivity.this,MainActivity.class);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                not.putExtra("value_id", String.valueOf(23));
                startActivity(not);
            }
        });
    }

}
