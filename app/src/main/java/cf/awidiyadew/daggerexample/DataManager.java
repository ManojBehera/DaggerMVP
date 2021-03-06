package cf.awidiyadew.daggerexample;

import javax.inject.Inject;

import cf.awidiyadew.daggerexample.model.ApiResponse;
import cf.awidiyadew.daggerexample.model.Barang;
import cf.awidiyadew.daggerexample.model.Picture;
import cf.awidiyadew.daggerexample.remote.ApiService;
import rx.Observable;

/**
 * Created by awidiyadew on 4/11/17.
 */

public class DataManager {

    ApiService mApiService;

    @Inject
    public DataManager(ApiService mApiService) {
        // ApiService provided by dagger by @Inject annotation
        this.mApiService = mApiService;
    }

    public Observable<ApiResponse<Barang>> getListBarang(){
        return mApiService.getListBarang();
    }

    public Observable<ApiResponse<Picture>> getListPicture(){
        return mApiService.getListPicture();
    }

}
