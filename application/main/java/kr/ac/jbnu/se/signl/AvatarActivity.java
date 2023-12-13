package kr.ac.jbnu.se.signl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

public class AvatarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avatar);

        Intent intent = getIntent();
        String result = intent.getStringExtra("result");
        TextView substt = findViewById(R.id.substt);
        substt.setText(result);

        //HOME 버튼
        ImageButton left =(ImageButton) findViewById(R.id.left);
        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });

        
        if(substt.getText().toString().equals("가다")) {
            //artivitiy_avatar.xml에 있는 VidioView
            final VideoView videoview = (VideoView) findViewById(R.id.video);
            //Video View에서 보여줄 동영상주소.
            Uri url = Uri.parse("https://bucket-samplee.s3.ap-northeast-2.amazonaws.com/sample/%EA%B0%80%EB%8B%A4.mp4");
            videoview.setVideoURI(url);
            //비디오 컨트롤바.
            videoview.setMediaController(new MediaController(this));
            //videoview.start();
        }

        else if(substt.getText().toString().equals("곧")) {
            //artivitiy_avatar.xml에 있는 VidioView
            final VideoView videoview = (VideoView) findViewById(R.id.video);
            //Video View에서 보여줄 동영상주소.
            Uri url = Uri.parse("https://bucket-samplee.s3.ap-northeast-2.amazonaws.com/sample/%EA%B3%A7.mp4");
            videoview.setVideoURI(url);
            //비디오 컨트롤바.
            videoview.setMediaController(new MediaController(this));
            //videoview.start();
        }

        else if(substt.getText().toString().equals("알아듣다")) {
            //artivitiy_avatar.xml에 있는 VidioView
            final VideoView videoview = (VideoView) findViewById(R.id.video);
            //Video View에서 보여줄 동영상주소.
            Uri url = Uri.parse("https://bucket-samplee.s3.ap-northeast-2.amazonaws.com/sample/%EC%95%8C%EC%95%84%EB%93%A3%EB%8B%A4.mp4");
            videoview.setVideoURI(url);
            //비디오 컨트롤바.
            videoview.setMediaController(new MediaController(this));
            //videoview.start();
        }

        else if(substt.getText().toString().equals("오다")) {
            //artivitiy_avatar.xml에 있는 VidioView
            final VideoView videoview = (VideoView) findViewById(R.id.video);
            //Video View에서 보여줄 동영상주소.
            Uri url = Uri.parse("https://bucket-samplee.s3.ap-northeast-2.amazonaws.com/sample/%EC%98%A4%EB%8B%A4.mp4");
            videoview.setVideoURI(url);
            //비디오 컨트롤바.
            videoview.setMediaController(new MediaController(this));
            //videoview.start();
        }

        else if(substt.getText().toString().equals("오른쪽")) {
            //artivitiy_avatar.xml에 있는 VidioView
            final VideoView videoview = (VideoView) findViewById(R.id.video);
            //Video View에서 보여줄 동영상주소.
            Uri url = Uri.parse("https://bucket-samplee.s3.ap-northeast-2.amazonaws.com/sample/%EC%98%A4%EB%A5%B8%EC%AA%BD.mp4");
            videoview.setVideoURI(url);
            //비디오 컨트롤바.
            videoview.setMediaController(new MediaController(this));
            //videoview.start();
        }

        else if(substt.getText().toString().contains("알겠습니다")) {
            //artivitiy_avatar.xml에 있는 VidioView
            final VideoView videoview = (VideoView) findViewById(R.id.video);
            //Video View에서 보여줄 동영상주소.
            Uri url = Uri.parse("https://bucket-samplee.s3.ap-northeast-2.amazonaws.com/sample/%EC%95%8C%EA%B2%A0%EC%8A%B5%EB%8B%88%EB%8B%A4.mp4");
            videoview.setVideoURI(url);
            //비디오 컨트롤바.
            videoview.setMediaController(new MediaController(this));
            //videoview.start();
        }

        else{
            Toast.makeText(getApplicationContext(), "해당하는 수어 영상이 없습니다.", Toast.LENGTH_SHORT).show();
        }





    }
}
