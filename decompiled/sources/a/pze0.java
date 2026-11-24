package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class pze0 extends q0f0 {
    public final boolean c;
    public final boolean d;
    public final String e;

    public pze0(String str, boolean z, boolean z2) {
        super(z, z2);
        this.c = z;
        this.d = z2;
        this.e = str;
    }

    @Override // a.q0f0
    public final boolean a() {
        return this.d;
    }

    @Override // a.q0f0
    public final boolean b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pze0)) {
            return false;
        }
        pze0 pze0Var = (pze0) obj;
        return this.c == pze0Var.c && this.d == pze0Var.d && this.e.equals(pze0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + brm0.e(Boolean.hashCode(this.c) * 31, 31, this.d);
    }

    public final String toString() {
        return axq.n(f140.q("Date(isRequired=", ", isHidden=", ", minAge=", this.c, this.d), this.e, Separators.RPAREN);
    }
}
