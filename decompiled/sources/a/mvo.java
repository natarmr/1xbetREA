package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class mvo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f22467a;
    public final boolean b;
    public final boolean c;
    public final kvo d;
    public final zdm0 e;
    public final nc5 f;

    public mvo(boolean z, boolean z2, boolean z3, kvo kvoVar, zdm0 zdm0Var, nc5 nc5Var) {
        this.f22467a = z;
        this.b = z2;
        this.c = z3;
        this.d = kvoVar;
        this.e = zdm0Var;
        this.f = nc5Var;
    }

    public static mvo a(mvo mvoVar, boolean z, boolean z2, boolean z3, kvo kvoVar, zdm0 zdm0Var, nc5 nc5Var, int i) {
        if ((i & 1) != 0) {
            z = mvoVar.f22467a;
        }
        boolean z4 = z;
        if ((i & 2) != 0) {
            z2 = mvoVar.b;
        }
        boolean z5 = z2;
        if ((i & 4) != 0) {
            z3 = mvoVar.c;
        }
        boolean z6 = z3;
        if ((i & 8) != 0) {
            kvoVar = mvoVar.d;
        }
        kvo kvoVar2 = kvoVar;
        if ((i & 16) != 0) {
            zdm0Var = mvoVar.e;
        }
        zdm0 zdm0Var2 = zdm0Var;
        if ((i & 32) != 0) {
            nc5Var = mvoVar.f;
        }
        mvoVar.getClass();
        return new mvo(z4, z5, z6, kvoVar2, zdm0Var2, nc5Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mvo)) {
            return false;
        }
        mvo mvoVar = (mvo) obj;
        return this.f22467a == mvoVar.f22467a && this.b == mvoVar.b && this.c == mvoVar.c && Intrinsics.d(this.d, mvoVar.d) && this.e.equals(mvoVar.e) && this.f.equals(mvoVar.f);
    }

    public final int hashCode() {
        int iE = brm0.e(brm0.e(Boolean.hashCode(this.f22467a) * 31, 31, this.b), 31, this.c);
        kvo kvoVar = this.d;
        return this.f.hashCode() + kng0.a(this.e, (iE + (kvoVar == null ? 0 : kvoVar.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("FactsStateModel(isLive=", ", isLoading=", ", hasError=", this.f22467a, this.b);
        sbQ.append(this.c);
        sbQ.append(", factsModel=");
        sbQ.append(this.d);
        sbQ.append(", statisticHeaderUiModel=");
        sbQ.append(this.e);
        sbQ.append(", backgroundHeaderModel=");
        sbQ.append(this.f);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
