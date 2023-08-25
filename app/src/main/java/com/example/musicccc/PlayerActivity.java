package com.example.musicccc;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.ToggleButton;
import java.util.ArrayList;
public class PlayerActivity extends AppCompatActivity {
    ImageView play, prev, next, fastf, fastr,imageView;
    TextView songTitle, textstop;
    SeekBar mSeekBarTime, mSeekBarVol;
    static MediaPlayer mMediaPlayer;
    private Runnable runnable;
    private ToggleButton loopButton;
    private AudioManager mAudioManager;
    int currentIndex = 0;
    ArrayList<Integer> songs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);
        mAudioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
        play = findViewById(R.id.play);
        prev = findViewById(R.id.prev);
        next = findViewById(R.id.next);
        fastf = findViewById(R.id.fstf);
        fastr=findViewById(R.id.fstr);
        songTitle = findViewById(R.id.songTitle);
        imageView = findViewById(R.id.imageView);
        mSeekBarTime = findViewById(R.id.seekBarTime);
        mSeekBarVol = findViewById(R.id.seekBarVol);
        textstop=findViewById(R.id.txtsstop);
        loopButton=findViewById(R.id.loopb);

        // creating an ArrayList to store our songs
        songs = new ArrayList<>();
        songs.add(0, R.raw.believer);
        songs.add(1, R.raw.munjanemanjalli);
        songs.add(2, R.raw.pal);
        songs.add(3, R.raw.kannmaniye);
        songs.add(4, R.raw.tumhiho);
        songs.add(5, R.raw.wannabe);
        songs.add(6, R.raw.apnabanale);
        songs.add(7, R.raw.babyily);
        songs.add(8, R.raw.befree);
        songs.add(9, R.raw.blindinglights);
        songs.add(10, R.raw.dancemonkey);
        songs.add(11, R.raw.dandelions);
        songs.add(12, R.raw.doobey);
        songs.add(13, R.raw.fairy);
        songs.add(14, R.raw.galliyan);
        songs.add(15, R.raw.gumma);
        songs.add(16, R.raw.hello);
        songs.add(17, R.raw.hellohello);
        songs.add(18, R.raw.inkem);
        songs.add(19, R.raw.jeena);
        songs.add(20, R.raw.kannu);
        songs.add(21, R.raw.kesariya);
        songs.add(22, R.raw.levitating);
        songs.add(23, R.raw.loveme);
        songs.add(24, R.raw.mainterabf);
        songs.add(25, R.raw.neenade);
        songs.add(26, R.raw.onlylove);
        songs.add(27, R.raw.rakkamma);
        songs.add(28, R.raw.ranjha);
        songs.add(29, R.raw.saaluthillave);
        songs.add(30, R.raw.sadha);
        songs.add(31, R.raw.saturday);
        songs.add(32, R.raw.shape);
        songs.add(33, R.raw.singformom);
        songs.add(34, R.raw.symphony);
        songs.add(35, R.raw.taratara);
        songs.add(36, R.raw.unholy);
        songs.add(37, R.raw.until);
        songs.add(38, R.raw.usire);
        songs.add(39, R.raw.violin);
        songs.add(40, R.raw.watermelon);
        songs.add(41, R.raw.yaaronanu);
        songs.add(42, R.raw.yenaithu);
        songs.add(43, R.raw.zara);
        songs.add(44, R.raw.paravasha);
        songs.add(45, R.raw.chammak);
        songs.add(46, R.raw.alochane);
        songs.add(47, R.raw.gaganave);
        songs.add(48, R.raw.eradu);
        currentIndex=getIntent().getIntExtra("currentIndex",0);
        // intializing mediaplayer
        mMediaPlayer = MediaPlayer.create(getApplicationContext(), songs.get(currentIndex));
        mMediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener(){
            public void onPrepared(MediaPlayer mp){
                int totalDuration=mMediaPlayer.getDuration();
                mSeekBarTime.setMax(totalDuration);
                String totalTime=String.format("%02d:%02d",totalDuration/60000,(totalDuration%60000)/1000);
                textstop.setText(totalTime);
                mMediaPlayer.setLooping(loopButton.isChecked());
                updateSeekbar();
            }
        });
        // seekbar volume
        int maxV = mAudioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        int curV = mAudioManager.getStreamVolume(AudioManager.STREAM_MUSIC);
        mSeekBarVol.setMax(maxV);
        mSeekBarVol.setProgress(curV);

        mSeekBarVol.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                mAudioManager.setStreamVolume(AudioManager.STREAM_MUSIC, progress, 0);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        loopButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                boolean loopEnabled=loopButton.isChecked();
                mMediaPlayer.setLooping(loopEnabled);
            }
        });
        //above seekbar volume
        fastr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mMediaPlayer.isPlaying())
                {
                    mMediaPlayer.seekTo(mMediaPlayer.getCurrentPosition()-10000);
                }
            }
        });
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSeekBarTime.setMax(mMediaPlayer.getDuration());
                if (mMediaPlayer != null && mMediaPlayer.isPlaying()) {
                    mMediaPlayer.pause();
                    play.setImageResource(R.drawable.ic_play);

                } else {
                    mMediaPlayer.start();
                    play.setImageResource(R.drawable.ic_pause);

                }

                songNames();

            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playNextSong();
            }
        });
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mMediaPlayer != null) {
                    play.setImageResource(R.drawable.ic_pause);
                }
                    currentIndex--;
                if(currentIndex<0) {
                    currentIndex = songs.size() - 1;
                }
                if (mMediaPlayer.isPlaying()) {
                    mMediaPlayer.stop();
                }
                mMediaPlayer = MediaPlayer.create(getApplicationContext(), songs.get(currentIndex));
                mMediaPlayer.start();
                songNames();
            }
        });
        fastf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mMediaPlayer.isPlaying())
                {
                    mMediaPlayer.seekTo(mMediaPlayer.getCurrentPosition()+10000);
                }
            }
        });
    }
    private void updateSeekbar(){
        int totalDuration=mMediaPlayer.getDuration();
        int remainingTime=totalDuration-mMediaPlayer.getCurrentPosition();
        String remainingTimeString=String.format("%02d:%02d",remainingTime/60000,(remainingTime%60000)/1000);
        textstop.setText(remainingTimeString);
        mSeekBarTime.setProgress(mMediaPlayer.getCurrentPosition());
        handler.postDelayed(updateRunnable,100);
    }
    protected Runnable updateRunnable=new Runnable() {
        @Override
        public void run() {
            updateSeekbar();
        }
    };
    private void songNames() {
        switch(currentIndex){
          case 0:
            songTitle.setText("BELIEVER-IMAGINE DRAGONS");
            imageView.setImageResource(R.drawable.believer);
            break;
          case 1:
            songTitle.setText("MUNJANE MANJALLI-RAGHU DIXIT\nMovie:Just Math Mathalli");
            imageView.setImageResource(R.drawable.jmm);
              break;
          case 2:
            songTitle.setText("PAL-JAVED MOSHIN\nMovie:Jalebi");
            imageView.setImageResource(R.drawable.pal);
              break;
          case 3:
            songTitle.setText("KANNMANIYE-SANJITH HEGDE\nMovie:Pailwan");
            imageView.setImageResource(R.drawable.kannmaniye);
              break;
          case 4:
            songTitle.setText("TUM HI HO-ARIJITH SINGH\nMovie:Aashiqui 2");
            imageView.setImageResource(R.drawable.tumhiho);
                break;
          case 5:
            songTitle.setText("WANNABE-WHY MONA");
            imageView.setImageResource(R.drawable.wann);
                break;
          case 6:
            songTitle.setText("APNA BANA LE-ARIJITH SINGH\nMovie:Bhediya");
            imageView.setImageResource(R.drawable.apn);
                break;
          case 7:
            songTitle.setText("NINNA HINDE-KARTHIK\nMovie:Maanikya");
            imageView.setImageResource(R.drawable.bbyil);
                break;
          case 8:
            songTitle.setText("BE FREE-VIDYA VOX");
            imageView.setImageResource(R.drawable.befree);
                break;
          case 9:
            songTitle.setText("BLINDING LIGHTS-THE WEEKEND");
            imageView.setImageResource(R.drawable.bl);
                break;
          case 10:
            songTitle.setText("DANCE MONKEY-TONES AND I");
            imageView.setImageResource(R.drawable.dm);
                break;
          case 11:
            songTitle.setText("DANDELIONS-RUTH B.");
            imageView.setImageResource(R.drawable.ddn);
                break;
          case 12:
            songTitle.setText("DOOBEY-OAFF\nMovie:Gehraiyaan");
            imageView.setImageResource(R.drawable.doob);
                break;
          case 13:
            songTitle.setText("FAIRYTALE-ALEXANDER RYBAK");
            imageView.setImageResource(R.drawable.ft);
                break;
          case 14:
            songTitle.setText("GALLIYAN-ANKIT TIWARI\nMovie:Ek Villain");
            imageView.setImageResource(R.drawable.gall);
                break;
          case 15:
            songTitle.setText("DEVIL'S FURY-ANUP BHANDARI\nMovie:Vikrant Rona");
            imageView.setImageResource(R.drawable.devilf);
                break;
          case 16:
            songTitle.setText("HELLO MISTER-NEETI MOHAN\nMovie:Kotigobba 2");
            imageView.setImageResource(R.drawable.hellomm);
                break;
          case 17:
            songTitle.setText("HELLO HELLO-VIJAY PRAKASH\nMovie:BACHCHAN");
            imageView.setImageResource(R.drawable.hlohlo);
                break;
          case 18:
            songTitle.setText("INKEM INKEM-SID SRIRAM\nMovie:Geeta Govindam");
            imageView.setImageResource(R.drawable.inkmm);
                break;
          case 19:
            songTitle.setText("JEENA JEENA YA-SHAAN\nMovie:Maanikya");
            imageView.setImageResource(R.drawable.jeenaa);
                break;
          case 20:
            songTitle.setText("KANNU HODIYAKA-SHREYA GHOSHAL\nMovie:Roberrt");
            imageView.setImageResource(R.drawable.kannuu);
                break;
          case 21:
            songTitle.setText("KESARIYA-PRITAM,ARIJIT SINGH\nMovie:Brahmastra");
            imageView.setImageResource(R.drawable.kesriya);
                break;
          case 22:
            songTitle.setText("LEVITATING-DUA LIPA");
            imageView.setImageResource(R.drawable.lvt);
          case 23:
            songTitle.setText("LOVE ME LIKE YOU DO-ELLIE GOULDING\nMovie:Fifty Shades Of Grey");
            imageView.setImageResource(R.drawable.lmlyd);
                break;
          case 24:
            songTitle.setText("MAIN TERA BOYFRIEND-PRITAM,ARIJIT SINGH\nMovie:Raabta");
            imageView.setImageResource(R.drawable.mttbff);
                break;
          case 25:
            songTitle.setText("NEENADE NA-THAMAN S\nMovie:Yuvaratna");
            imageView.setImageResource(R.drawable.neenad);
                break;
          case 26:
            songTitle.setText("ONLY LOVE CAN HURT LIKE THIS-PALOMA FAITH");
            imageView.setImageResource(R.drawable.olch);
                break;
          case 27:
            songTitle.setText("RAKKAMMA-NAKASH AZIZ,SUNIDHI CHAUHAN\nMovie:Vikrant Rona");
            imageView.setImageResource(R.drawable.rkmmaa);
                break;
          case 28:
            songTitle.setText("RANJHA-JASLEEN ROYAL\nMovie:Shershaah");
            imageView.setImageResource(R.drawable.rnjh);
                break;
          case 29:
            songTitle.setText("SAALUTHILLAVE-SHREYA GHOSHAL,VIJAY PRAKASH\nMovie:Kotigobba 2");
            imageView.setImageResource(R.drawable.saltst);
                break;
          case 30:
            songTitle.setText("SADHA NINNA KANNALI-SONU NIGAM,SHREYA GHOSHAL\nMovie:Bachchan");
            imageView.setImageResource(R.drawable.sada);
                break;
          case 31:
            songTitle.setText("SATURDAY SATURDAY-SHAARIB TOSHI\nMovie:Humpty Sharma Ki Dulhania");
            imageView.setImageResource(R.drawable.satrdy);
                break;
          case 32:
            songTitle.setText("SHAPE OF YOU-ED SHEERAN");
            imageView.setImageResource(R.drawable.shap);
                break;
          case 33:
            songTitle.setText("SING FOR THE MOMENT-EMINEM");
            imageView.setImageResource(R.drawable.sfm);
                break;
          case 34:
            songTitle.setText("SYMPHONY-ZARA LARSSON");
            imageView.setImageResource(R.drawable.symph);
                break;
          case 35:
            songTitle.setText("THARA THARA-VIJAY PRAKASH,SHREYA GHOSHAL\nMovie:Kempegowda");
            imageView.setImageResource(R.drawable.thara);
                break;
          case 36:
            songTitle.setText("UNHOLY-SAM SMITH,KIM PETRAS");
            imageView.setImageResource(R.drawable.unhol);
                break;
          case 37:
            songTitle.setText("UNTIL I FOUND YOU-STEPHAN SANCHEZ,EM BEIHOLD");
            imageView.setImageResource(R.drawable.uify);
                break;
          case 38:
            songTitle.setText("USIRE-RAJESH KRISHNAN\nMovie:Huccha");
            imageView.setImageResource(R.drawable.usire);
                break;
          case 39:
            songTitle.setText("VIOLIN SONG-DAVID SIMON,ANITHA\nMovie:Idharammapilatho");
            imageView.setImageResource(R.drawable.viol);
                break;
          case 40:
            songTitle.setText("WATERMELON SUGAR-HARRY STYLES");
            imageView.setImageResource(R.drawable.wats);
                break;
          case 41:
            songTitle.setText("YAARO NAANU-SHREYA GHOSHAL\nMovie:Natasaarvabhowma");
            imageView.setImageResource(R.drawable.yaroo);
                break;
          case 42:
            songTitle.setText("YENAITHU-PUNEETH RAJKUMAR,KAJAL AGGARWAL\nMovie:Chakravyuha");
            imageView.setImageResource(R.drawable.yen);
                break;
          case 43:
            songTitle.setText("ZARA ZARA-BOMBAY JAYASHRI\nMovie:RHTDM");
            imageView.setImageResource(R.drawable.zaraa);
                break;
          case 44:
            songTitle.setText("PARAVASHANADENU-SONU NIGAM\nMovie:Paramatma");
            imageView.setImageResource(R.drawable.parav);
                break;
          case 45:
            songTitle.setText("CHAMMAK CHALLO-AKON\nMovie:Ra One");
            imageView.setImageResource(R.drawable.chmk);
                break;
          case 46:
            songTitle.setText("AALOCHANE\nMovie:Romeo");
            imageView.setImageResource(R.drawable.alch);
                break;
          case 47:
            songTitle.setText("GAGANAVE BAAGI-SHREYA GHOSHAL\nMovie:Sanju Weds Geetha");
            imageView.setImageResource(R.drawable.gagnaa);
                break;
          case 48:
            songTitle.setText("ERADU JADEYANNU-SONU NIGAM,SHREYA GHOSHAL\nMovie:Jackie");
            imageView.setImageResource(R.drawable.erdu);
                break;
        }
        // seekbar duration
        mMediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mSeekBarTime.setMax(mMediaPlayer.getDuration());
                mMediaPlayer.start();
            }
        });
        mSeekBarTime.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (fromUser) {
                    mMediaPlayer.seekTo(progress);
                    mSeekBarTime.setProgress(progress);

                    updateSeekbar();
                }
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        mMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                playNextSong();
            }
        });

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (mMediaPlayer != null) {
                    try {
                        if (mMediaPlayer.isPlaying()) {
                            Message message = new Message();
                            message.what = mMediaPlayer.getCurrentPosition();
                            handler.sendMessage(message);
                            Thread.sleep(1000);
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
    private void playNextSong() {
        currentIndex++;
        if (currentIndex >=songs.size()) {
            currentIndex = 0;
        }

        if (mMediaPlayer.isPlaying()) {
            mMediaPlayer.stop();
        }

        mMediaPlayer = MediaPlayer.create(getApplicationContext(),songs.get(currentIndex));
        mMediaPlayer.start();
        songNames();
    }
    @SuppressLint("Handler Leak") Handler handler = new Handler () {
        @Override
        public void handleMessage  (Message msg) {

            mSeekBarTime.setProgress(msg.what);
        }
    };
    @Override
    protected void onDestroy(){
        super.onDestroy();;
        if (mMediaPlayer != null) {
            mMediaPlayer.release();
            mMediaPlayer=null;
        }
    }
}
