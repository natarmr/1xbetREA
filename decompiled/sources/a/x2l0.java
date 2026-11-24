package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class x2l0 implements g3l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ope f40173a;
    public final int b;
    public final zb c;
    public final boolean d;

    public x2l0(ope opeVar, int i, zb zbVar, boolean z) {
        this.f40173a = opeVar;
        this.b = i;
        this.c = zbVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2l0)) {
            return false;
        }
        x2l0 x2l0Var = (x2l0) obj;
        return this.f40173a.equals(x2l0Var.f40173a) && this.b == x2l0Var.b && this.c.equals(x2l0Var.c) && this.d == x2l0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + twn.a(this.b, this.f40173a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "CounterWithAccordion(counterStyle=" + this.f40173a + ", counterValue=" + this.b + ", accordionStyle=" + this.c + ", expanded=" + this.d + Separators.RPAREN;
    }
}
