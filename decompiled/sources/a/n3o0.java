package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n3o0 implements q3o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wyp f22860a;
    public final zyp b;
    public final zyp c;
    public final a4x d;
    public final azp e;

    public n3o0(wyp wypVar, zyp zypVar, zyp zypVar2, a4x a4xVar, azp azpVar) {
        a4xVar.getClass();
        this.f22860a = wypVar;
        this.b = zypVar;
        this.c = zypVar2;
        this.d = a4xVar;
        this.e = azpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3o0)) {
            return false;
        }
        n3o0 n3o0Var = (n3o0) obj;
        return this.f22860a.equals(n3o0Var.f22860a) && this.b.equals(n3o0Var.b) && this.c.equals(n3o0Var.c) && Intrinsics.d(this.d, n3o0Var.d) && this.e.equals(n3o0Var.e);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.e.hashCode() + cs0.b(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.f22860a.f39984a.hashCode() * 31)) * 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        return "Fighting(label=" + this.f22860a + ", firstOpponent=" + this.b + ", secondOpponent=" + this.c + ", scoreList=" + this.d + ", scoreResult=" + this.e + ", enableEventStatusIndicator=true)";
    }
}
