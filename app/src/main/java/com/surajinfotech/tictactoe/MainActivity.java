package com.surajinfotech.tictactoe;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView button1, button2, button3, button4, button5, button6, button7, button8, button9;

    private String startGame = "X";
    int b1 = 5, b2 = 5, b3 = 5, b4 = 5, b5 = 5, b6 = 5, b7 = 5, b8 = 5, b9 =5, xCount = 0, oCount = 0, i = 0;
    private TextView scoreX, scoreO;

    private Button reset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.buttonImage1);
        button2 = findViewById(R.id.buttonImage2);
        button3 = findViewById(R.id.buttonImage3);
        button4 = findViewById(R.id.buttonImage4);
        button5 = findViewById(R.id.buttonImage5);
        button6 = findViewById(R.id.buttonImage6);
        button7 = findViewById(R.id.buttonImage7);
        button8 = findViewById(R.id.buttonImage8);
        button9 = findViewById(R.id.buttonImage9);

        scoreX = findViewById(R.id.ScoreX);
        scoreO = findViewById(R.id.ScoreO);

        reset = findViewById(R.id.Reset);

//        OnLick Listener for Reset Button
        reset.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                button1.setImageDrawable(null);
                button2.setImageDrawable(null);
                button3.setImageDrawable(null);
                button4.setImageDrawable(null);
                button5.setImageDrawable(null);
                button6.setImageDrawable(null);
                button7.setImageDrawable(null);
                button8.setImageDrawable(null);
                button9.setImageDrawable(null);
                //call the reset value
                resetValues();

//                resetting value to 0
                xCount = 0;
                oCount = 0;
//                resetting value for score
                scoreX.setText("Score X :- " + String.valueOf(xCount));
                scoreO.setText("Score O :- " + String.valueOf(oCount));
            }
        });

//        Code for Button1
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Check if the button already has an image
                if (button1.getDrawable() == null) {
                    // check what variables contain on start game
                    if (startGame.equals("X")) {
                        button1.setImageResource(R.drawable.cross);
                        b1 = 1;
                        i++;
                    } else {
                        button1.setImageResource(R.drawable.circle);
                        b1 = 0;
                        i++;
                    }

                    choosePlayer();
                    // telling function who is winning
                    winningGame();
                }
            }
        });

        //        Code for Button2
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Check if the button already has an image
                if (button2.getDrawable() == null) {
                    // check what variables contain on start game
                    if (startGame.equals("X")) {
                        button2.setImageResource(R.drawable.cross);
                        b2 = 1;
                        i++;
                    } else {
                        button2.setImageResource(R.drawable.circle);
                        b2 = 0;
                        i++;
                    }

                    choosePlayer();
                    // telling function who is winning
                    winningGame();
                }
            }
        });

        //        Code for Button3
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Check if the button already has an image
                if (button3.getDrawable() == null) {
                    // check what variables contain on start game
                    if (startGame.equals("X")) {
                        button3.setImageResource(R.drawable.cross);
                        b3 = 1;
                        i++;
                    } else {
                        button3.setImageResource(R.drawable.circle);
                        b3 = 0;
                        i++;
                    }

                    choosePlayer();
                    // telling function who is winning
                    winningGame();
                }
            }
        });

        //        Code for Button4
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Check if the button already has an image
                if (button4.getDrawable() == null) {
                    // check what variables contain on start game
                    if (startGame.equals("X")) {
                        button4.setImageResource(R.drawable.cross);
                        b4 = 1;
                        i++;
                    } else {
                        button4.setImageResource(R.drawable.circle);
                        b4 = 0;
                        i++;
                    }

                    choosePlayer();
                    // telling function who is winning
                    winningGame();
                }
            }
        });

        //        Code for Button5
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Check if the button already has an image
                if (button5.getDrawable() == null) {
                    // check what variables contain on start game
                    if (startGame.equals("X")) {
                        button5.setImageResource(R.drawable.cross);
                        b5 = 1;
                        i++;
                    } else {
                        button5.setImageResource(R.drawable.circle);
                        b5 = 0;
                        i++;
                    }

                    choosePlayer();
                    // telling function who is winning
                    winningGame();
                }
            }
        });

        //        Code for Button6
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Check if the button already has an image
                if (button6.getDrawable() == null) {
                    // check what variables contain on start game
                    if (startGame.equals("X")) {
                        button6.setImageResource(R.drawable.cross);
                        b6 = 1;
                        i++;
                    } else {
                        button6.setImageResource(R.drawable.circle);
                        b6 = 0;
                        i++;
                    }

                    choosePlayer();
                    // telling function who is winning
                    winningGame();
                }
            }
        });

        //        Code for Button7
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Check if the button already has an image
                if (button7.getDrawable() == null) {
                    // check what variables contain on start game
                    if (startGame.equals("X")) {
                        button7.setImageResource(R.drawable.cross);
                        b7 = 1;
                        i++;
                    } else {
                        button7.setImageResource(R.drawable.circle);
                        b7 = 0;
                        i++;
                    }

                    choosePlayer();
                    // telling function who is winning
                    winningGame();
                }
            }
        });

        //        Code for Button8
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Check if the button already has an image
                if (button8.getDrawable() == null) {
                    // check what variables contain on start game
                    if (startGame.equals("X")) {
                        button8.setImageResource(R.drawable.cross);
                        b8 = 1;
                        i++;
                    } else {
                        button8.setImageResource(R.drawable.circle);
                        b8 = 0;
                        i++;
                    }

                    choosePlayer();
                    // telling function who is winning
                    winningGame();
                }
            }
        });

        //        Code for Button9
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Check if the button already has an image
                if (button9.getDrawable() == null) {
                    // check what variables contain on start game
                    if (startGame.equals("X")) {
                        button9.setImageResource(R.drawable.cross);
                        b9 = 1;
                        i++;
                    } else {
                        button9.setImageResource(R.drawable.circle);
                        b9 = 0;
                        i++;
                    }

                    choosePlayer();
                    // telling function who is winning
                    winningGame();
                }
            }
        });


    }
// 8 possible cases to winning X and also 8 possible cases to winning O
//    creating for winning X function
    private void winningGame()
    {
//        if for 1st condition button 1, 2 and 3 cases
        if((b1 == 1) && (b2 == 1) && (b3 == 1))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player X Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
//                    reset all the code
                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);
                    //call the reset value
                    resetValues();

                }
            });

//            show the alert dialog box
            AlertDialog alertDialog = builder.create();
            alertDialog.show();

//            now incrementing score board of the user
            xCount++;
//            to show the value of score X
            scoreX.setText("Score X :- " + String.valueOf(xCount));
        }

//        else if button for 2nd condition 4, 5 and 6 cases
        else if((b4 == 1) && (b5 == 1) && (b6 == 1))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player X Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
//                    reset all the code
                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);
                    //call the reset value
                    resetValues();

                }
            });

//            show the alert dialog box
            AlertDialog alertDialog = builder.create();
            alertDialog.show();

//            now incrementing score board of the user
            xCount++;
//            to show the value of score X
            scoreX.setText("Score X :- " + String.valueOf(xCount));
        }


//        else if button for 3rd condition 7, 8 and 9 cases
        else if((b7 == 1) && (b8 == 1) && (b9 == 1))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player X Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
//                    reset all the code
                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);
                    //call the reset value
                    resetValues();

                }
            });

//            show the alert dialog box
            AlertDialog alertDialog = builder.create();
            alertDialog.show();

//            now incrementing score board of the user
            xCount++;
//            to show the value of score X
            scoreX.setText("Score X :- " + String.valueOf(xCount));
        }


//        else if button for 4th condition 1, 4 and 7 cases
        else if((b1 == 1) && (b4 == 1) && (b7 == 1))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player X Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
//                    reset all the code
                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);
                    //call the reset value
                    resetValues();

                }
            });

//            show the alert dialog box
            AlertDialog alertDialog = builder.create();
            alertDialog.show();

//            now incrementing score board of the user
            xCount++;
//            to show the value of score X
            scoreX.setText("Score X :- " + String.valueOf(xCount));
        }

//        else if button for 5th condition 2, 5 and 8 cases
        else if((b2 == 1) && (b5 == 1) && (b8 == 1))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player X Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
//                    reset all the code
                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);
                    //call the reset value
                    resetValues();

                }
            });

//            show the alert dialog box
            AlertDialog alertDialog = builder.create();
            alertDialog.show();

//            now incrementing score board of the user
            xCount++;
//            to show the value of score X
            scoreX.setText("Score X :- " + String.valueOf(xCount));
        }

//        else if button for 6th condition 3, 6 and 9 cases
        else if((b3 == 1) && (b6 == 1) && (b9 == 1))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player X Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
//                    reset all the code
                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);
                    //call the reset value
                    resetValues();

                }
            });

//            show the alert dialog box
            AlertDialog alertDialog = builder.create();
            alertDialog.show();

//            now incrementing score board of the user
            xCount++;
//            to show the value of score X
            scoreX.setText("Score X :- " + String.valueOf(xCount));
        }


//        else if button for 7th condition 1, 5 and 9 cases
        else if((b1 == 1) && (b5 == 1) && (b9 == 1))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player X Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
//                    reset all the code
                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);
                    //call the reset value
                    resetValues();

                }
            });

//            show the alert dialog box
            AlertDialog alertDialog = builder.create();
            alertDialog.show();

//            now incrementing score board of the user
            xCount++;
//            to show the value of score X
            scoreX.setText("Score X :- " + String.valueOf(xCount));
        }


//        else if button for 8th condition 3, 5 and 7 cases
        else if((b3 == 1) && (b5 == 1) && (b7 == 1))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player X Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
//                    reset all the code
                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);
                    //call the reset value
                    resetValues();

                }
            });

//            show the alert dialog box
            AlertDialog alertDialog = builder.create();
            alertDialog.show();

//            now incrementing score board of the user
            xCount++;
//            to show the value of score X
            scoreX.setText("Score X :- " + String.valueOf(xCount));
        }


        //    creating for winning O function
//        else if button for 1st condition 1, 2 and 3 cases

        else if((b1 == 0) && (b2 == 0) && (b3 == 0))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player O Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
//                    reset all the code
                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);
                    //call the reset value
                    resetValues();

                }
            });

//            show the alert dialog box
            AlertDialog alertDialog = builder.create();
            alertDialog.show();

//            now incrementing score board of the user
            oCount++;
//            to show the value of score X
            scoreO.setText("Score O :- " + String.valueOf(oCount));
        }

        //    else if button for 2nd condition 4, 5 and 6 cases

        else if((b4 == 0) && (b5 == 0) && (b6 == 0))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player O Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
//                    reset all the code
                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);
                    //call the reset value
                    resetValues();

                }
            });

//            show the alert dialog box
            AlertDialog alertDialog = builder.create();
            alertDialog.show();

//            now incrementing score board of the user
            oCount++;
//            to show the value of score X
            scoreO.setText("Score O :- " + String.valueOf(oCount));
        }

//        else if button for 3rd condition 7, 8 and 9 cases

        else if((b7 == 0) && (b8 == 0) && (b9 == 0))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player O Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
//                    reset all the code
                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);
                    //call the reset value
                    resetValues();

                }
            });

//            show the alert dialog box
            AlertDialog alertDialog = builder.create();
            alertDialog.show();

//            now incrementing score board of the user
            oCount++;
//            to show the value of score X
            scoreO.setText("Score O :- " + String.valueOf(oCount));
        }

        //    else if button for 4th condition 1, 4 and 7 cases

        else if((b1 == 0) && (b4 == 0) && (b7 == 0))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player O Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
//                    reset all the code
                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);
                    //call the reset value
                    resetValues();

                }
            });

//            show the alert dialog box
            AlertDialog alertDialog = builder.create();
            alertDialog.show();

//            now incrementing score board of the user
            oCount++;
//            to show the value of score X
            scoreO.setText("Score O :- " + String.valueOf(oCount));
        }

        //      else if button for 5th condition 2, 5 and 8 cases

        else if((b2 == 0) && (b5 == 0) && (b8 == 0))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player O Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
//                    reset all the code
                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);
                    //call the reset value
                    resetValues();

                }
            });

//            show the alert dialog box
            AlertDialog alertDialog = builder.create();
            alertDialog.show();

//            now incrementing score board of the user
            oCount++;
//            to show the value of score X
            scoreO.setText("Score O :- " + String.valueOf(oCount));
        }

        //        else if button for 6th condition 3, 6 and 9 cases

        else if((b3 == 0) && (b6 == 0) && (b9 == 0))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player O Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
//                    reset all the code
                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);
                    //call the reset value
                    resetValues();

                }
            });

//            show the alert dialog box
            AlertDialog alertDialog = builder.create();
            alertDialog.show();

//            now incrementing score board of the user
            oCount++;
//            to show the value of score X
            scoreO.setText("Score O :- " + String.valueOf(oCount));
        }

        //       else if button for 7th condition 1, 5 and 9 cases

        else if((b1 == 0) && (b5 == 0) && (b9 == 0))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player O Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
//                    reset all the code
                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);
                    //call the reset value
                    resetValues();

                }
            });

//            show the alert dialog box
            AlertDialog alertDialog = builder.create();
            alertDialog.show();

//            now incrementing score board of the user
            oCount++;
//            to show the value of score X
            scoreO.setText("Score O :- " + String.valueOf(oCount));
        }

        //      else if button for 8th condition 3, 5 and 7 cases

        else if((b3 == 0) && (b5 == 0) && (b7 == 0))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player O Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
//                    reset all the code
                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);
                    //call the reset value
                    resetValues();

                }
            });

//            show the alert dialog box
            AlertDialog alertDialog = builder.create();
            alertDialog.show();

//            now incrementing score board of the user
            oCount++;
//            to show the value of score X
            scoreO.setText("Score O :- " + String.valueOf(oCount));
        }

//        if no one wins!
//        if the variable value contain i and any above case X and O doesn't not run no one wins
//        after clicking the every button the value of i button is going to increase so, if the
//        variable value reached to 9 and any of the case is no run because the player can win the
//        also 9th button clicking. So any of the button not run that means i == 9 no one win
        else
        {
            if(i == 9)
            {
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage("No one Wins").setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
//                    reset all the code
                        button1.setImageDrawable(null);
                        button2.setImageDrawable(null);
                        button3.setImageDrawable(null);
                        button4.setImageDrawable(null);
                        button5.setImageDrawable(null);
                        button6.setImageDrawable(null);
                        button7.setImageDrawable(null);
                        button8.setImageDrawable(null);
                        button9.setImageDrawable(null);
                        //call the reset value
                        resetValues();

                    }
                });

//            show the alert dialog box
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        }


    }


    private void choosePlayer()
    {
        if(startGame.equals("X"))
        {
            startGame = "O";
        }
        else
        {
            startGame = "X";
        }
    }

    private void resetValues() {
//        reset the all value
        b1 = 5;
        b2 = 5;
        b3 = 5;
        b4 = 5;
        b5 = 5;
        b6 = 5;
        b7 = 5;
        b8 = 5;
        b9 = 5;
        i = 0;
    }
}