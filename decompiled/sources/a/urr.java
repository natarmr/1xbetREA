package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class urr implements asr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vqr f36178a;
    public final vdp0 b;
    public final vdp0 c;
    public final mpm d;
    public final j83 e;
    public final nqr f;

    public urr(vqr vqrVar, vdp0 vdp0Var, vdp0 vdp0Var2, mpm mpmVar, j83 j83Var, nqr nqrVar) {
        this.f36178a = vqrVar;
        this.b = vdp0Var;
        this.c = vdp0Var2;
        this.d = mpmVar;
        this.e = j83Var;
        this.f = nqrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof urr)) {
            return false;
        }
        urr urrVar = (urr) obj;
        return this.f36178a.equals(urrVar.f36178a) && this.b.equals(urrVar.b) && this.c.equals(urrVar.c) && this.d.equals(urrVar.d) && this.e.equals(urrVar.e) && Intrinsics.d(this.f, urrVar.f);
    }

    public final int hashCode() {
        int iF = brm0.f(this.e, ohs0.e(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.f36178a.hashCode() * 31)) * 31)) * 31, 31), 31);
        nqr nqrVar = this.f;
        return iF + (nqrVar == null ? 0 : nqrVar.hashCode());
    }

    public final String toString() {
        return "SimpleScore(labels=" + this.f36178a + ", teamOne=" + this.b + ", teamTwo=" + this.c + ", score=" + this.d + ", bottomInfo=" + ((Object) this.e) + ", additionalInfo=" + this.f + Separators.RPAREN;
    }
}
