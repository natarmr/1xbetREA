package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class q8l implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f28306a;
    public final boolean b;
    public final boolean c;

    public q8l(long j, boolean z, boolean z2) {
        this.f28306a = j;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q8l)) {
            return false;
        }
        q8l q8lVar = (q8l) obj;
        return this.f28306a == q8lVar.f28306a && this.b == q8lVar.b && this.c == q8lVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(R.drawable.dota_aegis_ic) + brm0.e(brm0.e(Long.hashCode(this.f28306a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f28306a, "Aegis(time=", ", radiant=", this.b);
        cs0.v(R.drawable.dota_aegis_ic, ", visibility=", ", icon=", sbR, this.c);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
