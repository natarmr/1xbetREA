package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class jtc implements ltc {
    public jtc() {
        ymx ymxVar = ymx.INTERVAL_100;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jtc)) {
            return false;
        }
        ymx ymxVar = ymx.INTERVAL_100;
        return true;
    }

    public final int hashCode() {
        return ymx.INTERVAL_500.hashCode();
    }

    public final String toString() {
        return "GlobalBlock(blockTimeout=" + ymx.INTERVAL_500 + Separators.RPAREN;
    }
}
