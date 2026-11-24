package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f96 implements h96 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vws0 f9140a;
    public final vws0 b;
    public final String c;
    public final String d;
    public final String e;
    public final qem f;
    public final xem g;

    public f96(vws0 vws0Var, vws0 vws0Var2, String str, String str2, String str3, qem qemVar, xem xemVar) {
        str3.getClass();
        this.f9140a = vws0Var;
        this.b = vws0Var2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = qemVar;
        this.g = xemVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f96)) {
            return false;
        }
        f96 f96Var = (f96) obj;
        return this.f9140a.equals(f96Var.f9140a) && this.b.equals(f96Var.b) && this.c.equals(f96Var.c) && this.d.equals(f96Var.d) && Intrinsics.d(this.e, f96Var.e) && Intrinsics.d(this.f, f96Var.f) && this.g.equals(f96Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((ua80.b(ua80.b(ua80.b((this.b.hashCode() + (this.f9140a.hashCode() * 31)) * 961, 961, this.c), 31, this.d), 31, this.e) + (this.f == null ? 0 : -924444967)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TwoOpponents(firstOpponentModel=");
        sb.append(this.f9140a);
        sb.append(", secondOpponentModel=");
        sb.append(this.b);
        sb.append(", timer=null, infoLabel=");
        f140.v(sb, this.c, ", scoreGameTitle=, scoreSetTitle=", this.d, ", scoreResultTitle=");
        sb.append(this.e);
        sb.append(", eventStatusIndicatorModel=");
        sb.append(this.f);
        sb.append(", gameIndicator=");
        sb.append(this.g);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
