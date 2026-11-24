package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class i6s implements v6s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f14257a;
    public final boolean b;

    public i6s(boolean z, boolean z2) {
        this.f14257a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i6s)) {
            return false;
        }
        i6s i6sVar = (i6s) obj;
        return this.f14257a == i6sVar.f14257a && this.b == i6sVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.f14257a) * 31);
    }

    public final String toString() {
        return hne.n("AutoScrolledToTop(playBroadcasting=", ", playZone=", Separators.RPAREN, this.f14257a, this.b);
    }
}
