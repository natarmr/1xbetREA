package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class fsi0 implements vjn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10065a;
    public final int b;

    public fsi0(int i, int i2) {
        this.f10065a = i;
        this.b = i2;
    }

    @Override // a.vjn
    public final void a(z55 z55Var) {
        int iD = l1e0.d(this.f10065a, 0, ((tyc) z55Var.f).B());
        int iD2 = l1e0.d(this.b, 0, ((tyc) z55Var.f).B());
        if (iD < iD2) {
            z55Var.q(iD, iD2);
        } else {
            z55Var.q(iD2, iD);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fsi0)) {
            return false;
        }
        fsi0 fsi0Var = (fsi0) obj;
        return this.f10065a == fsi0Var.f10065a && this.b == fsi0Var.b;
    }

    public final int hashCode() {
        return (this.f10065a * 31) + this.b;
    }

    public final String toString() {
        return ohs0.m("SetSelectionCommand(start=", this.f10065a, ", end=", Separators.RPAREN, this.b);
    }
}
