package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class otn0 implements rtn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25838a;

    public final boolean equals(Object obj) {
        if (obj instanceof otn0) {
            return this.f25838a.equals(((otn0) obj).f25838a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f25838a.hashCode();
    }

    public final String toString() {
        return kng0.l("PossibleWin(value=", this.f25838a, Separators.RPAREN);
    }
}
