package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j6l0 implements k6l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15994a;
    public final qzl b;
    public final fxs0 c;
    public final fxs0 d;
    public final n5l0 e;
    public final n5l0 f;
    public final n5l0 g;
    public final gad h;
    public final String i;

    public j6l0(long j, qzl qzlVar, fxs0 fxs0Var, fxs0 fxs0Var2, n5l0 n5l0Var, n5l0 n5l0Var2, n5l0 n5l0Var3, gad gadVar, String str) {
        this.f15994a = j;
        this.b = qzlVar;
        this.c = fxs0Var;
        this.d = fxs0Var2;
        this.e = n5l0Var;
        this.f = n5l0Var2;
        this.g = n5l0Var3;
        this.h = gadVar;
        this.i = str;
    }

    @Override // a.k6l0
    public final long a() {
        return this.f15994a;
    }

    @Override // a.k6l0
    public final qzl c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j6l0)) {
            return false;
        }
        j6l0 j6l0Var = (j6l0) obj;
        return this.f15994a == j6l0Var.f15994a && this.b.equals(j6l0Var.b) && this.c.equals(j6l0Var.c) && this.d.equals(j6l0Var.d) && Intrinsics.d(this.e, j6l0Var.e) && Intrinsics.d(this.f, j6l0Var.f) && Intrinsics.d(this.g, j6l0Var.g) && this.h == j6l0Var.h && this.i.equals(j6l0Var.i);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f15994a) * 31)) * 31)) * 31)) * 31;
        n5l0 n5l0Var = this.e;
        int iHashCode2 = (iHashCode + (n5l0Var == null ? 0 : n5l0Var.hashCode())) * 31;
        n5l0 n5l0Var2 = this.f;
        int iHashCode3 = (iHashCode2 + (n5l0Var2 == null ? 0 : n5l0Var2.hashCode())) * 31;
        n5l0 n5l0Var3 = this.g;
        return this.i.hashCode() + ((this.h.hashCode() + ((iHashCode3 + (n5l0Var3 != null ? n5l0Var3.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TwoPairs(gameId=");
        sb.append(this.f15994a);
        sb.append(", bottomBlock=");
        sb.append(this.b);
        sb.append(", teamOne=");
        sb.append(this.c);
        sb.append(", teamTwo=");
        sb.append(this.d);
        sb.append(", teamSetScore=");
        sb.append(this.e);
        sb.append(", teamGameScore=");
        sb.append(this.f);
        sb.append(", teamResultScore=");
        sb.append(this.g);
        sb.append(", gameIndicator=");
        sb.append(this.h);
        return rw2.o(sb, ", infoLabel=", this.i, Separators.RPAREN);
    }
}
