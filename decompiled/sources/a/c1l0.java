package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c1l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f3578a;
    public final String b;
    public final boolean c;
    public final List d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public c1l0(Double d, String str, boolean z, List list, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        list.getClass();
        this.f3578a = d;
        this.b = str;
        this.c = z;
        this.d = list;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = z6;
    }

    public static c1l0 a(c1l0 c1l0Var, Double d, String str, boolean z, List list, boolean z2, boolean z3, boolean z4, int i) {
        if ((i & 1) != 0) {
            d = c1l0Var.f3578a;
        }
        Double d2 = d;
        if ((i & 2) != 0) {
            str = c1l0Var.b;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            z = c1l0Var.c;
        }
        boolean z5 = z;
        List list2 = (i & 8) != 0 ? c1l0Var.d : list;
        boolean z6 = (i & 16) != 0 ? c1l0Var.e : true;
        boolean z7 = (i & 32) != 0 ? c1l0Var.f : false;
        boolean z8 = (i & 64) != 0 ? c1l0Var.g : z2;
        boolean z9 = (i & 128) != 0 ? c1l0Var.h : z3;
        boolean z10 = (i & 256) != 0 ? c1l0Var.i : z4;
        c1l0Var.getClass();
        list2.getClass();
        return new c1l0(d2, str2, z5, list2, z6, z7, z8, z9, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1l0)) {
            return false;
        }
        c1l0 c1l0Var = (c1l0) obj;
        return Intrinsics.d(this.f3578a, c1l0Var.f3578a) && this.b.equals(c1l0Var.b) && this.c == c1l0Var.c && Intrinsics.d(this.d, c1l0Var.d) && this.e == c1l0Var.e && this.f == c1l0Var.f && this.g == c1l0Var.g && this.h == c1l0Var.h && this.i == c1l0Var.i;
    }

    public final int hashCode() {
        Double d = this.f3578a;
        return Boolean.hashCode(this.i) + brm0.e(brm0.e(brm0.e(brm0.e(dw9.a(brm0.e(ua80.b((d == null ? 0 : d.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SportCashbackState(cashbackSum=");
        sb.append(this.f3578a);
        sb.append(", transferSumInput=");
        sb.append(this.b);
        sb.append(", isTransferLoading=");
        vqd.y(sb, ", transactions=", this.d, ", initialFetchingCompleted=", this.c);
        ua80.u(", loading=", ", isSwipeRefreshing=", sb, this.e, this.f);
        ua80.u(", textInputHasFocusEvent=", ", connection=", sb, this.g, this.h);
        return rw2.p(sb, this.i, Separators.RPAREN);
    }
}
