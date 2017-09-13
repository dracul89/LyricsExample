package beaumont.danny.musicapipoc.injection.interfaces;

import javax.inject.Singleton;

import beaumont.danny.musicapipoc.FullscreenActivity;
import beaumont.danny.musicapipoc.MusicLyricsApplication;
import beaumont.danny.musicapipoc.injection.modules.NetworkModule;
import dagger.Component;

/**
 * Created by dracul89 on 9/9/17.
 */

@Singleton
@Component(modules = {NetworkModule.class})
public interface InjectionComponent {
    void inject(FullscreenActivity fullscreenActivity);
    void inject(MusicLyricsApplication musicLyricsApplication);
}
