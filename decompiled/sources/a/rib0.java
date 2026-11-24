package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class rib0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f30534a;
    public final boolean b;
    public final int c;
    public final List d;
    public final boolean e;
    public final boolean f;
    public final List g;

    public rib0(boolean z, boolean z2, int i, List list, boolean z3, boolean z4, List list2) {
        list.getClass();
        list2.getClass();
        this.f30534a = z;
        this.b = z2;
        this.c = i;
        this.d = list;
        this.e = z3;
        this.f = z4;
        this.g = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rib0)) {
            return false;
        }
        rib0 rib0Var = (rib0) obj;
        return this.f30534a == rib0Var.f30534a && this.b == rib0Var.b && this.c == rib0Var.c && Intrinsics.d(this.d, rib0Var.d) && this.e == rib0Var.e && this.f == rib0Var.f && Intrinsics.d(this.g, rib0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + brm0.e(brm0.e(dw9.a(twn.a(this.c, brm0.e(Boolean.hashCode(this.f30534a) * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("PopularSettingsModel(hasPopularBalance=", ", hasPopularSearch=", ", popularSportsCount=", this.f30534a, this.b);
        ohs0.v(this.c, ", popularTabOrder=", ", hasBanners=", sbQ, this.d);
        ua80.u(", hasMainScreenSettings=", ", popularTabModelList=", sbQ, this.e, this.f);
        return dw9.r(sbQ, this.g, Separators.RPAREN);
    }
}
