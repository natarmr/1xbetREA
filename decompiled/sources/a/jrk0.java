package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class jrk0 implements ork0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17006a;
    public final String b;

    public jrk0(long j, String str) {
        this.f17006a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jrk0)) {
            return false;
        }
        jrk0 jrk0Var = (jrk0) obj;
        return this.f17006a == jrk0Var.f17006a && this.b.equals(jrk0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f17006a) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f17006a, "OnVenueClick(stadiumId=", ", stadiumTitle=", this.b);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
