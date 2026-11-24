package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class jep0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iep0 f16386a;
    public final iep0 b;

    public jep0(iep0 iep0Var, iep0 iep0Var2) {
        this.f16386a = iep0Var;
        this.b = iep0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jep0)) {
            return false;
        }
        jep0 jep0Var = (jep0) obj;
        return this.f16386a.equals(jep0Var.f16386a) && this.b.equals(jep0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f16386a.hashCode() * 31);
    }

    public final String toString() {
        return "DoubleTeam(firstTeam=" + this.f16386a + ", secondTeam=" + this.b + Separators.RPAREN;
    }
}
