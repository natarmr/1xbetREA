package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class x2o0 implements a3o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zyp f40178a;
    public final zyp b;
    public final a4x c;
    public final azp d;

    public x2o0(zyp zypVar, zyp zypVar2, a4x a4xVar, azp azpVar) {
        a4xVar.getClass();
        this.f40178a = zypVar;
        this.b = zypVar2;
        this.c = a4xVar;
        this.d = azpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2o0)) {
            return false;
        }
        x2o0 x2o0Var = (x2o0) obj;
        return this.f40178a.equals(x2o0Var.f40178a) && this.b.equals(x2o0Var.b) && Intrinsics.d(this.c, x2o0Var.c) && this.d.equals(x2o0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cs0.b(this.c, (this.b.hashCode() + (this.f40178a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "Fighting(firstOpponent=" + this.f40178a + ", secondOpponent=" + this.b + ", scoreList=" + this.c + ", scoreResult=" + this.d + Separators.RPAREN;
    }
}
