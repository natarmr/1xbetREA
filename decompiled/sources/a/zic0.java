package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class zic0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f44434a;
    public final int b;
    public final boolean c;
    public final boolean d;

    public zic0(int i, boolean z, boolean z2, boolean z3) {
        this.f44434a = z;
        this.b = i;
        this.c = z2;
        this.d = z3;
    }

    public static zic0 a(zic0 zic0Var, boolean z, int i, boolean z2, boolean z3, int i2) {
        if ((i2 & 1) != 0) {
            z = zic0Var.f44434a;
        }
        if ((i2 & 2) != 0) {
            i = zic0Var.b;
        }
        if ((i2 & 4) != 0) {
            z2 = zic0Var.c;
        }
        if ((i2 & 8) != 0) {
            z3 = zic0Var.d;
        }
        zic0Var.getClass();
        return new zic0(i, z, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zic0)) {
            return false;
        }
        zic0 zic0Var = (zic0) obj;
        return this.f44434a == zic0Var.f44434a && this.b == zic0Var.b && this.c == zic0Var.c && this.d == zic0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(twn.a(this.b, Boolean.hashCode(this.f44434a) * 31, 31), 31, this.c);
    }

    public final String toString() {
        return ohs0.p(", showOfflineShimmers=", Separators.RPAREN, ohs0.t(this.b, "ControlViewState(startButtonEnabled=", ", gamesCount=", ", buyGamesEnabled=", this.f44434a), this.c, this.d);
    }
}
