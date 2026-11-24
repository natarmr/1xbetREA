package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ias0 implements jas0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final col f14453a;

    public ias0(col colVar) {
        this.f14453a = colVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ias0) && this.f14453a.equals(((ias0) obj).f14453a);
    }

    public final int hashCode() {
        return this.f14453a.hashCode();
    }

    public final String toString() {
        return "Loading(providersCardCollectionUiModel=" + this.f14453a + Separators.RPAREN;
    }
}
