package techgroup.com.slaeyplay;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

public class VideoActivity extends AppCompatActivity {
    ToggleButton play_pause;
    Button stop;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

       play_pause = (ToggleButton) findViewById(R.id.play_pause);
       stop = (Button) findViewById(R.id.button_stop);
       final  MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.ed_sheeran);

       play_pause.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
               if (play_pause.isChecked()){
                   mediaPlayer.start();
               }else{
                   mediaPlayer.pause();
               }
           }
       });
       stop.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               mediaPlayer.stop();
           }
       });

    }


}
