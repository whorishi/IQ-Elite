package com.example.quizappuser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.quizappuser.databinding.ActivityScoreBinding;

public class ScoreActivity extends AppCompatActivity {

    ActivityScoreBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityScoreBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().hide();

        int correct  = getIntent().getIntExtra("score",0);
        int totalQuestion = getIntent().getIntExtra("totalQuestion",0);
        //Toast.makeText(this, "correct ="+correct + " Total ="+ totalQuestion, Toast.LENGTH_SHORT).show();
        int incorrect = totalQuestion-correct;
        float percentage = (float) ((double)(correct*100.0)/(double)totalQuestion);

        binding.correct.setText(String.valueOf(correct));
        binding.incorrect.setText(String.valueOf(incorrect));
        binding.percentage.setText(String.valueOf(percentage) + "%");
        binding.progressBar.setProgressMax(totalQuestion);
        binding.progressBar.setProgress(correct);

        binding.retryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ScoreActivity.this,MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });

        binding.quitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}