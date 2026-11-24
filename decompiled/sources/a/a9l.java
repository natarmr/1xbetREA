package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class a9l implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f483a;
    public final boolean b;

    public a9l(boolean z, long j) {
        this.f483a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a9l)) {
            return false;
        }
        a9l a9lVar = (a9l) obj;
        return this.f483a == a9lVar.f483a && this.b == a9lVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(R.drawable.dota_tormentor_active_ic) + brm0.e(Long.hashCode(this.f483a) * 31, 31, this.b);
    }

    public final String toString() {
        return vqd.p(kng0.r(this.f483a, "Tormentors(time=", ", visible=", this.b), ", icon=", R.drawable.dota_tormentor_active_ic, Separators.RPAREN);
    }
}
