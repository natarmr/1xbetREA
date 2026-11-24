package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class rkh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f30648a;
    public final long b;
    public final long c;
    public final long d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final long i;
    public final List j;
    public final int k;
    public final List l;
    public final String m;
    public final String n;
    public final String o;
    public final long p;
    public final long q;
    public final List r;
    public final boolean s;
    public final List t;
    public final String u;

    public rkh(long j, long j2, long j3, long j4, String str, String str2, String str3, String str4, long j5, List list, int i, List list2, String str5, String str6, String str7, long j6, long j7, List list3, boolean z, List list4, String str8) {
        hne.C(list, list2, list3, list4);
        this.f30648a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = j5;
        this.j = list;
        this.k = i;
        this.l = list2;
        this.m = str5;
        this.n = str6;
        this.o = str7;
        this.p = j6;
        this.q = j7;
        this.r = list3;
        this.s = z;
        this.t = list4;
        this.u = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rkh)) {
            return false;
        }
        rkh rkhVar = (rkh) obj;
        return this.f30648a == rkhVar.f30648a && this.b == rkhVar.b && this.c == rkhVar.c && this.d == rkhVar.d && this.e.equals(rkhVar.e) && this.f.equals(rkhVar.f) && this.g.equals(rkhVar.g) && this.h.equals(rkhVar.h) && this.i == rkhVar.i && Intrinsics.d(this.j, rkhVar.j) && this.k == rkhVar.k && Intrinsics.d(this.l, rkhVar.l) && this.m.equals(rkhVar.m) && this.n.equals(rkhVar.n) && this.o.equals(rkhVar.o) && this.p == rkhVar.p && this.q == rkhVar.q && Intrinsics.d(this.r, rkhVar.r) && this.s == rkhVar.s && Intrinsics.d(this.t, rkhVar.t) && this.u.equals(rkhVar.u);
    }

    public final int hashCode() {
        return this.u.hashCode() + dw9.a(brm0.e(dw9.a(rw2.b(rw2.b(ua80.b(ua80.b(ua80.b(dw9.a(twn.a(this.k, dw9.a(rw2.b(ua80.b(ua80.b(ua80.b(ua80.b(rw2.b(rw2.b(rw2.b(Long.hashCode(this.f30648a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f30648a, "CyberTournamentBracketModel(id=", ", subSportId=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", feedId=", this.c, ", globalId=");
        kng0.z(sbQ, this.d, ", name=", this.e);
        f140.v(sbQ, ", description=", this.f, ", type=", this.g);
        hne.B(sbQ, ", location=", this.h, ", prizePool=");
        hne.x(sbQ, this.i, ", prizeDistribution=", this.j);
        sbQ.append(", tier=");
        sbQ.append(this.k);
        sbQ.append(", teams=");
        sbQ.append(this.l);
        f140.v(sbQ, ", imageS3=", this.m, ", beginAt=", this.n);
        hne.B(sbQ, ", endAt=", this.o, ", beginAtStamp=");
        sbQ.append(this.p);
        kng0.A(sbQ, ", endAtStamp=", this.q, ", stages=");
        rz4.z(sbQ, ", isCurrencySymbolOnLeft=", this.r, ", swissGroupsDisplay=", this.s);
        sbQ.append(this.t);
        sbQ.append(", countryImage=");
        sbQ.append(this.u);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
