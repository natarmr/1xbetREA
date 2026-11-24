package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class lk50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20183a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final List i;
    public final cys0 j;
    public final List k;
    public final List l;
    public final k1m0 m;
    public final int n;
    public final boolean o;

    public lk50(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, cys0 cys0Var, List list2, List list3, k1m0 k1m0Var, int i) {
        b1j.B(list, list2, list3);
        this.f20183a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = list;
        this.j = cys0Var;
        this.k = list2;
        this.l = list3;
        this.m = k1m0Var;
        this.n = i;
        this.o = cys0Var == cys0.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lk50)) {
            return false;
        }
        lk50 lk50Var = (lk50) obj;
        return this.f20183a == lk50Var.f20183a && this.b.equals(lk50Var.b) && this.c.equals(lk50Var.c) && this.d.equals(lk50Var.d) && this.e.equals(lk50Var.e) && this.f.equals(lk50Var.f) && this.g.equals(lk50Var.g) && this.h.equals(lk50Var.h) && Intrinsics.d(this.i, lk50Var.i) && this.j == lk50Var.j && Intrinsics.d(this.k, lk50Var.k) && Intrinsics.d(this.l, lk50Var.l) && this.m.equals(lk50Var.m) && this.n == lk50Var.n;
    }

    public final int hashCode() {
        return Integer.hashCode(this.n) + ((this.m.hashCode() + dw9.a(dw9.a((this.j.hashCode() + dw9.a(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(Long.hashCode(this.f20183a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i)) * 31, 31, this.k), 31, this.l)) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f20183a, "NetCellModel(sportId=", ", teamOneName=", this.b);
        f140.v(sbO, ", teamTwoName=", this.c, ", teamOneId=", this.d);
        f140.v(sbO, ", teamTwoId=", this.e, ", winnerId=", this.f);
        f140.v(sbO, ", teamOneImage=", this.g, ", teamTwoImage=", this.h);
        sbO.append(", games=");
        sbO.append(this.i);
        sbO.append(", typeCardGame=");
        sbO.append(this.j);
        hne.v(", subTeamOne=", ", subTeamTwo=", sbO, this.k, this.l);
        sbO.append(", seedGame=");
        sbO.append(this.m);
        sbO.append(", position=");
        sbO.append(this.n);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
