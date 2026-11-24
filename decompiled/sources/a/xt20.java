package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class xt20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f41445a;
    public final long b;
    public final String c;
    public final boolean d;
    public final long e;
    public final double f;
    public final boolean g;
    public final boolean h;

    public xt20(List list, long j, String str, boolean z, long j2, double d, boolean z2, boolean z3) {
        list.getClass();
        this.f41445a = list;
        this.b = j;
        this.c = str;
        this.d = z;
        this.e = j2;
        this.f = d;
        this.g = z2;
        this.h = z3;
    }

    public static xt20 a(xt20 xt20Var, ArrayList arrayList, boolean z, long j, double d, int i) {
        List list = arrayList;
        if ((i & 1) != 0) {
            list = xt20Var.f41445a;
        }
        List list2 = list;
        long j2 = xt20Var.b;
        String str = xt20Var.c;
        if ((i & 8) != 0) {
            z = xt20Var.d;
        }
        boolean z2 = z;
        long j3 = (i & 16) != 0 ? xt20Var.e : j;
        double d2 = (i & 32) != 0 ? xt20Var.f : d;
        boolean z3 = (i & 64) != 0 ? xt20Var.g : true;
        boolean z4 = xt20Var.h;
        xt20Var.getClass();
        list2.getClass();
        return new xt20(list2, j2, str, z2, j3, d2, z3, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xt20)) {
            return false;
        }
        xt20 xt20Var = (xt20) obj;
        return Intrinsics.d(this.f41445a, xt20Var.f41445a) && this.b == xt20Var.b && this.c.equals(xt20Var.c) && this.d == xt20Var.d && this.e == xt20Var.e && Double.compare(this.f, xt20Var.f) == 0 && this.g == xt20Var.g && this.h == xt20Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + brm0.e(brm0.d(this.f, rw2.b(brm0.e(ua80.b(rw2.b(this.f41445a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketGroup(eventsBets=");
        sb.append(this.f41445a);
        sb.append(", marketGroupId=");
        sb.append(this.b);
        w6x.z(", marketGroupName=", this.c, ", expanded=", sb, this.d);
        kng0.A(sb, ", selectedBetId=", this.e, ", selectedBetParam=");
        rz4.x(sb, this.f, ", pinned=", this.g);
        return f140.n(sb, ", hasSpecialSign=", this.h, Separators.RPAREN);
    }
}
