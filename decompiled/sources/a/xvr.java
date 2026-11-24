package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class xvr implements ewr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41574a;

    public final boolean equals(Object obj) {
        if (obj instanceof xvr) {
            return this.f41574a.equals(((xvr) obj).f41574a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f41574a.hashCode();
    }

    public final String toString() {
        return kng0.l("Caption(value=", this.f41574a, Separators.RPAREN);
    }
}
