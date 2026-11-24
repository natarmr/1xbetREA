package com.huawei.hms.hatool;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class m {
    private static m b;
    private static final Object c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f45871a;

    private m() {
    }

    private static synchronized void b() {
        if (b == null) {
            b = new m();
        }
    }

    public void a(Context context) {
        synchronized (c) {
            try {
                if (this.f45871a != null) {
                    v.f("hmsSdk", "DataManager already initialized.");
                    return;
                }
                this.f45871a = context;
                s.c().b().a(this.f45871a);
                s.c().b().j(context.getPackageName());
                j.a().a(context);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static m a() {
        if (b == null) {
            b();
        }
        return b;
    }

    public void a(String str) {
        v.a("hmsSdk", "HiAnalyticsDataManager.setAppid(String appid) is execute.");
        Context context = this.f45871a;
        if (context == null) {
            v.e("hmsSdk", "sdk is not init");
        } else {
            s.c().b().i(e1.a("appID", str, "[a-zA-Z0-9_][a-zA-Z0-9. _-]{0,255}", context.getPackageName()));
        }
    }
}
