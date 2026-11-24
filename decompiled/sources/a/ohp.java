package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ohp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final txe f25275a;
    public final boolean b;

    public ohp(txe txeVar, boolean z) {
        this.f25275a = txeVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ohp)) {
            return false;
        }
        ohp ohpVar = (ohp) obj;
        return this.f25275a.equals(ohpVar.f25275a) && this.b == ohpVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f25275a.hashCode() * 31);
    }

    public final String toString() {
        return "FeatureTypeKeyModel(couponInfoStateModel=" + this.f25275a + ", forceLoading=" + this.b + Separators.RPAREN;
    }
}
