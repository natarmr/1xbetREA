package com.huawei.hms.adapter;

import android.content.Context;
import com.huawei.hms.support.log.HMSLog;

/* JADX INFO: loaded from: classes2.dex */
public class InnerBinderAdapter extends BinderAdapter {
    private static final Object j = new Object();
    private static BinderAdapter k;

    private InnerBinderAdapter(Context context, String str, String str2) {
        super(context, str, str2);
    }

    public static BinderAdapter getInstance(Context context, String str, String str2) {
        BinderAdapter innerBinderAdapter;
        HMSLog.i("InnerBinderAdapter", "InnerBinderAdapter getInstance.");
        synchronized (j) {
            try {
                innerBinderAdapter = k;
                if (innerBinderAdapter == null) {
                    innerBinderAdapter = new InnerBinderAdapter(context, str, str2);
                    k = innerBinderAdapter;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return innerBinderAdapter;
    }

    @Override // com.huawei.hms.adapter.BinderAdapter
    public int getConnTimeOut() {
        return 2001;
    }

    @Override // com.huawei.hms.adapter.BinderAdapter
    public int getMsgDelayDisconnect() {
        return 2002;
    }
}
