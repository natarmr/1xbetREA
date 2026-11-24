package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class w370 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f38488a;
    public final boolean b;
    public final mdm c;
    public final rc50 d;
    public final zm5 e;
    public final tdt f;
    public final f3b g;
    public final long h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final kg m;
    public final boolean n;

    public w370(boolean z, boolean z2, mdm mdmVar, rc50 rc50Var, zm5 zm5Var, tdt tdtVar, f3b f3bVar, long j, boolean z3, boolean z4, boolean z5, boolean z6, kg kgVar, boolean z7) {
        kgVar.getClass();
        this.f38488a = z;
        this.b = z2;
        this.c = mdmVar;
        this.d = rc50Var;
        this.e = zm5Var;
        this.f = tdtVar;
        this.g = f3bVar;
        this.h = j;
        this.i = z3;
        this.j = z4;
        this.k = z5;
        this.l = z6;
        this.m = kgVar;
        this.n = z7;
    }

    public static w370 a(w370 w370Var, boolean z, boolean z2, mdm mdmVar, rc50 rc50Var, zm5 zm5Var, tdt tdtVar, f3b f3bVar, boolean z3, boolean z4, boolean z5, boolean z6, int i) {
        boolean z7 = (i & 1) != 0 ? w370Var.f38488a : z;
        boolean z8 = (i & 2) != 0 ? w370Var.b : z2;
        mdm mdmVar2 = (i & 4) != 0 ? w370Var.c : mdmVar;
        rc50 rc50Var2 = (i & 8) != 0 ? w370Var.d : rc50Var;
        zm5 zm5Var2 = (i & 16) != 0 ? w370Var.e : zm5Var;
        tdt tdtVar2 = (i & 32) != 0 ? w370Var.f : tdtVar;
        f3b f3bVar2 = (i & 64) != 0 ? w370Var.g : f3bVar;
        long j = (i & 128) != 0 ? w370Var.h : 0L;
        boolean z9 = (i & 256) != 0 ? w370Var.i : z3;
        boolean z10 = (i & 512) != 0 ? w370Var.j : z4;
        boolean z11 = (i & 1024) != 0 ? w370Var.k : z5;
        boolean z12 = (i & 2048) != 0 ? w370Var.l : z6;
        kg kgVar = w370Var.m;
        boolean z13 = w370Var.n;
        w370Var.getClass();
        kgVar.getClass();
        return new w370(z7, z8, mdmVar2, rc50Var2, zm5Var2, tdtVar2, f3bVar2, j, z9, z10, z11, z12, kgVar, z13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w370)) {
            return false;
        }
        w370 w370Var = (w370) obj;
        return this.f38488a == w370Var.f38488a && this.b == w370Var.b && Intrinsics.d(this.c, w370Var.c) && this.d.equals(w370Var.d) && this.e.equals(w370Var.e) && this.f.equals(w370Var.f) && this.g.equals(w370Var.g) && this.h == w370Var.h && this.i == w370Var.i && this.j == w370Var.j && this.k == w370Var.k && this.l == w370Var.l && this.m == w370Var.m && this.n == w370Var.n;
    }

    public final int hashCode() {
        int iE = brm0.e(Boolean.hashCode(this.f38488a) * 31, 31, this.b);
        mdm mdmVar = this.c;
        return Boolean.hashCode(this.n) + ((this.m.hashCode() + brm0.e(brm0.e(brm0.e(brm0.e(rw2.b((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((iE + (mdmVar == null ? 0 : mdmVar.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("OneXGamesStateModel(isLoadingContent=", ", underMaintenance=", ", lottieConfig=", this.f38488a, this.b);
        sbQ.append(this.c);
        sbQ.append(", navigationBarState=");
        sbQ.append(this.d);
        sbQ.append(", balanceState=");
        sbQ.append(this.e);
        sbQ.append(", gamesState=");
        sbQ.append(this.f);
        sbQ.append(", categoriesState=");
        sbQ.append(this.g);
        sbQ.append(", gameIdToOpen=");
        sbQ.append(this.h);
        w6x.A(", isConnected=", ", previousConnected=", sbQ, this.i, this.j);
        w6x.A(", contentLoaded=", ", isAuthorized=", sbQ, this.k, this.l);
        sbQ.append(", accountSelectionStyle=");
        sbQ.append(this.m);
        sbQ.append(", showFavoriteIcon=");
        sbQ.append(this.n);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
