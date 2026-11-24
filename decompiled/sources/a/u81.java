package a;

import android.gov.nist.core.Separators;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class u81 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mlr f35213a;
    public final f02 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final String h;
    public final long i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final ql5 m;
    public final sff0 n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final int r;
    public final boolean s;
    public final ax0 t;
    public final Set u;

    public u81(mlr mlrVar, f02 f02Var, boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, long j, boolean z5, boolean z6, boolean z7, ql5 ql5Var, sff0 sff0Var, boolean z8, boolean z9, boolean z10, int i, boolean z11, ax0 ax0Var, Set set) {
        str2.getClass();
        this.f35213a = mlrVar;
        this.b = f02Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = str;
        this.h = str2;
        this.i = j;
        this.j = z5;
        this.k = z6;
        this.l = z7;
        this.m = ql5Var;
        this.n = sff0Var;
        this.o = z8;
        this.p = z9;
        this.q = z10;
        this.r = i;
        this.s = z11;
        this.t = ax0Var;
        this.u = set;
    }

    public static u81 a(u81 u81Var, f02 f02Var, boolean z, boolean z2, boolean z3, String str, String str2, long j, boolean z4, boolean z5, ql5 ql5Var, boolean z6, boolean z7, boolean z8, int i, ax0 ax0Var, int i2) {
        mlr mlrVar = u81Var.f35213a;
        f02 f02Var2 = (i2 & 2) != 0 ? u81Var.b : f02Var;
        boolean z9 = u81Var.c;
        boolean z10 = (i2 & 8) != 0 ? u81Var.d : z;
        boolean z11 = (i2 & 16) != 0 ? u81Var.e : z2;
        boolean z12 = (i2 & 32) != 0 ? u81Var.f : z3;
        String str3 = (i2 & 64) != 0 ? u81Var.g : str;
        String str4 = (i2 & 128) != 0 ? u81Var.h : str2;
        long j2 = (i2 & 256) != 0 ? u81Var.i : j;
        boolean z13 = u81Var.j;
        boolean z14 = (i2 & 1024) != 0 ? u81Var.k : z4;
        boolean z15 = (i2 & 2048) != 0 ? u81Var.l : z5;
        ql5 ql5Var2 = (i2 & 4096) != 0 ? u81Var.m : ql5Var;
        sff0 sff0Var = u81Var.n;
        boolean z16 = (i2 & 16384) != 0 ? u81Var.o : z6;
        boolean z17 = (i2 & 32768) != 0 ? u81Var.p : z7;
        boolean z18 = (i2 & 65536) != 0 ? u81Var.q : z8;
        int i3 = (i2 & 131072) != 0 ? u81Var.r : i;
        boolean z19 = (i2 & 262144) != 0 ? u81Var.s : false;
        ax0 ax0Var2 = (i2 & 524288) != 0 ? u81Var.t : ax0Var;
        Set set = u81Var.u;
        u81Var.getClass();
        str3.getClass();
        str4.getClass();
        ax0Var2.getClass();
        return new u81(mlrVar, f02Var2, z9, z10, z11, z12, str3, str4, j2, z13, z14, z15, ql5Var2, sff0Var, z16, z17, z18, i3, z19, ax0Var2, set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u81)) {
            return false;
        }
        u81 u81Var = (u81) obj;
        return this.f35213a.equals(u81Var.f35213a) && Intrinsics.d(this.b, u81Var.b) && this.c == u81Var.c && this.d == u81Var.d && this.e == u81Var.e && this.f == u81Var.f && this.g.equals(u81Var.g) && Intrinsics.d(this.h, u81Var.h) && this.i == u81Var.i && this.j == u81Var.j && this.k == u81Var.k && this.l == u81Var.l && Intrinsics.d(this.m, u81Var.m) && this.n.equals(u81Var.n) && this.o == u81Var.o && this.p == u81Var.p && this.q == u81Var.q && this.r == u81Var.r && this.s == u81Var.s && this.t.equals(u81Var.t) && this.u.equals(u81Var.u);
    }

    public final int hashCode() {
        int iHashCode = this.f35213a.hashCode() * 31;
        f02 f02Var = this.b;
        int iE = brm0.e(brm0.e(brm0.e(rw2.b(ua80.b(ua80.b(brm0.e(brm0.e(brm0.e(brm0.e((iHashCode + (f02Var == null ? 0 : f02Var.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l);
        ql5 ql5Var = this.m;
        return this.u.hashCode() + ((this.t.hashCode() + brm0.e(twn.a(this.r, brm0.e(brm0.e(brm0.e(cs0.c(this.n, (iE + (ql5Var != null ? ql5Var.hashCode() : 0)) * 31, 31), 31, this.o), 31, this.p), 31, this.q), 31), 31, this.s)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AggregatorMultiModeGameStateModel(game=");
        sb.append(this.f35213a);
        sb.append(", webGameResult=");
        sb.append(this.b);
        sb.append(", fromMainScreen=");
        ua80.u(", isDemo=", ", isLoading=", sb, this.c, this.d);
        ua80.u(", isFavorite=", ", gameUrl=", sb, this.e, this.f);
        f140.v(sb, this.g, ", lobbyUrl=", this.h, ", balanceId=");
        hne.t(this.i, ", debugAllowed=", sb, this.j);
        w6x.A(", isFullScreen=", ", isAuth=", sb, this.k, this.l);
        sb.append(", balanceModel=");
        sb.append(this.m);
        sb.append(", remoteConfigModel=");
        sb.append(this.n);
        w6x.A(", isAlreadyShownUnknownError=", ", disabledHandleAction=", sb, this.o, this.p);
        cs0.v(this.r, ", changeGameModeAfterPayment=", ", playForRealTimeout=", sb, this.q);
        sb.append(", taxInfoVisible=");
        sb.append(this.s);
        sb.append(", aggregatorGameWebViewState=");
        sb.append(this.t);
        sb.append(", currentLimitedListeners=");
        sb.append(this.u);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
