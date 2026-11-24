package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class lf40 implements tf40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vf10 f19936a;

    public lf40(vf10 vf10Var) {
        this.f19936a = vf10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lf40) && this.f19936a.equals(((lf40) obj).f19936a);
    }

    @Override // a.tf40
    public final String getKey() {
        String strJ = sre0.f32672a.b(lf40.class).J();
        return strJ == null ? "" : strJ;
    }

    public final int hashCode() {
        return this.f19936a.hashCode();
    }

    public final String toString() {
        return "LoyaltyProgramAlternativeWidget(model=" + this.f19936a + Separators.RPAREN;
    }
}
