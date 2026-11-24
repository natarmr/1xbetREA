package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class hl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13231a;
    public final double b;
    public final String c;

    public hl(long j, double d, String str) {
        this.f13231a = j;
        this.b = d;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hl)) {
            return false;
        }
        hl hlVar = (hl) obj;
        return this.f13231a == hlVar.f13231a && Double.compare(this.b, hlVar.b) == 0 && this.c.equals(hlVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.d(this.b, Long.hashCode(this.f13231a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f13231a, "ActiveBonusSumModel(bonusId=", ", amount=");
        hne.w(sbQ, this.b, ", currency=", this.c);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
