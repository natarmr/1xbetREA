package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class mt50 implements ot50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ra10 f22355a;
    public final boolean b;

    public mt50(ra10 ra10Var, boolean z) {
        this.f22355a = ra10Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mt50)) {
            return false;
        }
        mt50 mt50Var = (mt50) obj;
        return this.f22355a.equals(mt50Var.f22355a) && this.b == mt50Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f22355a.hashCode() * 31);
    }

    public final String toString() {
        return "Error(lottieConfig=" + this.f22355a + ", connectionError=" + this.b + Separators.RPAREN;
    }
}
