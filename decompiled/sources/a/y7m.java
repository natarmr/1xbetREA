package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class y7m implements a8m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c8m f42159a;

    public y7m(c8m c8mVar) {
        this.f42159a = c8mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y7m) && this.f42159a.equals(((y7m) obj).f42159a);
    }

    public final int hashCode() {
        return this.f42159a.hashCode();
    }

    public final String toString() {
        return "Content(uiModel=" + this.f42159a + Separators.RPAREN;
    }
}
