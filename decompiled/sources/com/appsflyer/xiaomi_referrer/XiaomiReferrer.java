package com.appsflyer.xiaomi_referrer;

import android.content.Context;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.sdk_base.referrer.Payload;
import com.appsflyer.sdk_base.referrer.Referrer;
import com.appsflyer.sdk_base.referrer.ReferrerProp;
import com.appsflyer.sdk_base.util.AndroidExtensionsKt;
import com.miui.referrer.api.GetAppsReferrerClient;
import com.miui.referrer.api.GetAppsReferrerDetails;
import com.miui.referrer.api.GetAppsReferrerStateListener;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class XiaomiReferrer extends Referrer {
    public final AFLoggerBase logger;

    public XiaomiReferrer(ReferrerProp referrerProp) {
        super(Payload.TYPE_STORE, Payload.SOURCE_XIAOMI, referrerProp);
        this.logger = referrerProp.getLogger();
    }

    private boolean allow() {
        try {
            Class.forName("com.miui.referrer.api.GetAppsReferrerClient");
            this.logger.d(LogTag.REFERRER, "Xiaomi Install Referrer is allowed");
            return true;
        } catch (ClassNotFoundException unused) {
            this.logger.v(LogTag.REFERRER, "Class com.miui.referrer.api.GetAppsReferrerClient not found");
            return false;
        } catch (Throwable th) {
            this.logger.e(LogTag.REFERRER, "An error occurred while trying to access GetAppsReferrerClient", th);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleConnectionOK(GetAppsReferrerClient getAppsReferrerClient) {
        this.map.put("response", Payload.RESPONSE_OK);
        try {
            AFLoggerBase aFLoggerBase = this.logger;
            LogTag logTag = LogTag.REFERRER;
            aFLoggerBase.d(logTag, "XiaomiInstallReferrer connected");
            if (!getAppsReferrerClient.isReady()) {
                this.logger.w(logTag, "XiaomiReferrerClient: XiaomiInstallReferrer is not ready");
                return;
            }
            GetAppsReferrerDetails installReferrer = getAppsReferrerClient.getInstallReferrer();
            String installReferrer2 = installReferrer.getInstallReferrer();
            if (installReferrer2 != null) {
                this.map.put(Payload.RFR, installReferrer2);
            }
            this.map.put(Payload.CLICK_TS, Long.valueOf(installReferrer.getReferrerClickTimestampSeconds()));
            this.map.put(Payload.INSTALL_BEGIN_TS, Long.valueOf(installReferrer.getInstallBeginTimestampSeconds()));
            HashMap map = new HashMap();
            map.put(Payload.CLICK_SERVER_TS, Long.valueOf(installReferrer.getReferrerClickTimestampServerSeconds()));
            map.put(Payload.INSTALL_BEGIN_SERVER_TS, Long.valueOf(installReferrer.getInstallBeginTimestampServerSeconds()));
            map.put(Payload.INSTALL_VERSION, installReferrer.getInstallVersion());
            this.map.put(Payload.XIAOMI_CUSTOM, map);
        } catch (Throwable th) {
            onError(th);
        }
    }

    public void onError(Throwable th) {
        this.logger.e(LogTag.REFERRER, th.getMessage() != null ? th.getMessage() : "", th, false, false);
    }

    @Override // com.appsflyer.sdk_base.referrer.Referrer
    public void start(final Context context) {
        if (allow()) {
            start();
            final GetAppsReferrerClient getAppsReferrerClientBuild = GetAppsReferrerClient.Companion.newBuilder(context).build();
            getAppsReferrerClientBuild.startConnection(new GetAppsReferrerStateListener() { // from class: com.appsflyer.xiaomi_referrer.XiaomiReferrer.1
                public void onGetAppsReferrerSetupFinished(int i) {
                    try {
                        XiaomiReferrer.this.map.put(Payload.API, Long.valueOf(AndroidExtensionsKt.getVersionCode(context, "com.xiaomi.mipicks")));
                        XiaomiReferrer.this.map.put(Payload.API_NAME, AndroidExtensionsKt.getVersionName(context, "com.xiaomi.mipicks"));
                        if (i == -1) {
                            XiaomiReferrer.this.logger.w(LogTag.REFERRER, "XiaomiInstallReferrer SERVICE_DISCONNECTED");
                            XiaomiReferrer.this.map.put("response", Payload.RESPONSE_SERVICE_DISCONNECTED);
                        } else if (i == 0) {
                            XiaomiReferrer.this.handleConnectionOK(getAppsReferrerClientBuild);
                        } else if (i == 1) {
                            XiaomiReferrer.this.map.put("response", Payload.RESPONSE_SERVICE_UNAVAILABLE);
                            XiaomiReferrer.this.logger.w(LogTag.REFERRER, "XiaomiInstallReferrer not supported");
                        } else if (i != 2) {
                            XiaomiReferrer xiaomiReferrer = XiaomiReferrer.this;
                            if (i == 3) {
                                xiaomiReferrer.logger.w(LogTag.REFERRER, "XiaomiInstallReferrer DEVELOPER_ERROR");
                                XiaomiReferrer.this.map.put("response", Payload.RESPONSE_DEVELOPER_ERROR);
                            } else if (i != 4) {
                                xiaomiReferrer.logger.w(LogTag.REFERRER, "responseCode not found.");
                            } else {
                                xiaomiReferrer.logger.w(LogTag.REFERRER, "XiaomiInstallReferrer DEVELOPER_ERROR");
                                XiaomiReferrer.this.map.put("response", Payload.RESPONSE_PERMISSION_ERROR);
                            }
                        } else {
                            XiaomiReferrer.this.logger.w(LogTag.REFERRER, "XiaomiInstallReferrer FEATURE_NOT_SUPPORTED");
                            XiaomiReferrer.this.map.put("response", Payload.RESPONSE_FEATURE_NOT_SUPPORTED);
                        }
                        XiaomiReferrer.this.logger.d(LogTag.REFERRER, "Xiaomi Install Referrer collected locally");
                    } catch (Throwable th) {
                        try {
                            XiaomiReferrer.this.onError(th);
                        } finally {
                            XiaomiReferrer.this.finish();
                            getAppsReferrerClientBuild.endConnection();
                        }
                    }
                }

                public void onGetAppsServiceDisconnected() {
                }
            });
        }
    }
}
