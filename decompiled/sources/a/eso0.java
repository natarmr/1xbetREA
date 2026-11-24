package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class eso0 implements fso0 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eso0)) {
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
