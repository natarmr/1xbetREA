package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class y7l implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f42157a;
    public final boolean b;

    public y7l(boolean z, long j) {
        this.f42157a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y7l)) {
            return false;
        }
        y7l y7lVar = (y7l) obj;
        return this.f42157a == y7lVar.f42157a && this.b == y7lVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(R.drawable.dota_aegis_ic) + brm0.e(Long.hashCode(this.f42157a) * 31, 31, this.b);
    }

    public final String toString() {
        return vqd.p(kng0.r(this.f42157a, "RadiantAegis(time=", ", visibility=", this.b), ", icon=", R.drawable.dota_aegis_ic, Separators.RPAREN);
    }
}
