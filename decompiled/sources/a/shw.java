package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class shw implements whw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f32235a;
    public final boolean b;

    public shw(boolean z, long j) {
        this.f32235a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof shw)) {
            return false;
        }
        shw shwVar = (shw) obj;
        return this.f32235a == shwVar.f32235a && this.b == shwVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.f32235a) * 31);
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f32235a, "OnSubHeaderClick(sportId=", ", live=", this.b);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
