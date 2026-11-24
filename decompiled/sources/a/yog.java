package a;

/* JADX INFO: loaded from: classes4.dex */
public final class yog {
    public static final v0h0 d = new v0h0(new vlf(20), new jyf((byte) 25));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f42983a;
    public final agk0 b;
    public final xog c = new xog(this, (byte) 0);

    public yog(float f) {
        this.b = androidx.compose.runtime.e.a(f);
    }

    public final float a(float f) {
        float f2 = this.f42983a;
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        agk0 agk0Var = this.b;
        float fC = l1e0.c(agk0Var.l(), 0.0f, f2);
        float fC2 = l1e0.c(fC - f, 0.0f, f2);
        agk0Var.m(fC2);
        return fC - fC2;
    }
}
