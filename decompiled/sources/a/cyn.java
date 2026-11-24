package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class cyn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5186a;
    public final boolean b;

    public cyn(boolean z, boolean z2) {
        this.f5186a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cyn)) {
            return false;
        }
        cyn cynVar = (cyn) obj;
        return this.f5186a == cynVar.f5186a && this.b == cynVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.f5186a) * 31);
    }

    public final String toString() {
        return hne.n("EndSessionParams(canSkipLogin=", ", clearUserCredentials=", Separators.RPAREN, this.f5186a, this.b);
    }
}
