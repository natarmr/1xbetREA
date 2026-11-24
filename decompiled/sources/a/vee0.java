package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class vee0 implements yee0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zll f37283a;

    public vee0(zll zllVar) {
        this.f37283a = zllVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vee0) && this.f37283a.equals(((vee0) obj).f37283a);
    }

    public final int hashCode() {
        return this.f37283a.hashCode();
    }

    public final String toString() {
        return "Content(gameCardCollectionUiModel=" + this.f37283a + Separators.RPAREN;
    }
}
