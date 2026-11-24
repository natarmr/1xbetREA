package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class nqv implements pqv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r040 f23974a;
    public final boolean b;
    public final gy30 c;

    public nqv(r040 r040Var, boolean z, gy30 gy30Var) {
        r040Var.getClass();
        this.f23974a = r040Var;
        this.b = z;
        this.c = gy30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nqv)) {
            return false;
        }
        nqv nqvVar = (nqv) obj;
        return this.f23974a == nqvVar.f23974a && this.b == nqvVar.b && this.c.equals(nqvVar.c);
    }

    @Override // a.pqv
    public final boolean f0() {
        return this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(this.f23974a.hashCode() * 31, 31, this.b);
    }

    @Override // a.pqv
    public final r040 n() {
        return this.f23974a;
    }

    public final String toString() {
        return "AccordeonMenuCellUiItem(menuSectionType=" + this.f23974a + ", expanded=" + this.b + ", style=" + this.c + Separators.RPAREN;
    }
}
