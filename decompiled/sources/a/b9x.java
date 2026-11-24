package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class b9x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2231a;
    public final ugg0 b;

    public b9x(long j, ugg0 ugg0Var) {
        this.f2231a = j;
        this.b = ugg0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b9x)) {
            return false;
        }
        b9x b9xVar = (b9x) obj;
        long j = b9xVar.f2231a;
        int i = y3d.h;
        return h2t0.a(this.f2231a, j) && this.b.equals(b9xVar.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(R.drawable.ic_glyph_move_horizontal_small) * 961;
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return this.b.hashCode() + rw2.b(iHashCode, 31, this.f2231a);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(R.drawable.ic_glyph_move_horizontal_small, "InfoLabelIconUiModel(iconRes=", ", iconTint=null, backgroundColor=", y3d.i(this.f2231a), ", shape=");
        sbR.append(this.b);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
