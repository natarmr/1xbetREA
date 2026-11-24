package a;

import android.gov.nist.core.Separators;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class v7l implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f36931a;

    public final boolean equals(Object obj) {
        if (obj instanceof v7l) {
            return this.f36931a.equals(((v7l) obj).f36931a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f36931a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f36931a, "MapBuildings(value=", Separators.RPAREN);
    }
}
