package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e96 implements h96 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vws0 f7406a;
    public final vws0 b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final qem g;
    public final xem h;

    public e96(vws0 vws0Var, vws0 vws0Var2, String str, String str2, String str3, String str4, qem qemVar, xem xemVar) {
        str.getClass();
        str4.getClass();
        this.f7406a = vws0Var;
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
        if (!(obj instanceof e96)) {
            return false;
        }
        e96 e96Var = (e96) obj;
        return this.f7406a.equals(e96Var.f7406a) && this.b.equals(e96Var.b) && Intrinsics.d(this.c, e96Var.c) && this.d.equals(e96Var.d) && this.e.equals(e96Var.e) && Intrinsics.d(this.f, e96Var.f) && Intrinsics.d(this.g, e96Var.g) && this.h.equals(e96Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((ua80.b(ua80.b(ua80.b(ua80.b((this.b.hashCode() + (this.f7406a.hashCode() * 31)) * 961, 31, this.c), 31, this.d), 31, this.e), 31, this.f) + (this.g == null ? 0 : -924444967)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Tennis(firstOpponentModel=");
        sb.append(this.f7406a);
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
