package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class xb70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uaq0 f40588a;
    public final String b;
    public final c5v0 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final x870 i;
    public final boolean j;
    public final boolean k;
    public final int l;
    public final boolean m;
    public final fa70 n;
    public final f970 o;
    public final c970 p;
    public final z870 q;

    public xb70(uaq0 uaq0Var, String str, c5v0 c5v0Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, x870 x870Var, boolean z6, boolean z7, int i, boolean z8, fa70 fa70Var, f970 f970Var, c970 c970Var, z870 z870Var) {
        this.f40588a = uaq0Var;
        this.b = str;
        this.c = c5v0Var;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = x870Var;
        this.j = z6;
        this.k = z7;
        this.l = i;
        this.m = z8;
        this.n = fa70Var;
        this.o = f970Var;
        this.p = c970Var;
        this.q = z870Var;
    }

    public static xb70 a(xb70 xb70Var, uaq0 uaq0Var, String str, c5v0 c5v0Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, x870 x870Var, boolean z6, boolean z7, int i, boolean z8, fa70 fa70Var, f970 f970Var, c970 c970Var, z870 z870Var, int i2) {
        uaq0 uaq0Var2 = (i2 & 1) != 0 ? xb70Var.f40588a : uaq0Var;
        String str2 = (i2 & 2) != 0 ? xb70Var.b : str;
        c5v0 c5v0Var2 = (i2 & 4) != 0 ? xb70Var.c : c5v0Var;
        boolean z9 = (i2 & 8) != 0 ? xb70Var.d : z;
        boolean z10 = (i2 & 16) != 0 ? xb70Var.e : z2;
        boolean z11 = (i2 & 32) != 0 ? xb70Var.f : z3;
        boolean z12 = (i2 & 64) != 0 ? xb70Var.g : z4;
        boolean z13 = (i2 & 128) != 0 ? xb70Var.h : z5;
        x870 x870Var2 = (i2 & 256) != 0 ? xb70Var.i : x870Var;
        boolean z14 = (i2 & 512) != 0 ? xb70Var.j : z6;
        boolean z15 = (i2 & 1024) != 0 ? xb70Var.k : z7;
        int i3 = (i2 & 2048) != 0 ? xb70Var.l : i;
        boolean z16 = (i2 & 4096) != 0 ? xb70Var.m : z8;
        fa70 fa70Var2 = (i2 & 8192) != 0 ? xb70Var.n : fa70Var;
        uaq0 uaq0Var3 = uaq0Var2;
        f970 f970Var2 = (i2 & 16384) != 0 ? xb70Var.o : f970Var;
        c970 c970Var2 = (i2 & 32768) != 0 ? xb70Var.p : c970Var;
        z870 z870Var2 = (i2 & 65536) != 0 ? xb70Var.q : z870Var;
        xb70Var.getClass();
        uaq0Var3.getClass();
        return new xb70(uaq0Var3, str2, c5v0Var2, z9, z10, z11, z12, z13, x870Var2, z14, z15, i3, z16, fa70Var2, f970Var2, c970Var2, z870Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xb70)) {
            return false;
        }
        xb70 xb70Var = (xb70) obj;
        return this.f40588a == xb70Var.f40588a && this.b.equals(xb70Var.b) && Intrinsics.d(this.c, xb70Var.c) && this.d == xb70Var.d && this.e == xb70Var.e && this.f == xb70Var.f && this.g == xb70Var.g && this.h == xb70Var.h && this.i == xb70Var.i && this.j == xb70Var.j && this.k == xb70Var.k && this.l == xb70Var.l && this.m == xb70Var.m && this.n.equals(xb70Var.n) && this.o.equals(xb70Var.o) && this.p.equals(xb70Var.p) && this.q.equals(xb70Var.q);
    }

    public final int hashCode() {
        int iB = ua80.b(this.f40588a.hashCode() * 31, 31, this.b);
        c5v0 c5v0Var = this.c;
        return this.q.hashCode() + ((this.p.hashCode() + ((this.o.hashCode() + ((this.n.hashCode() + brm0.e(twn.a(this.l, brm0.e(brm0.e((this.i.hashCode() + brm0.e(brm0.e(brm0.e(brm0.e(brm0.e((iB + (c5v0Var == null ? 0 : c5v0Var.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h)) * 31, 31, this.j), 31, this.k), 31), 31, this.m)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OneXGamesWebGameState(theme=");
        sb.append(this.f40588a);
        sb.append(", sessionId=");
        sb.append(this.b);
        sb.append(", webViewHolder=");
        sb.append(this.c);
        sb.append(", animationsEnabled=");
        sb.append(this.d);
        sb.append(", keyboardVisible=");
        ua80.u(", appInForeground=", ", connected=", sb, this.e, this.f);
        ua80.u(", authorized=", ", authPoint=", sb, this.g, this.h);
        sb.append(this.i);
        sb.append(", webClientPageReady=");
        sb.append(this.j);
        sb.append(", federalTaxLegislationInfoEnabled=");
        ua80.q(this.l, ", loadMainFrameAttemptCount=", ", restartDialogVisible=", sb, this.k);
        sb.append(this.m);
        sb.append(", gameState=");
        sb.append(this.n);
        sb.append(", demoState=");
        sb.append(this.o);
        sb.append(", bonusState=");
        sb.append(this.p);
        sb.append(", balanceState=");
        sb.append(this.q);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
