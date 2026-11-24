package com.appsflyer.internal;

import a.jf4;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.StrictMode;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.exception_manager.ExceptionManager;
import com.appsflyer.exception_manager.ExceptionManagerImpl;
import com.appsflyer.exception_manager.SdkData;
import com.appsflyer.sdk_base.exception_manager.ExceptionManagerConfiguration;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.sdk_base.logger.LoggerDelegate;
import com.appsflyer.sdk_base.util.OptionalFeaturesValidator;
import com.appsflyer.sdk_base.util.SupportedOptionalFeatures;
import com.appsflyer.share.AppsFlyerConversionListener;
import java.lang.reflect.Constructor;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1aSDK implements AFc1bSDK {
    private static final int registerClient = 30000;
    private ScheduledExecutorService AFKeystoreWrapper;
    private ExecutorService AFLogger;
    private AFh1xSDK AFLoggerLogLevel;
    private AFi1hSDK AppsFlyerLib;
    private AFg1rSDK afDebugLog;
    private AppsFlyerProperties afErrorLog;
    private SharedPreferences afInfoLog;
    private AFf1aSDK afWarnLog;
    private AFf1eSDK clearUserPii;
    private AFd1xSDK e;
    private LoggerDelegate enableTCFDataCollection;
    private PurchaseHandler force;
    private AFi1aSDK getEntries;
    private OptionalFeaturesValidator getInstance;
    private AFe1wSDK getLevel;
    private AFh1sSDK getOutOfStore;
    private AFf1fSDK getSdkVersion;
    private AFc1gSDK i;
    private AFc1vSDK onPause;
    private AFf1bSDK sendPushNotificationData;
    private AFd1eSDK setAdditionalData;
    private AFd1jSDK setAndroidIdData;
    private AFi1oSDK setAppInviteOneLink;
    private AFc1eSDK setCollectAndroidID;
    private AFg1qSDK setCustomerUserId;
    private AFj1cSDK setDebugLog;
    private AFj1mSDK setImeiData;
    private AFg1wSDK setOaidData;
    private AFh1wSDK setOutOfStore;
    private AFj1wSDK setResolveDeepLinkURLs;
    private AFa1qSDK setUserEmail;
    private AFa1lSDK setUserFbLoginId;
    private AFa1aSDK setUserFirstName;
    private AFi1tSDK setUserLastName;
    private AFb1bSDK setUserPhone;
    private ExceptionManager stop;
    private ExecutorService unregisterClient;
    private AFi1vSDK updateServerUninstallToken;
    private AFf1hSDK v;
    private AFj1ySDK valueOf;
    private AFd1uSDK values;
    private AFc1iSDK w;
    public final AFd1zSDK d = new AFd1zSDK();
    private volatile AppsFlyerConversionListener setOneLinkCustomDomain = null;

    public static class AFa1tSDK implements ThreadFactory {
        private static final AtomicInteger AFLogger = new AtomicInteger();
        private final AtomicInteger d = new AtomicInteger();

        public AFa1tSDK() {
            AFLogger.incrementAndGet();
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            int i = AFLogger.get();
            int iIncrementAndGet = this.d.incrementAndGet();
            StringBuilder sb = new StringBuilder("queue-");
            sb.append(i);
            sb.append("-");
            sb.append(iIncrementAndGet);
            return new Thread(runnable, sb.toString());
        }
    }

    private synchronized ScheduledExecutorService clearUserPii() {
        ScheduledExecutorService scheduledExecutorServiceAFKeystoreWrapper;
        scheduledExecutorServiceAFKeystoreWrapper = this.AFKeystoreWrapper;
        if (scheduledExecutorServiceAFKeystoreWrapper == null) {
            scheduledExecutorServiceAFKeystoreWrapper = AFc1jSDK.AFKeystoreWrapper();
            this.AFKeystoreWrapper = scheduledExecutorServiceAFKeystoreWrapper;
        }
        return scheduledExecutorServiceAFKeystoreWrapper;
    }

    private synchronized AFd1xSDK getOutOfStore() {
        AFd1xSDK aFd1xSDK;
        aFd1xSDK = this.e;
        if (aFd1xSDK == null) {
            aFd1xSDK = new AFd1xSDK(new AFd1mSDK(registerClient), d());
            this.e = aFd1xSDK;
        }
        return aFd1xSDK;
    }

    private SharedPreferences s_(Context context) {
        if (this.afInfoLog == null) {
            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
            try {
                this.afInfoLog = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
            } finally {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            }
        }
        return this.afInfoLog;
    }

    private synchronized AFj1mSDK sendPushNotificationData() {
        AFj1mSDK aFj1mSDK;
        aFj1mSDK = this.setImeiData;
        if (aFj1mSDK == null) {
            aFj1mSDK = new AFj1mSDK(AFLogger());
            this.setImeiData = aFj1mSDK;
        }
        return aFj1mSDK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ExceptionManagerConfiguration setAdditionalData() {
        AFh1gSDK aFh1gSDK;
        AFh1aSDK aFh1aSDK = i().unregisterClient.AFLogger;
        if (aFh1aSDK == null || (aFh1gSDK = aFh1aSDK.registerClient) == null) {
            return null;
        }
        return aFh1gSDK.d;
    }

    private synchronized AFf1bSDK setCollectAndroidID() {
        AFf1bSDK aFf1bSDK;
        aFf1bSDK = this.sendPushNotificationData;
        if (aFf1bSDK == null) {
            aFf1bSDK = new AFf1bSDK(valueOf(), AFLogger());
            this.sendPushNotificationData = aFf1bSDK;
        }
        return aFf1bSDK;
    }

    private synchronized ScheduledExecutorService setOutOfStore() {
        ScheduledExecutorService scheduledExecutorServiceAFLogger;
        scheduledExecutorServiceAFLogger = this.AFKeystoreWrapper;
        if (scheduledExecutorServiceAFLogger == null) {
            scheduledExecutorServiceAFLogger = AFc1jSDK.AFLogger();
            this.AFKeystoreWrapper = scheduledExecutorServiceAFLogger;
        }
        return scheduledExecutorServiceAFLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String setResolveDeepLinkURLs() {
        return String.format(Locale.US, AFj1mSDK.e, AppsFlyerLib.getInstance().getHostPrefix(), com.appsflyer.internal.AFa1tSDK.d().getHostName());
    }

    private synchronized ExecutorService setUserFbLoginId() {
        ExecutorService executorServiceD;
        executorServiceD = this.AFLogger;
        if (executorServiceD == null) {
            executorServiceD = AFc1jSDK.d();
            this.AFLogger = executorServiceD;
        }
        return executorServiceD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ SharedPreferences t_() {
        Context context = this.d.d;
        if (context != null) {
            return s_(context);
        }
        jf4.n("Context must be set via setContext method before calling this dependency.");
        return null;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final AFc1kSDK AFKeystoreWrapper() {
        AFc1gSDK aFc1gSDK = this.i;
        if (aFc1gSDK != null) {
            return aFc1gSDK;
        }
        AFc1gSDK aFc1gSDK2 = new AFc1gSDK(new AFc1dSDK(new i(this, (byte) 0)));
        this.i = aFc1gSDK2;
        return aFc1gSDK2;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final synchronized AFc1iSDK AFLogger() {
        AFc1iSDK aFc1iSDK;
        try {
            aFc1iSDK = this.w;
            if (aFc1iSDK == null) {
                AFd1zSDK aFd1zSDKValueOf = valueOf();
                AFc1kSDK aFc1kSDKAFKeystoreWrapper = AFKeystoreWrapper();
                AFc1eSDK aFc1eSDK = this.setCollectAndroidID;
                if (aFc1eSDK == null) {
                    aFc1eSDK = new AFc1eSDK();
                    this.setCollectAndroidID = aFc1eSDK;
                }
                aFc1iSDK = new AFc1iSDK(aFd1zSDKValueOf, aFc1kSDKAFKeystoreWrapper, aFc1eSDK, d());
                this.w = aFc1iSDK;
            }
        } catch (Throwable th) {
            throw th;
        }
        return aFc1iSDK;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final synchronized AFd1uSDK AFLoggerLogLevel() {
        AFd1uSDK aFd1wSDK;
        aFd1wSDK = this.values;
        if (aFd1wSDK == null) {
            aFd1wSDK = new AFd1wSDK(this);
            this.values = aFd1wSDK;
        }
        return aFd1wSDK;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final synchronized AFf1fSDK AppsFlyerLib() {
        AFf1fSDK aFf1fSDK;
        try {
            aFf1fSDK = this.getSdkVersion;
            if (aFf1fSDK == null) {
                AFd1zSDK aFd1zSDKValueOf = valueOf();
                OptionalFeaturesValidator aFj1hSDK = this.getInstance;
                if (aFj1hSDK == null) {
                    aFj1hSDK = new AFj1hSDK();
                    this.getInstance = aFj1hSDK;
                }
                aFf1fSDK = new AFf1fSDK(aFd1zSDKValueOf, aFj1hSDK);
                this.getSdkVersion = aFf1fSDK;
            }
        } catch (Throwable th) {
            throw th;
        }
        return aFf1fSDK;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final synchronized AFi1aSDK afDebugLog() {
        AFi1aSDK aFi1aSDK;
        try {
            aFi1aSDK = this.getEntries;
            if (aFi1aSDK == null) {
                AFi1hSDK aFi1eSDK = this.AppsFlyerLib;
                if (aFi1eSDK == null) {
                    aFi1eSDK = new AFi1eSDK();
                    this.AppsFlyerLib = aFi1eSDK;
                }
                aFi1aSDK = new AFi1aSDK(this, aFi1eSDK);
                this.getEntries = aFi1aSDK;
            }
        } catch (Throwable th) {
            throw th;
        }
        return aFi1aSDK;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final LoggerDelegate afErrorLog() {
        LoggerDelegate loggerDelegate = this.enableTCFDataCollection;
        if (loggerDelegate != null) {
            return loggerDelegate;
        }
        LoggerDelegate loggerDelegate2 = new LoggerDelegate(AFLogger.INSTANCE);
        this.enableTCFDataCollection = loggerDelegate2;
        return loggerDelegate2;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final AFj1ySDK afInfoLog() {
        AFj1ySDK aFj1ySDK = this.valueOf;
        if (aFj1ySDK != null) {
            return aFj1ySDK;
        }
        Context context = this.d.d;
        if (context == null) {
            jf4.n("Context must be set via setContext method before calling this dependency.");
            return null;
        }
        AFj1vSDK aFj1vSDK = new AFj1vSDK(context, setUserFbLoginId());
        this.valueOf = aFj1vSDK;
        return aFj1vSDK;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final synchronized AFe1wSDK afWarnLog() {
        AFe1wSDK aFe1wSDK;
        aFe1wSDK = this.getLevel;
        if (aFe1wSDK == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 6, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>() { // from class: com.appsflyer.internal.AFc1aSDK.5
                @Override // java.util.concurrent.LinkedBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
                public final /* synthetic */ boolean offer(Object obj) {
                    Runnable runnable = (Runnable) obj;
                    if (isEmpty()) {
                        return super.offer(runnable);
                    }
                    return false;
                }
            }, new AFa1tSDK());
            threadPoolExecutor.setRejectedExecutionHandler(new j());
            aFe1wSDK = new AFe1wSDK(threadPoolExecutor);
            this.getLevel = aFe1wSDK;
        }
        return aFe1wSDK;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final synchronized ExecutorService d() {
        ExecutorService executorServiceUnregisterClient;
        executorServiceUnregisterClient = this.unregisterClient;
        if (executorServiceUnregisterClient == null) {
            executorServiceUnregisterClient = AFc1jSDK.unregisterClient();
            this.unregisterClient = executorServiceUnregisterClient;
        }
        return executorServiceUnregisterClient;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final synchronized AFh1xSDK e() {
        AFh1xSDK aFh1xSDK;
        aFh1xSDK = this.AFLoggerLogLevel;
        if (aFh1xSDK == null) {
            aFh1xSDK = new AFh1xSDK(AFKeystoreWrapper(), AFLogger());
            this.AFLoggerLogLevel = aFh1xSDK;
        }
        return aFh1xSDK;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final synchronized AFa1qSDK enableTCFDataCollection() {
        AFa1qSDK aFa1qSDK;
        aFa1qSDK = this.setUserEmail;
        if (aFa1qSDK == null) {
            aFa1qSDK = new AFa1qSDK(this);
            this.setUserEmail = aFa1qSDK;
        }
        return aFa1qSDK;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final AFg1rSDK force() {
        AFg1rSDK aFg1rSDK = this.afDebugLog;
        if (aFg1rSDK == null) {
            Context context = this.d.d;
            aFg1rSDK = null;
            if (context != null) {
                AFj1cSDK aFj1eSDK = this.setDebugLog;
                if (aFj1eSDK == null) {
                    aFj1eSDK = new AFj1eSDK();
                    this.setDebugLog = aFj1eSDK;
                }
                AFg1wSDK aFg1pSDK = this.setOaidData;
                if (aFg1pSDK == null) {
                    aFg1pSDK = new AFg1pSDK();
                    this.setOaidData = aFg1pSDK;
                }
                AFj1ySDK aFj1vSDK = this.valueOf;
                if (aFj1vSDK == null) {
                    Context context2 = this.d.d;
                    if (context2 == null) {
                        jf4.n("Context must be set via setContext method before calling this dependency.");
                        return null;
                    }
                    aFj1vSDK = new AFj1vSDK(context2, setUserFbLoginId());
                    this.valueOf = aFj1vSDK;
                }
                AFg1qSDK aFg1nSDK = this.setCustomerUserId;
                if (aFg1nSDK == null) {
                    aFg1nSDK = new AFg1nSDK();
                    this.setCustomerUserId = aFg1nSDK;
                }
                AFh1xSDK aFh1xSDKE = e();
                AFj1cSDK aFj1cSDK = aFj1eSDK;
                AFg1wSDK aFg1wSDK = aFg1pSDK;
                AFj1ySDK aFj1ySDK = aFj1vSDK;
                AFg1qSDK aFg1qSDK = aFg1nSDK;
                AFc1kSDK aFc1kSDKAFKeystoreWrapper = AFKeystoreWrapper();
                AFc1iSDK aFc1iSDKAFLogger = AFLogger();
                AFi1vSDK aFi1vSDK = this.updateServerUninstallToken;
                if (aFi1vSDK == null) {
                    Context context3 = this.d.d;
                    if (context3 == null) {
                        jf4.n("Context must be set via setContext method before calling this dependency.");
                        return null;
                    }
                    aFi1vSDK = new AFi1vSDK(context3);
                    this.updateServerUninstallToken = aFi1vSDK;
                }
                AFi1vSDK aFi1vSDK2 = aFi1vSDK;
                AFf1fSDK aFf1fSDKAppsFlyerLib = AppsFlyerLib();
                AFd1zSDK aFd1zSDKValueOf = valueOf();
                AFf1bSDK collectAndroidID = setCollectAndroidID();
                AFc1eSDK aFc1eSDK = this.setCollectAndroidID;
                if (aFc1eSDK == null) {
                    aFc1eSDK = new AFc1eSDK();
                    this.setCollectAndroidID = aFc1eSDK;
                }
                AFg1oSDK aFg1oSDK = new AFg1oSDK(context, aFj1cSDK, aFg1wSDK, aFj1ySDK, aFg1qSDK, aFh1xSDKE, aFc1kSDKAFKeystoreWrapper, aFc1iSDKAFLogger, aFi1vSDK2, aFf1fSDKAppsFlyerLib, aFd1zSDKValueOf, collectAndroidID, aFc1eSDK, registerClient());
                this.afDebugLog = aFg1oSDK;
                return aFg1oSDK;
            }
            jf4.n("Context must be set via setContext method before calling this dependency.");
        }
        return aFg1rSDK;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final synchronized ExceptionManager getEntries() {
        try {
            OptionalFeaturesValidator aFj1hSDK = this.getInstance;
            if (aFj1hSDK == null) {
                aFj1hSDK = new AFj1hSDK();
                this.getInstance = aFj1hSDK;
            }
            if (aFj1hSDK.isOptionalFeaturePresent(SupportedOptionalFeatures.EXCEPTION_MANAGER) && this.stop == null) {
                AFf1fSDK aFf1fSDKAppsFlyerLib = AppsFlyerLib();
                String str = (String) AFf1fSDK.unregisterClient(new Object[]{aFf1fSDKAppsFlyerLib}, -1660886869, 1660886871, System.identityHashCode(aFf1fSDKAppsFlyerLib));
                com.appsflyer.c cVar = new com.appsflyer.c((byte) 2);
                AFLogger();
                String strUnregisterClient = AFc1iSDK.unregisterClient();
                String strAFLogger = AFb1jSDK.AFLogger(AFLogger().AFKeystoreWrapper);
                String packageName = AFLogger().d.d.getPackageName();
                AFj1cSDK aFj1eSDK = this.setDebugLog;
                if (aFj1eSDK == null) {
                    aFj1eSDK = new AFj1eSDK();
                    this.setDebugLog = aFj1eSDK;
                }
                SdkData sdkData = new SdkData(str, cVar, strUnregisterClient, strAFLogger, packageName, aFj1eSDK.unregisterClient());
                Context context = this.d.d;
                if (context == null) {
                    throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
                }
                this.stop = new ExceptionManagerImpl(sdkData, context, d(), AFKeystoreWrapper().p_(), new i(this, (byte) 3), new a((byte) 6));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.stop;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final AFi1vSDK getInstance() {
        AFi1vSDK aFi1vSDK = this.updateServerUninstallToken;
        if (aFi1vSDK != null) {
            return aFi1vSDK;
        }
        Context context = this.d.d;
        if (context == null) {
            jf4.n("Context must be set via setContext method before calling this dependency.");
            return null;
        }
        AFi1vSDK aFi1vSDK2 = new AFi1vSDK(context);
        this.updateServerUninstallToken = aFi1vSDK2;
        return aFi1vSDK2;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final synchronized AFd1jSDK getLevel() {
        AFd1jSDK aFd1jSDK;
        aFd1jSDK = this.setAndroidIdData;
        if (aFd1jSDK == null) {
            aFd1jSDK = new AFd1jSDK(AFLogger(), AFKeystoreWrapper());
            this.setAndroidIdData = aFd1jSDK;
        }
        return aFd1jSDK;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final synchronized AFa1aSDK getSdkVersion() {
        AFa1aSDK aFb1tSDK;
        aFb1tSDK = this.setUserFirstName;
        if (aFb1tSDK == null) {
            aFb1tSDK = new AFb1tSDK(valueOf());
            this.setUserFirstName = aFb1tSDK;
        }
        return aFb1tSDK;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final synchronized AFf1hSDK i() {
        AFf1hSDK aFf1hSDK;
        try {
            aFf1hSDK = this.v;
            if (aFf1hSDK == null) {
                AFf1jSDK aFf1jSDK = new AFf1jSDK(AFKeystoreWrapper());
                AFc1iSDK aFc1iSDKAFLogger = AFLogger();
                AFc1eSDK aFc1eSDK = this.setCollectAndroidID;
                if (aFc1eSDK == null) {
                    aFc1eSDK = new AFc1eSDK();
                    this.setCollectAndroidID = aFc1eSDK;
                }
                AFf1kSDK aFf1kSDK = new AFf1kSDK(aFc1iSDKAFLogger, aFf1jSDK, aFc1eSDK);
                AFf1nSDK aFf1nSDK = new AFf1nSDK();
                AFc1iSDK aFc1iSDKAFLogger2 = AFLogger();
                AFf1fSDK aFf1fSDKAppsFlyerLib = AppsFlyerLib();
                AFd1sSDK aFd1sSDKUnregisterClient = unregisterClient();
                AFc1eSDK aFc1eSDK2 = this.setCollectAndroidID;
                if (aFc1eSDK2 == null) {
                    aFc1eSDK2 = new AFc1eSDK();
                    this.setCollectAndroidID = aFc1eSDK2;
                }
                AFf1hSDK aFf1hSDK2 = new AFf1hSDK(aFf1nSDK, aFc1iSDKAFLogger2, aFf1fSDKAppsFlyerLib, aFf1jSDK, aFd1sSDKUnregisterClient, aFf1kSDK, aFc1eSDK2, afWarnLog());
                this.v = aFf1hSDK2;
                aFf1hSDK = aFf1hSDK2;
            }
        } catch (Throwable th) {
            throw th;
        }
        return aFf1hSDK;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final AFj1cSDK onPause() {
        AFj1cSDK aFj1cSDK = this.setDebugLog;
        if (aFj1cSDK != null) {
            return aFj1cSDK;
        }
        AFj1eSDK aFj1eSDK = new AFj1eSDK();
        this.setDebugLog = aFj1eSDK;
        return aFj1eSDK;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final synchronized AppsFlyerProperties registerClient() {
        AppsFlyerProperties aFa1vSDK;
        aFa1vSDK = this.afErrorLog;
        if (aFa1vSDK == null) {
            aFa1vSDK = new AFa1vSDK(AFKeystoreWrapper());
            this.afErrorLog = aFa1vSDK;
        }
        return aFa1vSDK;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final AFc1eSDK setAndroidIdData() {
        AFc1eSDK aFc1eSDK = this.setCollectAndroidID;
        if (aFc1eSDK != null) {
            return aFc1eSDK;
        }
        AFc1eSDK aFc1eSDK2 = new AFc1eSDK();
        this.setCollectAndroidID = aFc1eSDK2;
        return aFc1eSDK2;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final synchronized AFj1wSDK setAppInviteOneLink() {
        AFj1wSDK aFj1xSDK;
        aFj1xSDK = this.setResolveDeepLinkURLs;
        if (aFj1xSDK == null) {
            aFj1xSDK = new AFj1xSDK(new AFc1dSDK(new i(this, (byte) 1)), new AFc1dSDK(new i(this, (byte) 2)));
            this.setResolveDeepLinkURLs = aFj1xSDK;
        }
        return aFj1xSDK;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final synchronized AFe1vSDK setCustomerUserId() {
        AFd1eSDK aFd1eSDK;
        aFd1eSDK = this.setAdditionalData;
        if (aFd1eSDK == null) {
            aFd1eSDK = new AFd1eSDK(AFKeystoreWrapper(), registerClient(), afWarnLog(), this);
            this.setAdditionalData = aFd1eSDK;
        }
        return aFd1eSDK;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final AFh1wSDK setDebugLog() {
        AFh1wSDK aFh1wSDK = this.setOutOfStore;
        if (aFh1wSDK != null) {
            return aFh1wSDK;
        }
        AFh1tSDK aFh1tSDK = new AFh1tSDK(this);
        this.setOutOfStore = aFh1tSDK;
        return aFh1tSDK;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final AFi1oSDK setImeiData() {
        try {
            if (this.setAppInviteOneLink == null) {
                try {
                    Object[] objArr = {AFLogger(), valueOf()};
                    Map map = AFi1nSDK.getSdkVersion;
                    Object declaredConstructor = map.get(-224518253);
                    if (declaredConstructor == null) {
                        declaredConstructor = ((Class) AFi1nSDK.AFKeystoreWrapper((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), ((Process.getThreadPriority(0) + 20) >> 6) + 37, (char) Drawable.resolveOpacity(0, 0))).getDeclaredConstructor(AFc1iSDK.class, AFd1zSDK.class);
                        map.put(-224518253, declaredConstructor);
                    }
                    this.setAppInviteOneLink = (AFi1oSDK) ((Constructor) declaredConstructor).newInstance(objArr);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(LogTag.PLAY_INTEGRITY_API, th2.getMessage() != null ? th2.getMessage() : "", th2, false, false);
        }
        return this.setAppInviteOneLink;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final AFf1eSDK setOaidData() {
        AFf1eSDK aFf1eSDK = this.clearUserPii;
        if (aFf1eSDK != null) {
            return aFf1eSDK;
        }
        Context context = this.d.d;
        if (context == null) {
            jf4.n("Context must be set via setContext method before calling this dependency.");
            return null;
        }
        AFc1eSDK aFc1eSDK = this.setCollectAndroidID;
        if (aFc1eSDK == null) {
            aFc1eSDK = new AFc1eSDK();
            this.setCollectAndroidID = aFc1eSDK;
        }
        AFg1zSDK aFg1zSDK = new AFg1zSDK(context, aFc1eSDK);
        AFc1eSDK aFc1eSDK2 = this.setCollectAndroidID;
        if (aFc1eSDK2 == null) {
            aFc1eSDK2 = new AFc1eSDK();
            this.setCollectAndroidID = aFc1eSDK2;
        }
        AFf1gSDK aFf1gSDK = new AFf1gSDK(aFg1zSDK, aFc1eSDK2);
        this.clearUserPii = aFf1gSDK;
        return aFf1gSDK;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final AFb1aSDK setUserEmail() {
        AFc1eSDK aFc1eSDK = this.setCollectAndroidID;
        if (aFc1eSDK == null) {
            aFc1eSDK = new AFc1eSDK();
            this.setCollectAndroidID = aFc1eSDK;
        }
        return new AFc1tSDK(aFc1eSDK, valueOf(), AppsFlyerLib());
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final AppsFlyerConversionListener setUserFirstName() {
        return this.setOneLinkCustomDomain;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final AFh1sSDK setUserLastName() {
        if (AFh1rSDK.unregisterClient() && this.getOutOfStore == null) {
            this.getOutOfStore = new AFh1oSDK(AFLogger(), afDebugLog());
        }
        return this.getOutOfStore;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final AFa1lSDK setUserPhone() {
        AFa1lSDK aFa1lSDK = this.setUserFbLoginId;
        if (aFa1lSDK != null) {
            return aFa1lSDK;
        }
        AFa1hSDK aFa1hSDK = new AFa1hSDK(AFKeystoreWrapper());
        this.setUserFbLoginId = aFa1hSDK;
        return aFa1hSDK;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final AFi1tSDK stop() {
        AFi1tSDK aFi1tSDK = this.setUserLastName;
        if (aFi1tSDK != null) {
            return aFi1tSDK;
        }
        AFi1qSDK aFi1qSDK = new AFi1qSDK();
        this.setUserLastName = aFi1qSDK;
        return aFi1qSDK;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final AFd1sSDK unregisterClient() {
        AFd1xSDK outOfStore = getOutOfStore();
        AFc1iSDK aFc1iSDKAFLogger = AFLogger();
        AFd1jSDK level = getLevel();
        AFj1mSDK aFj1mSDKSendPushNotificationData = sendPushNotificationData();
        AFj1cSDK aFj1eSDK = this.setDebugLog;
        if (aFj1eSDK == null) {
            aFj1eSDK = new AFj1eSDK();
            this.setDebugLog = aFj1eSDK;
        }
        return new AFd1sSDK(outOfStore, aFc1iSDKAFLogger, level, aFj1mSDKSendPushNotificationData, aFj1eSDK, AppsFlyerLib());
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final AFb1bSDK updateServerUninstallToken() {
        AFb1bSDK aFb1bSDK = this.setUserPhone;
        if (aFb1bSDK != null) {
            return aFb1bSDK;
        }
        AFb1cSDK aFb1cSDK = new AFb1cSDK(setOutOfStore(), enableTCFDataCollection());
        this.setUserPhone = aFb1cSDK;
        return aFb1cSDK;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final synchronized PurchaseHandler v() {
        PurchaseHandler purchaseHandler;
        purchaseHandler = this.force;
        if (purchaseHandler == null) {
            purchaseHandler = new PurchaseHandler(this);
            this.force = purchaseHandler;
        }
        return purchaseHandler;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final synchronized AFd1zSDK valueOf() {
        return this.d;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final synchronized AFc1vSDK values() {
        AFc1vSDK aFc1uSDK;
        aFc1uSDK = this.onPause;
        if (aFc1uSDK == null) {
            aFc1uSDK = new AFc1uSDK(valueOf(), AFKeystoreWrapper());
            this.onPause = aFc1uSDK;
        }
        return aFc1uSDK;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final AFf1aSDK w() {
        AFf1aSDK aFf1aSDK = this.afWarnLog;
        if (aFf1aSDK != null) {
            return aFf1aSDK;
        }
        AFa1aSDK sdkVersion = getSdkVersion();
        AFi1aSDK aFi1aSDKAfDebugLog = afDebugLog();
        AFc1iSDK aFc1iSDKAFLogger = AFLogger();
        AFc1eSDK aFc1eSDK = this.setCollectAndroidID;
        if (aFc1eSDK == null) {
            aFc1eSDK = new AFc1eSDK();
            this.setCollectAndroidID = aFc1eSDK;
        }
        AFg1tSDK aFg1tSDK = new AFg1tSDK(this, sdkVersion, aFi1aSDKAfDebugLog, aFc1iSDKAFLogger, aFc1eSDK, valueOf(), force(), AppsFlyerLib(), registerClient(), clearUserPii());
        this.afWarnLog = aFg1tSDK;
        return aFg1tSDK;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final void registerClient(AppsFlyerConversionListener appsFlyerConversionListener) {
        this.setOneLinkCustomDomain = appsFlyerConversionListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Unit AFKeystoreWrapper(String str) {
        AFLogger.INSTANCE.d(LogTag.EXCEPTION_MANAGER, str);
        return Unit.f46060a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void AFLogger(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        try {
            threadPoolExecutor.getQueue().put(runnable);
        } catch (InterruptedException e) {
            AFLogger.INSTANCE.e(LogTag.GENERAL, "Could not create executor for queue", e, false, false);
            Thread.currentThread().interrupt();
        }
    }
}
