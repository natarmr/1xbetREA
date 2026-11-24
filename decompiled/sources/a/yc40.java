package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class yc40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xb40 f42368a;
    public final List b;
    public final j0g0 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public yc40(xb40 xb40Var, List list, j0g0 j0g0Var, boolean z, boolean z2, boolean z3) {
        list.getClass();
        this.f42368a = xb40Var;
        this.b = list;
        this.c = j0g0Var;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    public static yc40 a(yc40 yc40Var, xb40 xb40Var, List list, j0g0 j0g0Var, boolean z, int i) {
        if ((i & 1) != 0) {
            xb40Var = yc40Var.f42368a;
        }
        xb40 xb40Var2 = xb40Var;
        if ((i & 2) != 0) {
            list = yc40Var.b;
        }
        List list2 = list;
        if ((i & 4) != 0) {
            j0g0Var = yc40Var.c;
        }
        j0g0 j0g0Var2 = j0g0Var;
        boolean z2 = (i & 8) != 0 ? yc40Var.d : true;
        if ((i & 16) != 0) {
            z = yc40Var.e;
        }
        boolean z3 = yc40Var.f;
        yc40Var.getClass();
        list2.getClass();
        return new yc40(xb40Var2, list2, j0g0Var2, z2, z, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yc40)) {
            return false;
        }
        yc40 yc40Var = (yc40) obj;
        return this.f42368a == yc40Var.f42368a && Intrinsics.d(this.b, yc40Var.b) && Intrinsics.d(this.c, yc40Var.c) && this.d == yc40Var.d && this.e == yc40Var.e && this.f == yc40Var.f;
    }

    public final int hashCode() {
        int iA = dw9.a(this.f42368a.hashCode() * 31, 31, this.b);
        j0g0 j0g0Var = this.c;
        return Boolean.hashCode(this.f) + brm0.e(brm0.e((iA + (j0g0Var == null ? 0 : j0g0.b(j0g0Var.f15681a))) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MetaHeroesStateModel(selectedPosition=");
        sb.append(this.f42368a);
        sb.append(", availablePositions=");
        sb.append(this.b);
        sb.append(", heroesResult=");
        sb.append(this.c);
        sb.append(", roleSelectorAvailable=");
        sb.append(this.d);
        sb.append(", connected=");
        return ohs0.p(", supportRtl=", Separators.RPAREN, sb, this.e, this.f);
    }
}
