package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class c8l implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3918a;

    public c8l(long j) {
        this.f3918a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c8l) && this.f3918a == ((c8l) obj).f3918a;
    }

    public final int hashCode() {
        return Integer.hashCode(R.drawable.dota_tormentor_active_ic) + brm0.e(Long.hashCode(this.f3918a) * 31, 31, false);
    }

    public final String toString() {
        StringBuilder sbQ = brm0.q(R.drawable.dota_tormentor_active_ic, this.f3918a, "RadiantTormentor(time=", ", visibility=false, icon=");
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
