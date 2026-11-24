package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class ciq implements vhv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f4425a;
    public final float b;
    public final float c;
    public final float d;

    public ciq(float f, float f2, float f3, float f4) {
        this.f4425a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // a.vhv0
    public final int a(w6k w6kVar, k6z k6zVar) {
        return w6kVar.T(this.f4425a);
    }

    @Override // a.vhv0
    public final int b(w6k w6kVar) {
        return w6kVar.T(this.d);
    }

    @Override // a.vhv0
    public final int c(w6k w6kVar, k6z k6zVar) {
        return w6kVar.T(this.c);
    }

    @Override // a.vhv0
    public final int d(w6k w6kVar) {
        return w6kVar.T(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ciq)) {
            return false;
        }
        ciq ciqVar = (ciq) obj;
        return ycl.b(this.f4425a, ciqVar.f4425a) && ycl.b(this.b, ciqVar.b) && ycl.b(this.c, ciqVar.c) && ycl.b(this.d, ciqVar.d);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + defpackage.c.a(defpackage.c.a(Float.hashCode(this.f4425a) * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        String strC = ycl.c(this.f4425a);
        String strC2 = ycl.c(this.b);
        return ua80.m(b1j.n("Insets(left=", strC, ", top=", strC2, ", right="), ycl.c(this.c), ", bottom=", ycl.c(this.d), Separators.RPAREN);
    }
}
