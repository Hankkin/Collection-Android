package com.youngmanster.collection.mvp.contract.wechat.okhttpcache;

import com.youngmanster.collection.been.Result;
import com.youngmanster.collection.been.wechat.WeChatNews;
import com.youngmanster.collectionlibrary.mvp.BasePresenter;
import com.youngmanster.collectionlibrary.mvp.BaseView;

import java.util.List;

import io.reactivex.Observable;

/**
 * Created by yangyan
 * on 2018/3/21.
 */

public interface WeChatWorldNewsContract {

	interface View extends BaseView{
		void refreshUI(List<WeChatNews> weChatNews);
	}

	abstract class Presenter extends BasePresenter<View>{
		public abstract void requestWorldNews(int page,int num);
	}
}
