package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class evc0 implements fvc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8461a;
    public final boolean b;

    public evc0(boolean z, long j) {
        this.f8461a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof evc0)) {
            return false;
        }
        evc0 evc0Var = (evc0) obj;
        return this.f8461a == evc0Var.f8461a && this.b == evc0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.f8461a) * 31);
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f8461a, "Tournaments(bannerId=", ", fromMenu=", this.b);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
