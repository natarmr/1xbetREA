package a;

import android.gov.nist.core.Separators;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class opv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25661a;
    public final zov0 b;
    public final maj c;
    public final long d;
    public final long e;
    public final long f;
    public final o4e g;
    public final int h;
    public final af5 i;
    public final long j;
    public final long k;
    public final int l;
    public final int m;
    public final long n;
    public final int o;
    public final List p;
    public final String q;
    public final List r;

    public opv0(String str, zov0 zov0Var, maj majVar, long j, long j2, long j3, o4e o4eVar, int i, af5 af5Var, long j4, long j5, int i2, int i3, long j6, int i4, List list, String str2, List list2) {
        str.getClass();
        majVar.getClass();
        list.getClass();
        str2.getClass();
        list2.getClass();
        this.f25661a = str;
        this.b = zov0Var;
        this.c = majVar;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = o4eVar;
        this.h = i;
        this.i = af5Var;
        this.j = j4;
        this.k = j5;
        this.l = i2;
        this.m = i3;
        this.n = j6;
        this.o = i4;
        this.p = list;
        this.q = str2;
        this.r = list2;
    }

    public final apv0 a() {
        long j;
        long jE;
        List list = this.r;
        maj majVar = !list.isEmpty() ? (maj) list.get(0) : maj.b;
        UUID uuidFromString = UUID.fromString(this.f25661a);
        uuidFromString.getClass();
        HashSet hashSet = new HashSet(this.p);
        long j2 = this.e;
        yov0 yov0Var = j2 != 0 ? new yov0(j2, this.f) : null;
        zov0 zov0Var = zov0.f44733a;
        zov0 zov0Var2 = this.b;
        int i = this.h;
        long j3 = this.d;
        if (zov0Var2 == zov0Var) {
            String str = ppv0.z;
            j = j3;
            jE = ipm0.e(zov0Var2 == zov0Var && i > 0, i, this.i, this.j, this.k, this.l, j2 != 0, j, this.f, j2, this.n);
        } else {
            j = j3;
            jE = Long.MAX_VALUE;
        }
        return new apv0(uuidFromString, zov0Var2, hashSet, this.c, majVar, i, this.m, this.g, j, yov0Var, jE, this.o, this.q);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof opv0)) {
            return false;
        }
        opv0 opv0Var = (opv0) obj;
        return Intrinsics.d(this.f25661a, opv0Var.f25661a) && this.b == opv0Var.b && Intrinsics.d(this.c, opv0Var.c) && this.d == opv0Var.d && this.e == opv0Var.e && this.f == opv0Var.f && this.g.equals(opv0Var.g) && this.h == opv0Var.h && this.i == opv0Var.i && this.j == opv0Var.j && this.k == opv0Var.k && this.l == opv0Var.l && this.m == opv0Var.m && this.n == opv0Var.n && this.o == opv0Var.o && Intrinsics.d(this.p, opv0Var.p) && Intrinsics.d(this.q, opv0Var.q) && Intrinsics.d(this.r, opv0Var.r);
    }

    public final int hashCode() {
        return this.r.hashCode() + ua80.b(dw9.a(twn.a(this.o, rw2.b(twn.a(this.m, twn.a(this.l, rw2.b(rw2.b((this.i.hashCode() + twn.a(this.h, (this.g.hashCode() + rw2.b(rw2.b(rw2.b((this.c.hashCode() + ((this.b.hashCode() + (this.f25661a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f)) * 31, 31)) * 31, 31, this.j), 31, this.k), 31), 31), 31, this.n), 31), 31, this.p), 31, this.q);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WorkInfoPojo(id=");
        sb.append(this.f25661a);
        sb.append(", state=");
        sb.append(this.b);
        sb.append(", output=");
        sb.append(this.c);
        sb.append(", initialDelay=");
        sb.append(this.d);
        kng0.A(sb, ", intervalDuration=", this.e, ", flexDuration=");
        sb.append(this.f);
        sb.append(", constraints=");
        sb.append(this.g);
        sb.append(", runAttemptCount=");
        sb.append(this.h);
        sb.append(", backoffPolicy=");
        sb.append(this.i);
        kng0.A(sb, ", backoffDelayDuration=", this.j, ", lastEnqueueTime=");
        ua80.v(sb, this.k, ", periodCount=", this.l);
        rw2.x(sb, ", generation=", this.m, ", nextScheduleTimeOverride=");
        ua80.v(sb, this.n, ", stopReason=", this.o);
        sb.append(", tags=");
        sb.append(this.p);
        sb.append(", workerClassName=");
        sb.append(this.q);
        return ohs0.s(sb, ", progress=", this.r, Separators.RPAREN);
    }
}
