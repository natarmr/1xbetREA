package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class uy50 implements az50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m5p f36474a;

    public uy50(m5p m5pVar) {
        this.f36474a = m5pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uy50) && this.f36474a.equals(((uy50) obj).f36474a);
    }

    public final int hashCode() {
        return this.f36474a.hashCode();
    }

    public final String toString() {
        return "OnRemoveChampFromFavoritesClick(item=" + this.f36474a + Separators.RPAREN;
    }
}
