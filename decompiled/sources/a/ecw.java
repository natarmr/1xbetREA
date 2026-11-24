package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ecw implements hcw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0k0 f7587a;
    public final zxj0 b;

    public ecw(zxj0 zxj0Var, m0k0 m0k0Var) {
        this.f7587a = m0k0Var;
        this.b = zxj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ecw)) {
            return false;
        }
        ecw ecwVar = (ecw) obj;
        return this.f7587a.equals(ecwVar.f7587a) && this.b.equals(ecwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f7587a.hashCode() * 31);
    }

    public final String toString() {
        return "OnReplaceCoupon(singleBetGame=" + this.f7587a + ", simpleBetZip=" + this.b + Separators.RPAREN;
    }
}
