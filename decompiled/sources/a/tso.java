package a;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class tso {
    public static volatile tso b;
    public static final tso c = new tso();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f34469a = Collections.EMPTY_MAP;

    public static tso a() {
        tso tsoVar;
        c5d0 c5d0Var = c5d0.c;
        tso tsoVar2 = b;
        if (tsoVar2 != null) {
            return tsoVar2;
        }
        synchronized (tso.class) {
            try {
                tsoVar = b;
                if (tsoVar == null) {
                    Class cls = oso.f25791a;
                    tso tsoVar3 = null;
                    if (cls != null) {
                        try {
                            tsoVar3 = (tso) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    tsoVar = tsoVar3 != null ? tsoVar3 : c;
                    b = tsoVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return tsoVar;
    }
}
