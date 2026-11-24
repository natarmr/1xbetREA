package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class hk1 implements jk1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dol f13187a;

    public hk1(dol dolVar) {
        this.f13187a = dolVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hk1) && this.f13187a.equals(((hk1) obj).f13187a);
    }

    public final int hashCode() {
        return this.f13187a.hashCode();
    }

    public final String toString() {
        return "Content(providersCardCollectionUiModel=" + this.f13187a + Separators.RPAREN;
    }
}
