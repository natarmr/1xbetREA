package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class b6h implements n6h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0k0 f2054a;
    public final zxj0 b;

    public b6h(zxj0 zxj0Var, m0k0 m0k0Var) {
        this.f2054a = m0k0Var;
        this.b = zxj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b6h)) {
            return false;
        }
        b6h b6hVar = (b6h) obj;
        return this.f2054a.equals(b6hVar.f2054a) && this.b.equals(b6hVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f2054a.hashCode() * 31);
    }

    public final String toString() {
        return "OnReplaceCouponEventClicked(singleBetGame=" + this.f2054a + ", simpleBetZip=" + this.b + Separators.RPAREN;
    }
}
