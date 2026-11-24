package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class lla0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eme f20238a;
    public final hdm0 b;
    public final nc5 c;
    public final List d;
    public final String e;
    public final List f;
    public final int g;
    public final hko0 h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;

    static {
        hko0 hko0Var = hko0.d;
    }

    public lla0(eme emeVar, hdm0 hdm0Var, nc5 nc5Var, List list, String str, List list2, int i, hko0 hko0Var, boolean z, boolean z2, boolean z3, boolean z4) {
        list.getClass();
        list2.getClass();
        hko0Var.getClass();
        this.f20238a = emeVar;
        this.b = hdm0Var;
        this.c = nc5Var;
        this.d = list;
        this.e = str;
        this.f = list2;
        this.g = i;
        this.h = hko0Var;
        this.i = z;
        this.j = z2;
        this.k = z3;
        this.l = z4;
    }

    public static lla0 a(lla0 lla0Var, hdm0 hdm0Var, nc5 nc5Var, List list, String str, List list2, int i, hko0 hko0Var, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        hdm0 hdm0Var2 = hdm0Var;
        eme emeVar = lla0Var.f20238a;
        if ((i2 & 2) != 0) {
            hdm0Var2 = lla0Var.b;
        }
        if ((i2 & 4) != 0) {
            nc5Var = lla0Var.c;
        }
        if ((i2 & 8) != 0) {
            list = lla0Var.d;
        }
        if ((i2 & 16) != 0) {
            str = lla0Var.e;
        }
        if ((i2 & 32) != 0) {
            list2 = lla0Var.f;
        }
        if ((i2 & 64) != 0) {
            i = lla0Var.g;
        }
        if ((i2 & 128) != 0) {
            hko0Var = lla0Var.h;
        }
        if ((i2 & 256) != 0) {
            z = lla0Var.i;
        }
        if ((i2 & 512) != 0) {
            z2 = lla0Var.j;
        }
        if ((i2 & 1024) != 0) {
            z3 = lla0Var.k;
        }
        if ((i2 & 2048) != 0) {
            z4 = lla0Var.l;
        }
        boolean z5 = z4;
        lla0Var.getClass();
        hdm0Var2.getClass();
        list.getClass();
        str.getClass();
        list2.getClass();
        hko0Var.getClass();
        boolean z6 = z3;
        boolean z7 = z2;
        boolean z8 = z;
        hko0 hko0Var2 = hko0Var;
        int i3 = i;
        List list3 = list2;
        String str2 = str;
        List list4 = list;
        return new lla0(emeVar, hdm0Var2, nc5Var, list4, str2, list3, i3, hko0Var2, z8, z7, z6, z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lla0)) {
            return false;
        }
        lla0 lla0Var = (lla0) obj;
        return this.f20238a == lla0Var.f20238a && this.b.equals(lla0Var.b) && this.c.equals(lla0Var.c) && Intrinsics.d(this.d, lla0Var.d) && this.e.equals(lla0Var.e) && Intrinsics.d(this.f, lla0Var.f) && this.g == lla0Var.g && Intrinsics.d(this.h, lla0Var.h) && this.i == lla0Var.i && this.j == lla0Var.j && this.k == lla0Var.k && this.l == lla0Var.l;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.l) + brm0.e(brm0.e(brm0.e((this.h.hashCode() + twn.a(this.g, dw9.a(ua80.b(dw9.a((this.c.hashCode() + ((this.b.hashCode() + (this.f20238a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f), 31)) * 31, 31, this.i), 31, this.j), 31, this.k);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayersStatisticsCricketState(coreHeaderModel=");
        sb.append(this.f20238a);
        sb.append(", statisticHeaderModel=");
        sb.append(this.b);
        sb.append(", backgroundHeaderModel=");
        sb.append(this.c);
        sb.append(", teams=");
        sb.append(this.d);
        sb.append(", currentTeamId=");
        cs0.y(this.e, ", innings=", ", currentInning=", sb, this.f);
        sb.append(this.g);
        sb.append(", table=");
        sb.append(this.h);
        sb.append(", hasFilters=");
        ua80.u(", isLive=", ", isLoading=", sb, this.i, this.j);
        return ohs0.p(", isError=", Separators.RPAREN, sb, this.k, this.l);
    }
}
