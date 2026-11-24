package a;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class kwo extends r7x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f19011a;
    public final String b;
    public final t7u0 c;
    public final c44 d;

    public kwo(Object obj, String str, m2a m2aVar, t7u0 t7u0Var) {
        this.f19011a = obj;
        this.b = str;
        this.c = t7u0Var;
        c44 c44Var = new c44(str + " value: " + obj, (byte) 17);
        StackTraceElement[] stackTrace = c44Var.getStackTrace();
        stackTrace.getClass();
        c44Var.setStackTrace((StackTraceElement[]) tx3.y(2, stackTrace).toArray(new StackTraceElement[0]));
        this.d = c44Var;
    }

    @Override // a.r7x
    public final Object v() throws c44 {
        int iOrdinal = this.c.ordinal();
        if (iOrdinal == 0) {
            throw this.d;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return null;
            }
            t9f.b();
            return null;
        }
        Log.d("wtj0", this.b + " value: " + this.f19011a);
        return null;
    }
}
