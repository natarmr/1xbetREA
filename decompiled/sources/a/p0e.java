package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class p0e implements q0e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26146a;

    public p0e(String str) {
        this.f26146a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p0e) && this.f26146a.equals(((p0e) obj).f26146a);
    }

    public final int hashCode() {
        return this.f26146a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowTokenExpiredMessage(text=", this.f26146a, Separators.RPAREN);
    }
}
