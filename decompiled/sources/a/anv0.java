package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class anv0 implements cnv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1174a;

    public anv0(String str) {
        this.f1174a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof anv0) && this.f1174a.equals(((anv0) obj).f1174a);
    }

    public final int hashCode() {
        return this.f1174a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnPlayerClicked(playerId=", this.f1174a, Separators.RPAREN);
    }
}
