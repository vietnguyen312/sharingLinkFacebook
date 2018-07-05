package vn.com.sharelinkfacbook;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.widget.ShareDialog;



public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button sharingButton = findViewById(R.id.sharing);
		sharingButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				ShareLinkContent content = new ShareLinkContent.Builder()
						.setContentUrl(Uri.parse("https://www.google.com/"))
						.setQuote("Setting up Retrofit 2 and running it in Android is easy, but at " 
								+ "times it gets trickier when you work in production environment " 
								+ "where you’ll be working with backends that use Authorisation " 
								+ "Headers, Basic Authentication & SSL enabled API’s. " 
								+ "I am a freelance android developer " 
								+ "and I’ll be sharing few insights on how to setup these " 
								+ "based on my experience.")
						.build();
				ShareDialog.show(MainActivity.this, content);
			}
		});
	}
}