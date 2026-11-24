package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class o010 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24399a;
    public final int b;

    public o010(long j, int i) {
        this.f24399a = j;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o010)) {
            return false;
        }
        o010 o010Var = (o010) obj;
        return this.f24399a == o010Var.f24399a && this.b == o010Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Long.hashCode(this.f24399a) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = brm0.q(this.b, this.f24399a, "LolHeroItemsModel(itemId=", ", itemCount=");
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
