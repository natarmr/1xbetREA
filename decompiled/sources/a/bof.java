package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class bof implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oqf f2930a;

    public final boolean equals(Object obj) {
        if (obj instanceof bof) {
            return this.f2930a.equals(((bof) obj).f2930a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2930a.hashCode();
    }

    public final String toString() {
        return "WeaponThirdPlayer(value=" + this.f2930a + Separators.RPAREN;
    }
}
