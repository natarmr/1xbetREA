package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class t1k0 implements a2k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yi5 f33171a;

    public t1k0(yi5 yi5Var) {
        this.f33171a = yi5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t1k0) && this.f33171a == ((t1k0) obj).f33171a;
    }

    public final int hashCode() {
        return this.f33171a.hashCode();
    }

    public final String toString() {
        return "OnMenuItemClick(menuItem=" + this.f33171a + Separators.RPAREN;
    }
}
