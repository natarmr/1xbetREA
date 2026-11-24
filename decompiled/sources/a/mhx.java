package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class mhx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final udl0 f21819a;
    public final boolean b;

    public mhx(udl0 udl0Var, boolean z) {
        this.f21819a = udl0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mhx)) {
            return false;
        }
        mhx mhxVar = (mhx) obj;
        return this.f21819a == mhxVar.f21819a && this.b == mhxVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f21819a.hashCode() * 31);
    }

    public final String toString() {
        return "InsightsMarketsSettingsModel(sportGameType=" + this.f21819a + ", isNewEventParams=" + this.b + Separators.RPAREN;
    }
}
