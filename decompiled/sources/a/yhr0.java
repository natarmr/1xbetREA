package a;

import android.gov.nist.core.Separators;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class yhr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lhr0 f42652a;
    public final lmr0 b;
    public final Map c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final long g;
    public final long h;
    public final String i;

    public yhr0(lhr0 lhr0Var, lmr0 lmr0Var, Map map, String str, boolean z, boolean z2, long j, long j2, String str2) {
        this.f42652a = lhr0Var;
        this.b = lmr0Var;
        this.c = map;
        this.d = str;
        this.e = z;
        this.f = z2;
        this.g = j;
        this.h = j2;
        this.i = str2;
    }

    public static yhr0 a(yhr0 yhr0Var, lhr0 lhr0Var, lmr0 lmr0Var, Map map, boolean z, boolean z2, long j, long j2, String str, int i) {
        if ((i & 1) != 0) {
            lhr0Var = yhr0Var.f42652a;
        }
        lhr0 lhr0Var2 = lhr0Var;
        if ((i & 2) != 0) {
            lmr0Var = yhr0Var.b;
        }
        lmr0 lmr0Var2 = lmr0Var;
        if ((i & 4) != 0) {
            map = yhr0Var.c;
        }
        Map map2 = map;
        String str2 = yhr0Var.d;
        boolean z3 = (i & 16) != 0 ? yhr0Var.e : z;
        boolean z4 = (i & 32) != 0 ? yhr0Var.f : z2;
        long j3 = (i & 64) != 0 ? yhr0Var.g : j;
        long j4 = (i & 128) != 0 ? yhr0Var.h : j2;
        String str3 = (i & 256) != 0 ? yhr0Var.i : str;
        yhr0Var.getClass();
        lmr0Var2.getClass();
        map2.getClass();
        return new yhr0(lhr0Var2, lmr0Var2, map2, str2, z3, z4, j3, j4, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yhr0)) {
            return false;
        }
        yhr0 yhr0Var = (yhr0) obj;
        return this.f42652a.equals(yhr0Var.f42652a) && this.b.equals(yhr0Var.b) && this.c.equals(yhr0Var.c) && this.d.equals(yhr0Var.d) && this.e == yhr0Var.e && this.f == yhr0Var.f && this.g == yhr0Var.g && this.h == yhr0Var.h && this.i.equals(yhr0Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + rw2.b(rw2.b(brm0.e(brm0.e(ua80.b(ohs0.f(this.c, (this.b.hashCode() + (this.f42652a.hashCode() * 31)) * 31, 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TotoActiveTirageState(activeTirageDataState=");
        sb.append(this.f42652a);
        sb.append(", totoBetTypeModel=");
        sb.append(this.b);
        sb.append(", selectedOutcomes=");
        sb.append(this.c);
        sb.append(", totoName=");
        sb.append(this.d);
        sb.append(", showMakeBetLoader=");
        ua80.u(", isScrollToTopRequested=", ", lottieRetryCountDownMillis=", sb, this.e, this.f);
        sb.append(this.g);
        kng0.A(sb, ", untilEndMillisLeft=", this.h, ", backgroundImageUrl=");
        return axq.n(sb, this.i, Separators.RPAREN);
    }
}
