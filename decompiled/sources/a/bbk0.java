package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class bbk0 implements hbk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iy3 f2312a;
    public final y0x b;

    public bbk0(iy3 iy3Var, y0x y0xVar) {
        this.f2312a = iy3Var;
        this.b = y0xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bbk0)) {
            return false;
        }
        bbk0 bbk0Var = (bbk0) obj;
        return this.f2312a.equals(bbk0Var.f2312a) && this.b.equals(bbk0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f2312a.hashCode() * 31);
    }

    public final String toString() {
        return "Image(aspectRatio=" + this.f2312a + ", params=" + this.b + Separators.RPAREN;
    }
}
