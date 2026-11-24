package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class qx60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sc50 f29466a;
    public final gep b;
    public final cfp c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final kg g;
    public final Throwable h;

    public qx60(sc50 sc50Var, gep gepVar, cfp cfpVar, boolean z, boolean z2, boolean z3, kg kgVar, Throwable th) {
        this.f29466a = sc50Var;
        this.b = gepVar;
        this.c = cfpVar;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = kgVar;
        this.h = th;
    }

    public static qx60 a(qx60 qx60Var, gep gepVar, cfp cfpVar, boolean z, boolean z2, boolean z3, Throwable th, int i) {
        sc50 sc50Var = qx60Var.f29466a;
        if ((i & 2) != 0) {
            gepVar = qx60Var.b;
        }
        gep gepVar2 = gepVar;
        if ((i & 4) != 0) {
            cfpVar = qx60Var.c;
        }
        cfp cfpVar2 = cfpVar;
        if ((i & 8) != 0) {
            z = qx60Var.d;
        }
        boolean z4 = z;
        if ((i & 16) != 0) {
            z2 = qx60Var.e;
        }
        boolean z5 = z2;
        if ((i & 32) != 0) {
            z3 = qx60Var.f;
        }
        boolean z6 = z3;
        kg kgVar = qx60Var.g;
        Throwable th2 = (i & 128) != 0 ? qx60Var.h : th;
        qx60Var.getClass();
        return new qx60(sc50Var, gepVar2, cfpVar2, z4, z5, z6, kgVar, th2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qx60)) {
            return false;
        }
        qx60 qx60Var = (qx60) obj;
        return this.f29466a.equals(qx60Var.f29466a) && this.b.equals(qx60Var.b) && this.c.equals(qx60Var.c) && this.d == qx60Var.d && this.e == qx60Var.e && this.f == qx60Var.f && this.g == qx60Var.g && Intrinsics.d(this.h, qx60Var.h);
    }

    public final int hashCode() {
        int iHashCode = (this.g.hashCode() + brm0.e(brm0.e(brm0.e((this.c.hashCode() + ((this.b.hashCode() + (this.f29466a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f)) * 31;
        Throwable th = this.h;
        return iHashCode + (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OneXGamesFavoritesState(navigationBarState=");
        sb.append(this.f29466a);
        sb.append(", balanceState=");
        sb.append(this.b);
        sb.append(", gamesState=");
        sb.append(this.c);
        sb.append(", isConnected=");
        sb.append(this.d);
        sb.append(", previousConnected=");
        ua80.u(", isAuthorized=", ", accountSelectionStyle=", sb, this.e, this.f);
        sb.append(this.g);
        sb.append(", error=");
        sb.append(this.h);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
