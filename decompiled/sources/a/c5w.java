package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class c5w implements d5w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3793a;
    public final boolean b;

    public c5w(boolean z, boolean z2) {
        this.f3793a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c5w)) {
            return false;
        }
        c5w c5wVar = (c5w) obj;
        return this.f3793a == c5wVar.f3793a && this.b == c5wVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.f3793a) * 31);
    }

    public final String toString() {
        return hne.n("Loading(isLoading=", ", block=", Separators.RPAREN, this.f3793a, this.b);
    }
}
