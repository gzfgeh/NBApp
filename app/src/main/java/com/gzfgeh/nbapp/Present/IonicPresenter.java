package com.gzfgeh.nbapp.Present;

import android.content.Context;

import com.gzfgeh.nbapp.Model.IonicModel;
import com.gzfgeh.nbapp.Utils.RxSubUtils;
import com.gzfgeh.nbapp.View.IonicView;

import javax.inject.Inject;

/**
 * Created by
 */
public class IonicPresenter extends BasePresenter<IonicView> {
    @Inject
    IonicModel model;

    @Inject
    IonicPresenter() {}

    public void getApkFinish(Context context){
        compositeDisposable.add(model.getApkFinish()
                .subscribeWith(new RxSubUtils<Boolean>(compositeDisposable,context) {
                    @Override
                    protected void _onNext(Boolean aBoolean) {
                        getView().getFinish(aBoolean);
                    }

                }));
    }
}
