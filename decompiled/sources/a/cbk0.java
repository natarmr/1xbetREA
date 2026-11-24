package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class cbk0 implements hbk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iy3 f4065a;
    public final int b;
    public final uyw c;

    public cbk0(iy3 iy3Var, int i, uyw uywVar) {
        this.f4065a = iy3Var;
        this.b = i;
        this.c = uywVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cbk0)) {
            return false;
        }
        cbk0 cbk0Var = (cbk0) obj;
        return this.f4065a.equals(cbk0Var.f4065a) && this.b == cbk0Var.b && this.c.equals(cbk0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, this.f4065a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "Lottie(aspectRatio=" + this.f4065a + ", lottieRes=" + this.b + ", backgroundRes=" + this.c + Separators.RPAREN;
    }
}
