package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class mh6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21776a;
    public final int b;
    public final int c;
    public final int d;
    public final String e;

    public mh6(int i, int i2, int i3, long j, String str) {
        this.f21776a = j;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mh6)) {
            return false;
        }
        mh6 mh6Var = (mh6) obj;
        return this.f21776a == mh6Var.f21776a && this.b == mh6Var.b && this.c == mh6Var.c && this.d == mh6Var.d && this.e.equals(mh6Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + twn.a(this.d, twn.a(this.c, twn.a(this.b, Long.hashCode(this.f21776a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbQ = brm0.q(this.b, this.f21776a, "BetBuilderGameInfoModel(gameId=", ", gameVid=");
        rw2.s(this.c, this.d, ", gameType=", ", period=", sbQ);
        return rw2.o(sbQ, ", gameName=", this.e, Separators.RPAREN);
    }
}
