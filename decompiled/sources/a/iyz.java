package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class iyz implements tyz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vrz f15610a;
    public final String b;
    public final String c;
    public final wui0 d;
    public final ry e;

    public iyz(vrz vrzVar, String str, String str2, wui0 wui0Var, ry ryVar) {
        str.getClass();
        str2.getClass();
        this.f15610a = vrzVar;
        this.b = str;
        this.c = str2;
        this.d = wui0Var;
        this.e = ryVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iyz)) {
            return false;
        }
        iyz iyzVar = (iyz) obj;
        return this.f15610a.equals(iyzVar.f15610a) && Intrinsics.d(this.b, iyzVar.b) && Intrinsics.d(this.c, iyzVar.c) && this.d == iyzVar.d && Intrinsics.d(this.e, iyzVar.e);
    }

    public final int hashCode() {
        int iC = rw2.c(this.d, ua80.b(ua80.b(this.f15610a.hashCode() * 31, 31, this.b), 31, this.c), 31);
        ry ryVar = this.e;
        return iC + (ryVar == null ? 0 : ryVar.hashCode());
    }

    public final String toString() {
        return "LimitsKenyaMoneyLimitUiModel(limitType=" + this.f15610a + ", title=" + this.b + ", limit=" + this.c + ", position=" + this.d + ", additionalInfoUiModel=" + this.e + Separators.RPAREN;
    }
}
