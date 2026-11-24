package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class kzr implements qzr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final apg f19164a;

    public final boolean equals(Object obj) {
        if (obj instanceof kzr) {
            return this.f19164a.equals(((kzr) obj).f19164a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19164a.hashCode();
    }

    public final String toString() {
        return "MapsTeamFirst(value=" + this.f19164a + Separators.RPAREN;
    }
}
