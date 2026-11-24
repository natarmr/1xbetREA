package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
final class ax {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static aw f45607a;

    public static synchronized aw a(Context context) {
        aw awVarB;
        awVarB = f45607a;
        if (awVarB == null) {
            u uVar = new u(null);
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            uVar.a(context);
            awVarB = uVar.b();
            f45607a = awVarB;
        }
        return awVarB;
    }
}
