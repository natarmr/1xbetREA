package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class z3o0 implements f4o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lvm f43731a;
    public final lvm b;
    public final lpm c;
    public final String d;
    public final String e;
    public final a4x f;
    public final zum g;

    public z3o0(lvm lvmVar, lvm lvmVar2, lpm lpmVar, String str, String str2, a4x a4xVar, zum zumVar) {
        a4xVar.getClass();
        this.f43731a = lvmVar;
        this.b = lvmVar2;
        this.c = lpmVar;
        this.d = str;
        this.e = str2;
        this.f = a4xVar;
        this.g = zumVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z3o0)) {
            return false;
        }
        z3o0 z3o0Var = (z3o0) obj;
        return this.f43731a.equals(z3o0Var.f43731a) && this.b.equals(z3o0Var.b) && this.c.equals(z3o0Var.c) && this.d.equals(z3o0Var.d) && this.e.equals(z3o0Var.e) && Intrinsics.d(this.f, z3o0Var.f) && this.g.equals(z3o0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + cs0.b(this.f, ua80.b(ua80.b(f140.e(this.c, (this.b.hashCode() + (this.f43731a.hashCode() * 31)) * 31, 961), 31, this.d), 31, this.e), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CyberPoker(firstOpponent=");
        sb.append(this.f43731a);
        sb.append(", secondOpponent=");
        sb.append(this.b);
        sb.append(", scoreModel=");
        sb.append(this.c);
        sb.append(", infoLabel=, infoLabel2=");
        sb.append(this.d);
        sb.append(", gameLabel=");
        cs0.B(sb, this.e, ", cardOnTableList=", this.f, ", options=");
        sb.append(this.g);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
