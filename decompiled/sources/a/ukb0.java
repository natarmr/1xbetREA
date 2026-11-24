package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ukb0 implements xkb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final egd f35821a;

    public ukb0(egd egdVar) {
        this.f35821a = egdVar;
    }

    @Override // a.xkb0
    public final skb0 b() {
        return skb0.ShowGameCardMarkets;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ukb0) && this.f35821a.equals(((ukb0) obj).f35821a);
    }

    public final int hashCode() {
        return this.f35821a.hashCode();
    }

    public final String toString() {
        return "ShowGameCardMarkets(coord=" + this.f35821a + Separators.RPAREN;
    }
}
