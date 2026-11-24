package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class h3i0 implements l3i0 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h3i0)) {
            return false;
        }
        j6m0 j6m0Var = ygq0.b;
        return true;
    }

    public final int hashCode() {
        return ygq0.NOT.hashCode();
    }

    public final String toString() {
        return "SetTimeFilter(timeFilter=" + ygq0.NOT + Separators.RPAREN;
    }
}
