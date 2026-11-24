package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class wkb0 implements xkb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final egd f39300a;

    public wkb0(egd egdVar) {
        this.f39300a = egdVar;
    }

    @Override // a.xkb0
    public final skb0 b() {
        return skb0.TopUpBalance;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wkb0) && this.f39300a.equals(((wkb0) obj).f39300a);
    }

    public final int hashCode() {
        return this.f39300a.hashCode();
    }

    public final String toString() {
        return "TopUpBalance(coord=" + this.f39300a + Separators.RPAREN;
    }
}
