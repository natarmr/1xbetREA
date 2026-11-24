package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e2o0 implements k2o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gvm f7096a;
    public final gvm b;
    public final kpm c;
    public final String d;
    public final String e;
    public final a4x f;
    public final zum g;

    public e2o0(gvm gvmVar, gvm gvmVar2, kpm kpmVar, String str, String str2, a4x a4xVar, zum zumVar) {
        str.getClass();
        a4xVar.getClass();
        this.f7096a = gvmVar;
        this.b = gvmVar2;
        this.c = kpmVar;
        this.d = str;
        this.e = str2;
        this.f = a4xVar;
        this.g = zumVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2o0)) {
            return false;
        }
        e2o0 e2o0Var = (e2o0) obj;
        return this.f7096a.equals(e2o0Var.f7096a) && this.b.equals(e2o0Var.b) && this.c.equals(e2o0Var.c) && Intrinsics.d(this.d, e2o0Var.d) && this.e.equals(e2o0Var.e) && Intrinsics.d(this.f, e2o0Var.f) && this.g.equals(e2o0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + cs0.b(this.f, ua80.b(ua80.b(dw9.c(this.c, (this.b.hashCode() + (this.f7096a.hashCode() * 31)) * 31, 31), 961, this.d), 31, this.e), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CyberPoker(firstOpponent=");
        sb.append(this.f7096a);
        sb.append(", secondOpponent=");
        sb.append(this.b);
        sb.append(", scoreModel=");
        sb.append(this.c);
        sb.append(", infoLabel=");
        sb.append(this.d);
        sb.append(", infoLabel2=, gameLabel=");
        cs0.B(sb, this.e, ", cardOnTableList=", this.f, ", options=");
        sb.append(this.g);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
