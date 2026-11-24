package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class t6k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j53 f33420a;
    public final j53 b;
    public final float c;

    public t6k() {
        pz40 pz40Var = s6t0.f31722a;
        long coefHigher = s6t0.b().b.getCoefHigher();
        zcl zclVar = qmk.f28987a;
        j53 j53Var = new j53(R.drawable.ic_glyph_arrow_up, coefHigher);
        j53 j53Var2 = new j53(R.drawable.ic_glyph_arrow_down, s6t0.b().b.getCoefLower());
        this.f33420a = j53Var;
        this.b = j53Var2;
        this.c = 2.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t6k)) {
            return false;
        }
        t6k t6kVar = (t6k) obj;
        return Intrinsics.d(this.f33420a, t6kVar.f33420a) && Intrinsics.d(this.b, t6kVar.b) && ycl.b(this.c, t6kVar.c);
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + ((this.b.hashCode() + (this.f33420a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        String strC = ycl.c(this.c);
        StringBuilder sb = new StringBuilder("DeltaParams(arrowIconUpParamsStyle=");
        sb.append(this.f33420a);
        sb.append(", arrowIconDownParamsStyle=");
        sb.append(this.b);
        sb.append(", spaceBetweenDeltaAndIcon=");
        return axq.n(sb, strC, Separators.RPAREN);
    }
}
