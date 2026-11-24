package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class ma4 implements pa4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21443a;

    public final boolean equals(Object obj) {
        if (obj instanceof ma4) {
            return this.f21443a.equals(((ma4) obj).f21443a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21443a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnPhoneValueChanged(value=", this.f21443a, Separators.RPAREN);
    }
}
