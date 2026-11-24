package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class rx10 extends yx10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iz30 f31242a;

    public rx10(iz30 iz30Var) {
        this.f31242a = iz30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rx10) && this.f31242a == ((rx10) obj).f31242a;
    }

    public final int hashCode() {
        return this.f31242a.hashCode();
    }

    public final String toString() {
        return "MenuItemSecurityModel(menuItem=" + this.f31242a + Separators.RPAREN;
    }
}
