package a;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class k6x0 {
    public static final k6x0 b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f17793a = new AtomicReference(new u7x0(new hhi0((byte) 1)));

    static {
        try {
            k6x0 k6x0Var = new k6x0();
            k6x0Var.d(new j5x0(o5x0.class, new o6x0()));
            k6x0Var.f(new y6x0(t5x0.class, new s6x0()));
            b = k6x0Var;
        } catch (Exception e) {
            itt0.s(e);
        }
    }

    public final x4w0 a(fpw0 fpw0Var) throws GeneralSecurityException {
        HashMap map = ((u7x0) this.f17793a.get()).c;
        if (map.containsKey(fpw0Var.getClass())) {
            return ((y6x0) map.get(fpw0Var.getClass())).b.h(fpw0Var);
        }
        throw new GeneralSecurityException(kng0.l("No Key Format serializer for ", String.valueOf(fpw0Var.getClass()), " available"));
    }

    public final fpw0 b(x4w0 x4w0Var) throws GeneralSecurityException {
        u7x0 u7x0Var = (u7x0) this.f17793a.get();
        u7x0Var.getClass();
        String str = (String) x4w0Var.b;
        HashMap map = u7x0Var.d;
        if (map.containsKey(str)) {
            return ((u6x0) map.get(str)).b.e(x4w0Var);
        }
        throw new GeneralSecurityException(kng0.l("No Parameters Parser for requested key type ", str, " available"));
    }

    public final synchronized void c(e5x0 e5x0Var) {
        hhi0 hhi0Var = new hhi0((u7x0) this.f17793a.get());
        String str = e5x0Var.f7255a;
        HashMap map = hhi0Var.b;
        if (map.containsKey(str)) {
            e5x0 e5x0Var2 = (e5x0) map.get(str);
            if (!e5x0Var2.equals(e5x0Var) || e5x0Var != e5x0Var2) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(str));
            }
        } else {
            map.put(str, e5x0Var);
        }
        this.f17793a.set(new u7x0(hhi0Var));
    }

    public final synchronized void d(j5x0 j5x0Var) {
        hhi0 hhi0Var = new hhi0((u7x0) this.f17793a.get());
        HashMap map = hhi0Var.f13065a;
        Class cls = j5x0Var.f15956a;
        if (map.containsKey(cls)) {
            j5x0 j5x0Var2 = (j5x0) map.get(cls);
            if (!j5x0Var2.equals(j5x0Var) || j5x0Var != j5x0Var2) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(String.valueOf(cls)));
            }
        } else {
            map.put(cls, j5x0Var);
        }
        this.f17793a.set(new u7x0(hhi0Var));
    }

    public final synchronized void e(u6x0 u6x0Var) {
        hhi0 hhi0Var = new hhi0((u7x0) this.f17793a.get());
        String str = u6x0Var.f35159a;
        HashMap map = hhi0Var.d;
        if (map.containsKey(str)) {
            u6x0 u6x0Var2 = (u6x0) map.get(str);
            if (!u6x0Var2.equals(u6x0Var) || u6x0Var != u6x0Var2) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(str));
            }
        } else {
            map.put(str, u6x0Var);
        }
        this.f17793a.set(new u7x0(hhi0Var));
    }

    public final synchronized void f(y6x0 y6x0Var) {
        hhi0 hhi0Var = new hhi0((u7x0) this.f17793a.get());
        HashMap map = hhi0Var.c;
        Class cls = y6x0Var.f42122a;
        if (map.containsKey(cls)) {
            y6x0 y6x0Var2 = (y6x0) map.get(cls);
            if (!y6x0Var2.equals(y6x0Var) || y6x0Var != y6x0Var2) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(String.valueOf(cls)));
            }
        } else {
            map.put(cls, y6x0Var);
        }
        this.f17793a.set(new u7x0(hhi0Var));
    }
}
