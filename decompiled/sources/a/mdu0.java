package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class mdu0 implements wdu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21616a;

    public final boolean equals(Object obj) {
        if (obj instanceof mdu0) {
            return this.f21616a.equals(((mdu0) obj).f21616a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21616a.hashCode();
    }

    public final String toString() {
        return kng0.l("FirstPlayerSecondNumber(value=", this.f21616a, Separators.RPAREN);
    }
}
