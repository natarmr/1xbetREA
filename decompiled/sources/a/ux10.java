package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ux10 extends yx10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iz30 f36419a;

    public ux10(iz30 iz30Var) {
        this.f36419a = iz30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ux10) && this.f36419a == ((ux10) obj).f36419a;
    }

    public final int hashCode() {
        return this.f36419a.hashCode();
    }

    public final String toString() {
        return "MenuItemSwipeXModel(menuItem=" + this.f36419a + Separators.RPAREN;
    }
}
