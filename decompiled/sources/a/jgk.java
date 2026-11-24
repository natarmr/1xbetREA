package a;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jgk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f16484a = 0;

    static {
        byte b = 6;
        m50[] m50VarArr = {new m50(igk.class, (byte) 6)};
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
            pcf0.h(lgk.b);
            if (foq0.a()) {
                return;
            }
            pcf0.f(new o50(n70.class, new m50[]{new m50(igk.class, (byte) 6)}, b), true);
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
