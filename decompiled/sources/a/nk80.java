package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class nk80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mk80 f23670a;
    public final mdm b;

    public nk80(mk80 mk80Var, mdm mdmVar) {
        this.f23670a = mk80Var;
        this.b = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nk80)) {
            return false;
        }
        nk80 nk80Var = (nk80) obj;
        return this.f23670a == nk80Var.f23670a && Intrinsics.d(this.b, nk80Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.f23670a.hashCode() * 31;
        mdm mdmVar = this.b;
        return iHashCode + (mdmVar == null ? 0 : mdmVar.hashCode());
    }

    public final String toString() {
        return "PagerLottieModel(lottieErrorType=" + this.f23670a + ", lottieConfig=" + this.b + Separators.RPAREN;
    }
}
