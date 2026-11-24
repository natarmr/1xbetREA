package a;

import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jx3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f17282a;

    static {
        Object g0g0Var;
        try {
            e0g0 e0g0Var = j0g0.b;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            g0g0Var = property != null ? StringsKt.toIntOrNull(property) : null;
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        Integer num = (Integer) (g0g0Var instanceof g0g0 ? null : g0g0Var);
        f17282a = num != null ? num.intValue() : 2097152;
    }
}
