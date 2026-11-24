package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class r5d extends w8b implements s5d {
    public final String d;
    public final int e;

    public r5d(String str, int i) {
        super(new h9b(str), Integer.valueOf(i), null, 22);
        this.d = str;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r5d)) {
            return false;
        }
        r5d r5dVar = (r5d) obj;
        return this.d.equals(r5dVar.d) && this.e == r5dVar.e;
    }

    @Override // a.s5d
    public final String getTitle() {
        return this.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + (this.d.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(this.e, "ChampNameColumnTitle(title=", this.d, ", widthMax=", Separators.RPAREN);
    }
}
