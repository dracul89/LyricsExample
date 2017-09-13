package beaumont.danny.musicapipoc;

import android.app.Application;

import beaumont.danny.musicapipoc.injection.Injector;

/**
 * Created by dracul89 on 9/9/17.
 */

public class MusicLyricsApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        setupDagger();
    }

    private void setupDagger() {
        Injector.getComponent().inject(this);
    }
}
