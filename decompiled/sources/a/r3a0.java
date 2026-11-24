package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class r3a0 implements t3a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f29778a;
    public final mdm b;

    public r3a0(mdm mdmVar, imm immVar) {
        this.f29778a = immVar;
        this.b = mdmVar;
    }

    @Override // a.t3a0
    public final imm a() {
        return this.f29778a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r3a0)) {
            return false;
        }
        r3a0 r3a0Var = (r3a0) obj;
        return this.f29778a.equals(r3a0Var.f29778a) && this.b.equals(r3a0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f29778a.hashCode() * 31);
    }

    public final String toString() {
        return "Error(dsNavigationBarUiModel=" + this.f29778a + ", dsEmptyConfig=" + this.b + Separators.RPAREN;
    }
}
