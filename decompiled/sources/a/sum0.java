package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class sum0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f32829a;
    public final long b;
    public final String c;
    public final String d;
    public final long e;
    public final String f;
    public final String g;
    public final String h;
    public final int i;
    public final int j;
    public final boolean k;
    public final long l;
    public final List m;
    public final pgb n;

    public sum0(long j, long j2, String str, String str2, long j3, String str3, String str4, String str5, int i, int i2, boolean z, long j4, List list, pgb pgbVar) {
        list.getClass();
        this.f32829a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = j3;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = i;
        this.j = i2;
        this.k = z;
        this.l = j4;
        this.m = list;
        this.n = pgbVar;
    }

    public static sum0 a(sum0 sum0Var, boolean z, ArrayList arrayList, int i) {
        long j = sum0Var.f32829a;
        long j2 = sum0Var.b;
        String str = sum0Var.c;
        String str2 = sum0Var.d;
        long j3 = sum0Var.e;
        String str3 = sum0Var.f;
        String str4 = sum0Var.g;
        String str5 = sum0Var.h;
        int i2 = sum0Var.i;
        int i3 = sum0Var.j;
        if ((i & 1024) != 0) {
            z = sum0Var.k;
        }
        long j4 = sum0Var.l;
        List list = (i & 8192) != 0 ? sum0Var.m : arrayList;
        pgb pgbVar = sum0Var.n;
        ohs0.z(str, str2, str3, str4, str5);
        list.getClass();
        pgbVar.getClass();
        return new sum0(j, j2, str, str2, j3, str3, str4, str5, i2, i3, z, j4, list, pgbVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sum0)) {
            return false;
        }
        sum0 sum0Var = (sum0) obj;
        return this.f32829a == sum0Var.f32829a && this.b == sum0Var.b && Intrinsics.d(this.c, sum0Var.c) && Intrinsics.d(this.d, sum0Var.d) && this.e == sum0Var.e && Intrinsics.d(this.f, sum0Var.f) && Intrinsics.d(this.g, sum0Var.g) && Intrinsics.d(this.h, sum0Var.h) && this.i == sum0Var.i && this.j == sum0Var.j && this.k == sum0Var.k && this.l == sum0Var.l && Intrinsics.d(this.m, sum0Var.m) && this.n == sum0Var.n;
    }

    public final int hashCode() {
        return this.n.hashCode() + dw9.a(rw2.b(brm0.e(brm0.e(twn.a(this.j, twn.a(this.i, ua80.b(ua80.b(ua80.b(rw2.b(ua80.b(ua80.b(rw2.b(Long.hashCode(this.f32829a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31), 31), 31, this.k), 31, false), 31, this.l), 31, this.m);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f32829a, "SubChamp(id=", ", globalChampId=");
        kng0.z(sbQ, this.b, ", name=", this.c);
        hne.B(sbQ, ", sportName=", this.d, ", count=");
        kng0.z(sbQ, this.e, ", champImage=", this.f);
        f140.v(sbQ, ", countryImage=", this.g, ", cyberImage=", this.h);
        rw2.s(this.i, this.j, ", ssi=", ", idCountry=", sbQ);
        rz4.A(sbQ, ", favorite=", this.k, ", live=false, sportId=");
        hne.x(sbQ, this.l, ", games=", this.m);
        sbQ.append(", champType=");
        sbQ.append(this.n);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }

    public sum0(long j, long j2, String str, long j3, String str2, String str3, int i, int i2, long j4, List list, pgb pgbVar) {
        this(j, j2, str, "", j3, str2, str3, "", i, i2, false, j4, list, pgbVar);
    }
}
