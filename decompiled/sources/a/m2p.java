package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class m2p implements p2p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x2p f21073a;

    public m2p(x2p x2pVar) {
        this.f21073a = x2pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m2p) && this.f21073a.equals(((m2p) obj).f21073a);
    }

    public final int hashCode() {
        return this.f21073a.hashCode();
    }

    public final String toString() {
        return "OnFavoriteChampClick(item=" + this.f21073a + Separators.RPAREN;
    }
}
