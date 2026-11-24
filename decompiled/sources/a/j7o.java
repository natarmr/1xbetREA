package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class j7o implements r7o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final owr0 f16051a;

    public j7o(owr0 owr0Var) {
        this.f16051a = owr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j7o) && this.f16051a.equals(((j7o) obj).f16051a);
    }

    public final int hashCode() {
        return this.f16051a.hashCode();
    }

    public final String toString() {
        return "OnBannerClick(item=" + this.f16051a + Separators.RPAREN;
    }
}
