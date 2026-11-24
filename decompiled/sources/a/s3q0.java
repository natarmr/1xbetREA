package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class s3q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f31572a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final List e;
    public final zdm0 f;
    public final nc5 g;

    public s3q0(boolean z, boolean z2, boolean z3, int i, List list, zdm0 zdm0Var, nc5 nc5Var) {
        this.f31572a = z;
        this.b = z2;
        this.c = z3;
        this.d = i;
        this.e = list;
        this.f = zdm0Var;
        this.g = nc5Var;
    }

    public static s3q0 a(s3q0 s3q0Var, boolean z, boolean z2, boolean z3, int i, List list, zdm0 zdm0Var, nc5 nc5Var, int i2) {
        if ((i2 & 1) != 0) {
            z = s3q0Var.f31572a;
        }
        boolean z4 = z;
        if ((i2 & 2) != 0) {
            z2 = s3q0Var.b;
        }
        boolean z5 = z2;
        if ((i2 & 4) != 0) {
            z3 = s3q0Var.c;
        }
        boolean z6 = z3;
        if ((i2 & 8) != 0) {
            i = s3q0Var.d;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            list = s3q0Var.e;
        }
        List list2 = list;
        if ((i2 & 32) != 0) {
            zdm0Var = s3q0Var.f;
        }
        zdm0 zdm0Var2 = zdm0Var;
        if ((i2 & 64) != 0) {
            nc5Var = s3q0Var.g;
        }
        s3q0Var.getClass();
        return new s3q0(z4, z5, z6, i3, list2, zdm0Var2, nc5Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s3q0)) {
            return false;
        }
        s3q0 s3q0Var = (s3q0) obj;
        return this.f31572a == s3q0Var.f31572a && this.b == s3q0Var.b && this.c == s3q0Var.c && this.d == s3q0Var.d && Intrinsics.d(this.e, s3q0Var.e) && this.f.equals(s3q0Var.f) && this.g.equals(s3q0Var.g);
    }

    public final int hashCode() {
        int iA = twn.a(this.d, brm0.e(brm0.e(Boolean.hashCode(this.f31572a) * 31, 31, this.b), 31, this.c), 31);
        List list = this.e;
        return this.g.hashCode() + kng0.a(this.f, (iA + (list == null ? 0 : list.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("TextBroadcastStateModel(isLive=", ", isLoading=", ", hasError=", this.f31572a, this.b);
        ua80.q(this.d, ", selectedTab=", ", textBroadcastModelList=", sbQ, this.c);
        sbQ.append(this.e);
        sbQ.append(", statisticHeaderUiModel=");
        sbQ.append(this.f);
        sbQ.append(", backgroundHeaderModel=");
        sbQ.append(this.g);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
