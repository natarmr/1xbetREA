package a;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hp10 {
    static {
        m50[] m50VarArr = {new m50(gp10.class, (byte) 8)};
        HashMap map = new HashMap();
        m50 m50Var = m50VarArr[0];
        boolean zContainsKey = map.containsKey(m50Var.f21197a);
        Class cls = m50Var.f21197a;
        if (zContainsKey) {
            jf4.o(ohs0.l(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            return;
        }
        map.put(cls, m50Var);
        Class cls2 = m50VarArr[0].f21197a;
        Collections.unmodifiableMap(map);
        int i = qcf0.CONFIG_NAME_FIELD_NUMBER;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        pcf0.h(kp10.c);
        pcf0.h(djc.f6178a);
        pcf0.f(new o50(), true);
        vo80 vo80Var = tfw.f33885a;
        jz40 jz40Var = jz40.b;
        jz40Var.e(tfw.f33885a);
        jz40Var.d(tfw.b);
        jz40Var.c(tfw.c);
        jz40Var.b(tfw.d);
        bz40 bz40Var = bz40.b;
        bz40Var.a(o50.g);
        if (foq0.a()) {
            return;
        }
        pcf0.f(new o50(i50.class, new m50[]{new m50(gp10.class, (byte) 0)}, (byte) 0), true);
        jz40Var.e(t50.f33345a);
        jz40Var.d(t50.b);
        jz40Var.c(t50.c);
        jz40Var.b(t50.d);
        bz40Var.a(o50.f);
    }
}
