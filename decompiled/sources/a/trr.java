package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class trr implements zrr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uqr f34431a;
    public final wdp0 b;
    public final wdp0 c;
    public final mpm d;
    public final j83 e;
    public final mqr f;

    public trr(uqr uqrVar, wdp0 wdp0Var, wdp0 wdp0Var2, mpm mpmVar, j83 j83Var, mqr mqrVar) {
        this.f34431a = uqrVar;
        this.b = wdp0Var;
        this.c = wdp0Var2;
        this.d = mpmVar;
        this.e = j83Var;
        this.f = mqrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof trr)) {
            return false;
        }
        trr trrVar = (trr) obj;
        return this.f34431a.equals(trrVar.f34431a) && this.b.equals(trrVar.b) && this.c.equals(trrVar.c) && this.d.equals(trrVar.d) && this.e.equals(trrVar.e) && Intrinsics.d(this.f, trrVar.f);
    }

    public final int hashCode() {
        int iF = brm0.f(this.e, ohs0.e(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.f34431a.hashCode() * 31)) * 31)) * 31, 31), 31);
        mqr mqrVar = this.f;
        return iF + (mqrVar == null ? 0 : mqrVar.hashCode());
    }

    public final String toString() {
        return "SimpleScore(labels=" + this.f34431a + ", teamOne=" + this.b + ", teamTwo=" + this.c + ", score=" + this.d + ", bottomInfo=" + ((Object) this.e) + ", additionalInfo=" + this.f + Separators.RPAREN;
    }
}
