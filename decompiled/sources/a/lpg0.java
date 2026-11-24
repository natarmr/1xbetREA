package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class lpg0 implements mpg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20441a;

    public final boolean equals(Object obj) {
        if (obj instanceof lpg0) {
            return this.f20441a.equals(((lpg0) obj).f20441a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20441a.hashCode();
    }

    public final String toString() {
        return kng0.l("WinnerText(value=", this.f20441a, Separators.RPAREN);
    }
}
