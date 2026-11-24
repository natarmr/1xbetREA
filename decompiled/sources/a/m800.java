package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class m800 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21346a;
    public final int b;
    public final int c;
    public final int d;

    public m800(int i, int i2, int i3, String str) {
        this.f21346a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m800)) {
            return false;
        }
        m800 m800Var = (m800) obj;
        return this.f21346a.equals(m800Var.f21346a) && this.b == m800Var.b && this.c == m800Var.c && this.d == m800Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + twn.a(this.c, twn.a(this.b, this.f21346a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return w6x.o(this.c, this.d, ", num=", Separators.RPAREN, kng0.p(this.b, "LineUpPlayerModel(playerId=", this.f21346a, ", line=", ", position="));
    }
}
