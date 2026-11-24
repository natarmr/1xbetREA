package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class k5m implements o5m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r5m f17727a;

    public k5m(r5m r5mVar) {
        this.f17727a = r5mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k5m) && this.f17727a.equals(((k5m) obj).f17727a);
    }

    public final int hashCode() {
        return this.f17727a.hashCode();
    }

    public final String toString() {
        return "MultiTeams(uiModel=" + this.f17727a + Separators.RPAREN;
    }
}
