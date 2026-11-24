package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class frk0 implements ork0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10023a;
    public final String b;

    public frk0(long j, String str) {
        this.f10023a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof frk0)) {
            return false;
        }
        frk0 frk0Var = (frk0) obj;
        return this.f10023a == frk0Var.f10023a && this.b.equals(frk0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f10023a) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f10023a, "OnStadiumClick(stadiumId=", ", stadiumTitle=", this.b);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
