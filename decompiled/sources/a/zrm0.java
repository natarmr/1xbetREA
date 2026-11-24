package a;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zrm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f44862a;

    static {
        b2t0.b.getClass();
        h2t0.b.getClass();
        p1t0.b.getClass();
        q2t0.b.getClass();
        f44862a = tx3.l0(new ugi0[]{f2t0.b, l2t0.b, t1t0.b, u2t0.b});
    }

    public static final boolean a(ugi0 ugi0Var) {
        ugi0Var.getClass();
        return ugi0Var.isInline() && f44862a.contains(ugi0Var);
    }
}
