package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class nd2 implements sd2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23320a;

    public final boolean equals(Object obj) {
        if (obj instanceof nd2) {
            return this.f23320a.equals(((nd2) obj).f23320a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f23320a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnQueryChanged(query=", this.f23320a, Separators.RPAREN);
    }
}
