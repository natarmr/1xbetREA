package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class axf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1623a;
    public final boolean b;

    public axf0(String str, boolean z) {
        this.f1623a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axf0)) {
            return false;
        }
        axf0 axf0Var = (axf0) obj;
        return this.f1623a.equals(axf0Var.f1623a) && this.b == axf0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f1623a.hashCode() * 31);
    }

    public final String toString() {
        return ua80.j("RestoreNavigationStateModel(tabTag=", this.f1623a, ", isVirtual=", this.b, Separators.RPAREN);
    }
}
