package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class wwh extends w8b implements xwh {
    public final String d;
    public final String e;
    public final int f;
    public final int g;

    public wwh(int i, String str, int i2, String str2) {
        super(new h9b(str), Integer.valueOf(i2), Integer.valueOf(i), 6);
        this.d = str;
        this.e = str2;
        this.f = i;
        this.g = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wwh)) {
            return false;
        }
        wwh wwhVar = (wwh) obj;
        return this.d.equals(wwhVar.d) && this.e.equals(wwhVar.e) && this.f == wwhVar.f && this.g == wwhVar.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + twn.a(this.f, ua80.b(this.d.hashCode() * 31, 31, this.e), 31);
    }

    public final String toString() {
        return w6x.o(this.f, this.g, ", maxWidthCell=", Separators.RPAREN, b1j.n("TextCell(value=", this.d, ", playerId=", this.e, ", minWidthCell="));
    }
}
