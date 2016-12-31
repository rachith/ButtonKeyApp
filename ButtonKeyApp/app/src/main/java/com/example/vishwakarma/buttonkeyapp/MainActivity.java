package com.example.vishwakarma.buttonkeyapp;


import android.content.Context;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static com.example.vishwakarma.buttonkeyapp.R.id.clrbtn;

public class MainActivity extends AppCompatActivity {
    Button firstbtn,secondbtn,thirdbtn,fourthbtn,fifthbtn,sixthbtn,seventbtn,eightbtn,ninthbtn,zerobtn,starbtn,hashbtn,clrbtn;
    EditText editText;
    StringBuilder s=new StringBuilder();

    int Clickcount=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstbtn=(Button) findViewById(R.id.firstbtn);
        secondbtn=(Button) findViewById(R.id.secondbtn);
        thirdbtn=(Button) findViewById(R.id.thirdbtn);
        fourthbtn=(Button) findViewById(R.id.fourthbtn);
        fifthbtn=(Button) findViewById(R.id.fifthbtn);
        sixthbtn=(Button) findViewById(R.id.sixthbtn);
        seventbtn=(Button) findViewById(R.id.seventhbtn);
        eightbtn=(Button) findViewById(R.id.eightbtn);
        ninthbtn=(Button) findViewById(R.id.ninghtbtn);
        zerobtn=(Button) findViewById(R.id.zerobtn);
        starbtn=(Button) findViewById(R.id.starbtn);
        hashbtn=(Button) findViewById(R.id.hashbtn);
        editText=(EditText)findViewById(R.id.editText);
        clrbtn=(Button)findViewById(R.id.clrbtn);


        firstbtn.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {

                                            s=s.append("1");
                                            editText.setText(s);
                                        }
                                    }
        );
        secondbtn.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             Clickcount=Clickcount+1;

                                             if(Clickcount==1) {


                                                 s = s.append("2");
                                             }
                                             else if (Clickcount==2) {
                                                 s = s.append("A");
                                             }
                                             else if (Clickcount==3) {
                                                 s = s.append("B");
                                             }
                                             else if (Clickcount==4) {
                                                 s = s.append("C");
                                             }
                                             editText.setText(s);
                                             new CountDownTimer(800,800) {

                                                 public void onTick(long millisUntilFinished) {

                                                 }
                                                 public void onFinish() {
                                                     Clickcount=0;
                                                 }
                                             }.start();
                                         }

                                     }
        );
        thirdbtn.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {

                                            Clickcount=Clickcount+1;

                                            if(Clickcount==1) {
                                                s = s.append("3");
                                            }
                                            else if (Clickcount==2) {
                                                s = s.append("D");
                                            }
                                            else if (Clickcount==3) {
                                                s = s.append("E");
                                            }
                                            else if (Clickcount==4) {
                                                s = s.append("F");
                                            }
                                            editText.setText(s);
                                            new CountDownTimer(800,800) {

                                                public void onTick(long millisUntilFinished) {

                                                }
                                                public void onFinish() {
                                                    Clickcount=0;
                                                }
                                            }.start();
                                        }
                                    }
        );
        fourthbtn.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             Clickcount = Clickcount + 1;

                                             if (Clickcount == 1) {
                                                 s = s.append("4");
                                             } else if (Clickcount == 2) {
                                                 s = s.append("G");
                                             } else if (Clickcount == 3) {
                                                 s = s.append("H");
                                             } else if (Clickcount == 4) {
                                                 s = s.append("I");
                                             }
                                             editText.setText(s);
                                             new CountDownTimer(800,800) {

                                                 public void onTick(long millisUntilFinished) {

                                                 }

                                                 public void onFinish() {
                                                     Clickcount = 0;
                                                 }
                                             }.start();
                                         }
                                     }
        );
        fifthbtn.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            Clickcount = Clickcount + 1;

                                            if (Clickcount == 1) {
                                                s = s.append("5");
                                            } else if (Clickcount == 2) {
                                                s = s.append("J");
                                            } else if (Clickcount == 3) {
                                                s = s.append("K");
                                            } else if (Clickcount == 4) {
                                                s = s.append("L");
                                            }
                                            editText.setText(s);
                                            new CountDownTimer(800,800) {

                                                public void onTick(long millisUntilFinished) {

                                                }

                                                public void onFinish() {
                                                    Clickcount = 0;
                                                }
                                            }.start();
                                        }
                                    }
        );
        sixthbtn.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            Clickcount = Clickcount + 1;

                                            if (Clickcount == 1) {
                                                s = s.append("6");
                                            } else if (Clickcount == 2) {
                                                s = s.append("M");
                                            } else if (Clickcount == 3) {
                                                s = s.append("N");
                                            } else if (Clickcount == 4) {
                                                s = s.append("O");
                                            }
                                            editText.setText(s);
                                            new CountDownTimer(800,800) {

                                                public void onTick(long millisUntilFinished) {

                                                }

                                                public void onFinish() {
                                                    Clickcount = 0;
                                                }
                                            }.start();
                                        }
                                    }
        );
        seventbtn.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             Clickcount = Clickcount + 1;

                                             if (Clickcount == 1) {
                                                 s = s.append("7");
                                             } else if (Clickcount == 2) {
                                                 s = s.append("P");
                                             } else if (Clickcount == 3) {
                                                 s = s.append("Q");
                                             } else if (Clickcount == 4) {
                                                 s = s.append("R");
                                             } else if (Clickcount == 5) {
                                                 s = s.append("S");
                                             }
                                             editText.setText(s);
                                             new CountDownTimer(900,900) {

                                                 public void onTick(long millisUntilFinished) {

                                                 }

                                                 public void onFinish() {
                                                     Clickcount = 0;
                                                 }
                                             }.start();
                                         }
                                     }
        );
        eightbtn.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            Clickcount = Clickcount + 1;

                                            if (Clickcount == 1) {
                                                s = s.append("8");
                                            } else if (Clickcount == 2) {
                                                s = s.append("T");
                                            } else if (Clickcount == 3) {
                                                s = s.append("U");
                                            } else if (Clickcount == 4) {
                                                s = s.append("V");
                                            }

                                            editText.setText(s);
                                            new CountDownTimer(800,800) {

                                                public void onTick(long millisUntilFinished) {

                                                }

                                                public void onFinish() {
                                                    Clickcount = 0;
                                                }
                                            }.start();
                                        }
                                    }
        );
        ninthbtn.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            Clickcount = Clickcount + 1;

                                            if (Clickcount == 1) {
                                                s = s.append("9");
                                            } else if (Clickcount == 2) {
                                                s = s.append("W");
                                            } else if (Clickcount == 3) {
                                                s = s.append("X");
                                            } else if (Clickcount == 4) {
                                                s = s.append("Y");
                                            } else if (Clickcount == 5) {
                                                s = s.append("Z");
                                            }
                                            editText.setText(s);
                                            new CountDownTimer(900,900) {

                                                public void onTick(long millisUntilFinished) {

                                                }

                                                public void onFinish() {
                                                    Clickcount = 0;
                                                }
                                            }.start();
                                        }
                                    }
        );
        zerobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Clickcount = Clickcount + 1;

                if (Clickcount == 1) {
                    s = s.append("0");
                } else if (Clickcount == 2) {
                    s = s.append("_");
                }
                editText.setText(s);
                new CountDownTimer(1000,1000) {

                    public void onTick(long millisUntilFinished) {

                    }

                    public void onFinish() {
                        Clickcount = 0;
                    }
                }.start();
            }});starbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s=s.append("*");
                editText.setText(s);

            }
        });

        hashbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = s.append("#");
                editText.setText(s);
            }
                                      }
        );


            clrbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    s = s.delete(0, s.length());
                    editText.setText(s);
                }
            });
        }

    }


