package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class hwn0 implements lwn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13775a;

    public final boolean equals(Object obj) {
        if (obj instanceof hwn0) {
            return this.f13775a.equals(((hwn0) obj).f13775a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13775a.hashCode();
    }

    public final String toString() {
        return kng0.l("Coef(value=", this.f13775a, Separators.RPAREN);
    }
}
