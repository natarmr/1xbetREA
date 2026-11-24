package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class vlj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37627a;
    public final zvh0 b;
    public final List c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public vlj0(int i, zvh0 zvh0Var, List list, boolean z, boolean z2, boolean z3) {
        list.getClass();
        this.f37627a = i;
        this.b = zvh0Var;
        this.c = list;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    public static vlj0 a(vlj0 vlj0Var, int i, zvh0 zvh0Var, List list, boolean z, boolean z2, int i2) {
        if ((i2 & 1) != 0) {
            i = vlj0Var.f37627a;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            zvh0Var = vlj0Var.b;
        }
        zvh0 zvh0Var2 = zvh0Var;
        if ((i2 & 4) != 0) {
            list = vlj0Var.c;
        }
        List list2 = list;
        if ((i2 & 8) != 0) {
            z = vlj0Var.d;
        }
        boolean z3 = z;
        if ((i2 & 16) != 0) {
            z2 = vlj0Var.e;
        }
        boolean z4 = vlj0Var.f;
        vlj0Var.getClass();
        list2.getClass();
        return new vlj0(i3, zvh0Var2, list2, z3, z2, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vlj0)) {
            return false;
        }
        vlj0 vlj0Var = (vlj0) obj;
        return this.f37627a == vlj0Var.f37627a && this.b == vlj0Var.b && Intrinsics.d(this.c, vlj0Var.c) && this.d == vlj0Var.d && this.e == vlj0Var.e && this.f == vlj0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + brm0.e(brm0.e(dw9.a((this.b.hashCode() + (Integer.hashCode(this.f37627a) * 31)) * 31, 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShareAppByQrCodeState(currentTab=");
        sb.append(this.f37627a);
        sb.append(", segmentedControlStyle=");
        sb.append(this.b);
        sb.append(", appLinks=");
        rz4.z(sb, ", shareButtonEnabled=", this.c, ", hasErrorWhileLoadingData=", this.d);
        return ohs0.p(", isNightMode=", Separators.RPAREN, sb, this.e, this.f);
    }
}
