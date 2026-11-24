package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class yjz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42761a;
    public final String b;

    public yjz(String str, String str2) {
        this.f42761a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yjz)) {
            return false;
        }
        yjz yjzVar = (yjz) obj;
        return this.f42761a.equals(yjzVar.f42761a) && this.b.equals(yjzVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f42761a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("LegendUiModel(abbr=", this.f42761a, ", description=", this.b, Separators.RPAREN);
    }
}
