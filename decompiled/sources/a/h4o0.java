package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h4o0 implements n4o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pvm f12443a;
    public final pvm b;
    public final z1m c;
    public final String d;
    public final String e;
    public final a4x f;
    public final zum g;

    public h4o0(pvm pvmVar, pvm pvmVar2, z1m z1mVar, String str, String str2, a4x a4xVar, zum zumVar) {
        a4xVar.getClass();
        this.f12443a = pvmVar;
        this.b = pvmVar2;
        this.c = z1mVar;
        this.d = str;
        this.e = str2;
        this.f = a4xVar;
        this.g = zumVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h4o0)) {
            return false;
        }
        h4o0 h4o0Var = (h4o0) obj;
        return this.f12443a.equals(h4o0Var.f12443a) && this.b.equals(h4o0Var.b) && this.c.equals(h4o0Var.c) && this.d.equals(h4o0Var.d) && this.e.equals(h4o0Var.e) && Intrinsics.d(this.f, h4o0Var.f) && this.g.equals(h4o0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + cs0.b(this.f, ua80.b(ua80.b(rz4.b(this.c.f43628a, (this.b.hashCode() + (this.f12443a.hashCode() * 31)) * 31, 31), 961, this.d), 31, this.e), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CyberPoker(firstOpponent=");
        sb.append(this.f12443a);
        sb.append(", secondOpponent=");
        sb.append(this.b);
        sb.append(", scoreModel=");
        sb.append(this.c);
        sb.append(", gameLabel=");
        sb.append(this.d);
        sb.append(", infoLabel=, infoLabel2=");
        cs0.B(sb, this.e, ", cardOnTableList=", this.f, ", options=");
        sb.append(this.g);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
