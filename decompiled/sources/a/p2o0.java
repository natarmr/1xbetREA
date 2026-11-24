package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class p2o0 implements s2o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yyp f26261a;
    public final zyp b;
    public final zyp c;
    public final a4x d;
    public final azp e;

    public p2o0(yyp yypVar, zyp zypVar, zyp zypVar2, a4x a4xVar, azp azpVar) {
        a4xVar.getClass();
        this.f26261a = yypVar;
        this.b = zypVar;
        this.c = zypVar2;
        this.d = a4xVar;
        this.e = azpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2o0)) {
            return false;
        }
        p2o0 p2o0Var = (p2o0) obj;
        return this.f26261a.equals(p2o0Var.f26261a) && this.b.equals(p2o0Var.b) && this.c.equals(p2o0Var.c) && Intrinsics.d(this.d, p2o0Var.d) && this.e.equals(p2o0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cs0.b(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.f26261a.hashCode() * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "Fighting(label=" + this.f26261a + ", firstOpponent=" + this.b + ", secondOpponent=" + this.c + ", scoreList=" + this.d + ", scoreResult=" + this.e + Separators.RPAREN;
    }
}
