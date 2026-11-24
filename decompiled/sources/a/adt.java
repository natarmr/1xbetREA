package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class adt implements rdt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zll f696a;

    public adt(zll zllVar) {
        this.f696a = zllVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof adt) && this.f696a.equals(((adt) obj).f696a);
    }

    public final int hashCode() {
        return this.f696a.hashCode();
    }

    public final String toString() {
        return "Content(gameCardCollectionUiModel=" + this.f696a + Separators.RPAREN;
    }
}
