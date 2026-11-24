package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class o2p implements p2p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x2p f24541a;

    public o2p(x2p x2pVar) {
        this.f24541a = x2pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o2p) && this.f24541a.equals(((o2p) obj).f24541a);
    }

    public final int hashCode() {
        return this.f24541a.hashCode();
    }

    public final String toString() {
        return "OnRemoveFavoriteChampClick(item=" + this.f24541a + Separators.RPAREN;
    }
}
