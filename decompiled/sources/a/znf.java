package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class znf implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oqf f44671a;

    public final boolean equals(Object obj) {
        if (obj instanceof znf) {
            return this.f44671a.equals(((znf) obj).f44671a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f44671a.hashCode();
    }

    public final String toString() {
        return "WeaponFourPlayer(value=" + this.f44671a + Separators.RPAREN;
    }
}
