package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class vx10 extends yx10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iz30 f38180a;

    public vx10(iz30 iz30Var) {
        this.f38180a = iz30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vx10) && this.f38180a == ((vx10) obj).f38180a;
    }

    public final int hashCode() {
        return this.f38180a.hashCode();
    }

    public final String toString() {
        return "MenuItemTeamBetModel(menuItem=" + this.f38180a + Separators.RPAREN;
    }
}
