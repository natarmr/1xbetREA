package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class szl0 implements wzl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mk50 f33075a;
    public final String b;

    public szl0(mk50 mk50Var, String str) {
        this.f33075a = mk50Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof szl0)) {
            return false;
        }
        szl0 szl0Var = (szl0) obj;
        return this.f33075a.equals(szl0Var.f33075a) && this.b.equals(szl0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f33075a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowBottomSheet(netCellModel=" + this.f33075a + ", title=" + this.b + Separators.RPAREN;
    }
}
