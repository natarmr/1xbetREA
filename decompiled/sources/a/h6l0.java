package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h6l0 implements k6l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12535a;
    public final qzl b;
    public final String c;
    public final d280 d;
    public final d280 e;
    public final String f;
    public final String g;
    public final n5l0 h;
    public final n5l0 i;
    public final n5l0 j;
    public final gad k;

    public h6l0(long j, qzl qzlVar, String str, d280 d280Var, d280 d280Var2, String str2, String str3, n5l0 n5l0Var, n5l0 n5l0Var2, n5l0 n5l0Var3, gad gadVar) {
        this.f12535a = j;
        this.b = qzlVar;
        this.c = str;
        this.d = d280Var;
        this.e = d280Var2;
        this.f = str2;
        this.g = str3;
        this.h = n5l0Var;
        this.i = n5l0Var2;
        this.j = n5l0Var3;
        this.k = gadVar;
    }

    @Override // a.k6l0
    public final long a() {
        return this.f12535a;
    }

    @Override // a.k6l0
    public final qzl c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h6l0)) {
            return false;
        }
        h6l0 h6l0Var = (h6l0) obj;
        return this.f12535a == h6l0Var.f12535a && this.b.equals(h6l0Var.b) && this.c.equals(h6l0Var.c) && this.d.equals(h6l0Var.d) && this.e.equals(h6l0Var.e) && this.f.equals(h6l0Var.f) && this.g.equals(h6l0Var.g) && Intrinsics.d(this.h, h6l0Var.h) && Intrinsics.d(this.i, h6l0Var.i) && Intrinsics.d(this.j, h6l0Var.j) && this.k == h6l0Var.k;
    }

    public final int hashCode() {
        int iB = ua80.b(ua80.b(twn.e(this.e, twn.e(this.d, ua80.b((this.b.hashCode() + (Long.hashCode(this.f12535a) * 31)) * 31, 31, this.c), 31), 31), 31, this.f), 31, this.g);
        n5l0 n5l0Var = this.h;
        int iHashCode = (iB + (n5l0Var == null ? 0 : n5l0Var.hashCode())) * 31;
        n5l0 n5l0Var2 = this.i;
        int iHashCode2 = (iHashCode + (n5l0Var2 == null ? 0 : n5l0Var2.hashCode())) * 31;
        n5l0 n5l0Var3 = this.j;
        return this.k.hashCode() + ((iHashCode2 + (n5l0Var3 != null ? n5l0Var3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "SetGames(gameId=" + this.f12535a + ", bottomBlock=" + this.b + ", opponentOneName=" + this.c + ", opponentOneLogo=" + this.d + ", opponentTwoLogo=" + this.e + ", opponentTwoName=" + this.f + ", infoLabel=" + this.g + ", setScore=" + this.h + ", gameScore=" + this.i + ", resultScore=" + this.j + ", gameIndicator=" + this.k + Separators.RPAREN;
    }
}
