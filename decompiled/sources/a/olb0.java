package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class olb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f25444a;
    public final amb0 b;
    public final ql5 c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final long g;
    public final long h;
    public final boolean i;
    public final idb0 j;
    public final bib0 k;
    public final skb0 l;
    public final boolean m;

    public olb0(List list, amb0 amb0Var, ql5 ql5Var, boolean z, boolean z2, String str, long j, long j2, boolean z3, idb0 idb0Var, bib0 bib0Var, skb0 skb0Var, boolean z4) {
        amb0Var.getClass();
        this.f25444a = list;
        this.b = amb0Var;
        this.c = ql5Var;
        this.d = z;
        this.e = z2;
        this.f = str;
        this.g = j;
        this.h = j2;
        this.i = z3;
        this.j = idb0Var;
        this.k = bib0Var;
        this.l = skb0Var;
        this.m = z4;
    }

    public static olb0 a(olb0 olb0Var, List list, amb0 amb0Var, ql5 ql5Var, boolean z, boolean z2, String str, long j, long j2, boolean z3, idb0 idb0Var, bib0 bib0Var, skb0 skb0Var, int i) {
        List list2 = (i & 1) != 0 ? olb0Var.f25444a : list;
        amb0 amb0Var2 = (i & 2) != 0 ? olb0Var.b : amb0Var;
        ql5 ql5Var2 = (i & 4) != 0 ? olb0Var.c : ql5Var;
        boolean z4 = (i & 8) != 0 ? olb0Var.d : z;
        boolean z5 = (i & 16) != 0 ? olb0Var.e : z2;
        String str2 = (i & 32) != 0 ? olb0Var.f : str;
        long j3 = (i & 64) != 0 ? olb0Var.g : j;
        long j4 = (i & 128) != 0 ? olb0Var.h : j2;
        boolean z6 = (i & 256) != 0 ? olb0Var.i : z3;
        idb0 idb0Var2 = (i & 512) != 0 ? olb0Var.j : idb0Var;
        bib0 bib0Var2 = (i & 1024) != 0 ? olb0Var.k : bib0Var;
        skb0 skb0Var2 = (i & 2048) != 0 ? olb0Var.l : skb0Var;
        boolean z7 = (i & 4096) != 0 ? olb0Var.m : true;
        olb0Var.getClass();
        list2.getClass();
        amb0Var2.getClass();
        str2.getClass();
        return new olb0(list2, amb0Var2, ql5Var2, z4, z5, str2, j3, j4, z6, idb0Var2, bib0Var2, skb0Var2, z7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof olb0)) {
            return false;
        }
        olb0 olb0Var = (olb0) obj;
        return this.f25444a.equals(olb0Var.f25444a) && this.b == olb0Var.b && Intrinsics.d(this.c, olb0Var.c) && this.d == olb0Var.d && this.e == olb0Var.e && this.f.equals(olb0Var.f) && this.g == olb0Var.g && this.h == olb0Var.h && this.i == olb0Var.i && this.j.equals(olb0Var.j) && this.k.equals(olb0Var.k) && this.l == olb0Var.l && this.m == olb0Var.m;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f25444a.hashCode() * 31)) * 31;
        ql5 ql5Var = this.c;
        int iHashCode2 = (this.k.hashCode() + ((this.j.hashCode() + brm0.e(rw2.b(rw2.b(ua80.b(brm0.e(brm0.e((iHashCode + (ql5Var == null ? 0 : ql5Var.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i)) * 31)) * 31;
        skb0 skb0Var = this.l;
        return Boolean.hashCode(this.m) + ((iHashCode2 + (skb0Var != null ? skb0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PopularState(contentTypeList=");
        sb.append(this.f25444a);
        sb.append(", currentTab=");
        sb.append(this.b);
        sb.append(", currentBalance=");
        sb.append(this.c);
        sb.append(", isAuth=");
        sb.append(this.d);
        sb.append(", isSessionTimerVisible=");
        f140.s(", sessionTimer=", this.f, ", timerAuthOffer=", sb, this.e);
        sb.append(this.g);
        kng0.A(sb, ", timer2fa=", this.h, ", isMinAgeShown=");
        sb.append(this.i);
        sb.append(", popularInfoConditions=");
        sb.append(this.j);
        sb.append(", settings=");
        sb.append(this.k);
        sb.append(", onboardingStep=");
        sb.append(this.l);
        sb.append(", isScreenOpenAnalyticsLogged=");
        return rw2.p(sb, this.m, Separators.RPAREN);
    }
}
