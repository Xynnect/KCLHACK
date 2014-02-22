package kcl.hackton.hackproject;

import com.novoda.imageloader.core.*;
import com.novoda.imageloader.core.cache.LruBitmapCache;
import com.novoda.imageloader.core.util.DirectLoader;
import com.novoda.imageloader.core.LoaderSettings.SettingsBuilder;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Bitmap;
import android.view.Menu;

public class Main extends Activity {
	

	DirectLoader dl = new DirectLoader();
	Bitmap b = dl.download("http://www.asianweek.com/wp-content/uploads/2012/03/microsoft_logo11.jpg");
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
		normalImageManagerSettings();
	}

	private void normalImageManagerSettings() {
		ImageManager imageManager = new ImageManager(this, new SettingsBuilder()
	        .withCacheManager(new LruBitmapCache(this)).build(this));
	}
	

}
