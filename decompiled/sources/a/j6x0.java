package a;

/* JADX INFO: loaded from: classes2.dex */
public final class j6x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m6x0 f16012a;
    public int b = 1;
    public long c = a();

    public j6x0(m6x0 m6x0Var) {
        this.f16012a = m6x0Var;
    }

    public final long a() {
        m6x0 m6x0Var = this.f16012a;
        s0x.H(m6x0Var);
        long jLongValue = ((Long) btw0.v.a(null)).longValue();
        long jLongValue2 = ((Long) btw0.w.a(null)).longValue();
        for (int i = 1; i < this.b; i++) {
            jLongValue += jLongValue;
            if (jLongValue >= jLongValue2) {
                break;
            }
        }
        m6x0Var.S().getClass();
        return Math.min(jLongValue, jLongValue2) + System.currentTimeMillis();
    }
}
