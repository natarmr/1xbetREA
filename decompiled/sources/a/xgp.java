package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class xgp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ygp f40850a;
    public final boolean b;

    public xgp(ygp ygpVar, boolean z) {
        ygpVar.getClass();
        this.f40850a = ygpVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xgp)) {
            return false;
        }
        xgp xgpVar = (xgp) obj;
        return this.f40850a == xgpVar.f40850a && this.b == xgpVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f40850a.hashCode() * 31);
    }

    public final String toString() {
        return "FeatureToggleModel(type=" + this.f40850a + ", value=" + this.b + Separators.RPAREN;
    }
}
