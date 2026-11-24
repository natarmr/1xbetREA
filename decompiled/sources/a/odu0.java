package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class odu0 implements wdu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25093a;

    public final boolean equals(Object obj) {
        if (obj instanceof odu0) {
            return this.f25093a.equals(((odu0) obj).f25093a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f25093a.hashCode();
    }

    public final String toString() {
        return kng0.l("FirstPlayerTotal(value=", this.f25093a, Separators.RPAREN);
    }
}
