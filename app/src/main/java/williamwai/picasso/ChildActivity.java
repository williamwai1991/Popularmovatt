package williamwai.picasso;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ChildActivity extends AppCompatActivity {

    private TextView mDisplayText;
    private TextView mDisplayText2;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        mDisplayText = (TextView) findViewById(R.id.tv_display);
        mDisplayText2 = (TextView) findViewById(R.id.tv_display2);
        imageView = (ImageView) findViewById(R.id.imageView);

        Bundle bundle = getIntent().getExtras();


        if (bundle != null) {
            mDisplayText.setText(bundle.getString(Intent.EXTRA_TEXT));
        }
    }
}
