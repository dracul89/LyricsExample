package beaumont.danny.musicapipoc.network;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by dracul89 on 9/9/17.
 */

public interface LyricsService {
    // https://lyrics.wikia.com/api.php?func=getSong&artist=Tom+Waits&song=new+coat+of+paint&fmt=json
    @GET("api.php")
    Observable<ResponseBody> getLyrics(@Query("func") String func, @Query("artist") String artist, @Query("song") String song, @Query("fmt") String fmt);
}
