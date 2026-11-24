package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class eqo0 implements fqo0 {
    public eqo0() {
        d4d d4dVar = d4d.PRIMARY;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eqo0)) {
            return false;
        }
        d4d d4dVar = d4d.PRIMARY;
        return true;
    }

    public final int hashCode() {
        return d4d.BACKGROUND.hashCode();
    }

    public final String toString() {
        return "Rounded(borderColorKey=" + d4d.BACKGROUND + Separators.RPAREN;
    }
}
