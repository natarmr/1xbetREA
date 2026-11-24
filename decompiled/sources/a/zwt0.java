package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class zwt0 implements lxt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45125a;

    public final boolean equals(Object obj) {
        if (obj instanceof zwt0) {
            return this.f45125a.equals(((zwt0) obj).f45125a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f45125a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnMatchClick(value=", this.f45125a, Separators.RPAREN);
    }
}
