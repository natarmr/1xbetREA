package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class cjo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4471a;
    public final String b;

    public cjo0(String str, String str2) {
        this.f4471a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjo0)) {
            return false;
        }
        cjo0 cjo0Var = (cjo0) obj;
        return this.f4471a.equals(cjo0Var.f4471a) && this.b.equals(cjo0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f4471a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("TableColumnTitleModel(shortTitle=", this.f4471a, ", fullTitle=", this.b, Separators.RPAREN);
    }
}
