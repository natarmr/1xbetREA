package com.huawei.hms.hatool;

import android.content.Context;
import android.os.UserManager;

/* JADX INFO: loaded from: classes2.dex */
public class q1 {
    private static q1 c = new q1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f45883a = false;
    private Context b = q0.i();

    private q1() {
    }

    public static q1 b() {
        return c;
    }

    public boolean a() {
        boolean z = this.f45883a;
        if (z) {
            return z;
        }
        Context context = this.b;
        if (context == null) {
            return false;
        }
        UserManager userManager = (UserManager) context.getSystemService("user");
        if (userManager == null) {
            this.f45883a = false;
            return false;
        }
        boolean zIsUserUnlocked = userManager.isUserUnlocked();
        this.f45883a = zIsUserUnlocked;
        return zIsUserUnlocked;
    }
}
