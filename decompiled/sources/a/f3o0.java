package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f3o0 implements i3o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xyp f8874a;
    public final zyp b;
    public final zyp c;
    public final a4x d;
    public final azp e;

    public f3o0(xyp xypVar, zyp zypVar, zyp zypVar2, a4x a4xVar, azp azpVar) {
        a4xVar.getClass();
        this.f8874a = xypVar;
        this.b = zypVar;
        this.c = zypVar2;
        this.d = a4xVar;
        this.e = azpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f3o0)) {
            return false;
        }
        f3o0 f3o0Var = (f3o0) obj;
        return this.f8874a.equals(f3o0Var.f8874a) && this.b.equals(f3o0Var.b) && this.c.equals(f3o0Var.c) && Intrinsics.d(this.d, f3o0Var.d) && this.e.equals(f3o0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cs0.b(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.f8874a.hashCode() * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "Fighting(label=" + this.f8874a + ", firstOpponent=" + this.b + ", secondOpponent=" + this.c + ", scoreList=" + this.d + ", scoreResult=" + this.e + Separators.RPAREN;
    }
}
