package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class kz20 implements lz20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f19134a;
    public final qym0 b;
    public final long c;
    public final long d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final udl0 i;
    public final nym0 j;
    public final boolean k;
    public final boolean l;
    public final lm6 m;

    public kz20(List list, qym0 qym0Var, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4, udl0 udl0Var, nym0 nym0Var, boolean z5, boolean z6, lm6 lm6Var) {
        list.getClass();
        qym0Var.getClass();
        this.f19134a = list;
        this.b = qym0Var;
        this.c = j;
        this.d = j2;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = udl0Var;
        this.j = nym0Var;
        this.k = z5;
        this.l = z6;
        this.m = lm6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kz20)) {
            return false;
        }
        kz20 kz20Var = (kz20) obj;
        return Intrinsics.d(this.f19134a, kz20Var.f19134a) && Intrinsics.d(this.b, kz20Var.b) && this.c == kz20Var.c && this.d == kz20Var.d && this.e == kz20Var.e && this.f == kz20Var.f && this.g == kz20Var.g && this.h == kz20Var.h && this.i == kz20Var.i && Intrinsics.d(this.j, kz20Var.j) && this.k == kz20Var.k && this.l == kz20Var.l && Intrinsics.d(this.m, kz20Var.m);
    }

    public final int hashCode() {
        int iHashCode = (this.i.hashCode() + brm0.e(brm0.e(brm0.e(brm0.e(rw2.b(rw2.b((this.b.hashCode() + (this.f19134a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h)) * 31;
        nym0 nym0Var = this.j;
        int iE = brm0.e(brm0.e((iHashCode + (nym0Var == null ? 0 : nym0Var.f24336a.hashCode())) * 31, 31, this.k), 31, this.l);
        lm6 lm6Var = this.m;
        return iE + (lm6Var != null ? lm6Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(categories=");
        sb.append(this.f19134a);
        sb.append(", subGames=");
        sb.append(this.b);
        sb.append(", selectedSubGameId=");
        sb.append(this.c);
        kng0.A(sb, ", selectedCategoryId=", this.d, ", categoriesVisible=");
        ua80.u(", categoriesLoading=", ", subGamesVisible=", sb, this.e, this.f);
        ua80.u(", subGamesLoading=", ", sportGameType=", sb, this.g, this.h);
        sb.append(this.i);
        sb.append(", subGamesSearch=");
        sb.append(this.j);
        sb.append(", isSubGamesSearchEnabled=");
        ua80.u(", isMarketsDisplaySettingsVisible=", ", betBuilder=", sb, this.k, this.l);
        sb.append(this.m);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
