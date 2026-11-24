package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class xjw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41006a;
    public final String b;
    public final gy30 c;

    public xjw(int i, String str, gy30 gy30Var) {
        str.getClass();
        this.f41006a = i;
        this.b = str;
        this.c = gy30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xjw)) {
            return false;
        }
        xjw xjwVar = (xjw) obj;
        return this.f41006a == xjwVar.f41006a && Intrinsics.d(this.b, xjwVar.b) && this.c.equals(xjwVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Integer.hashCode(this.f41006a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f41006a, "HomeSpecialEventItemUiModel(id=", ", title=", this.b, ", style=");
        sbR.append(this.c);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
