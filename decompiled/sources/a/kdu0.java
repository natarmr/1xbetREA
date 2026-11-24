package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class kdu0 implements wdu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18124a;

    public final boolean equals(Object obj) {
        if (obj instanceof kdu0) {
            return this.f18124a.equals(((kdu0) obj).f18124a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18124a.hashCode();
    }

    public final String toString() {
        return kng0.l("FirstPlayerFirstNumber(value=", this.f18124a, Separators.RPAREN);
    }
}
