package a;

import android.gov.nist.core.Separators;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class fa90 implements ka90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9198a;
    public final k790 b;
    public final String c;
    public final Map d;
    public final long e;
    public final boolean f;
    public final String g;
    public final boolean h;

    public fa90(boolean z, k790 k790Var, String str, Map map, long j, boolean z2, String str2, boolean z3) {
        k790Var.getClass();
        str.getClass();
        map.getClass();
        str2.getClass();
        this.f9198a = z;
        this.b = k790Var;
        this.c = str;
        this.d = map;
        this.e = j;
        this.f = z2;
        this.g = str2;
        this.h = z3;
    }

    public static fa90 c(fa90 fa90Var, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = fa90Var.f9198a;
        }
        boolean z3 = z;
        k790 k790Var = fa90Var.b;
        String str = fa90Var.c;
        Map map = fa90Var.d;
        long j = fa90Var.e;
        boolean z4 = fa90Var.f;
        String str2 = fa90Var.g;
        if ((i & 128) != 0) {
            z2 = fa90Var.h;
        }
        k790Var.getClass();
        str.getClass();
        map.getClass();
        str2.getClass();
        return new fa90(z3, k790Var, str, map, j, z4, str2, z2);
    }

    @Override // a.ka90
    public final boolean a() {
        return this.f9198a;
    }

    @Override // a.ka90
    public final k790 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fa90)) {
            return false;
        }
        fa90 fa90Var = (fa90) obj;
        return this.f9198a == fa90Var.f9198a && Intrinsics.d(this.b, fa90Var.b) && Intrinsics.d(this.c, fa90Var.c) && Intrinsics.d(this.d, fa90Var.d) && this.e == fa90Var.e && this.f == fa90Var.f && Intrinsics.d(this.g, fa90Var.g) && this.h == fa90Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + ua80.b(brm0.e(rw2.b(ohs0.f(this.d, ua80.b((this.b.hashCode() + (Boolean.hashCode(this.f9198a) * 31)) * 31, 31, this.c), 31), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(reloadEnable=");
        sb.append(this.f9198a);
        sb.append(", paymentParams=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.c);
        sb.append(", extraHeaders=");
        sb.append(this.d);
        sb.append(", definedCurrency=");
        hne.t(this.e, ", deposit=", sb, this.f);
        w6x.z(", redirect=", this.g, ", webPageLoading=", sb, this.h);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
