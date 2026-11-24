package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class u7l implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f35189a;

    public u7l(long j) {
        this.f35189a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u7l) && this.f35189a == ((u7l) obj).f35189a;
    }

    public final int hashCode() {
        return Integer.hashCode(R.drawable.dota_tormentor_active_ic) + brm0.e(Long.hashCode(this.f35189a) * 31, 31, false);
    }

    public final String toString() {
        StringBuilder sbQ = brm0.q(R.drawable.dota_tormentor_active_ic, this.f35189a, "DireTormentor(time=", ", visibility=false, icon=");
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
