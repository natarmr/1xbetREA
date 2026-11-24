package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class zxq0 implements f0r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2r0 f45174a;
    public final j1r0 b;
    public final uhc0 c;

    public zxq0(f2r0 f2r0Var, j1r0 j1r0Var, uhc0 uhc0Var) {
        this.f45174a = f2r0Var;
        this.b = j1r0Var;
        this.c = uhc0Var;
    }

    public static zxq0 b(zxq0 zxq0Var, j1r0 j1r0Var, uhc0 uhc0Var, int i) {
        f2r0 f2r0Var = zxq0Var.f45174a;
        if ((i & 4) != 0) {
            uhc0Var = zxq0Var.c;
        }
        j1r0Var.getClass();
        return new zxq0(f2r0Var, j1r0Var, uhc0Var);
    }

    @Override // a.f0r0
    public final j1r0 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zxq0)) {
            return false;
        }
        zxq0 zxq0Var = (zxq0) obj;
        return this.f45174a.equals(zxq0Var.f45174a) && this.b.equals(zxq0Var.b) && Intrinsics.d(this.c, zxq0Var.c);
    }

    public final int hashCode() {
        int iH = brm0.h(this.b, this.f45174a.hashCode() * 31, 31);
        uhc0 uhc0Var = this.c;
        return iH + (uhc0Var == null ? 0 : uhc0Var.hashCode());
    }

    public final String toString() {
        StringBuilder sbS = brm0.s("TopAggregatorMonthProviderState(contentType=", this.f45174a, ", contentStatus=", this.b, ", content=");
        sbS.append(this.c);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
