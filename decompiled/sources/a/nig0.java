package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class nig0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qjg0 f23586a;
    public final qjg0 b;
    public final qjg0 c;
    public final tig0 d;

    public nig0(qjg0 qjg0Var, qjg0 qjg0Var2, qjg0 qjg0Var3, tig0 tig0Var) {
        this.f23586a = qjg0Var;
        this.b = qjg0Var2;
        this.c = qjg0Var3;
        this.d = tig0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nig0)) {
            return false;
        }
        nig0 nig0Var = (nig0) obj;
        return this.f23586a.equals(nig0Var.f23586a) && this.b.equals(nig0Var.b) && this.c.equals(nig0Var.c) && this.d == nig0Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f23586a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RpsGameInformationModel(firstPlayer=" + this.f23586a + ", secondPlayer=" + this.b + ", thirdPlayer=" + this.c + ", result=" + this.d + Separators.RPAREN;
    }
}
