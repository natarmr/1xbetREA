package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class da2 implements ea2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bem f5728a;

    public da2(bem bemVar) {
        this.f5728a = bemVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof da2) && this.f5728a.equals(((da2) obj).f5728a);
    }

    public final int hashCode() {
        return this.f5728a.hashCode();
    }

    public final String toString() {
        return twn.n("ResultGameCardAction(action=", this.f5728a, Separators.RPAREN);
    }
}
