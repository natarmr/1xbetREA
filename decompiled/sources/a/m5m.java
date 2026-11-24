package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class m5m implements o5m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h6m f21226a;

    public m5m(h6m h6mVar) {
        this.f21226a = h6mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m5m) && this.f21226a.equals(((m5m) obj).f21226a);
    }

    public final int hashCode() {
        return this.f21226a.hashCode();
    }

    public final String toString() {
        return "TwoTeamsDefault(uiModel=" + this.f21226a + Separators.RPAREN;
    }
}
