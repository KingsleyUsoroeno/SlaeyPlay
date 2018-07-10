package techgroup.com.slaeyplay;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  {
    /*we also had to import our Mediaplayer Class to help us to play selected
    songs
    */

    Button play, pause, forward , back;
    MediaPlayer mediaPlayer;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        play = (Button) findViewById(R.id.playbtn);
        pause = (Button) findViewById(R.id.pausebtn);
        forward = (Button) findViewById(R.id.forward);
        next = (Button) findViewById(R.id.next);
        back = (Button) findViewById(R.id.backButton);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.music);
               mediaPlayer.start();
            }
        });

        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.stop();
            }
        });

        forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.music2);
                mediaPlayer.start();
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, VideoActivity.class);
                startActivity(intent);
            }

        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.ed_sheeran);
                mediaPlayer.start();
            }
        });


    }

}











