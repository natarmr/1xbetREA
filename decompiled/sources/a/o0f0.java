package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class o0f0 extends q0f0 {
    public final boolean c;
    public final boolean d;

    public o0f0(boolean z, boolean z2) {
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
        if (!(obj instanceof o0f0)) {
            return false;
        }
        o0f0 o0f0Var = (o0f0) obj;
        return this.c == o0f0Var.c && this.d == o0f0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + (Boolean.hashCode(this.c) * 31);
    }

    public final String toString() {
        return hne.n("SharePersonalDataConfirmation(isRequired=", ", isHidden=", Separators.RPAREN, this.c, this.d);
    }
}
