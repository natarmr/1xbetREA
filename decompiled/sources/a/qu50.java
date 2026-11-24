package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class qu50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f29332a;
    public final boolean b;
    public final mb10 c;
    public final List d;
    public final int e;
    public final boolean f;

    public qu50(List list, boolean z, mb10 mb10Var, List list2, int i, boolean z2) {
        list.getClass();
        list2.getClass();
        this.f29332a = list;
        this.b = z;
        this.c = mb10Var;
        this.d = list2;
        this.e = i;
        this.f = z2;
    }

    public static qu50 a(qu50 qu50Var, List list, mb10 mb10Var, ArrayList arrayList, int i, boolean z, int i2) {
        if ((i2 & 1) != 0) {
            list = qu50Var.f29332a;
        }
        List list2 = list;
        boolean z2 = (i2 & 2) != 0 ? qu50Var.b : false;
        if ((i2 & 4) != 0) {
            mb10Var = qu50Var.c;
        }
        mb10 mb10Var2 = mb10Var;
        List list3 = arrayList;
        if ((i2 & 8) != 0) {
            list3 = qu50Var.d;
        }
        List list4 = list3;
        if ((i2 & 16) != 0) {
            i = qu50Var.e;
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            z = qu50Var.f;
        }
        qu50Var.getClass();
        list2.getClass();
        list4.getClass();
        return new qu50(list2, z2, mb10Var2, list4, i3, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qu50)) {
            return false;
        }
        qu50 qu50Var = (qu50) obj;
        return Intrinsics.d(this.f29332a, qu50Var.f29332a) && this.b == qu50Var.b && this.c.equals(qu50Var.c) && Intrinsics.d(this.d, qu50Var.d) && this.e == qu50Var.e && this.f == qu50Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + twn.a(this.e, dw9.a((this.c.hashCode() + brm0.e(this.f29332a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsMainState(banners=");
        sb.append(this.f29332a);
        sb.append(", isLoadingShowing=");
        sb.append(this.b);
        sb.append(", lottieModel=");
        sb.append(this.c);
        sb.append(", routes=");
        sb.append(this.d);
        sb.append(", selectedBannerPosition=");
        return ohs0.k(this.e, ", actionButtonNeeded=", Separators.RPAREN, sb, this.f);
    }
}
