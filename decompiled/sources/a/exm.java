package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class exm implements fxm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yyp f8585a;
    public final zyp b;
    public final zyp c;
    public final a4x d;
    public final azp e;

    public exm(yyp yypVar, zyp zypVar, zyp zypVar2, a4x a4xVar, azp azpVar) {
        a4xVar.getClass();
        this.f8585a = yypVar;
        this.b = zypVar;
        this.c = zypVar2;
        this.d = a4xVar;
        this.e = azpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof exm)) {
            return false;
        }
        exm exmVar = (exm) obj;
        return this.f8585a.equals(exmVar.f8585a) && this.b.equals(exmVar.b) && this.c.equals(exmVar.c) && Intrinsics.d(this.d, exmVar.d) && this.e.equals(exmVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cs0.b(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.f8585a.hashCode() * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "V4(label=" + this.f8585a + ", firstOpponent=" + this.b + ", secondOpponent=" + this.c + ", scoreList=" + this.d + ", scoreResult=" + this.e + Separators.RPAREN;
    }
}
