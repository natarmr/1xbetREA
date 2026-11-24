package com.huawei.agconnect.core.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.agconnect.core.impl.AGConnectInstanceImpl;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class AGConnectInitializeProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Log.i("AGConnectProvider", "AGConnectInitializeProvider#onCreate");
        Context context = getContext();
        Log.i("AGConnectInstance", "AGConnectInstance#initialize");
        ArrayList arrayList = AGConnectInstanceImpl.b;
        synchronized (AGConnectInstanceImpl.class) {
            Log.w("AGC_Instance", "agc sdk initialize");
            if (AGConnectInstanceImpl.c.size() > 0) {
                Log.w("AGC_Instance", "Repeated invoking initialize");
            } else {
                AGConnectInstanceImpl.b(context, AGConnectServicesConfig.c(context));
            }
        }
        return false;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
