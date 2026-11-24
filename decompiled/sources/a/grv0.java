package a;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class grv0 {
    public static final grv0 b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o58 f11800a;

    static {
        grv0 grv0Var = new grv0();
        grv0Var.f11800a = null;
        b = grv0Var;
    }

    public static o58 a(Context context) {
        o58 o58Var;
        grv0 grv0Var = b;
        synchronized (grv0Var) {
            try {
                o58Var = grv0Var.f11800a;
                if (o58Var == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    o58Var = new o58(context, (byte) 1);
                    grv0Var.f11800a = o58Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return o58Var;
    }
}
