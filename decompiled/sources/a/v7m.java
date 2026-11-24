package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class v7m implements x7m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c8m f36933a;

    public v7m(c8m c8mVar) {
        this.f36933a = c8mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v7m) && this.f36933a.equals(((v7m) obj).f36933a);
    }

    public final int hashCode() {
        return this.f36933a.hashCode();
    }

    public final String toString() {
        return "Content(uiModel=" + this.f36933a + Separators.RPAREN;
    }
}
