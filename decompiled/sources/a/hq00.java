package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class hq00 extends nrq {
    public final r7v f;

    public hq00(r7v r7vVar) {
        this.f = r7vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hq00) {
            return this.f == ((hq00) obj).f;
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode();
    }

    public final String toString() {
        return "LoadedFontFamily(typeface=" + this.f + Separators.RPAREN;
    }
}
