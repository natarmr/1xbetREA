package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class y86 implements z86 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wws0 f42181a;
    public final wws0 b;
    public final f2i c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final r0n i;
    public final xem j;

    public y86(wws0 wws0Var, wws0 wws0Var2, f2i f2iVar, String str, String str2, String str3, String str4, String str5, r0n r0nVar, xem xemVar) {
        brm0.B(str, str2, str5);
        this.f42181a = wws0Var;
        this.b = wws0Var2;
        this.c = f2iVar;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = r0nVar;
        this.j = xemVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y86)) {
            return false;
        }
        y86 y86Var = (y86) obj;
        return this.f42181a.equals(y86Var.f42181a) && this.b.equals(y86Var.b) && Intrinsics.d(this.c, y86Var.c) && Intrinsics.d(this.d, y86Var.d) && Intrinsics.d(this.e, y86Var.e) && this.f.equals(y86Var.f) && this.g.equals(y86Var.g) && Intrinsics.d(this.h, y86Var.h) && this.i.equals(y86Var.i) && this.j.equals(y86Var.j);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f42181a.hashCode() * 31)) * 31;
        f2i f2iVar = this.c;
        return this.j.hashCode() + ((this.i.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(ua80.b((iHashCode + (f2iVar == null ? 0 : f2iVar.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TwoPairs(firstOpponentModel=");
        sb.append(this.f42181a);
        sb.append(", secondOpponentModel=");
        sb.append(this.b);
        sb.append(", broadcastIndicatorModel=");
        sb.append(this.c);
        sb.append(", tagLiveText=");
        sb.append(this.d);
        sb.append(", infoLabel=");
        f140.v(sb, this.e, ", scoreGameTitle=", this.f, ", scoreSetTitle=");
        f140.v(sb, this.g, ", scoreResultTitle=", this.h, ", options=");
        sb.append(this.i);
        sb.append(", gameIndicator=");
        sb.append(this.j);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
