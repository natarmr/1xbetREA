package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class d8l implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5654a;
    public final boolean b;

    public d8l(boolean z, long j) {
        this.f5654a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d8l)) {
            return false;
        }
        d8l d8lVar = (d8l) obj;
        return this.f5654a == d8lVar.f5654a && this.b == d8lVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(R.drawable.dota_roshan_ic) + brm0.e(Long.hashCode(this.f5654a) * 31, 31, this.b);
    }

    public final String toString() {
        return vqd.p(kng0.r(this.f5654a, "Roshan(time=", ", visibility=", this.b), ", icon=", R.drawable.dota_roshan_ic, Separators.RPAREN);
    }
}
