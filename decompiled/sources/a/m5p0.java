package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class m5p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ufp0 f21232a;
    public final iwb b;

    public m5p0(ufp0 ufp0Var, iwb iwbVar) {
        this.f21232a = ufp0Var;
        this.b = iwbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m5p0)) {
            return false;
        }
        m5p0 m5p0Var = (m5p0) obj;
        return this.f21232a.equals(m5p0Var.f21232a) && this.b.equals(m5p0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f21232a.hashCode() * 31);
    }

    public final String toString() {
        return "TeamCharacteristicModel(team=" + this.f21232a + ", characteristics=" + this.b + Separators.RPAREN;
    }
}
