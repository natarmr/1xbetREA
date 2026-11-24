package com.appsflyer.internal;

import a.m460;
import a.t9f;
import a.xp20;
import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.sdk_base.referrer.Payload;
import com.appsflyer.sdk_base.referrer.Referrer;
import com.appsflyer.sdk_base.referrer.ReferrerProp;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class AFi1iSDK extends Referrer {
    private String AFKeystoreWrapper;
    private final AFc1iSDK d;
    private final AFi1jSDK registerClient;
    private final Runnable unregisterClient;

    public /* synthetic */ class AFa1ySDK {
        public static final /* synthetic */ int[] AFKeystoreWrapper;

        static {
            int[] iArr = new int[AFi1jSDK.values().length];
            try {
                iArr[AFi1jSDK.FACEBOOK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFi1jSDK.INSTAGRAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AFi1jSDK.FACEBOOK_LITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            AFKeystoreWrapper = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AFi1iSDK(AFc1iSDK aFc1iSDK, AFi1jSDK aFi1jSDK, ReferrerProp referrerProp, Runnable runnable) {
        String str;
        aFc1iSDK.getClass();
        aFi1jSDK.getClass();
        referrerProp.getClass();
        runnable.getClass();
        int i = AFi1fSDK.AFa1tSDK.AFKeystoreWrapper[aFi1jSDK.ordinal()];
        if (i == 1) {
            str = Payload.SOURCE_FACEBOOK;
        } else if (i == 2) {
            str = Payload.SOURCE_INSTAGRAM;
        } else {
            if (i != 3) {
                t9f.b();
                throw null;
            }
            str = Payload.SOURCE_FACEBOOK_LITE;
        }
        super(Payload.TYPE_APP, str, referrerProp);
        this.d = aFc1iSDK;
        this.registerClient = aFi1jSDK;
        this.unregisterClient = runnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:74:0x01fe A[PHI: r3
  0x01fe: PHI (r3v4 android.content.ContentProviderClient) = 
  (r3v3 android.content.ContentProviderClient)
  (r22v3 android.content.ContentProviderClient)
  (r22v3 android.content.ContentProviderClient)
 binds: [B:83:0x0242, B:73:0x01fc, B:78:0x0212] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:77:0x020f  */
    /* JADX WARN: Code duplicated, block: B:82:0x023f  */
    public static final void d(AFi1iSDK aFi1iSDK, Context context) {
        Throwable th;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient;
        Cursor cursor;
        AFLogger aFLogger;
        LogTag logTag;
        Uri uri;
        String string;
        String str;
        aFi1iSDK.start();
        String str2 = aFi1iSDK.AFKeystoreWrapper;
        str2.getClass();
        try {
            AFi1jSDK aFi1jSDK = aFi1iSDK.registerClient;
            int[] iArr = AFa1ySDK.AFKeystoreWrapper;
            int i = iArr[aFi1jSDK.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new m460();
                    }
                    if (context.getPackageManager().resolveContentProvider("com.facebook.lite.provider.InstallReferrerProvider", 0) != null) {
                        aFLogger = AFLogger.INSTANCE;
                        logTag = LogTag.META_REFERRER;
                        AFLoggerBase.d$default(aFLogger, logTag, "Found Facebook Lite content provider", false, 4, null);
                        uri = Uri.parse("content://com.facebook.lite.provider.InstallReferrerProvider/".concat(str2));
                    } else {
                        aFLogger = AFLogger.INSTANCE;
                        logTag = LogTag.META_REFERRER;
                        AFLoggerBase.d$default(aFLogger, logTag, "Facebook Lite content provider not found", false, 4, null);
                        uri = null;
                    }
                } else if (context.getPackageManager().resolveContentProvider("com.instagram.contentprovider.InstallReferrerProvider", 0) != null) {
                    aFLogger = AFLogger.INSTANCE;
                    logTag = LogTag.META_REFERRER;
                    AFLoggerBase.d$default(aFLogger, logTag, "Found Instagram content provider", false, 4, null);
                    uri = Uri.parse("content://com.instagram.contentprovider.InstallReferrerProvider/".concat(str2));
                } else {
                    aFLogger = AFLogger.INSTANCE;
                    logTag = LogTag.META_REFERRER;
                    AFLoggerBase.d$default(aFLogger, logTag, "Instagram content provider not found", false, 4, null);
                    uri = null;
                }
            } else if (context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.InstallReferrerProvider", 0) != null) {
                aFLogger = AFLogger.INSTANCE;
                logTag = LogTag.META_REFERRER;
                AFLoggerBase.d$default(aFLogger, logTag, "Found Facebook content provider", false, 4, null);
                uri = Uri.parse("content://com.facebook.katana.provider.InstallReferrerProvider/".concat(str2));
            } else {
                aFLogger = AFLogger.INSTANCE;
                logTag = LogTag.META_REFERRER;
                AFLoggerBase.d$default(aFLogger, logTag, "Facebook content provider not found", false, 4, null);
                uri = null;
            }
            if (uri != null) {
                contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uri);
                try {
                    Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient != null ? contentProviderClientAcquireUnstableContentProviderClient.query(uri, new String[]{"install_referrer", Payload.META_IS_CLICK_THROUGH_CUSTOM_KEY, "actual_timestamp"}, null, null, null) : null;
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                int columnIndex = cursorQuery.getColumnIndex("install_referrer");
                                if (columnIndex != -1) {
                                    string = cursorQuery.getString(columnIndex);
                                } else {
                                    AFLoggerBase.d$default(aFLogger, logTag, "No such column, " + aFi1iSDK.registerClient + " provider", false, 4, null);
                                    string = null;
                                }
                                if (string != null) {
                                    AFLoggerBase.d$default(aFLogger, logTag, "Collected " + aFi1iSDK.registerClient + " attribution data.", false, 4, null);
                                    aFi1iSDK.map.put("response", Payload.RESPONSE_OK);
                                    aFi1iSDK.map.put(Payload.RFR, string);
                                    int columnIndex2 = cursorQuery.getColumnIndex("actual_timestamp");
                                    Long lValueOf = columnIndex2 != -1 ? Long.valueOf(cursorQuery.getLong(columnIndex2)) : null;
                                    if (lValueOf != null) {
                                        aFi1iSDK.map.put(Payload.CLICK_TS, Long.valueOf(lValueOf.longValue()));
                                    }
                                    int columnIndex3 = cursorQuery.getColumnIndex(Payload.META_IS_CLICK_THROUGH_CUSTOM_KEY);
                                    Integer numValueOf = columnIndex3 != -1 ? Integer.valueOf(cursorQuery.getInt(columnIndex3)) : null;
                                    if (numValueOf != null) {
                                        aFi1iSDK.map.put(Payload.META_CUSTOM, xp20.h(new Pair(Payload.META_IS_CLICK_THROUGH_CUSTOM_KEY, Integer.valueOf(numValueOf.intValue()))));
                                    }
                                    int i2 = iArr[aFi1iSDK.registerClient.ordinal()];
                                    if (i2 == 1) {
                                        str = "com.facebook.katana";
                                    } else if (i2 == 2) {
                                        str = "com.instagram.android";
                                    } else {
                                        if (i2 != 3) {
                                            throw new m460();
                                        }
                                        str = "com.facebook.lite";
                                    }
                                    aFi1iSDK.map.put(Payload.API, Long.valueOf(AFj1qSDK.unregisterClient(context, str)));
                                    aFi1iSDK.map.put(Payload.API_NAME, AFj1qSDK.AFKeystoreWrapper(context, str));
                                }
                                cursorQuery.close();
                                if (contentProviderClientAcquireUnstableContentProviderClient != 0) {
                                    contentProviderClientAcquireUnstableContentProviderClient.close();
                                }
                            } else {
                                AFLoggerBase.d$default(aFLogger, logTag, "Content provider returned no data", false, 4, null);
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                                if (contentProviderClientAcquireUnstableContentProviderClient != 0) {
                                    contentProviderClientAcquireUnstableContentProviderClient.close();
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = cursorQuery;
                            try {
                                AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.META_REFERRER, "Error while collecting Meta Install Referrer for " + aFi1iSDK.registerClient.name() + " provider", th, false, false, false, false, 120, null);
                                if (cursor != null) {
                                    cursor.close();
                                }
                                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                                    contentProviderClientAcquireUnstableContentProviderClient.close();
                                }
                            } catch (Throwable th3) {
                                if (cursor != null) {
                                    cursor.close();
                                }
                                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                                    contentProviderClientAcquireUnstableContentProviderClient.close();
                                }
                                throw th3;
                            }
                        }
                    } else {
                        AFLoggerBase.d$default(aFLogger, logTag, "Content provider returned no data", false, 4, null);
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (contentProviderClientAcquireUnstableContentProviderClient != 0) {
                            contentProviderClientAcquireUnstableContentProviderClient.close();
                        }
                    }
                } catch (Throwable th4) {
                    contentProviderClientAcquireUnstableContentProviderClient = contentProviderClientAcquireUnstableContentProviderClient;
                    th = th4;
                    cursor = null;
                    AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.META_REFERRER, "Error while collecting Meta Install Referrer for " + aFi1iSDK.registerClient.name() + " provider", th, false, false, false, false, 120, null);
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        contentProviderClientAcquireUnstableContentProviderClient.close();
                    }
                    aFi1iSDK.finish();
                    aFi1iSDK.unregisterClient.run();
                }
            }
        } catch (Throwable th5) {
            th = th5;
            contentProviderClientAcquireUnstableContentProviderClient = null;
        }
        aFi1iSDK.finish();
        aFi1iSDK.unregisterClient.run();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007c A[PHI: r0
  0x007c: PHI (r0v6 java.lang.String) = (r0v5 java.lang.String), (r0v23 java.lang.String), (r0v29 java.lang.String) binds: [B:10:0x002b, B:19:0x0052, B:28:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ac, code lost:
    
        if (r11.getPackageManager().resolveContentProvider("com.facebook.lite.provider.InstallReferrerProvider", 0) != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00bd, code lost:
    
        if (r11.getPackageManager().resolveContentProvider("com.instagram.contentprovider.InstallReferrerProvider", 0) != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ca, code lost:
    
        if (r11.getPackageManager().resolveContentProvider("com.facebook.katana.provider.InstallReferrerProvider", 0) != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00cc, code lost:
    
        getProp().getBackgroundExecutor().execute(new com.appsflyer.internal.o(r10, r11, 5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00dd, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00de, code lost:
    
        com.appsflyer.sdk_base.logger.AFLoggerBase.d$default(com.appsflyer.AFLogger.INSTANCE, com.appsflyer.sdk_base.logger.LogTag.META_REFERRER, "Referrer collection disallowed by missing content providers.", false, 4, null);
     */
    @Override // com.appsflyer.sdk_base.referrer.Referrer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void start(android.content.Context r11) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFi1iSDK.start(android.content.Context):void");
    }
}
