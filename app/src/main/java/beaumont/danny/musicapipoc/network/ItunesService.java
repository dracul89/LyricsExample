package beaumont.danny.musicapipoc.network;


import beaumont.danny.musicapipoc.model.ItunesResponse;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by dracul89 on 9/9/17.
 */

public interface ItunesService {
    @GET("search")
    Observable<ItunesResponse> getSearchResults(@Query("term") String term);
}
