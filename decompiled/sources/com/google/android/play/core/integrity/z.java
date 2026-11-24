package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static s f45640a;

    public static synchronized s a(Context context) {
        s sVarB;
        sVarB = f45640a;
        if (sVarB == null) {
            q qVar = new q(null);
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            qVar.a(context);
            sVarB = qVar.b();
            f45640a = sVarB;
        }
        return sVarB;
    }
}
