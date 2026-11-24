package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class mhp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final txe f21806a;
    public final boolean b;
    public final boolean c;

    public mhp(txe txeVar, boolean z, boolean z2) {
        this.f21806a = txeVar;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mhp)) {
            return false;
        }
        mhp mhpVar = (mhp) obj;
        return this.f21806a.equals(mhpVar.f21806a) && this.b == mhpVar.b && this.c == mhpVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + brm0.e(this.f21806a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeatureTypeKeyModel(couponInfoStateModel=");
        sb.append(this.f21806a);
        sb.append(", isAuthorized=");
        sb.append(this.b);
        sb.append(", forceLoading=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
