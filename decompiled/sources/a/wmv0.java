package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class wmv0 extends v8b implements xmv0 {
    public final String d;
    public final int e;
    public final k6d f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wmv0(String str, int i, k6d k6dVar) {
        super(30, null, null, q3d.j(new g9b(i), new h9b(str), new g9b(i)));
        str.getClass();
        this.d = str;
        this.e = i;
        this.f = k6dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wmv0)) {
            return false;
        }
        wmv0 wmv0Var = (wmv0) obj;
        return Intrinsics.d(this.d, wmv0Var.d) && this.e == wmv0Var.e && this.f == wmv0Var.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + twn.a(this.e, this.d.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.e, "WinterGamesResultsColumnHeader(title=", this.d, ", spaceWidth=", ", type=");
        sbP.append(this.f);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
