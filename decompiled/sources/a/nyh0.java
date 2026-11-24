package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class nyh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24330a;
    public final String b;
    public final int c;
    public final int d;

    public nyh0(int i, int i2, int i3, String str) {
        this.f24330a = i;
        this.b = str;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nyh0)) {
            return false;
        }
        nyh0 nyh0Var = (nyh0) obj;
        return this.f24330a == nyh0Var.f24330a && this.b.equals(nyh0Var.b) && this.c == nyh0Var.c && this.d == nyh0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + twn.a(this.c, ua80.b(Integer.hashCode(this.f24330a) * 31, 31, this.b), 31);
    }

    public final String toString() {
        return w6x.o(this.c, this.d, ", secondScore=", Separators.RPAREN, vqd.r(this.f24330a, "SekiroRoundModel(round=", ", winnerName=", this.b, ", firstScore="));
    }
}
