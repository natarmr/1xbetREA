package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class iu70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15383a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final String j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final String o;
    public final boolean p;
    public final boolean q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;

    public iu70(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, String str, boolean z10, boolean z11, boolean z12, boolean z13, String str2, boolean z14, boolean z15, int i, int i2, int i3, int i4) {
        this.f15383a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = z8;
        this.i = z9;
        this.j = str;
        this.k = z10;
        this.l = z11;
        this.m = z12;
        this.n = z13;
        this.o = str2;
        this.p = z14;
        this.q = z15;
        this.r = i;
        this.s = i2;
        this.t = i3;
        this.u = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iu70)) {
            return false;
        }
        iu70 iu70Var = (iu70) obj;
        return this.f15383a == iu70Var.f15383a && this.b == iu70Var.b && this.c == iu70Var.c && this.d == iu70Var.d && this.e == iu70Var.e && this.f == iu70Var.f && this.g == iu70Var.g && this.h == iu70Var.h && this.i == iu70Var.i && this.j.equals(iu70Var.j) && this.k == iu70Var.k && this.l == iu70Var.l && this.m == iu70Var.m && this.n == iu70Var.n && this.o.equals(iu70Var.o) && this.p == iu70Var.p && this.q == iu70Var.q && this.r == iu70Var.r && this.s == iu70Var.s && this.t == iu70Var.t && this.u == iu70Var.u;
    }

    public final int hashCode() {
        return Integer.hashCode(this.u) + twn.a(this.t, twn.a(this.s, twn.a(this.r, brm0.e(brm0.e(ua80.b(brm0.e(brm0.e(brm0.e(brm0.e(ua80.b(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(Boolean.hashCode(this.f15383a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("OnlineCallUiState(isMicBtnEnable=", ", isVolumeBtnEnable=", ", isCallBtnEnable=", this.f15383a, this.b);
        ua80.u(", isMicBtnOn=", ", isVolumeBtnOn=", sbQ, this.c, this.d);
        ua80.u(", isCalling=", ", isPermissionsGranted=", sbQ, this.e, this.f);
        ua80.u(", isPulseAnimationEnable=", ", isConversationTimerVisible=", sbQ, this.g, this.h);
        f140.s(", conversationTime=", this.j, ", isLanguageSelectorEnable=", sbQ, this.i);
        ua80.u(", isLanguageSelectorVisible=", ", isLanguageSelectorBlocking=", sbQ, this.k, this.l);
        ua80.u(", isHintVisible=", ", currentLanguageName=", sbQ, this.m, this.n);
        brm0.C(this.o, ", isLightTheme=", ", isCallProcessStarted=", sbQ, this.p);
        ua80.q(this.r, ", hintText=", ", micBtnImage=", sbQ, this.q);
        axq.r(this.s, this.t, ", volumeBtnImage=", ", callBtnImage=", sbQ);
        return rz4.j(this.u, Separators.RPAREN, sbQ);
    }
}
