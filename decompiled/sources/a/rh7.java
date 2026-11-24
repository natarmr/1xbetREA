package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class rh7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f30476a;
    public final String b;

    public rh7(long j, String str) {
        this.f30476a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rh7)) {
            return false;
        }
        rh7 rh7Var = (rh7) obj;
        return this.f30476a == rh7Var.f30476a && this.b.equals(rh7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f30476a) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f30476a, "BetPlayerModel(id=", ", name=", this.b);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
