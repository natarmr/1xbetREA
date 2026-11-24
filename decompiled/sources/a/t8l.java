package a;

import android.gov.nist.core.Separators;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class t8l implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f33516a;

    public final boolean equals(Object obj) {
        if (obj instanceof t8l) {
            return this.f33516a.equals(((t8l) obj).f33516a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f33516a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f33516a, "MapBuildings(value=", Separators.RPAREN);
    }
}
