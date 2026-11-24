package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class tkb0 implements xkb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final egd f34087a;

    public tkb0(egd egdVar) {
        this.f34087a = egdVar;
    }

    @Override // a.xkb0
    public final skb0 b() {
        return skb0.ShowGameCard;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tkb0) && this.f34087a.equals(((tkb0) obj).f34087a);
    }

    public final int hashCode() {
        return this.f34087a.hashCode();
    }

    public final String toString() {
        return "ShowGameCard(coord=" + this.f34087a + Separators.RPAREN;
    }
}
