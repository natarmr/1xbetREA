package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h4p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f12445a;
    public final boolean b;
    public final boolean c;
    public final List d;
    public final g2v e;

    public h4p0(boolean z, boolean z2, boolean z3, List list, g2v g2vVar) {
        list.getClass();
        this.f12445a = z;
        this.b = z2;
        this.c = z3;
        this.d = list;
        this.e = g2vVar;
    }

    public static h4p0 a(h4p0 h4p0Var, boolean z, boolean z2, List list, int i) {
        boolean z3 = (i & 1) != 0 ? h4p0Var.f12445a : false;
        if ((i & 2) != 0) {
            z = h4p0Var.b;
        }
        boolean z4 = z;
        if ((i & 4) != 0) {
            z2 = h4p0Var.c;
        }
        boolean z5 = z2;
        if ((i & 8) != 0) {
            list = h4p0Var.d;
        }
        List list2 = list;
        g2v g2vVar = h4p0Var.e;
        list2.getClass();
        return new h4p0(z3, z4, z5, list2, g2vVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h4p0)) {
            return false;
        }
        h4p0 h4p0Var = (h4p0) obj;
        return this.f12445a == h4p0Var.f12445a && this.b == h4p0Var.b && this.c == h4p0Var.c && Intrinsics.d(this.d, h4p0Var.d) && this.e.equals(h4p0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + dw9.a(brm0.e(brm0.e(Boolean.hashCode(this.f12445a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("TeamBetTeamsScreenState(isLoading=", ", showRefreshing=", ", showError=", this.f12445a, this.b);
        vqd.y(sbQ, ", teams=", this.d, ", lottieEmptyConfigurator=", this.c);
        sbQ.append(this.e);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
