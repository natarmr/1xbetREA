package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g3r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10624a;
    public final String b;
    public final gy30 c;

    public g3r0(int i, String str, gy30 gy30Var) {
        str.getClass();
        this.f10624a = i;
        this.b = str;
        this.c = gy30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g3r0)) {
            return false;
        }
        g3r0 g3r0Var = (g3r0) obj;
        return this.f10624a == g3r0Var.f10624a && Intrinsics.d(this.b, g3r0Var.b) && this.c.equals(g3r0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Integer.hashCode(this.f10624a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f10624a, "TopEventMenuUiModel(id=", ", title=", this.b, ", style=");
        sbR.append(this.c);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
