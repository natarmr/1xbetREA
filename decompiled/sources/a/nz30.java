package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class nz30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24355a;
    public final cz10 b;

    public nz30(String str, cz10 cz10Var) {
        this.f24355a = str;
        this.b = cz10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nz30)) {
            return false;
        }
        nz30 nz30Var = (nz30) obj;
        return this.f24355a.equals(nz30Var.f24355a) && this.b.equals(nz30Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f24355a.hashCode() * 31);
    }

    public final String toString() {
        return "MenuItemStatistic(title=" + this.f24355a + ", mainMenuType=" + this.b + Separators.RPAREN;
    }
}
