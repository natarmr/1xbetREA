package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class yf90 implements uqa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42530a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final zmk0 g;
    public final zmk0 h;
    public final String i;
    public final ArrayList j;
    public final zmk0 k;
    public final zmk0 l;
    public final zmk0 m;
    public final zmk0 n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final bex r;

    public yf90(String str, String str2, String str3, String str4, String str5, String str6, zmk0 zmk0Var, zmk0 zmk0Var2, String str7, ArrayList arrayList, zmk0 zmk0Var3, zmk0 zmk0Var4, zmk0 zmk0Var5, zmk0 zmk0Var6, boolean z, boolean z2, boolean z3, bex bexVar) {
        brm0.B(str, str2, str7);
        this.f42530a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = zmk0Var;
        this.h = zmk0Var2;
        this.i = str7;
        this.j = arrayList;
        this.k = zmk0Var3;
        this.l = zmk0Var4;
        this.m = zmk0Var5;
        this.n = zmk0Var6;
        this.o = z;
        this.p = z2;
        this.q = z3;
        this.r = bexVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yf90)) {
            return false;
        }
        yf90 yf90Var = (yf90) obj;
        return Intrinsics.d(this.f42530a, yf90Var.f42530a) && Intrinsics.d(this.b, yf90Var.b) && this.c.equals(yf90Var.c) && this.d.equals(yf90Var.d) && this.e.equals(yf90Var.e) && this.f.equals(yf90Var.f) && this.g.equals(yf90Var.g) && this.h.equals(yf90Var.h) && Intrinsics.d(this.i, yf90Var.i) && this.j.equals(yf90Var.j) && this.k.equals(yf90Var.k) && this.l.equals(yf90Var.l) && this.m.equals(yf90Var.m) && this.n.equals(yf90Var.n) && this.o == yf90Var.o && this.p == yf90Var.p && this.q == yf90Var.q && this.r == yf90Var.r;
    }

    public final int hashCode() {
        return this.r.hashCode() + brm0.e(brm0.e(brm0.e(axq.b(this.n, axq.b(this.m, axq.b(this.l, axq.b(this.k, twn.g(this.j, ua80.b(axq.b(this.h, axq.b(this.g, ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(this.f42530a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31), 31), 31, this.i), 31), 31), 31), 31), 31), 31, this.o), 31, this.p), 31, this.q);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("PeriodUiModel(teamOneName=", this.f42530a, ", teamTwoName=", this.b, ", teamOneFirstPlayerImageUrl=");
        f140.v(sbN, this.c, ", teamOneSecondPlayerImageUrl=", this.d, ", teamTwoFirstPlayerImageUrl=");
        f140.v(sbN, this.e, ", teamTwoSecondPlayerImageUrl=", this.f, ", teamOneTotalScore=");
        sbN.append(this.g);
        sbN.append(", teamTwoTotalScore=");
        sbN.append(this.h);
        sbN.append(", timePeriodName=");
        sbN.append(this.i);
        sbN.append(", periodInfoUiModelList=");
        sbN.append(this.j);
        sbN.append(", teamOneTennisGameScore=");
        sbN.append(this.k);
        sbN.append(", teamTwoTennisGameScore=");
        sbN.append(this.l);
        sbN.append(", teamOnePointsScore=");
        sbN.append(this.m);
        sbN.append(", teamTwoPointsScore=");
        sbN.append(this.n);
        sbN.append(", isPointEnable=");
        ua80.u(", hostsVsGuests=", ", pairTeam=", sbN, this.o, this.p);
        sbN.append(this.q);
        sbN.append(", inningState=");
        sbN.append(this.r);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
