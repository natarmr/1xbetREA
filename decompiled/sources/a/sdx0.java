package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public abstract class sdx0 {
    public static final pdx0 d = new pdx0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sdx0 f32053a;
    public final nuj0 b;
    public boolean c = false;

    public /* synthetic */ sdx0(sdx0 sdx0Var, nuj0 nuj0Var) {
        if (sdx0Var != null) {
            x0x.A(sdx0Var.c);
        }
        this.f32053a = sdx0Var;
        this.b = nuj0Var;
    }

    public final sdx0 a() {
        if (this.c) {
            jf4.n("Already frozen");
            return null;
        }
        this.c = true;
        sdx0 sdx0Var = this.f32053a;
        return (sdx0Var == null || !this.b.isEmpty()) ? this : sdx0Var;
    }

    public final boolean b() {
        if (this.b.containsKey(d)) {
            return true;
        }
        sdx0 sdx0Var = this.f32053a;
        return sdx0Var != null && sdx0Var.b();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanExtras<");
        for (sdx0 sdx0Var = this; sdx0Var != null; sdx0Var = sdx0Var.f32053a) {
            for (int i = 0; i < sdx0Var.b.c; i++) {
                sb.append("[");
                sb.append(this.b.j(i));
                sb.append("], ");
            }
        }
        sb.append(Separators.GREATER_THAN);
        return sb.toString();
    }
}
