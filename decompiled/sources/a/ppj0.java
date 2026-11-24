package a;

/* JADX INFO: loaded from: classes6.dex */
public final class ppj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t33 f27378a;
    public final vne b;
    public final agk0 c;
    public final agk0 d;
    public final nul0 e;

    public ppj0(t33 t33Var, vne vneVar, float f, float f2) {
        t33Var.getClass();
        vneVar.getClass();
        this.f27378a = t33Var;
        this.b = vneVar;
        this.c = androidx.compose.runtime.e.a(f);
        this.d = androidx.compose.runtime.e.a(f2);
        this.e = ro4.g0(0.8f, 400.0f, null, 4);
    }

    public final float a(float f) {
        float fFloatValue = ((Number) this.f27378a.d()).floatValue();
        float fC = l1e0.c(f + fFloatValue, this.c.l(), this.d.l());
        float f2 = fC - fFloatValue;
        if (f2 == 0.0f) {
            return f2;
        }
        qjj.W(this.b, null, null, new opj0(this, fC, null, (byte) 1), 3);
        return f2;
    }

    public final void b() {
        agk0 agk0Var = this.c;
        float fL = agk0Var.l();
        agk0 agk0Var2 = this.d;
        qjj.W(this.b, null, null, new opj0(this, ((Number) this.f27378a.d()).floatValue() < (agk0Var2.l() + fL) / 2.0f ? agk0Var.l() : agk0Var2.l(), null, (byte) 2), 3);
    }
}
