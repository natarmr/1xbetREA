package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ftz implements vtz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final trz f10139a;
    public final String b;
    public final String c;
    public final wui0 d;
    public final py e;

    public ftz(trz trzVar, String str, String str2, wui0 wui0Var, py pyVar) {
        str.getClass();
        str2.getClass();
        this.f10139a = trzVar;
        this.b = str;
        this.c = str2;
        this.d = wui0Var;
        this.e = pyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ftz)) {
            return false;
        }
        ftz ftzVar = (ftz) obj;
        return this.f10139a.equals(ftzVar.f10139a) && Intrinsics.d(this.b, ftzVar.b) && Intrinsics.d(this.c, ftzVar.c) && this.d == ftzVar.d && Intrinsics.d(this.e, ftzVar.e);
    }

    public final int hashCode() {
        int iC = rw2.c(this.d, ua80.b(ua80.b(this.f10139a.hashCode() * 31, 31, this.b), 31, this.c), 31);
        py pyVar = this.e;
        return iC + (pyVar == null ? 0 : pyVar.hashCode());
    }

    public final String toString() {
        return "LimitsAfricaMoneyLimitUiModel(limitType=" + this.f10139a + ", title=" + this.b + ", limit=" + this.c + ", position=" + this.d + ", additionalInfoUiModel=" + this.e + Separators.RPAREN;
    }
}
