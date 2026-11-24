package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class bxm implements fxm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wyp f3380a;
    public final zyp b;
    public final zyp c;
    public final a4x d;
    public final azp e;

    public bxm(wyp wypVar, zyp zypVar, zyp zypVar2, a4x a4xVar, azp azpVar) {
        a4xVar.getClass();
        this.f3380a = wypVar;
        this.b = zypVar;
        this.c = zypVar2;
        this.d = a4xVar;
        this.e = azpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bxm)) {
            return false;
        }
        bxm bxmVar = (bxm) obj;
        return this.f3380a.equals(bxmVar.f3380a) && this.b.equals(bxmVar.b) && this.c.equals(bxmVar.c) && Intrinsics.d(this.d, bxmVar.d) && this.e.equals(bxmVar.e);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.e.hashCode() + cs0.b(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.f3380a.f39984a.hashCode() * 31)) * 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        return "V1(label=" + this.f3380a + ", firstOpponent=" + this.b + ", secondOpponent=" + this.c + ", scoreList=" + this.d + ", scoreResult=" + this.e + ", enableEventStatusIndicator=true)";
    }
}
