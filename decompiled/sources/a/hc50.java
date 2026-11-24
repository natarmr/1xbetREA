package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class hc50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12804a;
    public final ybg0 b;
    public final int c;
    public final Function0 d;
    public final boolean e;
    public final boolean f;
    public final vf5 g;
    public final Integer h;
    public final r0m i;
    public final i8m0 j;
    public final boolean k;

    public /* synthetic */ hc50(String str, ybg0 ybg0Var, int i, Function0 function0, int i2) {
        this(str, ybg0Var, i, function0, true, false, null, null, (i2 & 256) != 0 ? null : r0m.m, null, (i2 & 1024) == 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hc50)) {
            return false;
        }
        hc50 hc50Var = (hc50) obj;
        return Intrinsics.d(this.f12804a, hc50Var.f12804a) && this.b == hc50Var.b && this.c == hc50Var.c && Intrinsics.d(this.d, hc50Var.d) && this.e == hc50Var.e && this.f == hc50Var.f && this.g == hc50Var.g && Intrinsics.d(this.h, hc50Var.h) && this.i == hc50Var.i && this.j == hc50Var.j && this.k == hc50Var.k;
    }

    public final int hashCode() {
        int iE = brm0.e(brm0.e((this.d.hashCode() + twn.a(this.c, (this.b.hashCode() + (this.f12804a.hashCode() * 31)) * 31, 31)) * 31, 31, this.e), 31, this.f);
        vf5 vf5Var = this.g;
        int iHashCode = (iE + (vf5Var == null ? 0 : vf5Var.hashCode())) * 31;
        Integer num = this.h;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        r0m r0mVar = this.i;
        int iHashCode3 = (iHashCode2 + (r0mVar == null ? 0 : r0mVar.hashCode())) * 31;
        i8m0 i8m0Var = this.j;
        return Boolean.hashCode(this.k) + ((iHashCode3 + (i8m0Var != null ? i8m0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavigationBarButtonModel(iconId=");
        sb.append(this.f12804a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", iconRes=");
        sb.append(this.c);
        sb.append(", onClick=");
        sb.append(this.d);
        sb.append(", isClickable=");
        ua80.u(", isDisable=", ", badgeType=", sb, this.e, this.f);
        sb.append(this.g);
        sb.append(", counter=");
        sb.append(this.h);
        sb.append(", counterStyle=");
        sb.append(this.i);
        sb.append(", badgeStatus=");
        sb.append(this.j);
        sb.append(", isSearchButton=");
        return rw2.p(sb, this.k, Separators.RPAREN);
    }

    public hc50(String str, ybg0 ybg0Var, int i, Function0 function0, boolean z, boolean z2, vf5 vf5Var, Integer num, r0m r0mVar, i8m0 i8m0Var, boolean z3) {
        str.getClass();
        ybg0Var.getClass();
        function0.getClass();
        this.f12804a = str;
        this.b = ybg0Var;
        this.c = i;
        this.d = function0;
        this.e = z;
        this.f = z2;
        this.g = vf5Var;
        this.h = num;
        this.i = r0mVar;
        this.j = i8m0Var;
        this.k = z3;
    }
}
