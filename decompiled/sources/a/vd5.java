package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class vd5 implements be5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37215a;

    public final boolean equals(Object obj) {
        if (obj instanceof vd5) {
            return this.f37215a.equals(((vd5) obj).f37215a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f37215a.hashCode();
    }

    public final String toString() {
        return kng0.l("Large(urn=", this.f37215a, Separators.RPAREN);
    }
}
