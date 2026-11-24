package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class gc6 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11044a;
    public final wb6 b;
    public final String c;
    public final String d;
    public final String e;
    public final a4x f;
    public final boolean g;
    public final ec6 h;
    public final int i;
    public final boolean j;

    public gc6(String str, wb6 wb6Var, String str2, String str3, String str4, a4x a4xVar, boolean z, ec6 ec6Var, int i, boolean z2) {
        str2.getClass();
        a4xVar.getClass();
        this.f11044a = str;
        this.b = wb6Var;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = a4xVar;
        this.g = z;
        this.h = ec6Var;
        this.i = i;
        this.j = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gc6)) {
            return false;
        }
        gc6 gc6Var = (gc6) obj;
        return this.f11044a.equals(gc6Var.f11044a) && this.b == gc6Var.b && Intrinsics.d(this.c, gc6Var.c) && this.d.equals(gc6Var.d) && this.e.equals(gc6Var.e) && Intrinsics.d(this.f, gc6Var.f) && this.g == gc6Var.g && this.h.equals(gc6Var.h) && this.i == gc6Var.i && this.j == gc6Var.j;
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f11044a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.j) + twn.a(this.i, (this.h.hashCode() + brm0.e(cs0.b(this.f, ua80.b(ua80.b(ua80.b((this.b.hashCode() + (this.f11044a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31), 31, this.g)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BestHeroUiModel(key=");
        sb.append(this.f11044a);
        sb.append(", gameType=");
        sb.append(this.b);
        sb.append(", playerId=");
        f140.v(sb, this.c, ", playerName=", this.d, ", playerIcon=");
        cs0.B(sb, this.e, ", heroes=", this.f, ", expanded=");
        sb.append(this.g);
        sb.append(", positionIcon=");
        sb.append(this.h);
        sb.append(", arrowIcon=");
        return ohs0.k(this.i, ", firstItem=", Separators.RPAREN, sb, this.j);
    }
}
