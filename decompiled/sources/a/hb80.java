package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class hb80 implements ac80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m5p f12759a;

    public hb80(m5p m5pVar) {
        this.f12759a = m5pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hb80) && this.f12759a.equals(((hb80) obj).f12759a);
    }

    public final int hashCode() {
        return this.f12759a.hashCode();
    }

    public final String toString() {
        return "OnFavoriteChampionshipClick(item=" + this.f12759a + Separators.RPAREN;
    }
}
