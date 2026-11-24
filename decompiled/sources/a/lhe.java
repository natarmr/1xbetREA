package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class lhe implements cie {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zll f20051a;

    public lhe(zll zllVar) {
        this.f20051a = zllVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lhe) && this.f20051a.equals(((lhe) obj).f20051a);
    }

    public final int hashCode() {
        return this.f20051a.hashCode();
    }

    public final String toString() {
        return "FavoritesLoaded(content=" + this.f20051a + Separators.RPAREN;
    }
}
