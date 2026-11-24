package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class u2o0 implements a3o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jvm f34956a;
    public final jvm b;
    public final y1m c;
    public final String d;
    public final a4x e;

    public u2o0(jvm jvmVar, jvm jvmVar2, y1m y1mVar, String str, a4x a4xVar) {
        a4xVar.getClass();
        this.f34956a = jvmVar;
        this.b = jvmVar2;
        this.c = y1mVar;
        this.d = str;
        this.e = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2o0)) {
            return false;
        }
        u2o0 u2o0Var = (u2o0) obj;
        return this.f34956a.equals(u2o0Var.f34956a) && this.b.equals(u2o0Var.b) && this.c.equals(u2o0Var.c) && this.d.equals(u2o0Var.d) && Intrinsics.d(this.e, u2o0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b((this.c.hashCode() + ((this.b.hashCode() + (this.f34956a.hashCode() * 31)) * 31)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CyberPoker(firstOpponent=");
        sb.append(this.f34956a);
        sb.append(", secondOpponent=");
        sb.append(this.b);
        sb.append(", scoreModel=");
        sb.append(this.c);
        sb.append(", gameLabel=");
        sb.append(this.d);
        sb.append(", cardOnTableList=");
        return cs0.n(sb, this.e, Separators.RPAREN);
    }
}
