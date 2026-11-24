package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class n5m implements o5m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e8n f22950a;

    public n5m(e8n e8nVar) {
        this.f22950a = e8nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n5m) && this.f22950a.equals(((n5m) obj).f22950a);
    }

    public final int hashCode() {
        return this.f22950a.hashCode();
    }

    public final String toString() {
        return "TwoTeamsUfc(uiModel=" + this.f22950a + Separators.RPAREN;
    }
}
