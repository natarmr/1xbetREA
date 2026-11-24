package a;

import android.gov.nist.core.Separators;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class b5e0 extends w5 {
    public final d5e0 u;

    /* JADX WARN: Illegal instructions before constructor call */
    public b5e0(d5e0 d5e0Var) {
        FrameLayout frameLayout = d5e0Var.b;
        frameLayout.getClass();
        super(frameLayout);
        this.u = d5e0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b5e0) && this.u == ((b5e0) obj).u;
    }

    public final int hashCode() {
        return this.u.hashCode();
    }

    @Override // a.xhe0
    public final String toString() {
        return "RatingHistoryCellViewHolder(binding=" + this.u + Separators.RPAREN;
    }
}
