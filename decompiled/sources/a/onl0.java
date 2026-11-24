package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class onl0 implements pnl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a1n f25552a;
    public final a1n b;
    public final String c;
    public final String d;
    public final String e;
    public final r0n f;
    public final String g;
    public final xem h;
    public final String i;
    public final f2i j;

    public onl0(f2i f2iVar, xem xemVar, r0n r0nVar, a1n a1nVar, a1n a1nVar2, String str, String str2, String str3, String str4, String str5) {
        str3.getClass();
        str5.getClass();
        this.f25552a = a1nVar;
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
        if (!(obj instanceof onl0)) {
            return false;
        }
        onl0 onl0Var = (onl0) obj;
        return this.f25552a.equals(onl0Var.f25552a) && this.b.equals(onl0Var.b) && this.c.equals(onl0Var.c) && this.d.equals(onl0Var.d) && Intrinsics.d(this.e, onl0Var.e) && this.f.equals(onl0Var.f) && Intrinsics.d(this.g, onl0Var.g) && this.h.equals(onl0Var.h) && Intrinsics.d(this.i, onl0Var.i) && Intrinsics.d(this.j, onl0Var.j);
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + ua80.b(ua80.b(ua80.b((this.b.hashCode() + (this.f25552a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e)) * 31;
        String str = this.g;
        int iB = ua80.b((this.h.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.i);
        f2i f2iVar = this.j;
        return iB + (f2iVar != null ? f2iVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TwoPairs(teamOneModel=");
        sb.append(this.f25552a);
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
