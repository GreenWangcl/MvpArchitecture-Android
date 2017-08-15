package com.qingmei2.module.base.di.component;

import com.google.gson.Gson;
import com.qingmei2.module.base.BaseApplication;
import com.qingmei2.module.base.di.module.AppModule;
import com.qingmei2.module.base.di.module.GlobalConfigModule;
import com.qingmei2.module.base.di.module.HttpClientModule;
import com.qingmei2.module.base.di.module.ServiceModule;
import com.qingmei2.module.http.service.ServiceManager;

import javax.inject.Singleton;

import dagger.Component;
import okhttp3.OkHttpClient;

/**
 * Created by QingMei on 2017/8/14.
 * desc:
 */
@Singleton
@Component(modules = {
        AppModule.class,
        HttpClientModule.class,
        GlobalConfigModule.class,
        ServiceModule.class
})
public interface AppComponent {

    Gson gson();

    ServiceManager serviceManager();

    OkHttpClient okHttpClient();

    BaseApplication baseApplication();

    void inject(BaseApplication application);
}