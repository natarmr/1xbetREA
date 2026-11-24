package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class iiq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14840a;
    public final boolean b;

    public iiq0(String str, boolean z) {
        this.f14840a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iiq0)) {
            return false;
        }
        iiq0 iiq0Var = (iiq0) obj;
        return this.f14840a.equals(iiq0Var.f14840a) && this.b == iiq0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f14840a.hashCode() * 31);
    }

    public final String toString() {
        return ua80.j("TimeIsEndUiState(description=", this.f14840a, ", isExitButtonEnable=", this.b, Separators.RPAREN);
    }
}
