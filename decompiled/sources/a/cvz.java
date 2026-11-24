package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class cvz implements ivz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l810 f5053a;
    public final String b;
    public final String c;
    public final wui0 d;
    public final qy e;

    public cvz(l810 l810Var, String str, String str2, wui0 wui0Var, qy qyVar) {
        str.getClass();
        str2.getClass();
        this.f5053a = l810Var;
        this.b = str;
        this.c = str2;
        this.d = wui0Var;
        this.e = qyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvz)) {
            return false;
        }
        cvz cvzVar = (cvz) obj;
        return this.f5053a.equals(cvzVar.f5053a) && Intrinsics.d(this.b, cvzVar.b) && Intrinsics.d(this.c, cvzVar.c) && this.d == cvzVar.d && Intrinsics.d(this.e, cvzVar.e);
    }

    public final int hashCode() {
        int iC = rw2.c(this.d, ua80.b(ua80.b(this.f5053a.hashCode() * 31, 31, this.b), 31, this.c), 31);
        qy qyVar = this.e;
        return iC + (qyVar == null ? 0 : qyVar.hashCode());
    }

    public final String toString() {
        return "LimitsEeMoneyLimitUiModel(limitType=" + this.f5053a + ", title=" + this.b + ", limit=" + this.c + ", position=" + this.d + ", additionalInfoUiModel=" + this.e + Separators.RPAREN;
    }
}
