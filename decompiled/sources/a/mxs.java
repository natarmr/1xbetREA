package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class mxs implements txs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22574a;

    public final boolean equals(Object obj) {
        if (obj instanceof mxs) {
            return this.f22574a.equals(((mxs) obj).f22574a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f22574a.hashCode();
    }

    public final String toString() {
        return kng0.l("AuthIsRequired(message=", this.f22574a, Separators.RPAREN);
    }
}
