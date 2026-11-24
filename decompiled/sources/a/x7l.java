package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class x7l implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40418a;
    public final boolean b;

    public x7l(String str, boolean z) {
        this.f40418a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x7l)) {
            return false;
        }
        x7l x7lVar = (x7l) obj;
        return this.f40418a.equals(x7lVar.f40418a) && this.b == x7lVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + twn.a(R.drawable.dota_stage_map_placeholder, this.f40418a.hashCode() * 31, 31);
    }

    public final String toString() {
        return rw2.p(kng0.p(R.drawable.dota_stage_map_placeholder, "MapImage(image=", this.f40418a, ", placeholder=", ", blur="), this.b, Separators.RPAREN);
    }
}
