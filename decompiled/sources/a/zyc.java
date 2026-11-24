package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class zyc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f45199a;
    public final izc b;

    public zyc(double d, izc izcVar) {
        izcVar.getClass();
        this.f45199a = d;
        this.b = izcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zyc)) {
            return false;
        }
        zyc zycVar = (zyc) obj;
        return Double.compare(this.f45199a, zycVar.f45199a) == 0 && this.b == zycVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Double.hashCode(this.f45199a) * 31);
    }

    public final String toString() {
        return "CoefCacheModel(coef=" + this.f45199a + ", coefState=" + this.b + Separators.RPAREN;
    }
}
