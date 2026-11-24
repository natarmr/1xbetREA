package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class reo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f30345a;
    public final String b;

    public reo(long j, String str) {
        this.f30345a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof reo)) {
            return false;
        }
        reo reoVar = (reo) obj;
        return this.f30345a == reoVar.f30345a && this.b.equals(reoVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f30345a) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f30345a, "EventPlayerModel(id=", ", name=", this.b);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
