package com.appsflyer.huawei_referrer;

import a.llo;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.sdk_base.referrer.Payload;
import com.appsflyer.sdk_base.referrer.Referrer;
import com.appsflyer.sdk_base.referrer.ReferrerProp;
import com.appsflyer.sdk_base.util.AndroidExtensionsKt;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public class HuaweiReferrer extends Referrer {
    private static final String HUAWEI_CONTENT_PROVIDER_NAME = "com.huawei.appmarket.commondata";
    private final HuaweiContentProviderValidator contentProviderValidator;
    private final ExecutorService executorService;
    private final AFLoggerBase logger;

    public HuaweiReferrer(ReferrerProp referrerProp) {
        super(Payload.TYPE_STORE, Payload.SOURCE_HUAWEI, referrerProp);
        AFLoggerBase logger = referrerProp.getLogger();
        this.logger = logger;
        this.executorService = referrerProp.getBackgroundExecutor();
        this.contentProviderValidator = new HuaweiContentProviderValidatorImpl(logger);
    }

    private void fetchAttributionData(Context context) {
        try {
            Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://com.huawei.appmarket.commondata/item/5"), null, null, new String[]{context.getPackageName()}, null);
            try {
                String str = context.getPackageManager().resolveContentProvider(HUAWEI_CONTENT_PROVIDER_NAME, 128).packageName;
                this.map.put(Payload.API, Long.valueOf(AndroidExtensionsKt.getVersionCode(context, str)));
                this.map.put(Payload.API_NAME, AndroidExtensionsKt.getVersionName(context, str));
                if (cursorQuery != null) {
                    boolean zMoveToFirst = cursorQuery.moveToFirst();
                    Map<String, Object> map = this.map;
                    if (zMoveToFirst) {
                        map.put("response", Payload.RESPONSE_OK);
                        this.map.put(Payload.RFR, cursorQuery.getString(0));
                        this.map.put(Payload.CLICK_TS, Long.valueOf(cursorQuery.getLong(1)));
                        this.map.put(Payload.INSTALL_END_TS, Long.valueOf(cursorQuery.getLong(2)));
                        if (cursorQuery.getColumnCount() > 3) {
                            this.map.put(Payload.INSTALL_BEGIN_TS, Long.valueOf(cursorQuery.getLong(3)));
                            HashMap map2 = new HashMap();
                            String string = cursorQuery.getString(4);
                            if (string != null) {
                                map2.put(Payload.HUAWEI_TRACK_ID, string);
                            }
                            map2.put(Payload.HUAWEI_RFR_EX, cursorQuery.getString(5));
                            this.map.put(Payload.HUAWEI_CUSTOM, map2);
                        }
                    } else {
                        map.put("response", Payload.RESPONSE_FEATURE_NOT_SUPPORTED);
                    }
                } else {
                    this.map.put("response", Payload.RESPONSE_SERVICE_UNAVAILABLE);
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (Throwable th) {
                if (cursorQuery == null) {
                    throw th;
                }
                try {
                    cursorQuery.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            this.map.put("response", Payload.RESPONSE_FEATURE_NOT_SUPPORTED);
            onError(th3);
        }
    }

    private boolean isAllowedToRun(Context context) {
        if (!this.contentProviderValidator.isContentProviderPresent(context)) {
            this.logger.d(LogTag.REFERRER, "Huawei referrer collection disallowed by missing content provider.");
            return false;
        }
        if (this.contentProviderValidator.isProviderSignatureValid(context)) {
            return true;
        }
        this.logger.d(LogTag.REFERRER, "Huawei referrer collection disallowed by invalid content provider.");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$0(Context context) {
        start();
        fetchAttributionData(context);
        finish();
    }

    public void onError(Throwable th) {
        this.logger.e(LogTag.REFERRER, th.getMessage() != null ? th.getMessage() : "", th, false, true);
    }

    @Override // com.appsflyer.sdk_base.referrer.Referrer
    public void start(Context context) {
        if (isAllowedToRun(context)) {
            this.executorService.execute(new llo(this, context, (byte) 8));
        }
    }
}
