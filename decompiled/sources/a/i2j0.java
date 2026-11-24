package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class i2j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ezc f14050a;

    public i2j0(ezc ezcVar) {
        this.f14050a = ezcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i2j0) && this.f14050a == ((i2j0) obj).f14050a;
    }

    public final int hashCode() {
        return this.f14050a.hashCode();
    }

    public final String toString() {
        return "SettingsMakeBetCoefChangeStateModel(coefChangeType=" + this.f14050a + Separators.RPAREN;
    }
}
