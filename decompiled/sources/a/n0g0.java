package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class n0g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dyl0 f22697a;

    public n0g0(dyl0 dyl0Var) {
        this.f22697a = dyl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n0g0) && this.f22697a.equals(((n0g0) obj).f22697a);
    }

    public final int hashCode() {
        return this.f22697a.hashCode();
    }

    public final String toString() {
        return "OnClickGameItem(gameModel=" + this.f22697a + Separators.RPAREN;
    }
}
