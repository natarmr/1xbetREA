package a;

import android.gov.nist.core.Separators;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class e0x0 extends j1x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0x0 f7012a;
    public final c0x0 b;
    public final b0x0 c;
    public final m60 d;

    public e0x0(d0x0 d0x0Var, c0x0 c0x0Var, b0x0 b0x0Var, m60 m60Var) {
        this.f7012a = d0x0Var;
        this.b = c0x0Var;
        this.c = b0x0Var;
        this.d = m60Var;
    }

    public static h0q0 b() {
        h0q0 h0q0Var = new h0q0();
        h0q0Var.f12247a = null;
        h0q0Var.b = null;
        h0q0Var.c = null;
        h0q0Var.d = m60.m;
        return h0q0Var;
    }

    @Override // a.fpw0
    public final boolean a() {
        return this.d != m60.m;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e0x0)) {
            return false;
        }
        e0x0 e0x0Var = (e0x0) obj;
        return this.f7012a == e0x0Var.f7012a && this.b == e0x0Var.b && this.c == e0x0Var.c && this.d == e0x0Var.d;
    }

    public final int hashCode() {
        return Objects.hash(e0x0.class, this.f7012a, this.b, this.c, this.d);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.d);
        String strValueOf2 = String.valueOf(this.f7012a);
        return ua80.m(b1j.n("HPKE Parameters (Variant: ", strValueOf, ", KemId: ", strValueOf2, ", KdfId: "), String.valueOf(this.b), ", AeadId: ", String.valueOf(this.c), Separators.RPAREN);
    }
}
