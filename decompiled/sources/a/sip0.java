package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class sip0 implements tip0 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sip0)) {
            return false;
        }
        e5h0 e5h0Var = e5h0.f7234a;
        return true;
    }

    public final int hashCode() {
        return e5h0.b.hashCode() + 1488;
    }

    public final String toString() {
        return "TextScore(text=0, scoreState=" + e5h0.b + Separators.RPAREN;
    }
}
