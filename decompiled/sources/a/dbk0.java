package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class dbk0 implements fbk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iy3 f5810a;
    public final y0x b;

    public dbk0(iy3 iy3Var, y0x y0xVar) {
        this.f5810a = iy3Var;
        this.b = y0xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dbk0)) {
            return false;
        }
        dbk0 dbk0Var = (dbk0) obj;
        return this.f5810a.equals(dbk0Var.f5810a) && this.b.equals(dbk0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f5810a.hashCode() * 31);
    }

    public final String toString() {
        return "BackgroundImage(aspectRatio=" + this.f5810a + ", params=" + this.b + Separators.RPAREN;
    }
}
