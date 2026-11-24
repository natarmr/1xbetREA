package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class sra0 implements zra0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bem f32667a;

    public sra0(bem bemVar) {
        this.f32667a = bemVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sra0) && this.f32667a.equals(((sra0) obj).f32667a);
    }

    public final int hashCode() {
        return this.f32667a.hashCode();
    }

    public final String toString() {
        return twn.n("OnGameCardAction(action=", this.f32667a, Separators.RPAREN);
    }
}
