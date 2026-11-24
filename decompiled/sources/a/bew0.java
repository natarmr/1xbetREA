package a;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class bew0 {
    public static volatile bew0 b;
    public static final bew0 c = new bew0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f2472a = Collections.EMPTY_MAP;

    public static bew0 a() {
        bew0 bew0Var = b;
        if (bew0Var != null) {
            return bew0Var;
        }
        synchronized (bew0.class) {
            try {
                bew0 bew0Var2 = b;
                if (bew0Var2 != null) {
                    return bew0Var2;
                }
                int i = ldw0.f19874a;
                bew0 bew0VarB0 = hew0.b0();
                b = bew0VarB0;
                return bew0VarB0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
