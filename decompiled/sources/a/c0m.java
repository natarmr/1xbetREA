package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class c0m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0m f3532a;
    public final b0m b;
    public final f0m c;
    public final boolean d;
    public final xzl e;
    public final ene f;

    public c0m(j0m j0mVar, b0m b0mVar, f0m f0mVar, boolean z, xzl xzlVar, int i) {
        b0mVar = (i & 2) != 0 ? yzl.f43518a : b0mVar;
        f0mVar = (i & 4) != 0 ? e0m.f6994a : f0mVar;
        z = (i & 8) != 0 ? true : z;
        if ((i & 16) != 0) {
            pz40 pz40Var = s6t0.f31722a;
            xzlVar = new vzl(s6t0.b().f33626a.getBackgroundContent());
        }
        zcl zclVar = qmk.i;
        this.f3532a = j0mVar;
        this.b = b0mVar;
        this.c = f0mVar;
        this.d = z;
        this.e = xzlVar;
        this.f = zclVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0m)) {
            return false;
        }
        c0m c0mVar = (c0m) obj;
        return this.f3532a.equals(c0mVar.f3532a) && this.b.equals(c0mVar.b) && this.c.equals(c0mVar.c) && this.d == c0mVar.d && this.e.equals(c0mVar.e) && this.f.equals(c0mVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + brm0.e((this.c.hashCode() + ((this.b.hashCode() + (this.f3532a.hashCode() * 31)) * 31)) * 31, 31, this.d)) * 31);
    }

    public final String toString() {
        return "DsCompactMenuCellStyle(topStyle=" + this.f3532a + ", bottomStyle=" + this.b + ", counterStyle=" + this.c + ", enable=" + this.d + ", background=" + this.e + ", backgroundRadius=" + this.f + Separators.RPAREN;
    }
}
