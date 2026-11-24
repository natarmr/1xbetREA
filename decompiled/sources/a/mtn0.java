package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class mtn0 implements rtn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fzc f22379a;

    public final boolean equals(Object obj) {
        if (obj instanceof mtn0) {
            return this.f22379a == ((mtn0) obj).f22379a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f22379a.hashCode();
    }

    public final String toString() {
        return "CoefColor(coefColorType=" + this.f22379a + Separators.RPAREN;
    }
}
