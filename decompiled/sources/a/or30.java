package a;

import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class or30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p7m0 f25719a = q7m0.a(null);

    public final void a() {
        this.f25719a.n(null);
    }

    public final Object b() {
        Pair pair = (Pair) this.f25719a.getValue();
        if (pair != null) {
            return pair.f46059a;
        }
        return null;
    }

    public final Object c(long j) throws g2, ri9 {
        p7m0 p7m0Var = this.f25719a;
        Pair pair = (Pair) p7m0Var.getValue();
        Object obj = pair != null ? pair.f46059a : null;
        Pair pair2 = (Pair) p7m0Var.getValue();
        long jLongValue = pair2 != null ? ((Number) pair2.b).longValue() : -1L;
        if (jLongValue != -1 && System.currentTimeMillis() - jLongValue >= j) {
            throw new ri9();
        }
        if (obj != null) {
            return obj;
        }
        throw new g2((byte) 1);
    }

    public final void d(Object obj) {
        this.f25719a.o(null, new Pair(obj, Long.valueOf(System.currentTimeMillis())));
    }
}
