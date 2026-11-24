package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class lzr implements qzr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final apg f20918a;

    public final boolean equals(Object obj) {
        if (obj instanceof lzr) {
            return this.f20918a.equals(((lzr) obj).f20918a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20918a.hashCode();
    }

    public final String toString() {
        return "MapsTeamSecond(value=" + this.f20918a + Separators.RPAREN;
    }
}
