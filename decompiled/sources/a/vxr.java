package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class vxr implements yxr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38215a;

    public final boolean equals(Object obj) {
        if (obj instanceof vxr) {
            return this.f38215a.equals(((vxr) obj).f38215a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f38215a.hashCode();
    }

    public final String toString() {
        return kng0.l("Information(value=", this.f38215a, Separators.RPAREN);
    }
}
