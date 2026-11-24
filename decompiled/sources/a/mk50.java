package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class mk50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21928a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final List l;
    public final cys0 m;
    public final List n;
    public final List o;
    public final k1m0 p;
    public final boolean q;
    public final ArrayList r;
    public final boolean s;

    public mk50(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list, cys0 cys0Var, List list2, List list3, k1m0 k1m0Var, boolean z, ArrayList arrayList, boolean z2) {
        b1j.B(list, list2, list3);
        this.f21928a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
        this.k = str11;
        this.l = list;
        this.m = cys0Var;
        this.n = list2;
        this.o = list3;
        this.p = k1m0Var;
        this.q = z;
        this.r = arrayList;
        this.s = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mk50)) {
            return false;
        }
        mk50 mk50Var = (mk50) obj;
        return this.f21928a.equals(mk50Var.f21928a) && this.b.equals(mk50Var.b) && this.c.equals(mk50Var.c) && this.d.equals(mk50Var.d) && this.e.equals(mk50Var.e) && this.f.equals(mk50Var.f) && this.g.equals(mk50Var.g) && this.h.equals(mk50Var.h) && this.i.equals(mk50Var.i) && this.j.equals(mk50Var.j) && this.k.equals(mk50Var.k) && Intrinsics.d(this.l, mk50Var.l) && this.m == mk50Var.m && Intrinsics.d(this.n, mk50Var.n) && Intrinsics.d(this.o, mk50Var.o) && this.p.equals(mk50Var.p) && this.q == mk50Var.q && this.r.equals(mk50Var.r) && this.s == mk50Var.s;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.s) + twn.g(this.r, brm0.e((this.p.hashCode() + dw9.a(dw9.a((this.m.hashCode() + dw9.a(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(this.f21928a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l)) * 31, 31, this.n), 31, this.o)) * 31, 31, this.q), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("NetCellUiModel(teamOneName=", this.f21928a, ", teamTwoName=", this.b, ", teamOneId=");
        f140.v(sbN, this.c, ", teamTwoId=", this.d, ", winnerId=");
        f140.v(sbN, this.e, ", teamOneImage=", this.f, ", teamTwoImage=");
        f140.v(sbN, this.g, ", teamOneBottomImage=", this.h, ", teamTwoBottomImage=");
        f140.v(sbN, this.i, ", teamOneSubName=", this.j, ", teamTwoSubName=");
        cs0.y(this.k, ", games=", ", typeCardGame=", sbN, this.l);
        sbN.append(this.m);
        sbN.append(", subTeamOne=");
        sbN.append(this.n);
        sbN.append(", subTeamTwo=");
        sbN.append(this.o);
        sbN.append(", seedGame=");
        sbN.append(this.p);
        sbN.append(", isLive=");
        sbN.append(this.q);
        sbN.append(", scores=");
        sbN.append(this.r);
        sbN.append(", is24HourFormat=");
        return rw2.p(sbN, this.s, Separators.RPAREN);
    }
}
