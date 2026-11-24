package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class vwt0 implements lxt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ox f38171a;
    public final int b;

    public vwt0(ox oxVar, int i) {
        this.f38171a = oxVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vwt0)) {
            return false;
        }
        vwt0 vwt0Var = (vwt0) obj;
        return this.f38171a.equals(vwt0Var.f38171a) && this.b == vwt0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f38171a.hashCode() * 31);
    }

    public final String toString() {
        return "OnAdditionalInfoClick(action=" + this.f38171a + ", screenWidth=" + this.b + Separators.RPAREN;
    }
}
