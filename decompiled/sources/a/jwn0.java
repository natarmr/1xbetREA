package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class jwn0 implements lwn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17260a;

    public final boolean equals(Object obj) {
        if (obj instanceof jwn0) {
            return this.f17260a.equals(((jwn0) obj).f17260a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17260a.hashCode();
    }

    public final String toString() {
        return kng0.l("PossibleWin(value=", this.f17260a, Separators.RPAREN);
    }
}
