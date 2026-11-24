package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class vdh0 implements ieh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37233a;

    public final boolean equals(Object obj) {
        if (obj instanceof vdh0) {
            return this.f37233a.equals(((vdh0) obj).f37233a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f37233a.hashCode();
    }

    public final String toString() {
        return kng0.l("PlayerOneIcon(value=", this.f37233a, Separators.RPAREN);
    }
}
