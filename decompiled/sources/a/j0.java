package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class j0 implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15658a;

    public j0(String str) {
        this.f15658a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j0) && this.f15658a.equals(((j0) obj).f15658a);
    }

    @Override // a.k0
    public final String getValue() {
        return this.f15658a;
    }

    public final int hashCode() {
        return this.f15658a.hashCode();
    }

    public final String toString() {
        return kng0.l("Short(value=", this.f15658a, Separators.RPAREN);
    }
}
