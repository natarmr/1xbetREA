package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class qln {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f28943a;
    public final xte b;
    public final rse c;
    public final fue d;
    public final boolean e;

    public qln(long j, xte xteVar, rse rseVar, fue fueVar, boolean z) {
        this.f28943a = j;
        this.b = xteVar;
        this.c = rseVar;
        this.d = fueVar;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qln)) {
            return false;
        }
        qln qlnVar = (qln) obj;
        return this.f28943a == qlnVar.f28943a && this.b == qlnVar.b && this.c == qlnVar.c && this.d.equals(qlnVar.d) && this.e == qlnVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f28943a) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EditCouponEventUiModel(gameId=");
        sb.append(this.f28943a);
        sb.append(", couponCardStyleType=");
        sb.append(this.b);
        sb.append(", couponCardSeparatorStyle=");
        sb.append(this.c);
        sb.append(", couponCardUiModel=");
        sb.append(this.d);
        return f140.n(sb, ", isRtlSupportEnabled=", this.e, Separators.RPAREN);
    }
}
