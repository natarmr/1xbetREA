package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class xve0 implements hwe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wpa0 f41555a;

    public xve0(wpa0 wpa0Var) {
        this.f41555a = wpa0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xve0) && this.f41555a == ((xve0) obj).f41555a;
    }

    public final int hashCode() {
        return this.f41555a.hashCode();
    }

    public final String toString() {
        return "OnPoliticalExposedPersonFieldClick(politicalExposedPersonType=" + this.f41555a + Separators.RPAREN;
    }
}
