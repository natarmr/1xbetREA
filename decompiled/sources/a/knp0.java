package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class knp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18597a;
    public final boolean b;
    public final boolean c;
    public final List d;
    public final int e;
    public final dxh0 f;

    public knp0(String str, boolean z, boolean z2, List list, int i, dxh0 dxh0Var) {
        list.getClass();
        this.f18597a = str;
        this.b = z;
        this.c = z2;
        this.d = list;
        this.e = i;
        this.f = dxh0Var;
    }

    public static knp0 a(knp0 knp0Var, boolean z, boolean z2, List list, int i, int i2) {
        String str = knp0Var.f18597a;
        if ((i2 & 2) != 0) {
            z = knp0Var.b;
        }
        boolean z3 = z;
        if ((i2 & 4) != 0) {
            z2 = knp0Var.c;
        }
        boolean z4 = z2;
        if ((i2 & 8) != 0) {
            list = knp0Var.d;
        }
        List list2 = list;
        if ((i2 & 16) != 0) {
            i = knp0Var.e;
        }
        dxh0 dxh0Var = knp0Var.f;
        knp0Var.getClass();
        list2.getClass();
        return new knp0(str, z3, z4, list2, i, dxh0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof knp0)) {
            return false;
        }
        knp0 knp0Var = (knp0) obj;
        return this.f18597a.equals(knp0Var.f18597a) && this.b == knp0Var.b && this.c == knp0Var.c && Intrinsics.d(this.d, knp0Var.d) && this.e == knp0Var.e && this.f.equals(knp0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + twn.a(this.e, dw9.a(brm0.e(brm0.e(this.f18597a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder sbU = brm0.u("TeamTransfersState(teamId=", this.f18597a, ", isLoading=", this.b, ", isError=");
        vqd.y(sbU, ", teamTransfers=", this.d, ", selectedTab=", this.c);
        sbU.append(this.e);
        sbU.append(", tabsStyle=");
        sbU.append(this.f);
        sbU.append(Separators.RPAREN);
        return sbU.toString();
    }
}
