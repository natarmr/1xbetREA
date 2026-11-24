package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class h3m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g3m f12392a;

    public h3m(g3m g3mVar) {
        this.f12392a = g3mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h3m) && this.f12392a.equals(((h3m) obj).f12392a);
    }

    public final int hashCode() {
        return this.f12392a.hashCode();
    }

    public final String toString() {
        return "Static(item=" + this.f12392a + Separators.RPAREN;
    }
}
