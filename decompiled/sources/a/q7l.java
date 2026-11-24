package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class q7l implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f28255a;
    public final boolean b;

    public q7l(boolean z, long j) {
        this.f28255a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q7l)) {
            return false;
        }
        q7l q7lVar = (q7l) obj;
        return this.f28255a == q7lVar.f28255a && this.b == q7lVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(R.drawable.dota_aegis_ic) + brm0.e(Long.hashCode(this.f28255a) * 31, 31, this.b);
    }

    public final String toString() {
        return vqd.p(kng0.r(this.f28255a, "DireAegis(time=", ", visibility=", this.b), ", icon=", R.drawable.dota_aegis_ic, Separators.RPAREN);
    }
}
