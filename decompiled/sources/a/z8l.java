package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class z8l implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43972a;
    public final boolean b;

    public z8l(boolean z, long j) {
        this.f43972a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z8l)) {
            return false;
        }
        z8l z8lVar = (z8l) obj;
        return this.f43972a == z8lVar.f43972a && this.b == z8lVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(R.drawable.dota_roshan_ic) + brm0.e(Long.hashCode(this.f43972a) * 31, 31, this.b);
    }

    public final String toString() {
        return vqd.p(kng0.r(this.f43972a, "Roshan(time=", ", visibility=", this.b), ", icon=", R.drawable.dota_roshan_ic, Separators.RPAREN);
    }
}
