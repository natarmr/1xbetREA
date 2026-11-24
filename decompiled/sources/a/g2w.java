package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class g2w implements i2w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10581a;
    public final boolean b;

    public g2w(boolean z, boolean z2) {
        this.f10581a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2w)) {
            return false;
        }
        g2w g2wVar = (g2w) obj;
        return this.f10581a == g2wVar.f10581a && this.b == g2wVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.f10581a) * 31);
    }

    public final String toString() {
        return hne.n("Loading(refresh=", ", progress=", Separators.RPAREN, this.f10581a, this.b);
    }
}
