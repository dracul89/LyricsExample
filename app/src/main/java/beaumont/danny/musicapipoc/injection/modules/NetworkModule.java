package beaumont.danny.musicapipoc.injection.modules;

import javax.inject.Singleton;

import beaumont.danny.musicapipoc.network.ItunesService;
import beaumont.danny.musicapipoc.network.LyricsService;
import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by dracul89 on 9/9/17.
 */

@Module
public class NetworkModule {

    private Retrofit.Builder builder = new Retrofit.Builder()
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create());


    @Provides
    @Singleton
    ItunesService providesItunesService() {
        return builder
                .baseUrl("https://itunes.apple.com/")
                .build()
                .create(ItunesService.class);
    }

    @Provides
    @Singleton
    LyricsService providesLyricsService() {
        return new Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .baseUrl("http://lyrics.wikia.com/")
                .build()
                .create(LyricsService.class);
    }
}
