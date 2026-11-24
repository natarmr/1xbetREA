package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h2o0 implements k2o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vyp f12344a;
    public final zyp b;
    public final zyp c;
    public final a4x d;
    public final azp e;

    public h2o0(vyp vypVar, zyp zypVar, zyp zypVar2, a4x a4xVar, azp azpVar) {
        a4xVar.getClass();
        this.f12344a = vypVar;
        this.b = zypVar;
        this.c = zypVar2;
        this.d = a4xVar;
        this.e = azpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2o0)) {
            return false;
        }
        h2o0 h2o0Var = (h2o0) obj;
        return this.f12344a.equals(h2o0Var.f12344a) && this.b.equals(h2o0Var.b) && this.c.equals(h2o0Var.c) && Intrinsics.d(this.d, h2o0Var.d) && this.e.equals(h2o0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cs0.b(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.f12344a.f38259a.hashCode() * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "Fighting(label=" + this.f12344a + ", firstOpponent=" + this.b + ", secondOpponent=" + this.c + ", scoreList=" + this.d + ", scoreResult=" + this.e + Separators.RPAREN;
    }
}
