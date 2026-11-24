package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class ie4 implements me4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14614a;

    public final boolean equals(Object obj) {
        if (obj instanceof ie4) {
            return this.f14614a.equals(((ie4) obj).f14614a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14614a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnPhoneValueChanged(value=", this.f14614a, Separators.RPAREN);
    }
}
