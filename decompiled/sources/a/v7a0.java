package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class v7a0 implements x7a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f36915a;
    public final mdm b;

    public v7a0(mdm mdmVar, imm immVar) {
        this.f36915a = immVar;
        this.b = mdmVar;
    }

    @Override // a.x7a0
    public final imm a() {
        return this.f36915a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v7a0)) {
            return false;
        }
        v7a0 v7a0Var = (v7a0) obj;
        return this.f36915a.equals(v7a0Var.f36915a) && this.b.equals(v7a0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f36915a.hashCode() * 31);
    }

    public final String toString() {
        return "Error(navigationBarModel=" + this.f36915a + ", dsEmptyConfig=" + this.b + Separators.RPAREN;
    }
}
