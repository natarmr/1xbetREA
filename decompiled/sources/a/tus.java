package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class tus implements wus {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f34565a;
    public final long b;
    public final String c;
    public final List d;
    public final List e;
    public final boolean f;
    public final String g;
    public final long h;
    public final long i;
    public final boolean j;
    public final boolean k;
    public final long l;
    public final long m;
    public final int n;
    public final long o;
    public final String p;

    public tus(int i, long j, long j2, long j3, long j4, long j5, long j6, long j7, String str, String str2, String str3, List list, List list2, boolean z, boolean z2, boolean z3) {
        str.getClass();
        list.getClass();
        list2.getClass();
        this.f34565a = j;
        this.b = j2;
        this.c = str;
        this.d = list;
        this.e = list2;
        this.f = z;
        this.g = str2;
        this.h = j3;
        this.i = j4;
        this.j = z2;
        this.k = z3;
        this.l = j5;
        this.m = j6;
        this.n = i;
        this.o = j7;
        this.p = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tus)) {
            return false;
        }
        tus tusVar = (tus) obj;
        return this.f34565a == tusVar.f34565a && this.b == tusVar.b && Intrinsics.d(this.c, tusVar.c) && Intrinsics.d(this.d, tusVar.d) && Intrinsics.d(this.e, tusVar.e) && this.f == tusVar.f && this.g.equals(tusVar.g) && this.h == tusVar.h && this.i == tusVar.i && this.j == tusVar.j && this.k == tusVar.k && this.l == tusVar.l && this.m == tusVar.m && this.n == tusVar.n && this.o == tusVar.o && this.p.equals(tusVar.p);
    }

    public final int hashCode() {
        return this.p.hashCode() + rw2.b(twn.a(this.n, rw2.b(rw2.b(brm0.e(brm0.e(rw2.b(rw2.b(ua80.b(brm0.e(dw9.a(dw9.a(ua80.b(rw2.b(Long.hashCode(this.f34565a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31), 31, this.o);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f34565a, "ShowMenu(teamOneId=", ", teamTwoId=");
        kng0.z(sbQ, this.b, ", sportName=", this.c);
        hne.v(", statisticBlocksAvailableIds=", ", statisticBlocksDisableIds=", sbQ, this.d, this.e);
        hne.u(", statisticBlocksActive=", ", statId=", this.g, sbQ, this.f);
        kng0.A(sbQ, ", gameId=", this.h, ", constId=");
        hne.t(this.i, ", live=", sbQ, this.j);
        rz4.A(sbQ, ", autoStreamVisible=", this.k, ", sportId=");
        sbQ.append(this.l);
        kng0.A(sbQ, ", subSportId=", this.m, ", globalChampId=");
        sbQ.append(this.n);
        sbQ.append(", champId=");
        sbQ.append(this.o);
        return rw2.o(sbQ, ", champName=", this.p, Separators.RPAREN);
    }
}
