package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class axm implements fxm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vyp f1629a;
    public final zyp b;
    public final zyp c;
    public final a4x d;
    public final azp e;

    public axm(vyp vypVar, zyp zypVar, zyp zypVar2, a4x a4xVar, azp azpVar) {
        a4xVar.getClass();
        this.f1629a = vypVar;
        this.b = zypVar;
        this.c = zypVar2;
        this.d = a4xVar;
        this.e = azpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axm)) {
            return false;
        }
        axm axmVar = (axm) obj;
        return this.f1629a.equals(axmVar.f1629a) && this.b.equals(axmVar.b) && this.c.equals(axmVar.c) && Intrinsics.d(this.d, axmVar.d) && this.e.equals(axmVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cs0.b(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.f1629a.f38259a.hashCode() * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "Default(label=" + this.f1629a + ", firstOpponent=" + this.b + ", secondOpponent=" + this.c + ", scoreList=" + this.d + ", scoreResult=" + this.e + Separators.RPAREN;
    }
}
