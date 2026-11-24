package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class qx10 extends yx10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iz30 f29460a;

    public qx10(iz30 iz30Var) {
        this.f29460a = iz30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qx10) && this.f29460a == ((qx10) obj).f29460a;
    }

    public final int hashCode() {
        return this.f29460a.hashCode();
    }

    public final String toString() {
        return "MenuItemPromotionsModel(menuItem=" + this.f29460a + Separators.RPAREN;
    }
}
