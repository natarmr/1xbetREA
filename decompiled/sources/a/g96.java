package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g96 implements h96 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vws0 f10897a;
    public final vws0 b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final qem g;
    public final xem h;

    public g96(vws0 vws0Var, vws0 vws0Var2, String str, String str2, String str3, String str4, qem qemVar, xem xemVar) {
        str.getClass();
        str4.getClass();
        this.f10897a = vws0Var;
        this.b = vws0Var2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = qemVar;
        this.h = xemVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g96)) {
            return false;
        }
        g96 g96Var = (g96) obj;
        return this.f10897a.equals(g96Var.f10897a) && this.b.equals(g96Var.b) && Intrinsics.d(this.c, g96Var.c) && this.d.equals(g96Var.d) && this.e.equals(g96Var.e) && Intrinsics.d(this.f, g96Var.f) && Intrinsics.d(this.g, g96Var.g) && this.h.equals(g96Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((ua80.b(ua80.b(ua80.b(ua80.b((this.b.hashCode() + (this.f10897a.hashCode() * 31)) * 961, 31, this.c), 31, this.d), 31, this.e), 31, this.f) + (this.g == null ? 0 : -924444967)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TwoPairs(firstOpponentModel=");
        sb.append(this.f10897a);
        sb.append(", secondOpponentModel=");
        sb.append(this.b);
        sb.append(", timer=null, infoLabel=");
        f140.v(sb, this.c, ", scoreGameTitle=", this.d, ", scoreSetTitle=");
        f140.v(sb, this.e, ", scoreResultTitle=", this.f, ", eventStatusIndicatorModel=");
        sb.append(this.g);
        sb.append(", gameIndicator=");
        sb.append(this.h);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
