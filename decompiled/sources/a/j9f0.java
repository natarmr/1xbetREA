package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class j9f0 implements s9f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vpa0 f16135a;

    public j9f0(vpa0 vpa0Var) {
        this.f16135a = vpa0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j9f0) && this.f16135a == ((j9f0) obj).f16135a;
    }

    public final int hashCode() {
        return this.f16135a.hashCode();
    }

    public final String toString() {
        return "OnPoliticalExposedPersonFieldClick(politicalExposedPersonType=" + this.f16135a + Separators.RPAREN;
    }
}
