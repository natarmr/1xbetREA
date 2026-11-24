package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class x5h implements n6h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0k0 f40316a;
    public final zxj0 b;

    public x5h(zxj0 zxj0Var, m0k0 m0k0Var) {
        this.f40316a = m0k0Var;
        this.b = zxj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5h)) {
            return false;
        }
        x5h x5hVar = (x5h) obj;
        return this.f40316a.equals(x5hVar.f40316a) && this.b.equals(x5hVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f40316a.hashCode() * 31);
    }

    public final String toString() {
        return "OnAddEventToCouponClicked(singleBetGame=" + this.f40316a + ", simpleBetZip=" + this.b + Separators.RPAREN;
    }
}
