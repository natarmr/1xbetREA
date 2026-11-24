package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes5.dex */
public final class q3j0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f28056a;
    public final boolean b;
    public final boolean c;

    public q3j0(boolean z, boolean z2, boolean z3) {
        this.f28056a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q3j0)) {
            return false;
        }
        q3j0 q3j0Var = (q3j0) obj;
        return this.f28056a == q3j0Var.f28056a && this.b == q3j0Var.b && this.c == q3j0Var.c;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof q3j0) && (p6t0Var2 instanceof q3j0)) {
            return p6t0Var.getClass().equals(p6t0Var2.getClass());
        }
        return false;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + brm0.e(Boolean.hashCode(this.f28056a) * 31, 31, this.b);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof q3j0) && (p6t0Var2 instanceof q3j0)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            q3j0 q3j0Var = (q3j0) p6t0Var;
            q3j0 q3j0Var2 = (q3j0) p6t0Var2;
            k9x.G(linkedHashSet, new o3j0(q3j0Var.f28056a), new o3j0(q3j0Var2.f28056a));
            k9x.G(linkedHashSet, new n3j0(q3j0Var.b), new n3j0(q3j0Var2.b));
            k9x.G(linkedHashSet, new m3j0(q3j0Var.c), new m3j0(q3j0Var2.c));
            if (!linkedHashSet.isEmpty()) {
                return linkedHashSet;
            }
        }
        return null;
    }

    public final String toString() {
        String strD = defpackage.c.d("SubscribeBetUpdatesToggleChangeState(value=", Separators.RPAREN, this.f28056a);
        String strD2 = defpackage.c.d("ClearCouponAfterBetToggleChangeState(value=", Separators.RPAREN, this.b);
        return axq.n(b1j.n("SettingsMakeBetEventsUiModel(subscribeBetUpdatesToggleChangeState=", strD, ", clearCouponAfterBetToggleChangeState=", strD2, ", autoCleanCouponAfterEndEventChangeState="), defpackage.c.d("AutoCleanCouponAfterEndEventChangeState(value=", Separators.RPAREN, this.c), Separators.RPAREN);
    }
}
