package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ox10 extends yx10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iz30 f25991a;
    public final String b;

    public ox10(iz30 iz30Var, String str) {
        this.f25991a = iz30Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ox10)) {
            return false;
        }
        ox10 ox10Var = (ox10) obj;
        return this.f25991a == ox10Var.f25991a && this.b.equals(ox10Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f25991a.hashCode() * 31);
    }

    public final String toString() {
        return "MenuItemPolybetModel(menuItem=" + this.f25991a + ", endIconUrl=" + this.b + Separators.RPAREN;
    }
}
