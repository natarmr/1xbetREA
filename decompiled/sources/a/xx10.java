package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class xx10 extends yx10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iz30 f41637a;
    public final int b;

    public xx10(iz30 iz30Var, int i) {
        this.f41637a = iz30Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xx10)) {
            return false;
        }
        xx10 xx10Var = (xx10) obj;
        return this.f41637a == xx10Var.f41637a && this.b == xx10Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f41637a.hashCode() * 31);
    }

    public final String toString() {
        return "MenuSupportModel(menuItem=" + this.f41637a + ", unreadMessagesCount=" + this.b + Separators.RPAREN;
    }
}
