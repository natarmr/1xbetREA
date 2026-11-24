package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class fa70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9194a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public fa70(boolean z, boolean z2, boolean z3, boolean z4, long j, boolean z5, boolean z6, boolean z7) {
        this.f9194a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = j;
        this.f = z5;
        this.g = z6;
        this.h = z7;
    }

    public static fa70 a(fa70 fa70Var, boolean z, boolean z2, boolean z3, boolean z4, long j, boolean z5, boolean z6, boolean z7, int i) {
        if ((i & 1) != 0) {
            z = fa70Var.f9194a;
        }
        boolean z8 = z;
        if ((i & 2) != 0) {
            z2 = fa70Var.b;
        }
        boolean z9 = z2;
        if ((i & 4) != 0) {
            z3 = fa70Var.c;
        }
        boolean z10 = z3;
        if ((i & 8) != 0) {
            z4 = fa70Var.d;
        }
        return new fa70(z8, z9, z10, z4, (i & 16) != 0 ? fa70Var.e : j, (i & 32) != 0 ? fa70Var.f : z5, (i & 64) != 0 ? fa70Var.g : z6, (i & 128) != 0 ? fa70Var.h : z7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fa70)) {
            return false;
        }
        fa70 fa70Var = (fa70) obj;
        return this.f9194a == fa70Var.f9194a && this.b == fa70Var.b && this.c == fa70Var.c && this.d == fa70Var.d && this.e == fa70Var.e && this.f == fa70Var.f && this.g == fa70Var.g && this.h == fa70Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + brm0.e(brm0.e(rw2.b(brm0.e(brm0.e(brm0.e(Boolean.hashCode(this.f9194a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("OneXGamesWebGameGameState(fullScreen=", ", gameInitialized=", ", gameLoaded=", this.f9194a, this.b);
        ua80.u(", gameStarted=", ", gameId=", sbQ, this.c, this.d);
        hne.t(this.e, ", promoGame=", sbQ, this.f);
        w6x.A(", firstGameStateHandle=", ", unfinishedGame=", sbQ, this.g, this.h);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
