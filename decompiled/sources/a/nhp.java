package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class nhp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final txe f23544a;
    public final boolean b;
    public final boolean c;

    public nhp(txe txeVar, boolean z, boolean z2) {
        this.f23544a = txeVar;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nhp)) {
            return false;
        }
        nhp nhpVar = (nhp) obj;
        return this.f23544a.equals(nhpVar.f23544a) && this.b == nhpVar.b && this.c == nhpVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + brm0.e(this.f23544a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeatureTypeKeyModel(couponInfoStateModel=");
        sb.append(this.f23544a);
        sb.append(", isAuthorized=");
        sb.append(this.b);
        sb.append(", forceLoading=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
