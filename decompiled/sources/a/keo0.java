package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class keo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18163a;
    public final List b;
    public final List c;
    public final String d;
    public final boolean e;
    public final int f;
    public final int g;
    public final long h;
    public final boolean i;
    public final int j;

    public keo0(int i, List list, List list2, String str, boolean z, int i2, int i3, long j, boolean z2, int i4) {
        list.getClass();
        list2.getClass();
        this.f18163a = i;
        this.b = list;
        this.c = list2;
        this.d = str;
        this.e = z;
        this.f = i2;
        this.g = i3;
        this.h = j;
        this.i = z2;
        this.j = i4;
    }

    public static keo0 a(keo0 keo0Var, int i, List list, List list2, String str, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = keo0Var.f18163a;
        }
        int i4 = i;
        if ((i3 & 2) != 0) {
            list = keo0Var.b;
        }
        List list3 = list;
        List list4 = (i3 & 4) != 0 ? keo0Var.c : list2;
        String str2 = (i3 & 8) != 0 ? keo0Var.d : str;
        boolean z = (i3 & 16) != 0 ? keo0Var.e : false;
        int i5 = keo0Var.g;
        long j = keo0Var.h;
        boolean z2 = keo0Var.i;
        int i6 = keo0Var.j;
        list3.getClass();
        list4.getClass();
        return new keo0(i4, list3, list4, str2, z, i2, i5, j, z2, i6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof keo0)) {
            return false;
        }
        keo0 keo0Var = (keo0) obj;
        return this.f18163a == keo0Var.f18163a && Intrinsics.d(this.b, keo0Var.b) && Intrinsics.d(this.c, keo0Var.c) && this.d.equals(keo0Var.d) && this.e == keo0Var.e && this.f == keo0Var.f && this.g == keo0Var.g && this.h == keo0Var.h && this.i == keo0Var.i && this.j == keo0Var.j;
    }

    public final int hashCode() {
        return Integer.hashCode(this.j) + brm0.e(rw2.b(twn.a(this.g, twn.a(this.f, brm0.e(ua80.b(dw9.a(dw9.a(Integer.hashCode(this.f18163a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TabTopPlayersState(tabType=");
        sb.append(this.f18163a);
        sb.append(", columns=");
        sb.append(this.b);
        sb.append(", players=");
        h97.y(", query=", this.d, ", isLoading=", sb, this.c);
        ua80.q(this.f, ", activeMatchPosition=", ", eventId=", sb, this.e);
        sb.append(this.g);
        sb.append(", sportId=");
        sb.append(this.h);
        cs0.v(this.j, ", supportRtl=", ", lottieConfigType=", sb, this.i);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
