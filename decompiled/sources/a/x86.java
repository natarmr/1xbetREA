package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class x86 implements z86 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wws0 f40448a;
    public final wws0 b;
    public final f2i c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final r0n h;
    public final xem i;

    public x86(wws0 wws0Var, wws0 wws0Var2, f2i f2iVar, String str, String str2, String str3, String str4, r0n r0nVar, xem xemVar) {
        str.getClass();
        str4.getClass();
        this.f40448a = wws0Var;
        this.b = wws0Var2;
        this.c = f2iVar;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = r0nVar;
        this.i = xemVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x86)) {
            return false;
        }
        x86 x86Var = (x86) obj;
        return this.f40448a.equals(x86Var.f40448a) && this.b.equals(x86Var.b) && Intrinsics.d(this.c, x86Var.c) && Intrinsics.d(this.d, x86Var.d) && this.e.equals(x86Var.e) && this.f.equals(x86Var.f) && Intrinsics.d(this.g, x86Var.g) && this.h.equals(x86Var.h) && this.i.equals(x86Var.i);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f40448a.hashCode() * 31)) * 31;
        f2i f2iVar = this.c;
        return this.i.hashCode() + ((this.h.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b((iHashCode + (f2iVar == null ? 0 : f2iVar.hashCode())) * 31, 31, this.d), 961, this.e), 31, this.f), 31, this.g)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TwoOpponents(firstOpponentModel=");
        sb.append(this.f40448a);
        sb.append(", secondOpponentModel=");
        sb.append(this.b);
        sb.append(", broadcastIndicatorModel=");
        sb.append(this.c);
        sb.append(", tagLiveText=");
        sb.append(this.d);
        sb.append(", infoLabel=");
        f140.v(sb, this.e, ", scoreGameTitle=, scoreSetTitle=", this.f, ", scoreResultTitle=");
        sb.append(this.g);
        sb.append(", options=");
        sb.append(this.h);
        sb.append(", gameIndicator=");
        sb.append(this.i);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
