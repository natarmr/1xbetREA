package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ndu0 implements wdu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23352a;

    public final boolean equals(Object obj) {
        if (obj instanceof ndu0) {
            return this.f23352a.equals(((ndu0) obj).f23352a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f23352a.hashCode();
    }

    public final String toString() {
        return kng0.l("FirstPlayerThirdNumber(value=", this.f23352a, Separators.RPAREN);
    }
}
