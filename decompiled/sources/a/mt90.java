package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class mt90 {
    public mt90() {
        d4d d4dVar = d4d.PRIMARY;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mt90)) {
            return false;
        }
        d4d d4dVar = d4d.PRIMARY;
        return true;
    }

    public final int hashCode() {
        return d4d.PRIMARY.hashCode();
    }

    public final String toString() {
        return "Solid(colorKey=" + d4d.PRIMARY + Separators.RPAREN;
    }
}
