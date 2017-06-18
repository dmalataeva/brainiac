package dmalataeva.brainiac;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class BrainiacActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Context myContext = getApplicationContext();
        setContentView(R.layout.activity_brainiac);

        //addLogo(myContext);
        ImageButton play = addButtonPlay();
        ImageButton highscores = addButtonHighscores();
        ImageButton exit = addButtonExit();
    }

    protected void OnStart() {
        Context myContext = getApplicationContext();
        ImageView logo = (ImageView)findViewById(R.id.logo);
        Animation logoAnim = AnimationUtils.loadAnimation(this, R.anim.animation_logo);
        logo.startAnimation(logoAnim);
    }

    //public void addLogo(Context cont) {

    //}

    public ImageButton addButtonPlay() {
        ImageButton button = (ImageButton)findViewById(R.id.play);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Toast.makeText(getApplicationContext(), "PLAY is clicked!", Toast.LENGTH_SHORT).show();
                setContentView(R.layout.activity_choose_level);
            }
        });
        return button;
    }

    public ImageButton addButtonHighscores() {
        ImageButton button = (ImageButton)findViewById(R.id.highscores);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Toast.makeText(getApplicationContext(), "HIGHSCORES is clicked!", Toast.LENGTH_SHORT).show();
                setContentView(R.layout.activity_choose_level);
            }
        });
        return button;
    }

    public ImageButton addButtonExit() {
        ImageButton button = (ImageButton)findViewById(R.id.exit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Toast.makeText(getApplicationContext(), "EXIT is clicked!", Toast.LENGTH_SHORT).show();
                setContentView(R.layout.activity_choose_level);
            }
        });
        return button;
    }


}
