package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class yvc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f43311a;
    public final boolean b;
    public final int c;
    public final jkm d;
    public final long e;

    public yvc(List list, boolean z, int i, jkm jkmVar, long j) {
        list.getClass();
        this.f43311a = list;
        this.b = z;
        this.c = i;
        this.d = jkmVar;
        this.e = j;
    }

    public static yvc a(yvc yvcVar, ArrayList arrayList, int i, jkm jkmVar, long j, int i2) {
        List list = arrayList;
        if ((i2 & 1) != 0) {
            list = yvcVar.f43311a;
        }
        List list2 = list;
        boolean z = (i2 & 2) != 0 ? yvcVar.b : false;
        if ((i2 & 4) != 0) {
            i = yvcVar.c;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            jkmVar = yvcVar.d;
        }
        jkm jkmVar2 = jkmVar;
        if ((i2 & 16) != 0) {
            j = yvcVar.e;
        }
        yvcVar.getClass();
        list2.getClass();
        return new yvc(list2, z, i3, jkmVar2, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yvc)) {
            return false;
        }
        yvc yvcVar = (yvc) obj;
        return Intrinsics.d(this.f43311a, yvcVar.f43311a) && this.b == yvcVar.b && this.c == yvcVar.c && Intrinsics.d(this.d, yvcVar.d) && this.e == yvcVar.e;
    }

    public final int hashCode() {
        int iA = twn.a(this.c, brm0.e(this.f43311a.hashCode() * 31, 31, this.b), 31);
        jkm jkmVar = this.d;
        return Long.hashCode(this.e) + ((iA + (jkmVar == null ? 0 : jkmVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CmsBannerStateModel(banners=");
        sb.append(this.f43311a);
        sb.append(", isLoadingShowing=");
        sb.append(this.b);
        sb.append(", selectedPosition=");
        sb.append(this.c);
        sb.append(", lottieConfig=");
        sb.append(this.d);
        sb.append(", lottieCountdownTime=");
        return brm0.k(this.e, Separators.RPAREN, sb);
    }
}
