package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c96 implements h96 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vws0 f3947a;
    public final vws0 b;
    public final String c;
    public final String d;
    public final String e;
    public final qem f;
    public final xem g;

    public c96(vws0 vws0Var, vws0 vws0Var2, String str, String str2, String str3, qem qemVar, xem xemVar) {
        brm0.B(str, str2, str3);
        this.f3947a = vws0Var;
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
        if (!(obj instanceof c96)) {
            return false;
        }
        c96 c96Var = (c96) obj;
        return this.f3947a.equals(c96Var.f3947a) && this.b.equals(c96Var.b) && Intrinsics.d(this.c, c96Var.c) && Intrinsics.d(this.d, c96Var.d) && Intrinsics.d(this.e, c96Var.e) && Intrinsics.d(this.f, c96Var.f) && this.g.equals(c96Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((ua80.b(ua80.b(ua80.b((this.b.hashCode() + (this.f3947a.hashCode() * 31)) * 961, 961, this.c), 31, this.d), 31, this.e) + (this.f == null ? 0 : -924444967)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiTeams(firstOpponentModel=");
        sb.append(this.f3947a);
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
