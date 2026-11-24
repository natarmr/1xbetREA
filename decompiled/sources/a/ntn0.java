package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ntn0 implements rtn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24110a;

    public final boolean equals(Object obj) {
        if (obj instanceof ntn0) {
            return this.f24110a.equals(((ntn0) obj).f24110a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f24110a.hashCode();
    }

    public final String toString() {
        return kng0.l("InfoText(value=", this.f24110a, Separators.RPAREN);
    }
}
