package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class e19 implements g19 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dol f7028a;

    public e19(dol dolVar) {
        this.f7028a = dolVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e19) && this.f7028a.equals(((e19) obj).f7028a);
    }

    public final int hashCode() {
        return this.f7028a.hashCode();
    }

    public final String toString() {
        return "Content(providersCardCollectionUiModel=" + this.f7028a + Separators.RPAREN;
    }
}
