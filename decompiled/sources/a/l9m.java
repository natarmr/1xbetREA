package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class l9m implements wqg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0x f19660a;
    public final y3d b;

    public l9m(n0x n0xVar, y3d y3dVar) {
        this.f19660a = n0xVar;
        this.b = y3dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l9m)) {
            return false;
        }
        l9m l9mVar = (l9m) obj;
        return this.f19660a.equals(l9mVar.f19660a) && this.b.equals(l9mVar.b);
    }

    public final int hashCode() {
        int iA = twn.a(R.drawable.ic_glyph_mobile_legends, this.f19660a.hashCode() * 31, 961);
        long j = this.b.f41946a;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(j) + iA;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Square(image=");
        sb.append(this.f19660a);
        sb.append(", placeholder=");
        sb.append(R.drawable.ic_glyph_mobile_legends);
        sb.append(", imageTint=null, placeHolderTint=");
        return hne.p(sb, this.b, Separators.RPAREN);
    }
}
