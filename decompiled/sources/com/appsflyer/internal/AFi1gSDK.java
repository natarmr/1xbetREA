package com.appsflyer.internal;

import android.content.Context;
import android.os.Process;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.sdk_base.referrer.Payload;
import com.appsflyer.sdk_base.referrer.Referrer;
import com.appsflyer.sdk_base.referrer.ReferrerProp;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public class AFi1gSDK extends Referrer {
    final ExecutorService AFLogger;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFi1gSDK$2, reason: invalid class name */
    public class AnonymousClass2 implements InstallReferrerStateListener {
        final /* synthetic */ Context val$context;
        final /* synthetic */ InstallReferrerClient val$referrerClient;

        public AnonymousClass2(InstallReferrerClient installReferrerClient, Context context) {
            this.val$referrerClient = installReferrerClient;
            this.val$context = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onInstallReferrerSetupFinished$0(InstallReferrerClient installReferrerClient, Context context, int i) {
            AFi1gSDK.this.AFLogger(installReferrerClient, context, i);
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public final void onInstallReferrerServiceDisconnected() {
            AFLogger.INSTANCE.d(LogTag.REFERRER, "Install Referrer service disconnected");
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public final void onInstallReferrerSetupFinished(final int i) {
            ExecutorService executorService = AFi1gSDK.this.AFLogger;
            final InstallReferrerClient installReferrerClient = this.val$referrerClient;
            final Context context = this.val$context;
            executorService.execute(new Runnable() { // from class: com.appsflyer.internal.z
                @Override // java.lang.Runnable
                public final void run() {
                    this.f45452a.lambda$onInstallReferrerSetupFinished$0(installReferrerClient, context, i);
                }
            });
        }
    }

    public AFi1gSDK(ReferrerProp referrerProp) {
        super(Payload.TYPE_STORE, Payload.SOURCE_GOOGLE, referrerProp);
        this.AFLogger = referrerProp.getBackgroundExecutor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void registerClient(Context context) {
        start();
        try {
            InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(context).build();
            AFLogger.INSTANCE.d(LogTag.REFERRER, "Connecting to Install Referrer Library...");
            installReferrerClientBuild.startConnection(new AnonymousClass2(installReferrerClientBuild, context));
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(LogTag.REFERRER, "referrerClient -> startConnection", th);
        }
    }

    public final void AFLogger(InstallReferrerClient installReferrerClient, Context context, int i) {
        AFLogger aFLogger;
        LogTag logTag;
        Pair<Long, String> pairD = AFj1qSDK.d(context, "com.android.vending");
        this.map.put(Payload.API, pairD.f46059a);
        this.map.put(Payload.API_NAME, pairD.b);
        if (i == -1) {
            aFLogger = AFLogger.INSTANCE;
            logTag = LogTag.REFERRER;
            aFLogger.w(logTag, "InstallReferrer SERVICE_DISCONNECTED");
            this.map.put("response", Payload.RESPONSE_SERVICE_DISCONNECTED);
        } else if (i == 0) {
            this.map.put("response", Payload.RESPONSE_OK);
            try {
                AFLogger aFLogger2 = AFLogger.INSTANCE;
                LogTag logTag2 = LogTag.REFERRER;
                aFLogger2.d(logTag2, "InstallReferrer connected");
                if (installReferrerClient.isReady()) {
                    ReferrerDetails installReferrer = installReferrerClient.getInstallReferrer();
                    String installReferrer2 = installReferrer.getInstallReferrer();
                    if (installReferrer2 != null) {
                        this.map.put(Payload.RFR, installReferrer2);
                    }
                    this.map.put(Payload.CLICK_TS, Long.valueOf(installReferrer.getReferrerClickTimestampSeconds()));
                    this.map.put(Payload.INSTALL_BEGIN_TS, Long.valueOf(installReferrer.getInstallBeginTimestampSeconds()));
                    HashMap map = new HashMap();
                    try {
                        map.put(Payload.INSTANT, Boolean.valueOf(installReferrer.getGooglePlayInstantParam()));
                    } catch (NoSuchMethodError e) {
                        AFLogger aFLogger3 = AFLogger.INSTANCE;
                        LogTag logTag3 = LogTag.REFERRER;
                        aFLogger3.e(logTag3, "getGooglePlayInstantParam not exist", e, false, false);
                        aFLogger2 = aFLogger3;
                        logTag2 = logTag3;
                    }
                    try {
                        map.put(Payload.CLICK_SERVER_TS, Long.valueOf(installReferrer.getReferrerClickTimestampServerSeconds()));
                        map.put(Payload.INSTALL_BEGIN_SERVER_TS, Long.valueOf(installReferrer.getInstallBeginTimestampServerSeconds()));
                        map.put(Payload.INSTALL_VERSION, installReferrer.getInstallVersion());
                    } catch (NoSuchMethodError e2) {
                        AFLogger aFLogger4 = AFLogger.INSTANCE;
                        LogTag logTag4 = LogTag.REFERRER;
                        aFLogger4.e(logTag4, "some method not exist", e2, false, false);
                        aFLogger2 = aFLogger4;
                        logTag2 = logTag4;
                    }
                    if (!map.isEmpty()) {
                        this.map.put(Payload.GOOGLE_CUSTOM, map);
                    }
                    installReferrerClient.endConnection();
                } else {
                    aFLogger2.w(logTag2, "ReferrerClient: InstallReferrer is not ready");
                }
                aFLogger = aFLogger2;
                logTag = logTag2;
            } catch (Throwable th) {
                AFLogger aFLogger5 = AFLogger.INSTANCE;
                LogTag logTag5 = LogTag.REFERRER;
                StringBuilder sb = new StringBuilder("Failed to get install referrer: ");
                sb.append(th.getMessage());
                aFLogger5.w(logTag5, sb.toString());
                aFLogger5.e(logTag5, "Failed to get install referrer", th, false, false);
                aFLogger = aFLogger5;
                logTag = logTag5;
            }
        } else if (i == 1) {
            this.map.put("response", Payload.RESPONSE_SERVICE_UNAVAILABLE);
            aFLogger = AFLogger.INSTANCE;
            logTag = LogTag.REFERRER;
            aFLogger.w(logTag, "InstallReferrer not supported");
        } else if (i == 2) {
            aFLogger = AFLogger.INSTANCE;
            logTag = LogTag.REFERRER;
            aFLogger.w(logTag, "InstallReferrer FEATURE_NOT_SUPPORTED");
            this.map.put("response", Payload.RESPONSE_FEATURE_NOT_SUPPORTED);
        } else if (i != 3) {
            aFLogger = AFLogger.INSTANCE;
            logTag = LogTag.REFERRER;
            aFLogger.w(logTag, "responseCode not found.");
        } else {
            aFLogger = AFLogger.INSTANCE;
            logTag = LogTag.REFERRER;
            aFLogger.w(logTag, "InstallReferrer DEVELOPER_ERROR");
            this.map.put("response", Payload.RESPONSE_DEVELOPER_ERROR);
        }
        aFLogger.d(logTag, "Install Referrer collected locally");
        finish();
    }

    @Override // com.appsflyer.sdk_base.referrer.Referrer
    public void start(Context context) {
        if (AFLogger(context)) {
            this.AFLogger.execute(new o(this, context, (byte) 4));
        }
    }

    private static boolean AFLogger(Context context) {
        try {
            int iCheckPermission = context.checkPermission("com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE", Process.myPid(), Process.myUid());
            AFLogger aFLogger = AFLogger.INSTANCE;
            LogTag logTag = LogTag.GENERAL;
            StringBuilder sb = new StringBuilder("is Permission Available: com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE; res: ");
            sb.append(iCheckPermission);
            aFLogger.v(logTag, sb.toString());
            if (iCheckPermission == 0) {
                aFLogger.d(LogTag.REFERRER, "Install referrer is allowed");
                return true;
            }
            aFLogger.d(LogTag.REFERRER, "Install referrer is not allowed");
            return false;
        } catch (ClassNotFoundException e) {
            AFLogger aFLogger2 = AFLogger.INSTANCE;
            LogTag logTag2 = LogTag.REFERRER;
            aFLogger2.e(logTag2, "InstallReferrerClient not found", e, false, false);
            aFLogger2.v(logTag2, "Class com.android.installreferrer.api.InstallReferrerClient not found");
            return false;
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(LogTag.REFERRER, "An error occurred while trying to verify manifest : ".concat("com.android.installreferrer.api.InstallReferrerClient"), th);
            return false;
        }
    }
}
