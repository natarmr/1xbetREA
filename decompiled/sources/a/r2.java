package a;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r2 implements ig00 {
    public static final Object d = new Object();
    public static final edz e = new edz(l2.class);
    public static final boolean f;
    public static final jd8 g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f29706a;
    public volatile i2 b;
    public volatile q2 c;

    static {
        boolean z;
        jd8 n2Var;
        Throwable th;
        jd8 p2Var;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f = z;
        String property = System.getProperty("java.runtime.name", "");
        Throwable e2 = null;
        if (property == null || property.contains("Android")) {
            try {
                p2Var = new p2();
            } catch (Error | Exception e3) {
                try {
                    n2Var = new m2();
                } catch (Error | Exception e4) {
                    e2 = e4;
                    n2Var = new n2();
                }
                jd8 jd8Var = n2Var;
                th = e3;
                p2Var = jd8Var;
            }
        } else {
            try {
                p2Var = new m2();
            } catch (NoClassDefFoundError unused2) {
                p2Var = new n2();
            }
        }
        th = null;
        g = p2Var;
        if (e2 != null) {
            edz edzVar = e;
            Logger loggerA = edzVar.a();
            Level level = Level.SEVERE;
            loggerA.log(level, "UnsafeAtomicHelper is broken!", th);
            edzVar.a().log(level, "AtomicReferenceFieldUpdaterAtomicHelper is broken!", e2);
        }
    }

    public final void b(q2 q2Var) {
        q2Var.f27977a = null;
        while (true) {
            q2 q2Var2 = this.c;
            if (q2Var2 == q2.c) {
                return;
            }
            q2 q2Var3 = null;
            while (q2Var2 != null) {
                q2 q2Var4 = q2Var2.b;
                if (q2Var2.f27977a != null) {
                    q2Var3 = q2Var2;
                } else if (q2Var3 != null) {
                    q2Var3.b = q2Var4;
                    if (q2Var3.f27977a == null) {
                    }
                } else if (!g.c0(this, q2Var2, q2Var4)) {
                }
                q2Var2 = q2Var4;
            }
            return;
        }
    }

    public abstract Throwable c();
}
