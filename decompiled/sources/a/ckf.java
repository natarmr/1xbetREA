package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ckf implements nkf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4503a;

    public final boolean equals(Object obj) {
        if (obj instanceof ckf) {
            return this.f4503a.equals(((ckf) obj).f4503a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4503a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnMatchClick(value=", this.f4503a, Separators.RPAREN);
    }
}
