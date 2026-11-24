package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class dxm implements fxm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zyp f6853a;
    public final zyp b;
    public final a4x c;
    public final azp d;

    public dxm(zyp zypVar, zyp zypVar2, a4x a4xVar, azp azpVar) {
        a4xVar.getClass();
        this.f6853a = zypVar;
        this.b = zypVar2;
        this.c = a4xVar;
        this.d = azpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxm)) {
            return false;
        }
        dxm dxmVar = (dxm) obj;
        return this.f6853a.equals(dxmVar.f6853a) && this.b.equals(dxmVar.b) && Intrinsics.d(this.c, dxmVar.c) && this.d.equals(dxmVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cs0.b(this.c, (this.b.hashCode() + (this.f6853a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "V3(firstOpponent=" + this.f6853a + ", secondOpponent=" + this.b + ", scoreList=" + this.c + ", scoreResult=" + this.d + Separators.RPAREN;
    }
}
