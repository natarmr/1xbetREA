package com.huawei.hms.hatool;

import a.w6x;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f45872a = false;
    private int b = 4;

    public void a(int i) {
        Log.i("FormalHASDK", System.lineSeparator() + "======================================= " + System.lineSeparator() + a() + "" + System.lineSeparator() + "=======================================");
        this.b = i;
        this.f45872a = true;
    }

    public void b(int i, String str, String str2) {
        a(i, "FormalHASDK", w6x.q(str, "=> ", str2));
    }

    private static String a() {
        return "FormalHASDK_2.2.0.315" + p.a();
    }

    public void a(int i, String str, String str2) {
        if (i == 3) {
            Log.d(str, str2);
            return;
        }
        if (i == 5) {
            Log.w(str, str2);
        } else if (i != 6) {
            Log.i(str, str2);
        } else {
            Log.e(str, str2);
        }
    }

    public boolean b(int i) {
        return this.f45872a && i >= this.b;
    }
}
