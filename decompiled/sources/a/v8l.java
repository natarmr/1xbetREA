package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class v8l implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36990a;
    public final boolean b;

    public v8l(String str, boolean z) {
        this.f36990a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v8l)) {
            return false;
        }
        v8l v8lVar = (v8l) obj;
        return this.f36990a.equals(v8lVar.f36990a) && this.b == v8lVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + twn.a(R.drawable.dota_stage_map_placeholder, this.f36990a.hashCode() * 31, 31);
    }

    public final String toString() {
        return rw2.p(kng0.p(R.drawable.dota_stage_map_placeholder, "MapImage(image=", this.f36990a, ", placeholder=", ", blur="), this.b, Separators.RPAREN);
    }
}
