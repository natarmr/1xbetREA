package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ftr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tjr0 f10129a;
    public final ua20 b;
    public final zvh0 c;
    public final vsr0 d;
    public final rm5 e;
    public final pur0 f;
    public final boolean g;
    public final jur0 h;

    public ftr0(tjr0 tjr0Var, ua20 ua20Var, zvh0 zvh0Var, vsr0 vsr0Var, rm5 rm5Var, pur0 pur0Var, boolean z, jur0 jur0Var) {
        this.f10129a = tjr0Var;
        this.b = ua20Var;
        this.c = zvh0Var;
        this.d = vsr0Var;
        this.e = rm5Var;
        this.f = pur0Var;
        this.g = z;
        this.h = jur0Var;
    }

    public static ftr0 a(ftr0 ftr0Var, vsr0 vsr0Var, rm5 rm5Var, pur0 pur0Var, boolean z, jur0 jur0Var, int i) {
        tjr0 tjr0Var = ftr0Var.f10129a;
        ua20 ua20Var = ftr0Var.b;
        zvh0 zvh0Var = ftr0Var.c;
        if ((i & 8) != 0) {
            vsr0Var = ftr0Var.d;
        }
        vsr0 vsr0Var2 = vsr0Var;
        if ((i & 16) != 0) {
            rm5Var = ftr0Var.e;
        }
        rm5 rm5Var2 = rm5Var;
        if ((i & 32) != 0) {
            pur0Var = ftr0Var.f;
        }
        pur0 pur0Var2 = pur0Var;
        if ((i & 64) != 0) {
            z = ftr0Var.g;
        }
        boolean z2 = z;
        if ((i & 128) != 0) {
            jur0Var = ftr0Var.h;
        }
        ftr0Var.getClass();
        return new ftr0(tjr0Var, ua20Var, zvh0Var, vsr0Var2, rm5Var2, pur0Var2, z2, jur0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ftr0)) {
            return false;
        }
        ftr0 ftr0Var = (ftr0) obj;
        return this.f10129a.equals(ftr0Var.f10129a) && this.b == ftr0Var.b && this.c == ftr0Var.c && this.d == ftr0Var.d && this.e.equals(ftr0Var.e) && this.f.equals(ftr0Var.f) && this.g == ftr0Var.g && Intrinsics.d(this.h, ftr0Var.h);
    }

    public final int hashCode() {
        int iE = brm0.e((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f10129a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.g);
        jur0 jur0Var = this.h;
        return iE + (jur0Var == null ? 0 : jur0Var.hashCode());
    }

    public final String toString() {
        return "TotoMakeBetState(betGameInfoState=" + this.f10129a + ", makeBetStyle=" + this.b + ", segmentControlStyleModel=" + this.c + ", selectedMakeBetPageType=" + this.d + ", balanceState=" + this.e + ", simpleBetPageState=" + this.f + ", needBetLimitsUpdate=" + this.g + ", promoBetPageState=" + this.h + Separators.RPAREN;
    }
}
