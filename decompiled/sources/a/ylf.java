package a;

import android.gov.nist.core.Separators;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ylf implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f42837a;

    public final boolean equals(Object obj) {
        if (obj instanceof ylf) {
            return this.f42837a.equals(((ylf) obj).f42837a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f42837a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f42837a, "GameLogItems(value=", Separators.RPAREN);
    }
}
