package com.feng.structurewebpj;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;

/**
 * Package Name: com.feng.structurewebpj
 *
 * @author ysr
 * @Email yfeng1023@gmail.com
 * @Description: TODO
 * @Create Date: 2018年03月05日 19:47
 */

public class BaseFunc <T> implements ObservableTransformer<BaseResp<T>, Observable<T>> {


    @Override
    public ObservableSource<Observable<T>> apply(Observable<BaseResp<T>> upstream) {
        return null;
    }
}