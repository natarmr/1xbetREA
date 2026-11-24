package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class mnl0 implements pnl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a1n f22095a;
    public final a1n b;
    public final String c;
    public final String d;
    public final String e;
    public final r0n f;
    public final String g;
    public final xem h;
    public final String i;
    public final f2i j;

    public mnl0(f2i f2iVar, xem xemVar, r0n r0nVar, a1n a1nVar, a1n a1nVar2, String str, String str2, String str3, String str4, String str5) {
        str3.getClass();
        str5.getClass();
        this.f22095a = a1nVar;
        this.b = a1nVar2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = r0nVar;
        this.g = str4;
        this.h = xemVar;
        this.i = str5;
        this.j = f2iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mnl0)) {
            return false;
        }
        mnl0 mnl0Var = (mnl0) obj;
        return this.f22095a.equals(mnl0Var.f22095a) && this.b.equals(mnl0Var.b) && this.c.equals(mnl0Var.c) && this.d.equals(mnl0Var.d) && Intrinsics.d(this.e, mnl0Var.e) && this.f.equals(mnl0Var.f) && Intrinsics.d(this.g, mnl0Var.g) && this.h.equals(mnl0Var.h) && Intrinsics.d(this.i, mnl0Var.i) && Intrinsics.d(this.j, mnl0Var.j);
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + ua80.b(ua80.b(ua80.b((this.b.hashCode() + (this.f22095a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e)) * 31;
        String str = this.g;
        int iB = ua80.b((this.h.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.i);
        f2i f2iVar = this.j;
        return iB + (f2iVar != null ? f2iVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Tennis(teamOneModel=");
        sb.append(this.f22095a);
        sb.append(", teamTwoModel=");
        sb.append(this.b);
        sb.append(", scoreGameTitle=");
        f140.v(sb, this.c, ", scoreSetTitle=", this.d, ", scoreResultTitle=");
        sb.append(this.e);
        sb.append(", options=");
        sb.append(this.f);
        sb.append(", infoLabel=");
        sb.append(this.g);
        sb.append(", gameIndicator=");
        sb.append(this.h);
        sb.append(", tagLiveText=");
        sb.append(this.i);
        sb.append(", broadcastIndicatorModel=");
        sb.append(this.j);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
