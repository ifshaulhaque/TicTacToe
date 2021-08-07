package com.example.tictactoe;

import androidx.activity.OnBackPressedDispatcher;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView p1,p2,sp1,sp2,symp1,symp2;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,reset,lastclk,end;
    int flag = 0,p1_Score = 0,p2_Score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_main);

        p1 = findViewById(R.id.p1);
        p2 = findViewById(R.id.p2);
        sp1 = findViewById(R.id.p1Score);
        sp2 = findViewById(R.id.p2Score);
        symp1 = findViewById(R.id.p1Sym);
        symp2 = findViewById(R.id.p2Sym);
        b1 = findViewById(R.id.box1);
        b2 = findViewById(R.id.box2);
        b3 = findViewById(R.id.box3);
        b4 = findViewById(R.id.box4);
        b5 = findViewById(R.id.box5);
        b6 = findViewById(R.id.box6);
        b7 = findViewById(R.id.box7);
        b8 = findViewById(R.id.box8);
        b9 = findViewById(R.id.box9);
        reset = findViewById(R.id.reset);
        end =findViewById(R.id.end);

        Bundle b = getIntent().getExtras();
        p1.setText(b.getString("p1 Name"));
        p2.setText(b.getString("p2 Name"));

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        reset.setOnClickListener(this);
        end.setOnClickListener(this);
    }

    public void check() {
        if((b1.getText()=="X" && b2.getText()=="X" && b3.getText()=="X") || (b1.getText()=="O" && b2.getText()=="O" && b3.getText()=="O")) {
            b1.setBackgroundResource(R.drawable.win_box_design);
            b2.setBackgroundResource(R.drawable.win_box_design);
            b3.setBackgroundResource(R.drawable.win_box_design);
            compreset(false);
            OnWin();
        }

        if((b4.getText()=="X" && b5.getText()=="X" && b6.getText()=="X") || (b4.getText()=="O" && b5.getText()=="O" && b6.getText()=="O")) {
            b4.setBackgroundResource(R.drawable.win_box_design);
            b5.setBackgroundResource(R.drawable.win_box_design);
            b6.setBackgroundResource(R.drawable.win_box_design);
            compreset(false);
            OnWin();
        }

        if((b7.getText()=="X" && b8.getText()=="X" && b9.getText()=="X") || (b7.getText()=="O" && b8.getText()=="O" && b9.getText()=="O")) {
            b7.setBackgroundResource(R.drawable.win_box_design);
            b8.setBackgroundResource(R.drawable.win_box_design);
            b9.setBackgroundResource(R.drawable.win_box_design);
            compreset(false);
            OnWin();
        }

        if((b1.getText()=="X" && b4.getText()=="X" && b7.getText()=="X") || (b1.getText()=="O" && b4.getText()=="O" && b7.getText()=="O")) {
            b1.setBackgroundResource(R.drawable.win_box_design);
            b4.setBackgroundResource(R.drawable.win_box_design);
            b7.setBackgroundResource(R.drawable.win_box_design);
            compreset(false);
            OnWin();
        }

        if((b2.getText()=="X" && b5.getText()=="X" && b8.getText()=="X") || (b2.getText()=="O" && b5.getText()=="O" && b8.getText()=="O")) {
            b2.setBackgroundResource(R.drawable.win_box_design);
            b5.setBackgroundResource(R.drawable.win_box_design);
            b8.setBackgroundResource(R.drawable.win_box_design);
            compreset(false);
            OnWin();
        }

        if((b3.getText()=="X" && b6.getText()=="X" && b9.getText()=="X") || (b3.getText()=="O" && b6.getText()=="O" && b9.getText()=="O")) {
            b3.setBackgroundResource(R.drawable.win_box_design);
            b6.setBackgroundResource(R.drawable.win_box_design);
            b9.setBackgroundResource(R.drawable.win_box_design);
            compreset(false);
            OnWin();
        }

        if((b1.getText()=="X" && b5.getText()=="X" && b9.getText()=="X") || (b1.getText()=="O" && b5.getText()=="O" && b9.getText()=="O")) {
            b1.setBackgroundResource(R.drawable.win_box_design);
            b5.setBackgroundResource(R.drawable.win_box_design);
            b9.setBackgroundResource(R.drawable.win_box_design);
            compreset(false);
            OnWin();
        }

        if((b3.getText()=="X" && b5.getText()=="X" && b7.getText()=="X") || (b3.getText()=="O" && b5.getText()=="O" && b7.getText()=="O")) {
            b3.setBackgroundResource(R.drawable.win_box_design);
            b5.setBackgroundResource(R.drawable.win_box_design);
            b7.setBackgroundResource(R.drawable.win_box_design);
            compreset(false);
            OnWin();
        }
    }

    public void OnWin() {
        if(symp1.getText().toString().equals(lastclk.getText().toString())) {
            p1_Score++;
            sp1.setText("Score : "+p1_Score);
        }
        if(symp2.getText().toString().equals(lastclk.getText().toString())) {
            p2_Score++;
            sp2.setText("Score : "+p2_Score);
        }
    }

    public void play(Button x) {
        lastclk = x;
        if(flag==0) {
            sp1.setTextColor(Color.parseColor("#FF9800"));
            sp1.setTextSize(14);
            p1.setTextColor(Color.parseColor("#FF9800"));
            p1.setTextSize(14);
            sp2.setTextColor(Color.parseColor("#03FB39"));
            sp2.setTextSize(20);
            p2.setTextColor(Color.parseColor("#03FB39"));
            p2.setTextSize(20);
            x.setText("X");
            flag=1;
        }
        else {
            sp2.setTextColor(Color.parseColor("#FF9800"));
            sp2.setTextSize(14);
            p2.setTextColor(Color.parseColor("#FF9800"));
            p2.setTextSize(14);
            sp1.setTextColor(Color.parseColor("#03FB39"));
            sp1.setTextSize(20);
            p1.setTextColor(Color.parseColor("#03FB39"));
            p1.setTextSize(20);
            x.setText("O");
            flag=0;
        }
        x.setEnabled(false);
        check();
    }

    public void reset(Button y,boolean z) {
        y.setEnabled(z);

        if(z==true) {
            y.setBackgroundResource(R.drawable.board_design);
            y.setText("");
        }
    }

    public void compreset(boolean w) {
        reset(b1,w);
        reset(b2,w);
        reset(b3,w);
        reset(b4,w);
        reset(b5,w);
        reset(b6,w);
        reset(b7,w);
        reset(b8,w);
        reset(b9,w);

        flag=0;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(this,StartPage.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.box1:
                play(b1);
                break;

            case R.id.box2:
                play(b2);
                break;

            case R.id.box3:
                play(b3);
                break;

            case R.id.box4:
                play(b4);
                break;

            case R.id.box5:
                play(b5);
                break;

            case R.id.box6:
                play(b6);
                break;

            case R.id.box7:
                play(b7);
                break;

            case R.id.box8:
                play(b8);
                break;

            case R.id.box9:
                play(b9);
                break;

            case R.id.reset:
                if(symp1.getText().toString().equals("X") && symp2.getText().toString().equals("O")){
                    symp1.setText("O");
                    symp2.setText("X");
                }
                else {
                    symp1.setText("X");
                    symp2.setText("O");
                }
                compreset(true);
                break;

            case R.id.end:
                AlertDialog.Builder alert = new AlertDialog.Builder(this);
                alert.setTitle("Alert");
                alert.setMessage(p1.getText().toString()+" "+sp1.getText().toString()+"\n"+p2.getText().toString()+" "+sp2.getText().toString()+"\n\n"+"Are you sure you want to exit?");
                alert.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent inte = new Intent(MainActivity.this,StartPage.class);
                        startActivity(inte);
                    }
                });
                alert.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                alert.show();
        }
    }
}
