package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class uh5 implements vh5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35659a;

    public final boolean equals(Object obj) {
        if (obj instanceof uh5) {
            return this.f35659a.equals(((uh5) obj).f35659a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f35659a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnWithdrawClick(deviceId=", this.f35659a, Separators.RPAREN);
    }
}
