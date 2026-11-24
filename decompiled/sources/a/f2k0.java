package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f2k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ql5 f8816a;
    public final ik5 b;
    public final zgs0 c;
    public final ui5 d;
    public final boolean e;
    public final int f;
    public final sff0 g;
    public final v8d h;

    public f2k0(ql5 ql5Var, ik5 ik5Var, zgs0 zgs0Var, ui5 ui5Var, boolean z, int i, sff0 sff0Var, v8d v8dVar) {
        v8dVar.getClass();
        this.f8816a = ql5Var;
        this.b = ik5Var;
        this.c = zgs0Var;
        this.d = ui5Var;
        this.e = z;
        this.f = i;
        this.g = sff0Var;
        this.h = v8dVar;
    }

    public static f2k0 a(f2k0 f2k0Var, ql5 ql5Var, ik5 ik5Var, zgs0 zgs0Var, ui5 ui5Var, boolean z, int i, int i2) {
        if ((i2 & 1) != 0) {
            ql5Var = f2k0Var.f8816a;
        }
        ql5 ql5Var2 = ql5Var;
        if ((i2 & 2) != 0) {
            ik5Var = f2k0Var.b;
        }
        ik5 ik5Var2 = ik5Var;
        if ((i2 & 4) != 0) {
            zgs0Var = f2k0Var.c;
        }
        zgs0 zgs0Var2 = zgs0Var;
        if ((i2 & 8) != 0) {
            ui5Var = f2k0Var.d;
        }
        ui5 ui5Var2 = ui5Var;
        if ((i2 & 16) != 0) {
            z = f2k0Var.e;
        }
        boolean z2 = z;
        int i3 = (i2 & 32) != 0 ? f2k0Var.f : i;
        sff0 sff0Var = f2k0Var.g;
        v8d v8dVar = f2k0Var.h;
        f2k0Var.getClass();
        v8dVar.getClass();
        return new f2k0(ql5Var2, ik5Var2, zgs0Var2, ui5Var2, z2, i3, sff0Var, v8dVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f2k0)) {
            return false;
        }
        f2k0 f2k0Var = (f2k0) obj;
        return Intrinsics.d(this.f8816a, f2k0Var.f8816a) && Intrinsics.d(this.b, f2k0Var.b) && this.c.equals(f2k0Var.c) && this.d == f2k0Var.d && this.e == f2k0Var.e && this.f == f2k0Var.f && this.g.equals(f2k0Var.g) && Intrinsics.d(this.h, f2k0Var.h);
    }

    public final int hashCode() {
        ql5 ql5Var = this.f8816a;
        int iHashCode = (ql5Var == null ? 0 : ql5Var.hashCode()) * 31;
        ik5 ik5Var = this.b;
        return this.h.hashCode() + cs0.c(this.g, twn.a(this.f, brm0.e((this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (ik5Var != null ? ik5Var.hashCode() : 0)) * 31)) * 31)) * 31, 31, this.e), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SinglePageBalanceManagementState(balanceModel=");
        sb.append(this.f8816a);
        sb.append(", profileInfoModel=");
        sb.append(this.b);
        sb.append(", transactionsHistoryPagingState=");
        sb.append(this.c);
        sb.append(", initialDataLoadingState=");
        sb.append(this.d);
        sb.append(", showPullToRefresh=");
        ua80.q(this.f, ", prefetchDistance=", ", remoteConfigModel=", sb, this.e);
        sb.append(this.g);
        sb.append(", commonConfig=");
        sb.append(this.h);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
