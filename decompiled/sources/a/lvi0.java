package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class lvi0 implements pvi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uc00 f20716a;
    public final boolean b;

    public lvi0(uc00 uc00Var, boolean z) {
        this.f20716a = uc00Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lvi0)) {
            return false;
        }
        lvi0 lvi0Var = (lvi0) obj;
        return this.f20716a.equals(lvi0Var.f20716a) && this.b == lvi0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f20716a.hashCode() * 31);
    }

    public final String toString() {
        return "ListCheckbox(listCheckboxStyle=" + this.f20716a + ", active=" + this.b + Separators.RPAREN;
    }
}
