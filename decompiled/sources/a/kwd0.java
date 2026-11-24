package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class kwd0 implements owd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18996a;

    public final boolean equals(Object obj) {
        if (obj instanceof kwd0) {
            return this.f18996a == ((kwd0) obj).f18996a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f18996a);
    }

    public final String toString() {
        return axq.h(this.f18996a, "TabClick(value=", Separators.RPAREN);
    }
}
