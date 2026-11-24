package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class r2v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y3d f29758a;
    public final y3d b;
    public final y3d c;

    public r2v0(y3d y3dVar, y3d y3dVar2, y3d y3dVar3) {
        this.f29758a = y3dVar;
        this.b = y3dVar2;
        this.c = y3dVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r2v0)) {
            return false;
        }
        r2v0 r2v0Var = (r2v0) obj;
        return this.f29758a.equals(r2v0Var.f29758a) && this.b.equals(r2v0Var.b) && this.c.equals(r2v0Var.c);
    }

    public final int hashCode() {
        long j = this.f29758a.f41946a;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.c.f41946a) + rw2.b(Long.hashCode(j) * 31, 31, this.b.f41946a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebGamesAccountControlColors(background=");
        sb.append(this.f29758a);
        sb.append(", backgroundDataContainer=");
        sb.append(this.b);
        sb.append(", textColor=");
        return hne.p(sb, this.c, Separators.RPAREN);
    }
}
