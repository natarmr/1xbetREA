package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class t7g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ufp0 f33465a;
    public final List b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final String g;
    public final int h;
    public final t2m0 i;

    public t7g0(ufp0 ufp0Var, List list, int i, int i2, int i3, int i4, String str, int i5, t2m0 t2m0Var) {
        list.getClass();
        this.f33465a = ufp0Var;
        this.b = list;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = str;
        this.h = i5;
        this.i = t2m0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t7g0)) {
            return false;
        }
        t7g0 t7g0Var = (t7g0) obj;
        return this.f33465a.equals(t7g0Var.f33465a) && Intrinsics.d(this.b, t7g0Var.b) && this.c == t7g0Var.c && this.d == t7g0Var.d && this.e == t7g0Var.e && this.f == t7g0Var.f && this.g.equals(t7g0Var.g) && this.h == t7g0Var.h && this.i == t7g0Var.i;
    }

    public final int hashCode() {
        return this.i.hashCode() + twn.a(this.h, ua80.b(twn.a(this.f, twn.a(this.e, twn.a(this.d, twn.a(this.c, dw9.a(this.f33465a.hashCode() * 31, 31, this.b), 31), 31), 31), 31), 31, this.g), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResultsGridRowModel(teamModel=");
        sb.append(this.f33465a);
        sb.append(", resultsValues=");
        sb.append(this.b);
        sb.append(", totalGameCount=");
        axq.r(this.c, this.d, ", wins=", ", draws=", sb);
        axq.r(this.e, this.f, ", losses=", ", scoreDiff=", sb);
        twn.w(this.h, this.g, ", points=", ", color=", sb);
        sb.append(this.i);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
