package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class mb80 implements ac80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m5p f21496a;

    public mb80(m5p m5pVar) {
        this.f21496a = m5pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mb80) && this.f21496a.equals(((mb80) obj).f21496a);
    }

    public final int hashCode() {
        return this.f21496a.hashCode();
    }

    public final String toString() {
        return "OnRemoveChampFromFavoritesClick(item=" + this.f21496a + Separators.RPAREN;
    }
}
