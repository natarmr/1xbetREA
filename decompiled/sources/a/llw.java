package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class llw extends t9p {
    public final a4x b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public llw(i4 i4Var) {
        super("TACKED", i4Var);
        i4Var.getClass();
        this.b = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof llw) && Intrinsics.d(this.b, ((llw) obj).b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "TACKED " + this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() - 834028660;
    }

    public final String toString() {
        return h97.i(this.b, "HorizontalFavoriteTrackCoefUIItem(id=TACKED, uiItems=", Separators.RPAREN);
    }
}
