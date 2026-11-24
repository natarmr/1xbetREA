package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class l3j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f19359a;
    public final boolean b;
    public final boolean c;

    public l3j0(boolean z, boolean z2, boolean z3) {
        this.f19359a = z;
        this.b = z2;
        this.c = z3;
    }

    public static l3j0 a(l3j0 l3j0Var, boolean z, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            z = l3j0Var.f19359a;
        }
        if ((i & 2) != 0) {
            z2 = l3j0Var.b;
        }
        if ((i & 4) != 0) {
            z3 = l3j0Var.c;
        }
        return new l3j0(z, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l3j0)) {
            return false;
        }
        l3j0 l3j0Var = (l3j0) obj;
        return this.f19359a == l3j0Var.f19359a && this.b == l3j0Var.b && this.c == l3j0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + brm0.e(Boolean.hashCode(this.f19359a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(f140.q("SettingsMakeBetEventsStateModel(hasSubscribeBetUpdatesToggleEnabled=", ", hasClearCouponAfterBetToggleEnabled=", ", hasAutoCleanCouponAfterEndEventToggleEnabled=", this.f19359a, this.b), this.c, Separators.RPAREN);
    }
}
