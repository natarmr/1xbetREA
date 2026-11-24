package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class eid implements uid {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0k0 f7854a;
    public final zxj0 b;

    public eid(zxj0 zxj0Var, m0k0 m0k0Var) {
        this.f7854a = m0k0Var;
        this.b = zxj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eid)) {
            return false;
        }
        eid eidVar = (eid) obj;
        return this.f7854a.equals(eidVar.f7854a) && this.b.equals(eidVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f7854a.hashCode() * 31);
    }

    public final String toString() {
        return "OnAddEventToCouponClick(singleBetGame=" + this.f7854a + ", simpleBetZip=" + this.b + Separators.RPAREN;
    }
}
