package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class cxm implements fxm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xyp f5127a;
    public final zyp b;
    public final zyp c;
    public final a4x d;
    public final azp e;

    public cxm(xyp xypVar, zyp zypVar, zyp zypVar2, a4x a4xVar, azp azpVar) {
        a4xVar.getClass();
        this.f5127a = xypVar;
        this.b = zypVar;
        this.c = zypVar2;
        this.d = a4xVar;
        this.e = azpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cxm)) {
            return false;
        }
        cxm cxmVar = (cxm) obj;
        return this.f5127a.equals(cxmVar.f5127a) && this.b.equals(cxmVar.b) && this.c.equals(cxmVar.c) && Intrinsics.d(this.d, cxmVar.d) && this.e.equals(cxmVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cs0.b(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.f5127a.hashCode() * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "V2(label=" + this.f5127a + ", firstOpponent=" + this.b + ", secondOpponent=" + this.c + ", scoreList=" + this.d + ", scoreResult=" + this.e + Separators.RPAREN;
    }
}
