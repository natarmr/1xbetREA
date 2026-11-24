package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class y0x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uyw f41828a;
    public final int b;

    public y0x(uyw uywVar, int i) {
        this.f41828a = uywVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0x)) {
            return false;
        }
        y0x y0xVar = (y0x) obj;
        return this.f41828a.equals(y0xVar.f41828a) && this.b == y0xVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f41828a.hashCode() * 31);
    }

    public final String toString() {
        return "ImageParams(backgroundRes=" + this.f41828a + ", backgroundColor=" + ua80.e(this.b, "ColorImage(colorRes=", Separators.RPAREN) + Separators.RPAREN;
    }
}
