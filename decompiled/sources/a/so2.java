package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class so2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f32522a;
    public final long b;
    public final long c;
    public final long d;
    public final String e;
    public final String f;
    public final String g;
    public final long h;
    public final String i;
    public final List j;
    public final long k;
    public final String l;
    public final List m;
    public final boolean n;
    public final String o;
    public final int p;
    public final int q;

    public so2(long j, long j2, long j3, long j4, String str, String str2, String str3, long j5, String str4, List list, long j6, String str5, List list2, boolean z, String str6, int i, int i2) {
        list.getClass();
        list2.getClass();
        this.f32522a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = j5;
        this.i = str4;
        this.j = list;
        this.k = j6;
        this.l = str5;
        this.m = list2;
        this.n = z;
        this.o = str6;
        this.p = i;
        this.q = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so2)) {
            return false;
        }
        so2 so2Var = (so2) obj;
        return this.f32522a == so2Var.f32522a && this.b == so2Var.b && this.c == so2Var.c && this.d == so2Var.d && this.e.equals(so2Var.e) && this.f.equals(so2Var.f) && this.g.equals(so2Var.g) && this.h == so2Var.h && this.i.equals(so2Var.i) && Intrinsics.d(this.j, so2Var.j) && this.k == so2Var.k && this.l.equals(so2Var.l) && Intrinsics.d(this.m, so2Var.m) && this.n == so2Var.n && this.o.equals(so2Var.o) && this.p == so2Var.p && this.q == so2Var.q;
    }

    public final int hashCode() {
        return Integer.hashCode(this.q) + twn.a(this.p, ua80.b(brm0.e(dw9.a(ua80.b(rw2.b(dw9.a(ua80.b(rw2.b(ua80.b(ua80.b(ua80.b(rw2.b(rw2.b(rw2.b(Long.hashCode(this.f32522a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f32522a, "AlternativeInfoModel(sport=", ", champId=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", globalChampId=", this.c, ", gameId=");
        kng0.z(sbQ, this.d, ", champImage=", this.e);
        f140.v(sbQ, ", champName=", this.f, ", gameName=", this.g);
        kng0.A(sbQ, ", firstTeamId=", this.h, ", firstTeamName=");
        cs0.y(this.i, ", firstTeamImages=", ", secondTeamId=", sbQ, this.j);
        kng0.z(sbQ, this.k, ", secondTeamName=", this.l);
        esw0.k(sbQ, ", secondTeamImages=", this.m, ", isFinished=", this.n);
        axq.s(this.p, ", gameScore=", this.o, ", oppNumber=", sbQ);
        return vqd.p(sbQ, ", teamNumber=", this.q, Separators.RPAREN);
    }
}
