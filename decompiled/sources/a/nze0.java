package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class nze0 extends q0f0 {
    public final boolean c;
    public final boolean d;

    public nze0(boolean z, boolean z2) {
        super(z, z2);
        this.c = z;
        this.d = z2;
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
        if (!(obj instanceof nze0)) {
            return false;
        }
        nze0 nze0Var = (nze0) obj;
        return this.c == nze0Var.c && this.d == nze0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + (Boolean.hashCode(this.c) * 31);
    }

    public final String toString() {
        return hne.n("Country(isRequired=", ", isHidden=", Separators.RPAREN, this.c, this.d);
    }
}
