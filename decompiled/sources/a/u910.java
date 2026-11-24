package a;

/* JADX INFO: loaded from: classes.dex */
public final class u910 implements l7m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pz40 f35260a;
    public final pz40 b;
    public final pz40 c;
    public final pz40 d;
    public final pz40 e;
    public final pz40 f;
    public final pz40 g;
    public final zbk h;
    public final pz40 i;
    public final pz40 j;
    public final pz40 k;
    public final pz40 l;
    public final zbk m;
    public final g050 n;

    public u910() {
        Boolean bool = Boolean.FALSE;
        this.f35260a = androidx.compose.runtime.e.e(bool);
        this.b = androidx.compose.runtime.e.e(1);
        this.c = androidx.compose.runtime.e.e(1);
        this.d = androidx.compose.runtime.e.e(bool);
        this.e = androidx.compose.runtime.e.e(null);
        this.f = androidx.compose.runtime.e.e(Float.valueOf(1.0f));
        this.g = androidx.compose.runtime.e.e(bool);
        this.h = jgk0.b(new s910(this, (byte) 1));
        this.i = androidx.compose.runtime.e.e(null);
        Float fValueOf = Float.valueOf(0.0f);
        this.j = androidx.compose.runtime.e.e(fValueOf);
        this.k = androidx.compose.runtime.e.e(fValueOf);
        this.l = androidx.compose.runtime.e.e(Long.MIN_VALUE);
        this.m = jgk0.b(new s910(this, (byte) 0));
        jgk0.b(new s910(this, (byte) 2));
        this.n = new g050();
    }

    public final void b() {
        if (((hgk0) this.e).getValue() == null) {
            return;
        }
        hny.b();
    }

    public final fa10 c() {
        return (fa10) ((hgk0) this.i).getValue();
    }

    public final int e() {
        return ((Number) ((hgk0) this.b).getValue()).intValue();
    }

    public final float f() {
        return ((Number) ((hgk0) this.k).getValue()).floatValue();
    }

    public final float g() {
        return ((Number) ((hgk0) this.f).getValue()).floatValue();
    }

    @Override // a.l7m0
    public final Object getValue() {
        return Float.valueOf(f());
    }

    public final boolean h(int i, long j) {
        fa10 fa10VarC = c();
        if (fa10VarC == null) {
            return true;
        }
        pz40 pz40Var = this.l;
        long jLongValue = ((Number) ((hgk0) pz40Var).getValue()).longValue() == Long.MIN_VALUE ? 0L : j - ((Number) ((hgk0) pz40Var).getValue()).longValue();
        ((hgk0) pz40Var).setValue(Long.valueOf(j));
        b();
        b();
        float fB = (jLongValue / 1000000) / fa10VarC.b();
        zbk zbkVar = this.h;
        float fFloatValue = ((Number) zbkVar.getValue()).floatValue() * fB;
        float fFloatValue2 = ((Number) zbkVar.getValue()).floatValue();
        pz40 pz40Var2 = this.j;
        float fFloatValue3 = fFloatValue2 < 0.0f ? 0.0f - (((Number) ((hgk0) pz40Var2).getValue()).floatValue() + fFloatValue) : (((Number) ((hgk0) pz40Var2).getValue()).floatValue() + fFloatValue) - 1.0f;
        if (fFloatValue3 < 0.0f) {
            k(l1e0.c(((Number) ((hgk0) pz40Var2).getValue()).floatValue(), 0.0f, 1.0f) + fFloatValue);
            return true;
        }
        int i2 = (int) (fFloatValue3 / 1.0f);
        int i3 = i2 + 1;
        if (e() + i3 > i) {
            k(((Number) this.m.getValue()).floatValue());
            i(i);
            return false;
        }
        i(e() + i3);
        float f = fFloatValue3 - (i2 * 1.0f);
        k(((Number) zbkVar.getValue()).floatValue() < 0.0f ? 1.0f - f : 0.0f + f);
        return true;
    }

    public final void i(int i) {
        ((hgk0) this.b).setValue(Integer.valueOf(i));
    }

    public final void j(boolean z) {
        ((hgk0) this.f35260a).setValue(Boolean.valueOf(z));
    }

    public final void k(float f) {
        fa10 fa10VarC;
        ((hgk0) this.j).setValue(Float.valueOf(f));
        if (((Boolean) ((hgk0) this.g).getValue()).booleanValue() && (fa10VarC = c()) != null) {
            f -= f % (1.0f / fa10VarC.n);
        }
        ((hgk0) this.k).setValue(Float.valueOf(f));
    }
}
