package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class g3t extends l3t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gxo f10627a;

    public g3t(gxo gxoVar) {
        this.f10627a = gxoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g3t) && this.f10627a == ((g3t) obj).f10627a;
    }

    public final int hashCode() {
        return this.f10627a.hashCode();
    }

    public final String toString() {
        return "ClearBetValueFocus(betType=" + this.f10627a + Separators.RPAREN;
    }
}
