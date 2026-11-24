package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class gvi0 implements pvi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kpe f11976a;
    public final int b;
    public final y3d c;

    public gvi0(kpe kpeVar, int i, y3d y3dVar) {
        this.f11976a = kpeVar;
        this.b = i;
        this.c = y3dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gvi0)) {
            return false;
        }
        gvi0 gvi0Var = (gvi0) obj;
        return this.f11976a.equals(gvi0Var.f11976a) && this.b == gvi0Var.b && this.c.equals(gvi0Var.c);
    }

    public final int hashCode() {
        int iA = twn.a(this.b, this.f11976a.hashCode() * 31, 31);
        long j = this.c.f41946a;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(j) + iA;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CounterChevron(counterStyle=");
        sb.append(this.f11976a);
        sb.append(", counterValue=");
        sb.append(this.b);
        sb.append(", chevronColor=");
        return hne.p(sb, this.c, Separators.RPAREN);
    }
}
