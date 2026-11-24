package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class knv0 implements nnv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f18604a;
    public final env0 b;

    public knv0(imm immVar, env0 env0Var) {
        this.f18604a = immVar;
        this.b = env0Var;
    }

    @Override // a.nnv0
    public final imm a() {
        return this.f18604a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof knv0)) {
            return false;
        }
        knv0 knv0Var = (knv0) obj;
        return this.f18604a.equals(knv0Var.f18604a) && this.b.equals(knv0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f18604a.hashCode() * 31);
    }

    public final String toString() {
        return "Content(navigationBarModel=" + this.f18604a + ", statisticTableUiModel=" + this.b + Separators.RPAREN;
    }
}
