package kcl.hackton.hackproject;


import com.novoda.imageloader.core.*;
import com.novoda.imageloader.core.cache.LruBitmapCache;
import com.novoda.imageloader.core.model.ImageTag;
import com.novoda.imageloader.core.util.DirectLoader;
import com.novoda.imageloader.core.LoaderSettings.SettingsBuilder;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Bitmap;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;

public class Main extends Activity {
	

	DirectLoader dl = new DirectLoader();
	Bitmap b = dl.download("http://www.asianweek.com/wp-content/uploads/2012/03/microsoft_logo11.jpg");
	Bitmap myImage = new DirectLoader().download("http://production.slashmedias.com/main_images/images/000/005/357/IMAGE-PENSEE-HD-1_original_original_large.jpg?1372235419");
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);		
		setContentView(R.layout.activity_main);
		normalImageManagerSettings();
		
		guiBuilder();
	}

	private void normalImageManagerSettings() {
		ImageManager imageManager = new ImageManager(this, new SettingsBuilder()
	        .withCacheManager(new LruBitmapCache(this)).build(this));
		
		
	}
	
	private static void guiBuilder(){
		
	}
	
	
}
