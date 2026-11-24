package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class hu70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13666a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final String l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final String p;
    public final boolean q;
    public final List r;
    public final boolean s;
    public final suy t;
    public final boolean u;

    public hu70(int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, String str, boolean z10, boolean z11, boolean z12, String str2, boolean z13, List list, boolean z14, suy suyVar, boolean z15) {
        list.getClass();
        this.f13666a = i;
        this.b = i2;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = z6;
        this.i = z7;
        this.j = z8;
        this.k = z9;
        this.l = str;
        this.m = z10;
        this.n = z11;
        this.o = z12;
        this.p = str2;
        this.q = z13;
        this.r = list;
        this.s = z14;
        this.t = suyVar;
        this.u = z15;
    }

    public static hu70 a(hu70 hu70Var, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, String str, boolean z9, boolean z10, boolean z11, String str2, boolean z12, List list, suy suyVar, boolean z13, int i3) {
        int i4 = (i3 & 1) != 0 ? hu70Var.f13666a : i;
        int i5 = (i3 & 2) != 0 ? hu70Var.b : i2;
        boolean z14 = (i3 & 4) != 0 ? hu70Var.c : z;
        boolean z15 = (i3 & 8) != 0 ? hu70Var.d : z2;
        boolean z16 = (i3 & 16) != 0 ? hu70Var.e : z3;
        boolean z17 = (i3 & 32) != 0 ? hu70Var.f : z4;
        boolean z18 = (i3 & 64) != 0 ? hu70Var.g : z5;
        boolean z19 = (i3 & 128) != 0 ? hu70Var.h : z6;
        boolean z20 = (i3 & 256) != 0 ? hu70Var.i : true;
        boolean z21 = (i3 & 512) != 0 ? hu70Var.j : z7;
        boolean z22 = (i3 & 1024) != 0 ? hu70Var.k : z8;
        String str3 = (i3 & 2048) != 0 ? hu70Var.l : str;
        boolean z23 = (i3 & 4096) != 0 ? hu70Var.m : z9;
        boolean z24 = (i3 & 8192) != 0 ? hu70Var.n : z10;
        boolean z25 = (i3 & 16384) != 0 ? hu70Var.o : z11;
        String str4 = (32768 & i3) != 0 ? hu70Var.p : str2;
        boolean z26 = (65536 & i3) != 0 ? hu70Var.q : z12;
        List list2 = (131072 & i3) != 0 ? hu70Var.r : list;
        boolean z27 = hu70Var.s;
        suy suyVar2 = (524288 & i3) != 0 ? hu70Var.t : suyVar;
        boolean z28 = (i3 & 1048576) != 0 ? hu70Var.u : z13;
        hu70Var.getClass();
        str3.getClass();
        list2.getClass();
        suyVar2.getClass();
        return new hu70(i4, i5, z14, z15, z16, z17, z18, z19, z20, z21, z22, str3, z23, z24, z25, str4, z26, list2, z27, suyVar2, z28);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hu70)) {
            return false;
        }
        hu70 hu70Var = (hu70) obj;
        return this.f13666a == hu70Var.f13666a && this.b == hu70Var.b && this.c == hu70Var.c && this.d == hu70Var.d && this.e == hu70Var.e && this.f == hu70Var.f && this.g == hu70Var.g && this.h == hu70Var.h && this.i == hu70Var.i && this.j == hu70Var.j && this.k == hu70Var.k && this.l.equals(hu70Var.l) && this.m == hu70Var.m && this.n == hu70Var.n && this.o == hu70Var.o && this.p.equals(hu70Var.p) && this.q == hu70Var.q && Intrinsics.d(this.r, hu70Var.r) && this.s == hu70Var.s && this.t.equals(hu70Var.t) && this.u == hu70Var.u;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.u) + ((this.t.hashCode() + brm0.e(dw9.a(brm0.e(ua80.b(brm0.e(brm0.e(brm0.e(ua80.b(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(twn.a(this.b, Integer.hashCode(this.f13666a) * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s)) * 31);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("OnlineCallState(retryCallCount=", this.f13666a, ", retryDomainCount=", ", isMicBtnEnable=", this.b);
        ua80.u(", isVolumeBtnEnable=", ", isCallBtnEnable=", sbT, this.c, this.d);
        ua80.u(", isMicBtnOn=", ", isVolumeBtnOn=", sbT, this.e, this.f);
        ua80.u(", isCalling=", ", isPermissionsGranted=", sbT, this.g, this.h);
        ua80.u(", isPulseAnimationEnable=", ", isConversationTimerVisible=", sbT, this.i, this.j);
        f140.s(", conversationTime=", this.l, ", isNetworkAvailable=", sbT, this.k);
        ua80.u(", isLanguageSelectorEnable=", ", isLanguageSelectorVisible=", sbT, this.m, this.n);
        f140.s(", currentLanguageName=", this.p, ", isHintVisible=", sbT, this.o);
        vqd.y(sbT, ", languageList=", this.r, ", isLightTheme=", this.q);
        sbT.append(this.s);
        sbT.append(", languageSelectorBlockModel=");
        sbT.append(this.t);
        sbT.append(", isCallProcessStarted=");
        return rw2.p(sbT, this.u, Separators.RPAREN);
    }
}
