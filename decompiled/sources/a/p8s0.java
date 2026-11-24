package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class p8s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26574a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public p8s0(int i, int i2, int i3, int i4, String str, String str2) {
        this.f26574a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p8s0)) {
            return false;
        }
        p8s0 p8s0Var = (p8s0) obj;
        return this.f26574a.equals(p8s0Var.f26574a) && this.b.equals(p8s0Var.b) && this.c == p8s0Var.c && this.d == p8s0Var.d && this.e == p8s0Var.e && this.f == p8s0Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + twn.a(this.e, twn.a(this.d, twn.a(this.c, ua80.b(this.f26574a.hashCode() * 31, 31, this.b), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("TournamentValorantFeedStatisticMapModel(name=", this.f26574a, ", imageS3=", this.b, ", games=");
        axq.r(this.c, this.d, ", rounds=", ", defenceRoundWins=", sbN);
        return w6x.o(this.e, this.f, ", attackRoundWins=", Separators.RPAREN, sbN);
    }
}
