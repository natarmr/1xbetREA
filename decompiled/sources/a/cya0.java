package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class cya0 implements iya0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hdb0 f5164a;

    public cya0(hdb0 hdb0Var) {
        this.f5164a = hdb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cya0) && this.f5164a.equals(((cya0) obj).f5164a);
    }

    public final int hashCode() {
        return this.f5164a.hashCode();
    }

    public final String toString() {
        return "PopularInfoDismiss(model=" + this.f5164a + Separators.RPAREN;
    }
}
