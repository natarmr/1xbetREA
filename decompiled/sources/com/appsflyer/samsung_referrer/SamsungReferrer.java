package com.appsflyer.samsung_referrer;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.referrer.Payload;
import com.appsflyer.sdk_base.referrer.ReferrerProp;
import com.appsflyer.sdk_base.util.AndroidExtensionsKt;
import com.appsflyer.sdk_base.util.ContentProviderFetcher;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public class SamsungReferrer extends ContentProviderReferrer {
    private final ExecutorService executorService;
    private final AFLoggerBase loggerBase;

    public SamsungReferrer(ReferrerProp referrerProp) {
        super(Payload.TYPE_STORE, Payload.SOURCE_SAMSUNG, referrerProp);
        this.executorService = referrerProp.getBackgroundExecutor();
        this.loggerBase = referrerProp.getLogger();
    }

    @Override // com.appsflyer.sdk_base.referrer.Referrer
    public void start(Context context) {
        start(new ContentProviderFetcher<Map<String, Object>>(context, this.loggerBase, this.executorService, "com.sec.android.app.samsungapps.referrer", "FBA3AF4E7757D9016E953FB3EE4671CA2BD9AF725F9A53D52ED4A38EAAA08901") { // from class: com.appsflyer.samsung_referrer.SamsungReferrer.1
            private void addBoolean(String str, Map<String, Object> map, Cursor cursor) {
                String string;
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex == -1 || (string = cursor.getString(columnIndex)) == null) {
                    return;
                }
                map.put(str, Boolean.valueOf(Boolean.parseBoolean(string)));
            }

            private void addLong(String str, Map<String, Object> map, Cursor cursor) {
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex == -1) {
                    return;
                }
                long j = cursor.getLong(columnIndex);
                if (j == 0) {
                    return;
                }
                map.put(str, Long.valueOf(j));
            }

            private void addString(String str, Map<String, Object> map, Cursor cursor) {
                String string;
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex == -1 || (string = cursor.getString(columnIndex)) == null) {
                    return;
                }
                map.put(str, string);
            }

            @Override // com.appsflyer.sdk_base.util.ContentProviderFetcher
            public Map<String, Object> query() {
                try {
                    Cursor cursorQuery = this.context.getContentResolver().query(Uri.parse("content://" + this.authority), null, null, null, null);
                    try {
                        if (cursorQuery != null) {
                            boolean zMoveToFirst = cursorQuery.moveToFirst();
                            SamsungReferrer samsungReferrer = SamsungReferrer.this;
                            if (zMoveToFirst) {
                                samsungReferrer.map.put("response", Payload.RESPONSE_OK);
                                addString(Payload.RFR, SamsungReferrer.this.map, cursorQuery);
                                addLong(Payload.CLICK_TS, SamsungReferrer.this.map, cursorQuery);
                                addLong(Payload.INSTALL_BEGIN_TS, SamsungReferrer.this.map, cursorQuery);
                                addLong(Payload.INSTALL_END_TS, SamsungReferrer.this.map, cursorQuery);
                                addString(Payload.ORGANIC_KEYWORDS, SamsungReferrer.this.map, cursorQuery);
                                addString(Payload.ATTR_TYPE, SamsungReferrer.this.map, cursorQuery);
                                HashMap map = new HashMap();
                                addBoolean(Payload.INSTANT, map, cursorQuery);
                                addLong(Payload.CLICK_SERVER_TS, map, cursorQuery);
                                addLong(Payload.INSTALL_BEGIN_SERVER_TS, map, cursorQuery);
                                addString(Payload.INSTALL_VERSION, map, cursorQuery);
                                if (!map.isEmpty()) {
                                    SamsungReferrer.this.map.put(Payload.CUSTOM, map);
                                }
                            } else {
                                samsungReferrer.map.put("response", Payload.RESPONSE_FEATURE_NOT_SUPPORTED);
                            }
                        } else {
                            SamsungReferrer.this.map.put("response", Payload.RESPONSE_SERVICE_UNAVAILABLE);
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
                        String str = this.context.getPackageManager().resolveContentProvider(this.authority, 128).packageName;
                        SamsungReferrer.this.map.put(Payload.API, Long.valueOf(AndroidExtensionsKt.getVersionCode(this.context, str)));
                        SamsungReferrer.this.map.put(Payload.API_NAME, AndroidExtensionsKt.getVersionName(this.context, str));
                        SamsungReferrer.this.finish();
                        return SamsungReferrer.this.map;
                    }
                } catch (Exception e) {
                    SamsungReferrer.this.map.put("response", Payload.RESPONSE_FEATURE_NOT_SUPPORTED);
                    onError(e, true);
                }
                try {
                    String str2 = this.context.getPackageManager().resolveContentProvider(this.authority, 128).packageName;
                    SamsungReferrer.this.map.put(Payload.API, Long.valueOf(AndroidExtensionsKt.getVersionCode(this.context, str2)));
                    SamsungReferrer.this.map.put(Payload.API_NAME, AndroidExtensionsKt.getVersionName(this.context, str2));
                } catch (Throwable th3) {
                    onError(th3, false);
                }
                SamsungReferrer.this.finish();
                return SamsungReferrer.this.map;
            }
        });
    }
}
