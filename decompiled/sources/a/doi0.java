package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class doi0 implements vjn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6418a;
    public final int b;

    public doi0(int i, int i2) {
        this.f6418a = i;
        this.b = i2;
    }

    @Override // a.vjn
    public final void a(z55 z55Var) {
        boolean z = z55Var.d != -1;
        tyc tycVar = (tyc) z55Var.f;
        if (z) {
            z55Var.d = -1;
            z55Var.e = -1;
        }
        int iD = l1e0.d(this.f6418a, 0, tycVar.B());
        int iD2 = l1e0.d(this.b, 0, tycVar.B());
        if (iD != iD2) {
            if (iD < iD2) {
                z55Var.p(iD, iD2);
            } else {
                z55Var.p(iD2, iD);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof doi0)) {
            return false;
        }
        doi0 doi0Var = (doi0) obj;
        return this.f6418a == doi0Var.f6418a && this.b == doi0Var.b;
    }

    public final int hashCode() {
        return (this.f6418a * 31) + this.b;
    }

    public final String toString() {
        return ohs0.m("SetComposingRegionCommand(start=", this.f6418a, ", end=", Separators.RPAREN, this.b);
    }
}
