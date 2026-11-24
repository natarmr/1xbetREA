package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class mxr implements rxr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f22572a;
    public final boolean b;

    public mxr(boolean z, boolean z2) {
        this.f22572a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mxr)) {
            return false;
        }
        mxr mxrVar = (mxr) obj;
        return this.f22572a == mxrVar.f22572a && this.b == mxrVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.f22572a) * 31);
    }

    public final String toString() {
        return hne.n("ScoreServe(serveFirstVisible=", ", serveSecondVisible=", Separators.RPAREN, this.f22572a, this.b);
    }
}
