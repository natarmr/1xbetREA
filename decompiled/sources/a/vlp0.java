package a;

import android.gov.nist.core.Separators;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class vlp0 implements xlp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f37638a;

    public final boolean equals(Object obj) {
        if (obj instanceof vlp0) {
            return this.f37638a.equals(((vlp0) obj).f37638a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f37638a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f37638a, "StatisticsCellHeaders(value=", Separators.RPAREN);
    }
}
