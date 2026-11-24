package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class dpr0 implements ipr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6480a;
    public final iqr0 b;

    public dpr0(int i, iqr0 iqr0Var) {
        this.f6480a = i;
        this.b = iqr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpr0)) {
            return false;
        }
        dpr0 dpr0Var = (dpr0) obj;
        return this.f6480a == dpr0Var.f6480a && this.b == dpr0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f6480a) * 31);
    }

    public final String toString() {
        return "OnOutcomeClick(id=" + this.f6480a + ", outcome=" + this.b + Separators.RPAREN;
    }
}
