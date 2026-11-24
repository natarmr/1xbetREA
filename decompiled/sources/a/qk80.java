package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class qk80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28874a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final int j;
    public final int k;
    public final long l;
    public final lho m;
    public final List n;
    public final List o;
    public final cys0 p;

    public qk80(int i, int i2, long j, lho lhoVar, cys0 cys0Var, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, List list2) {
        str8.getClass();
        str9.getClass();
        list.getClass();
        list2.getClass();
        this.f28874a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = i;
        this.k = i2;
        this.l = j;
        this.m = lhoVar;
        this.n = list;
        this.o = list2;
        this.p = cys0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qk80)) {
            return false;
        }
        qk80 qk80Var = (qk80) obj;
        return this.f28874a.equals(qk80Var.f28874a) && this.b.equals(qk80Var.b) && this.c.equals(qk80Var.c) && this.d.equals(qk80Var.d) && this.e.equals(qk80Var.e) && this.f.equals(qk80Var.f) && this.g.equals(qk80Var.g) && Intrinsics.d(this.h, qk80Var.h) && Intrinsics.d(this.i, qk80Var.i) && this.j == qk80Var.j && this.k == qk80Var.k && this.l == qk80Var.l && this.m == qk80Var.m && Intrinsics.d(this.n, qk80Var.n) && Intrinsics.d(this.o, qk80Var.o) && this.p == qk80Var.p;
    }

    public final int hashCode() {
        return this.p.hashCode() + dw9.a(dw9.a((this.m.hashCode() + rw2.b(twn.a(this.k, twn.a(this.j, ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(this.f28874a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31), 31), 31, this.l)) * 31, 31, this.n), 31, this.o);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("PagerModel(statisticGameId=", this.f28874a, ", teamId1=", this.b, ", teamId2=");
        f140.v(sbN, this.c, ", team1Name=", this.d, ", team2Name=");
        f140.v(sbN, this.e, ", team1Image=", this.f, ", team2Image=");
        f140.v(sbN, this.g, ", score1=", this.h, ", score2=");
        twn.w(this.j, this.i, ", dateStart=", ", winner=", sbN);
        sbN.append(this.k);
        sbN.append(", feedGameId=");
        sbN.append(this.l);
        sbN.append(", statusType=");
        sbN.append(this.m);
        sbN.append(", subTeam1List=");
        sbN.append(this.n);
        sbN.append(", subTeam2List=");
        sbN.append(this.o);
        sbN.append(", typeCardGame=");
        sbN.append(this.p);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
