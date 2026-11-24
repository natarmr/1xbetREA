package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class rbb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f30176a;
    public final long b;
    public final String c;
    public final List d;
    public final String e;
    public final long f;
    public final String g;
    public final String h;
    public final String i;
    public final int j;
    public final int k;
    public final boolean l;
    public final boolean m;
    public final long n;
    public final pgb o;
    public final List p;

    public rbb(long j, long j2, String str, List list, String str2, long j3, String str3, String str4, int i, int i2, boolean z, long j4, pgb pgbVar, List list2, int i3) {
        this(j, (i3 & 2) != 0 ? 0L : j2, str, list, str2, j3, (i3 & 64) != 0 ? "" : str3, str4, "", (i3 & 512) != 0 ? 0 : i, i2, false, z, j4, (i3 & 16384) != 0 ? pgb.f26945a : pgbVar, (i3 & 32768) != 0 ? iun.f15405a : list2);
    }

    public static rbb a(rbb rbbVar, ArrayList arrayList, boolean z, ArrayList arrayList2, int i) {
        long j = rbbVar.f30176a;
        long j2 = rbbVar.b;
        String str = rbbVar.c;
        String str2 = rbbVar.e;
        long j3 = rbbVar.f;
        String str3 = rbbVar.g;
        String str4 = rbbVar.h;
        String str5 = rbbVar.i;
        int i2 = rbbVar.j;
        int i3 = rbbVar.k;
        boolean z2 = (i & 2048) != 0 ? rbbVar.l : z;
        boolean z3 = rbbVar.m;
        boolean z4 = z2;
        long j4 = rbbVar.n;
        pgb pgbVar = rbbVar.o;
        List list = (i & 32768) != 0 ? rbbVar.p : arrayList2;
        ohs0.z(str, str2, str3, str4, str5);
        pgbVar.getClass();
        list.getClass();
        return new rbb(j, j2, str, arrayList, str2, j3, str3, str4, str5, i2, i3, z4, z3, j4, pgbVar, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rbb)) {
            return false;
        }
        rbb rbbVar = (rbb) obj;
        return this.f30176a == rbbVar.f30176a && this.b == rbbVar.b && Intrinsics.d(this.c, rbbVar.c) && Intrinsics.d(this.d, rbbVar.d) && Intrinsics.d(this.e, rbbVar.e) && this.f == rbbVar.f && Intrinsics.d(this.g, rbbVar.g) && Intrinsics.d(this.h, rbbVar.h) && Intrinsics.d(this.i, rbbVar.i) && this.j == rbbVar.j && this.k == rbbVar.k && this.l == rbbVar.l && this.m == rbbVar.m && this.n == rbbVar.n && this.o == rbbVar.o && Intrinsics.d(this.p, rbbVar.p);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + dw9.a((this.o.hashCode() + rw2.b(brm0.e(brm0.e(twn.a(this.k, twn.a(this.j, ua80.b(ua80.b(ua80.b(rw2.b(ua80.b(dw9.a(ua80.b(rw2.b(Long.hashCode(this.f30176a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31), 31), 31, this.l), 31, this.m), 31, this.n)) * 31, 31, this.p);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f30176a, "Champ(id=", ", globalChampId=");
        kng0.z(sbQ, this.b, ", name=", this.c);
        sbQ.append(", subChamps=");
        sbQ.append(this.d);
        sbQ.append(", sportName=");
        sbQ.append(this.e);
        kng0.A(sbQ, ", count=", this.f, ", champImage=");
        f140.v(sbQ, this.g, ", countryImage=", this.h, ", cyberImage=");
        twn.w(this.j, this.i, ", ssi=", ", idCountry=", sbQ);
        brm0.w(this.k, ", favorite=", ", live=", sbQ, this.l);
        rw2.v(this.n, ", sportId=", sbQ, this.m);
        sbQ.append(", champType=");
        sbQ.append(this.o);
        sbQ.append(", games=");
        sbQ.append(this.p);
        sbQ.append(", forceExpanded=false)");
        return sbQ.toString();
    }

    public rbb(long j, long j2, String str, List list, String str2, long j3, String str3, String str4, String str5, int i, int i2, boolean z, boolean z2, long j4, pgb pgbVar, List list2) {
        list.getClass();
        str3.getClass();
        pgbVar.getClass();
        list2.getClass();
        this.f30176a = j;
        this.b = j2;
        this.c = str;
        this.d = list;
        this.e = str2;
        this.f = j3;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = i;
        this.k = i2;
        this.l = z;
        this.m = z2;
        this.n = j4;
        this.o = pgbVar;
        this.p = list2;
    }
}
