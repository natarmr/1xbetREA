package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ib8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f14474a;
    public final long b;
    public final float c;
    public final double d;
    public final double e;
    public final float f;
    public final float g;
    public final int h;
    public final boolean i;

    public ib8(List list, long j, float f, double d, double d2, float f2, float f3, int i, boolean z) {
        list.getClass();
        this.f14474a = list;
        this.b = j;
        this.c = f;
        this.d = d;
        this.e = d2;
        this.f = f2;
        this.g = f3;
        this.h = i;
        this.i = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ib8)) {
            return false;
        }
        ib8 ib8Var = (ib8) obj;
        return Intrinsics.d(this.f14474a, ib8Var.f14474a) && this.b == ib8Var.b && Float.compare(this.c, ib8Var.c) == 0 && Double.compare(this.d, ib8Var.d) == 0 && Double.compare(this.e, ib8Var.e) == 0 && Float.compare(this.f, ib8Var.f) == 0 && Float.compare(this.g, ib8Var.g) == 0 && this.h == ib8Var.h && this.i == ib8Var.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + twn.a(this.h, defpackage.c.a(defpackage.c.a(brm0.d(this.e, brm0.d(this.d, defpackage.c.a(rw2.b(this.f14474a.hashCode() * 31, 31, this.b), this.c, 31), 31), 31), this.f, 31), this.g, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BoardUpdateUIModel(prices=");
        sb.append(this.f14474a);
        sb.append(", date=");
        sb.append(this.b);
        sb.append(", percent=");
        sb.append(this.c);
        sb.append(", max=");
        sb.append(this.d);
        ohs0.A(sb, this.e, ", min=", ", startLevel=");
        vqd.v(sb, this.f, ", currentPrice=", this.g, ", fractionDecimals=");
        return ohs0.k(this.h, ", openTrade=", Separators.RPAREN, sb, this.i);
    }
}
