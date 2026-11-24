package a;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class r9b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f30072a;
    public final List b;
    public final s9b0 c;
    public final boolean d;
    public final String e;
    public final String f;
    public final c4l0 g;
    public final ql5 h;
    public final boolean i;
    public final boolean j;
    public final boolean k;

    public r9b0(boolean z, List list, s9b0 s9b0Var, boolean z2, String str, String str2, c4l0 c4l0Var, ql5 ql5Var, boolean z3, boolean z4, boolean z5) {
        s9b0Var.getClass();
        this.f30072a = z;
        this.b = list;
        this.c = s9b0Var;
        this.d = z2;
        this.e = str;
        this.f = str2;
        this.g = c4l0Var;
        this.h = ql5Var;
        this.i = z3;
        this.j = z4;
        this.k = z5;
    }

    public static r9b0 a(r9b0 r9b0Var, boolean z, s9b0 s9b0Var, ql5 ql5Var, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = r9b0Var.f30072a;
        }
        boolean z3 = z;
        List list = r9b0Var.b;
        s9b0 s9b0Var2 = (i & 4) != 0 ? r9b0Var.c : s9b0Var;
        boolean z4 = r9b0Var.d;
        String str = r9b0Var.e;
        String str2 = r9b0Var.f;
        c4l0 c4l0Var = r9b0Var.g;
        ql5 ql5Var2 = (i & 128) != 0 ? r9b0Var.h : ql5Var;
        boolean z5 = (i & 256) != 0 ? r9b0Var.i : z2;
        boolean z6 = r9b0Var.j;
        boolean z7 = r9b0Var.k;
        r9b0Var.getClass();
        r9b0Var.getClass();
        s9b0Var2.getClass();
        return new r9b0(z3, list, s9b0Var2, z4, str, str2, c4l0Var, ql5Var2, z5, z6, z7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r9b0)) {
            return false;
        }
        r9b0 r9b0Var = (r9b0) obj;
        return this.f30072a == r9b0Var.f30072a && this.b.equals(r9b0Var.b) && this.c == r9b0Var.c && this.d == r9b0Var.d && this.e.equals(r9b0Var.e) && this.f.equals(r9b0Var.f) && this.g == r9b0Var.g && Intrinsics.d(this.h, r9b0Var.h) && this.i == r9b0Var.i && this.j == r9b0Var.j && this.k == r9b0Var.k;
    }

    public final int hashCode() {
        int iHashCode = (this.g.hashCode() + ua80.b(ua80.b(brm0.e((this.c.hashCode() + dw9.a(Boolean.hashCode(this.f30072a) * 31, 31, this.b)) * 31, 31, this.d), 31, this.e), 31, this.f)) * 31;
        ql5 ql5Var = this.h;
        return Integer.hashCode(1357) + brm0.e(brm0.e(brm0.e((iHashCode + (ql5Var == null ? 0 : ql5Var.hashCode())) * 31, 31, this.i), 31, this.j), 31, this.k);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PopularClassicStateModel(nightMode=");
        sb.append(this.f30072a);
        sb.append(", tabTypeList=");
        sb.append(this.b);
        sb.append(", currentTab=");
        sb.append(this.c);
        sb.append(", searchEnable=");
        sb.append(this.d);
        sb.append(", accountControlStyle=");
        f140.v(sb, this.e, ", popularToolbarStyle=", this.f, ", sportCollectionStyle=");
        sb.append(this.g);
        sb.append(", currentBalance=");
        sb.append(this.h);
        sb.append(", isAuth=");
        ua80.u(", bettingEnable=", ", balanceEnable=", sb, this.i, this.j);
        return rw2.p(sb, this.k, ", groupId=1357)");
    }
}
