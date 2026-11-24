package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class mkg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0x f21942a;
    public final zig0 b;
    public final int c;
    public final njg0 d;
    public final njg0 e;
    public final njg0 f;
    public final pjg0 g;
    public final pjg0 h;
    public final pjg0 i;
    public final okg0 j;

    public mkg0(n0x n0xVar, zig0 zig0Var, int i, njg0 njg0Var, njg0 njg0Var2, njg0 njg0Var3, pjg0 pjg0Var, pjg0 pjg0Var2, pjg0 pjg0Var3, okg0 okg0Var) {
        this.f21942a = n0xVar;
        this.b = zig0Var;
        this.c = i;
        this.d = njg0Var;
        this.e = njg0Var2;
        this.f = njg0Var3;
        this.g = pjg0Var;
        this.h = pjg0Var2;
        this.i = pjg0Var3;
        this.j = okg0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mkg0)) {
            return false;
        }
        mkg0 mkg0Var = (mkg0) obj;
        return this.f21942a.equals(mkg0Var.f21942a) && this.b.equals(mkg0Var.b) && this.c == mkg0Var.c && this.d.equals(mkg0Var.d) && this.e.equals(mkg0Var.e) && this.f.equals(mkg0Var.f) && this.g.equals(mkg0Var.g) && this.h.equals(mkg0Var.h) && this.i.equals(mkg0Var.i) && this.j.equals(mkg0Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + twn.a(this.c, (this.b.hashCode() + (this.f21942a.hashCode() * 31)) * 31, 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RpsTableUiModel(tableImage=" + this.f21942a + ", gameState=" + this.b + ", round=" + this.c + ", firstPlayerHand=" + this.d + ", secondPlayerHand=" + this.e + ", thirdPlayerHand=" + this.f + ", firstPlayerInfo=" + this.g + ", secondPlayerInfo=" + this.h + ", thirdPlayerInfo=" + this.i + ", winnerInfo=" + this.j + Separators.RPAREN;
    }
}
