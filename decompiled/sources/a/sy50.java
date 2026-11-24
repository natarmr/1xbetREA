package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class sy50 implements az50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m5p f33011a;

    public sy50(m5p m5pVar) {
        this.f33011a = m5pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sy50) && this.f33011a.equals(((sy50) obj).f33011a);
    }

    public final int hashCode() {
        return this.f33011a.hashCode();
    }

    public final String toString() {
        return "OnFavoriteChampionshipClick(item=" + this.f33011a + Separators.RPAREN;
    }
}
