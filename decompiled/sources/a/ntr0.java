package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ntr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final md80 f24114a;
    public final boolean b;

    public ntr0(md80 md80Var, boolean z) {
        this.f24114a = md80Var;
        this.b = z;
    }

    public static ntr0 a(ntr0 ntr0Var, boolean z) {
        md80 md80Var = ntr0Var.f24114a;
        ntr0Var.getClass();
        return new ntr0(md80Var, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ntr0)) {
            return false;
        }
        ntr0 ntr0Var = (ntr0) obj;
        return this.f24114a == ntr0Var.f24114a && this.b == ntr0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f24114a.hashCode() * 31);
    }

    public final String toString() {
        return "TotoOutcomeChipModel(outComesModel=" + this.f24114a + ", isChosen=" + this.b + Separators.RPAREN;
    }
}
