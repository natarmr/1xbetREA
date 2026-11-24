package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class cwn0 implements fwn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5090a;

    public final boolean equals(Object obj) {
        if (obj instanceof cwn0) {
            return this.f5090a.equals(((cwn0) obj).f5090a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5090a.hashCode();
    }

    public final String toString() {
        return kng0.l("PossibleWin(value=", this.f5090a, Separators.RPAREN);
    }
}
