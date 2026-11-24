package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class nnl0 implements pnl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a1n f23829a;
    public final a1n b;
    public final String c;
    public final String d;
    public final r0n e;
    public final String f;
    public final xem g;
    public final String h;
    public final f2i i;

    public nnl0(a1n a1nVar, a1n a1nVar2, String str, String str2, r0n r0nVar, String str3, xem xemVar, String str4, f2i f2iVar) {
        str2.getClass();
        str4.getClass();
        this.f23829a = a1nVar;
        this.b = a1nVar2;
        this.c = str;
        this.d = str2;
        this.e = r0nVar;
        this.f = str3;
        this.g = xemVar;
        this.h = str4;
        this.i = f2iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nnl0)) {
            return false;
        }
        nnl0 nnl0Var = (nnl0) obj;
        return this.f23829a.equals(nnl0Var.f23829a) && this.b.equals(nnl0Var.b) && this.c.equals(nnl0Var.c) && Intrinsics.d(this.d, nnl0Var.d) && this.e.equals(nnl0Var.e) && this.f.equals(nnl0Var.f) && this.g.equals(nnl0Var.g) && Intrinsics.d(this.h, nnl0Var.h) && Intrinsics.d(this.i, nnl0Var.i);
    }

    public final int hashCode() {
        int iB = ua80.b((this.g.hashCode() + ua80.b((this.e.hashCode() + ua80.b(ua80.b((this.b.hashCode() + (this.f23829a.hashCode() * 31)) * 961, 31, this.c), 31, this.d)) * 31, 31, this.f)) * 31, 31, this.h);
        f2i f2iVar = this.i;
        return iB + (f2iVar == null ? 0 : f2iVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TwoOpponents(teamOneModel=");
        sb.append(this.f23829a);
        sb.append(", teamTwoModel=");
        sb.append(this.b);
        sb.append(", scoreGameTitle=, scoreSetTitle=");
        f140.v(sb, this.c, ", scoreResultTitle=", this.d, ", options=");
        sb.append(this.e);
        sb.append(", infoLabel=");
        sb.append(this.f);
        sb.append(", gameIndicator=");
        sb.append(this.g);
        sb.append(", tagLiveText=");
        sb.append(this.h);
        sb.append(", broadcastIndicatorModel=");
        sb.append(this.i);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
