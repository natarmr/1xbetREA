package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class qh5 implements vh5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yi5 f28722a;

    public qh5(yi5 yi5Var) {
        this.f28722a = yi5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qh5) && this.f28722a == ((qh5) obj).f28722a;
    }

    public final int hashCode() {
        return this.f28722a.hashCode();
    }

    public final String toString() {
        return "OnMenuItemClick(menuItem=" + this.f28722a + Separators.RPAREN;
    }
}
