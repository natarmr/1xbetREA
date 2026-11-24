package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class xqj0 {
    public static final xqj0 v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f41323a;
    public final long b;
    public final lho c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final ufp0 h;
    public final ufp0 i;
    public final int j;
    public final int k;
    public final List l;
    public final boolean m;
    public final hrj0 n;
    public final String o;
    public final boolean p;
    public final List q;
    public final long r;
    public final long s;
    public final String t;
    public final String u;

    static {
        lho lhoVar = lho.UNKNOWN;
        iun iunVar = iun.f15405a;
        v = new xqj0(-1L, 0L, lhoVar, -1, "0", "0", "", new ufp0(0, "", "", "", iunVar), new ufp0(0, "", "", "", iunVar), 0, 0, iunVar, false, hrj0.c, "", false, iunVar, 0L, 0L, "0", "0");
    }

    public xqj0(long j, long j2, lho lhoVar, int i, String str, String str2, String str3, ufp0 ufp0Var, ufp0 ufp0Var2, int i2, int i3, List list, boolean z, hrj0 hrj0Var, String str4, boolean z2, List list2, long j3, long j4, String str5, String str6) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        str4.getClass();
        list2.getClass();
        str5.getClass();
        str6.getClass();
        this.f41323a = j;
        this.b = j2;
        this.c = lhoVar;
        this.d = i;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = ufp0Var;
        this.i = ufp0Var2;
        this.j = i2;
        this.k = i3;
        this.l = list;
        this.m = z;
        this.n = hrj0Var;
        this.o = str4;
        this.p = z2;
        this.q = list2;
        this.r = j3;
        this.s = j4;
        this.t = str5;
        this.u = str6;
    }

    public static xqj0 a(xqj0 xqj0Var, boolean z, int i) {
        hrj0 hrj0Var = hrj0.d;
        long j = xqj0Var.f41323a;
        long j2 = xqj0Var.b;
        lho lhoVar = xqj0Var.c;
        int i2 = xqj0Var.d;
        String str = xqj0Var.e;
        String str2 = xqj0Var.f;
        String str3 = xqj0Var.g;
        ufp0 ufp0Var = xqj0Var.h;
        ufp0 ufp0Var2 = xqj0Var.i;
        int i3 = xqj0Var.j;
        int i4 = xqj0Var.k;
        List list = xqj0Var.l;
        boolean z2 = xqj0Var.m;
        hrj0 hrj0Var2 = (i & 8192) != 0 ? xqj0Var.n : hrj0Var;
        String str4 = xqj0Var.o;
        boolean z3 = (i & 32768) != 0 ? xqj0Var.p : z;
        List list2 = xqj0Var.q;
        long j3 = xqj0Var.r;
        long j4 = xqj0Var.s;
        String str5 = xqj0Var.t;
        String str6 = xqj0Var.u;
        xqj0Var.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        str4.getClass();
        list2.getClass();
        str5.getClass();
        str6.getClass();
        return new xqj0(j, j2, lhoVar, i2, str, str2, str3, ufp0Var, ufp0Var2, i3, i4, list, z2, hrj0Var2, str4, z3, list2, j3, j4, str5, str6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xqj0)) {
            return false;
        }
        xqj0 xqj0Var = (xqj0) obj;
        return this.f41323a == xqj0Var.f41323a && znq0.e(this.b, xqj0Var.b) && this.c == xqj0Var.c && this.d == xqj0Var.d && Intrinsics.d(this.e, xqj0Var.e) && Intrinsics.d(this.f, xqj0Var.f) && Intrinsics.d(this.g, xqj0Var.g) && this.h.equals(xqj0Var.h) && this.i.equals(xqj0Var.i) && this.j == xqj0Var.j && this.k == xqj0Var.k && Intrinsics.d(this.l, xqj0Var.l) && this.m == xqj0Var.m && this.n == xqj0Var.n && Intrinsics.d(this.o, xqj0Var.o) && this.p == xqj0Var.p && Intrinsics.d(this.q, xqj0Var.q) && this.r == xqj0Var.r && this.s == xqj0Var.s && Intrinsics.d(this.t, xqj0Var.t) && Intrinsics.d(this.u, xqj0Var.u);
    }

    public final int hashCode() {
        return this.u.hashCode() + ua80.b(rw2.b(rw2.b(dw9.a(brm0.e(ua80.b((this.n.hashCode() + brm0.e(dw9.a(twn.a(this.k, twn.a(this.j, twn.f(this.i, twn.f(this.h, ua80.b(ua80.b(ua80.b(twn.a(this.d, (this.c.hashCode() + rw2.b(Long.hashCode(this.f41323a) * 31, 31, this.b)) * 31, 31), 31, this.e), 31, this.f), 31, this.g), 31), 31), 31), 31), 31, this.l), 31, this.m)) * 31, 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f41323a, "ShortGameModel(sportId=", ", eventDate=", znq0.h(this.b));
        sbO.append(", eventStatusType=");
        sbO.append(this.c);
        sbO.append(", eventSubStatusTypeId=");
        sbO.append(this.d);
        f140.v(sbO, ", scoreTeamOne=", this.e, ", scoreTeamTwo=", this.f);
        sbO.append(", score=");
        sbO.append(this.g);
        sbO.append(", teamOne=");
        sbO.append(this.h);
        sbO.append(", teamTwo=");
        sbO.append(this.i);
        sbO.append(", redCardTeamOne=");
        sbO.append(this.j);
        sbO.append(", redCardTeamTwo=");
        sbO.append(this.k);
        sbO.append(", referees=");
        sbO.append(this.l);
        sbO.append(", showScore=");
        sbO.append(this.m);
        sbO.append(", source=");
        sbO.append(this.n);
        w6x.z(", tournamentTitle=", this.o, ", finished=", sbO, this.p);
        sbO.append(", periods=");
        sbO.append(this.q);
        sbO.append(", champId=");
        sbO.append(this.r);
        kng0.A(sbO, ", globalChampId=", this.s, ", stringScoreOne=");
        return ua80.m(sbO, this.t, ", stringScoreTwo=", this.u, Separators.RPAREN);
    }
}
