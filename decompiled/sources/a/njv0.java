package a;

import android.app.Activity;
import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class njv0 implements mjv0 {
    public final x6k b;

    public njv0() {
        this.b = Build.VERSION.SDK_INT >= 34 ? y6k.f42101a : rv00.l;
        q3d.e(1, 2, 4, 8, 16, 32, 64, 128);
    }

    public final kjv0 a(Activity activity) {
        ojv0 ojv0Var;
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            ojv0Var = y6k.b;
        } else {
            ojv0Var = i >= 30 ? wq8.b : hfk0.h;
        }
        return ojv0Var.b(activity, this.b);
    }

    public final kjv0 b(Context context) {
        ojv0 ojv0Var;
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            ojv0Var = y6k.b;
        } else {
            ojv0Var = i >= 30 ? wq8.b : hfk0.h;
        }
        return ojv0Var.g(context, this.b);
    }
}
