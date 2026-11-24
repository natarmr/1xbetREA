package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g5a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d280 f10709a;
    public final zfp b;

    public g5a0(d280 d280Var, zfp zfpVar) {
        this.f10709a = d280Var;
        this.b = zfpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g5a0)) {
            return false;
        }
        g5a0 g5a0Var = (g5a0) obj;
        return this.f10709a.equals(g5a0Var.f10709a) && Intrinsics.d(this.b, g5a0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.f10709a.hashCode() * 31;
        zfp zfpVar = this.b;
        return iHashCode + (zfpVar == null ? 0 : zfpVar.hashCode());
    }

    public final String toString() {
        return "PlayerLogoUiModel(playerIcon=" + this.f10709a + ", favourite=" + this.b + Separators.RPAREN;
    }
}
