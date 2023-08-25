package com.example.musicccc;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
public class MainActivity extends AppCompatActivity  {
    ImageView playy1,playy2,playy3,playy4,playy5,playy6,playy7,playy8,playy9,playy10,playy11,playy12,playy13,playy14,playy15,playy32,playy33;
    ImageView playy16,playy17,playy18,playy19,playy20,playy21,playy22,playy23,playy24,playy25,playy26,playy27,playy28,playy29,playy30,playy31;
    ImageView playy34,playy35,playy36,playy37,playy38,playy39,playy40,playy41,playy42,playy43,playy44,playy45,playy46,playy47,playy48,playy49;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        playy1=findViewById(R.id.play1);
        playy2=findViewById(R.id.play2);
        playy3=findViewById(R.id.play3);
        playy4=findViewById(R.id.play4);
        playy5=findViewById(R.id.play5);
        playy6=findViewById(R.id.play7);
        playy7=findViewById(R.id.play8);
        playy8=findViewById(R.id.play9);
        playy9=findViewById(R.id.play10);
        playy10=findViewById(R.id.play11);
        playy11=findViewById(R.id.play12);
        playy12=findViewById(R.id.play13);
        playy13=findViewById(R.id.play14);
        playy14=findViewById(R.id.play15);
        playy15=findViewById(R.id.play16);
        playy16=findViewById(R.id.play17);
        playy17=findViewById(R.id.play18);
        playy18=findViewById(R.id.play19);
        playy19=findViewById(R.id.play20);
        playy20=findViewById(R.id.play21);
        playy21=findViewById(R.id.play22);
        playy22=findViewById(R.id.play23);
        playy23=findViewById(R.id.play24);
        playy24=findViewById(R.id.play25);
        playy25=findViewById(R.id.play26);
        playy26=findViewById(R.id.play27);
        playy27=findViewById(R.id.play28);
        playy28=findViewById(R.id.play29);
        playy29=findViewById(R.id.play30);
        playy30=findViewById(R.id.play31);
        playy31=findViewById(R.id.play32);
        playy32=findViewById(R.id.play33);
        playy33=findViewById(R.id.play34);
        playy34=findViewById(R.id.play35);
        playy35=findViewById(R.id.play36);
        playy36=findViewById(R.id.play37);
        playy37=findViewById(R.id.play38);
        playy38=findViewById(R.id.play39);
        playy39=findViewById(R.id.play40);
        playy40=findViewById(R.id.play41);
        playy41=findViewById(R.id.play42);
        playy42=findViewById(R.id.play43);
        playy43=findViewById(R.id.play44);
        playy44=findViewById(R.id.play45);
        playy45=findViewById(R.id.play46);
        playy46=findViewById(R.id.play47);
        playy47=findViewById(R.id.play48);
        playy48=findViewById(R.id.play49);
        playy49=findViewById(R.id.play50);

        playy1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.equals(playy1))
                {
                    Intent it;
                    it = new Intent (MainActivity.this,PlayerActivity.class);
                    it.putExtra("currentIndex",0);
                    startActivity(it);

                }
            }
        });
        playy2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.equals(playy2))
                {
                    Intent it;
                    it = new Intent (MainActivity.this,PlayerActivity.class);
                    it.putExtra("currentIndex",1);
                    startActivity(it);

                }
            }
        });
        playy3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.equals(playy3))
                {
                    Intent it;
                    it = new Intent (MainActivity.this,PlayerActivity.class);
                    it.putExtra("currentIndex",2);
                    startActivity(it);

                }
            }
        });
        playy4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.equals(playy4))
                {
                    Intent it;
                    it = new Intent (MainActivity.this,PlayerActivity.class);
                    it.putExtra("currentIndex",3);
                    startActivity(it);

                }
            }
        });
        playy5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.equals(playy5))
                {
                    Intent it;
                    it = new Intent (MainActivity.this,PlayerActivity.class);
                    it.putExtra("currentIndex",4);
                    startActivity(it);

                }
            }
        });
        playy6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.equals(playy6))
                {
                    Intent it;
                    it = new Intent (MainActivity.this,PlayerActivity.class);
                    it.putExtra("currentIndex",5);
                    startActivity(it);

                }
            }
        });
        playy7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.equals(playy7))
                {
                    Intent it;
                    it = new Intent (MainActivity.this,PlayerActivity.class);
                    it.putExtra("currentIndex",6);
                    startActivity(it);

                }
            }
        });
        playy8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.equals(playy8))
                {
                    Intent it;
                    it = new Intent (MainActivity.this,PlayerActivity.class);
                    it.putExtra("currentIndex",7);
                    startActivity(it);

                }
            }
        });
        playy9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.equals(playy9))
                {
                    Intent it;
                    it = new Intent (MainActivity.this,PlayerActivity.class);
                    it.putExtra("currentIndex",8);
                    startActivity(it);

                }
            }
        });
        playy10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.equals(playy10))
                {
                    Intent it;
                    it = new Intent (MainActivity.this,PlayerActivity.class);
                    it.putExtra("currentIndex",9);
                    startActivity(it);

                }
            }
        });
        playy11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.equals(playy11))
                {
                    Intent it;
                    it = new Intent (MainActivity.this,PlayerActivity.class);
                    it.putExtra("currentIndex",10);
                    startActivity(it);

                }
            }
        });
        playy12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.equals(playy12))
                {
                    Intent it;
                    it = new Intent (MainActivity.this,PlayerActivity.class);
                    it.putExtra("currentIndex",11);
                    startActivity(it);

                }
            }
        });
        playy13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.equals(playy13))
                {
                    Intent it;
                    it = new Intent (MainActivity.this,PlayerActivity.class);
                    it.putExtra("currentIndex",12);
                    startActivity(it);

                }
            }
        });
        playy14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.equals(playy14))
                {
                    Intent it;
                    it = new Intent (MainActivity.this,PlayerActivity.class);
                    it.putExtra("currentIndex",13);
                    startActivity(it);

                }
            }
        });
        playy15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.equals(playy15))
                {
                    Intent it;
                    it = new Intent (MainActivity.this,PlayerActivity.class);
                    it.putExtra("currentIndex",14);
                    startActivity(it);

                }
            }
        });
        playy16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.equals(playy16))
                {
                    Intent it;
                    it = new Intent (MainActivity.this,PlayerActivity.class);
                    it.putExtra("currentIndex",15);
                    startActivity(it);

                }
            }
        });
        playy17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.equals(playy17))
                {
                    Intent it;
                    it = new Intent (MainActivity.this,PlayerActivity.class);
                    it.putExtra("currentIndex",16);
                    startActivity(it);

                }
            }
        });
        playy18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.equals(playy18))
                {
                    Intent it;
                    it = new Intent (MainActivity.this,PlayerActivity.class);
                    it.putExtra("currentIndex",17);
                    startActivity(it);

                }
            }
        });
        playy19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.equals(playy19))
                {
                    Intent it;
                    it = new Intent (MainActivity.this,PlayerActivity.class);
                    it.putExtra("currentIndex",18);
                    startActivity(it);

                }
            }
        });
        playy20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.equals(playy20))
                {
                    Intent it;
                    it = new Intent (MainActivity.this,PlayerActivity.class);
                    it.putExtra("currentIndex",19);
                    startActivity(it);

                }
            }
        });
        playy21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.equals(playy21))
                {
                    Intent it;
                    it = new Intent (MainActivity.this,PlayerActivity.class);
                    it.putExtra("currentIndex",20);
                    startActivity(it);

                }
            }
        });
        playy22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.equals(playy22))
                {
                    Intent it;
                    it = new Intent (MainActivity.this,PlayerActivity.class);
                    it.putExtra("currentIndex",21);
                    startActivity(it);

                }
            }
        });
        playy23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.equals(playy23))
                {
                    Intent it;
                    it = new Intent (MainActivity.this,PlayerActivity.class);
                    it.putExtra("currentIndex",22);
                    startActivity(it);

                }
            }
        });
        playy24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.equals(playy24))
                {
                    Intent it;
                    it = new Intent (MainActivity.this,PlayerActivity.class);
                    it.putExtra("currentIndex",23);
                    startActivity(it);

                }
            }
        });
        playy25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.equals(playy25))
                {
                    Intent it;
                    it = new Intent (MainActivity.this,PlayerActivity.class);
                    it.putExtra("currentIndex",24);
                    startActivity(it);

                }
            }
        });
        playy26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.equals(playy26))
                {
                    Intent it;
                    it = new Intent (MainActivity.this,PlayerActivity.class);
                    it.putExtra("currentIndex",25);
                    startActivity(it);

                }
            }
        });
        playy27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.equals(playy27))
                {
                    Intent it;
                    it = new Intent (MainActivity.this,PlayerActivity.class);
                    it.putExtra("currentIndex",26);
                    startActivity(it);

                }
            }
        });
        playy28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.equals(playy28))
                {
                    Intent it;
                    it = new Intent (MainActivity.this,PlayerActivity.class);
                    it.putExtra("currentIndex",27);
                    startActivity(it);

                }
            }
        });
        playy29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.equals(playy29))
                {
                    Intent it;
                    it = new Intent (MainActivity.this,PlayerActivity.class);
                    it.putExtra("currentIndex",28);
                    startActivity(it);

                }
            }
        });
        playy30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.equals(playy30))
                {
                    Intent it;
                    it = new Intent (MainActivity.this,PlayerActivity.class);
                    it.putExtra("currentIndex",29);
                    startActivity(it);

                }
            }
        });
        playy31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.equals(playy31))
                {
                    Intent it;
                    it = new Intent (MainActivity.this,PlayerActivity.class);
                    it.putExtra("currentIndex",30);
                    startActivity(it);

                }
            }
        });
        playy32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.equals(playy32))
                {
                    Intent it;
                    it = new Intent (MainActivity.this,PlayerActivity.class);
                    it.putExtra("currentIndex",31);
                    startActivity(it);

                }
            }
        });
        playy33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.equals(playy33))
                {
                    Intent it;
                    it = new Intent (MainActivity.this,PlayerActivity.class);
                    it.putExtra("currentIndex",32);
                    startActivity(it);

                }
            }
        });
        playy34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.equals(playy34))
                {
                    Intent it;
                    it = new Intent (MainActivity.this,PlayerActivity.class);
                    it.putExtra("currentIndex",33);
                    startActivity(it);

                }
            }
        });
        playy35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.equals(playy35))
                {
                    Intent it;
                    it = new Intent (MainActivity.this,PlayerActivity.class);
                    it.putExtra("currentIndex",34);
                    startActivity(it);

                }
            }
        });
        playy36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.equals(playy36))
                {
                    Intent it;
                    it = new Intent (MainActivity.this,PlayerActivity.class);
                    it.putExtra("currentIndex",35);
                    startActivity(it);

                }
            }
        });
        playy37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.equals(playy37))
                {
                    Intent it;
                    it = new Intent (MainActivity.this,PlayerActivity.class);
                    it.putExtra("currentIndex",36);
                    startActivity(it);

                }
            }
        });
        playy38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.equals(playy38))
                {
                    Intent it;
                    it = new Intent (MainActivity.this,PlayerActivity.class);
                    it.putExtra("currentIndex",37);
                    startActivity(it);

                }
            }
        });
        playy39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.equals(playy39))
                {
                    Intent it;
                    it = new Intent (MainActivity.this,PlayerActivity.class);
                    it.putExtra("currentIndex",38);
                    startActivity(it);

                }
            }
        });
        playy40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.equals(playy40))
                {
                    Intent it;
                    it = new Intent (MainActivity.this,PlayerActivity.class);
                    it.putExtra("currentIndex",39);
                    startActivity(it);

                }
            }
        });
        playy41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.equals(playy41))
                {
                    Intent it;
                    it = new Intent (MainActivity.this,PlayerActivity.class);
                    it.putExtra("currentIndex",40);
                    startActivity(it);

                }
            }
        });
        playy42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.equals(playy42))
                {
                    Intent it;
                    it = new Intent (MainActivity.this,PlayerActivity.class);
                    it.putExtra("currentIndex",41);
                    startActivity(it);

                }
            }
        });
        playy43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.equals(playy43))
                {
                    Intent it;
                    it = new Intent (MainActivity.this,PlayerActivity.class);
                    it.putExtra("currentIndex",42);
                    startActivity(it);

                }
            }
        });
        playy44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.equals(playy44))
                {
                    Intent it;
                    it = new Intent (MainActivity.this,PlayerActivity.class);
                    it.putExtra("currentIndex",43);
                    startActivity(it);

                }
            }
        });
        playy45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.equals(playy45))
                {
                    Intent it;
                    it = new Intent (MainActivity.this,PlayerActivity.class);
                    it.putExtra("currentIndex",44);
                    startActivity(it);

                }
            }
        });
        playy46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.equals(playy46))
                {
                    Intent it;
                    it = new Intent (MainActivity.this,PlayerActivity.class);
                    it.putExtra("currentIndex",45);
                    startActivity(it);

                }
            }
        });
        playy47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.equals(playy47))
                {
                    Intent it;
                    it = new Intent (MainActivity.this,PlayerActivity.class);
                    it.putExtra("currentIndex",46);
                    startActivity(it);

                }
            }
        });
        playy48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.equals(playy48))
                {
                    Intent it;
                    it = new Intent (MainActivity.this,PlayerActivity.class);
                    it.putExtra("currentIndex",47);
                    startActivity(it);

                }
            }
        });
        playy49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.equals(playy49))
                {
                    Intent it;
                    it = new Intent (MainActivity.this,PlayerActivity.class);
                    it.putExtra("currentIndex",48);
                    startActivity(it);
                }
            }
        });
    }
}

