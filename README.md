# RxApp

### ChangeLog: <br>
* 根据 http://blog.csdn.net/lmj623565791/article/details/53240600 <br>
  洋神的blog 替换图片资源 png换成webp图片 apk包由9.29M 变为 8.67M 
* 修复Android4.0侧滑bug，加上广告页(公司APP刚添加就拿来了)
* 增加Ionic项目，点击我的->ionic项目体验  angularjs写的基于PhoneGap框架的webapp，同一套代码写的app在android、ios平台都已经运行 <br>
  JavaScript项目地址 https://github.com/gzfgeh/IonicDemo
* 增加热更新 微信方案 tinker https://github.com/Tencent/tinker
* 增加增量更新
* 在项目基础上集成React Native
* 在项目基础上把Rxjava1.x升级Rxjava2.x
* 修改Android适配库

###            ![](/screenshot/app.gif) <br>
###            扫描二维码下载APP <br>
###            ![](/screenshot/app_download.png) <br>
  本App是本人最新学习新知识的一个总结，在工作之余所做，App采用Material Design设计效果，MVP+RxJava+Retrofit+Okhttp架构，由于是学习之用就没有考虑到兼容问题，目前支持Android4.0以上版本，后续会持续更新
本App用到一下第三方库，感谢以下作者：<br>
            RxJava：响应式、异步、链式编程; <br>
            https://github.com/ReactiveX/RxJava <br>
            RxAndroid: RxJava的辅助库; <br>
            https://github.com/ReactiveX/RxAndroid  <br>
            Retrofit: 网络请求库; <br>
            https://github.com/square/retrofit <br>
            OkHttp： 设置缓存、响应时间等; <br>
            https://github.com/square/okhttp <br>
            Glide：图片加载库; <br>
            https://github.com/bumptech/glide <br>
            Dagger2： 注解库; <br>
            https://github.com/square/dagger <br>
            ButterKnife：UI的注解框架; <br>
            https://github.com/JakeWharton/butterknife <br>
            AutoLayout： 屏幕适配方案; <br>
            https://github.com/hongyangAndroid/AndroidAutoLayout <br>
            RecyclerView: 装载列表数据的控件，封装成自带下拉加载，上拉加载更多效果,参考以下方案;
            https://github.com/gzfgeh/RecyclerView <br>
            https://github.com/Jude95/EasyRecyclerView <br>
            https://github.com/hongyangAndroid/baseAdapter <br>
            SwipeBack： 侧滑返回效果； <br>
            https://github.com/gzfgeh/SwipeBack <br>
            PullToZoom： 下拉放大效果的控件; <br>
            https://github.com/gzfgeh/PullToZoom <br>
            Jiecaovideoplayer: 视频播放器; <br>
            https://github.com/lipangit/JieCaoVideoPlayer <br>
            Api: 数据源Api接口 <br>
            http://gank.io/api <br>
            RxBus: 事件总线方案; <br>
还有一些忘记了，在此一并感谢！
